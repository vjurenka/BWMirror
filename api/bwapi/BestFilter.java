package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class BestFilter {


    private static Map<Long, BestFilter> instances = new HashMap<Long, BestFilter>();

    private BestFilter(long pointer) {
        this.pointer = pointer;
    }

    private static BestFilter get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        BestFilter instance = instances.get(pointer);
        if (instance == null ) {
            instance = new BestFilter(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;


}
