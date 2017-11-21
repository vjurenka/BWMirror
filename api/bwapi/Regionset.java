package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Regionset {

    public Position getCenter() {
        return getCenter_native(pointer);
    }

    public List<Unit> getUnits() {
        return getUnits_native(pointer);
    }


    private static Map<Long, Regionset> instances = new HashMap<Long, Regionset>();

    private Regionset(long pointer) {
        this.pointer = pointer;
    }

    private static Regionset get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Regionset instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Regionset(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native Position getCenter_native(long pointer);

    private native List<Unit> getUnits_native(long pointer);


}
