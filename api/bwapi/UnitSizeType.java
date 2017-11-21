package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class UnitSizeType {

    public String toString() {
        return toString_native(pointer);
    }

    public static final UnitSizeType Independent = new UnitSizeType(0);

    public static final UnitSizeType Small = new UnitSizeType(0);

    public static final UnitSizeType Medium = new UnitSizeType(0);

    public static final UnitSizeType Large = new UnitSizeType(0);

    public static final UnitSizeType None = new UnitSizeType(0);

    public static final UnitSizeType Unknown = new UnitSizeType(0);


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
