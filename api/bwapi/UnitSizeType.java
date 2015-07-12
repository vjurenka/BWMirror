package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

/**
Size types are used by unit types in Broodwar to determine how much damage will be applied. This corresponds with DamageType for several different damage reduction applications. See also DamageType, UnitType, UnitSizeTypes View on Starcraft Campendium (Official Website)
*/
/**
Expected type constructor. If the type is an invalid type, then it becomes Types::Unknown. A type is invalid if its value is less than 0 or greater than Types::Unknown. Parameters id The id that corresponds to this type. It is typically an integer value that corresponds to an internal Broodwar type. If the given id is invalid, then it becomes Types::Unknown.
*/
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
