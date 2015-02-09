package bwapi4;

import bwapi4.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class UnitSizeType {

    public String toString() {
        return toString_native(pointer);
    }

    public static UnitSizeType Independent;

    public static UnitSizeType Small;

    public static UnitSizeType Medium;

    public static UnitSizeType Large;

    public static UnitSizeType None;

    public static UnitSizeType Unknown;


    private static Map<Long, UnitSizeType> instances = new HashMap<Long, UnitSizeType>();

    private UnitSizeType(long pointer) {
        this.pointer = pointer;
    }

    private static UnitSizeType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        UnitSizeType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new UnitSizeType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
