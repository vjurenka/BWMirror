package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Race {

    public String toString() {
        return toString_native(pointer);
    }

    public UnitType getWorker() {
        return getWorker_native(pointer);
    }

    public UnitType getCenter() {
        return getCenter_native(pointer);
    }

    public UnitType getRefinery() {
        return getRefinery_native(pointer);
    }

    public UnitType getTransport() {
        return getTransport_native(pointer);
    }

    public UnitType getSupplyProvider() {
        return getSupplyProvider_native(pointer);
    }

    public static final Race Zerg = new Race(0);

    public static final Race Terran = new Race(0);

    public static final Race Protoss = new Race(0);

    public static final Race Random = new Race(0);

    public static final Race None = new Race(0);

    public static final Race Unknown = new Race(0);


    private static Map<Long, Race> instances = new HashMap<Long, Race>();

    private Race(long pointer) {
        this.pointer = pointer;
    }

    private static Race get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Race instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Race(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);

    private native UnitType getWorker_native(long pointer);

    private native UnitType getCenter_native(long pointer);

    private native UnitType getRefinery_native(long pointer);

    private native UnitType getTransport_native(long pointer);

    private native UnitType getSupplyProvider_native(long pointer);


}
