package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

/**
The Error object is generally used to determine why certain functions in BWAPI have failed. For example, you may not have enough resources to construct a unit. See also Game::getLastError, Game::setLastError, Errors
*/
/**
Expected type constructor. If the type is an invalid type, then it becomes Types::Unknown. A type is invalid if its value is less than 0 or greater than Types::Unknown. Parameters id The id that corresponds to this type. It is typically an integer value that corresponds to an internal Broodwar type. If the given id is invalid, then it becomes Types::Unknown.
*/
public class Error {

    public String toString() {
        return toString_native(pointer);
    }

    public static Error Unit_Does_Not_Exist;

    public static Error Unit_Not_Visible;

    public static Error Unit_Not_Owned;

    public static Error Unit_Busy;

    public static Error Incompatible_UnitType;

    public static Error Incompatible_TechType;

    public static Error Incompatible_State;

    public static Error Already_Researched;

    public static Error Fully_Upgraded;

    public static Error Currently_Researching;

    public static Error Currently_Upgrading;

    public static Error Insufficient_Minerals;

    public static Error Insufficient_Gas;

    public static Error Insufficient_Supply;

    public static Error Insufficient_Energy;

    public static Error Insufficient_Tech;

    public static Error Insufficient_Ammo;

    public static Error Insufficient_Space;

    public static Error Invalid_Tile_Position;

    public static Error Unbuildable_Location;

    public static Error Unreachable_Location;

    public static Error Out_Of_Range;

    public static Error Unable_To_Hit;

    public static Error Access_Denied;

    public static Error File_Not_Found;

    public static Error Invalid_Parameter;

    public static Error None;

    public static Error Unknown;


    private static Map<Long, Error> instances = new HashMap<Long, Error>();

    private Error(long pointer) {
        this.pointer = pointer;
    }

    private static Error get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Error instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Error(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
