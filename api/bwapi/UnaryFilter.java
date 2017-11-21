package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class UnaryFilter {


    private static Map<Long, UnaryFilter> instances = new HashMap<Long, UnaryFilter>();

    private UnaryFilter(long pointer) {
        this.pointer = pointer;
    }

    private static UnaryFilter get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        UnaryFilter instance = instances.get(pointer);
        if (instance == null ) {
            instance = new UnaryFilter(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;


}
