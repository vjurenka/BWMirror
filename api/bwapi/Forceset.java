package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Forceset {

    public List<Player> getPlayers() {
        return getPlayers_native(pointer);
    }


    private static Map<Long, Forceset> instances = new HashMap<Long, Forceset>();

    private Forceset(long pointer) {
        this.pointer = pointer;
    }

    private static Forceset get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Forceset instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Forceset(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native List<Player> getPlayers_native(long pointer);


}
