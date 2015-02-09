package bwapi4;

import bwapi4.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class DamageType {

    public String toString() {
        return toString_native(pointer);
    }

    public static DamageType Independent;

    public static DamageType Explosive;

    public static DamageType Concussive;

    public static DamageType Normal;

    public static DamageType Ignore_Armor;

    public static DamageType None;

    public static DamageType Unknown;


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
