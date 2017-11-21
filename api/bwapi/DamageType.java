package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class DamageType {

    public String toString() {
        return toString_native(pointer);
    }

    public static final DamageType Independent = new DamageType(0);

    public static final DamageType Explosive = new DamageType(0);

    public static final DamageType Concussive = new DamageType(0);

    public static final DamageType Normal = new DamageType(0);

    public static final DamageType Ignore_Armor = new DamageType(0);

    public static final DamageType None = new DamageType(0);

    public static final DamageType Unknown = new DamageType(0);


    private static Map<Long, DamageType> instances = new HashMap<Long, DamageType>();

    private DamageType(long pointer) {
        this.pointer = pointer;
    }

    private static DamageType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        DamageType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new DamageType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
