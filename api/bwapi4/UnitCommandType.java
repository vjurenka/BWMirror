package bwapi4;

import bwapi4.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class UnitCommandType {

    public String toString() {
        return toString_native(pointer);
    }

    public static UnitCommandType Attack_Move;

    public static UnitCommandType Attack_Unit;

    public static UnitCommandType Build;

    public static UnitCommandType Build_Addon;

    public static UnitCommandType Train;

    public static UnitCommandType Morph;

    public static UnitCommandType Research;

    public static UnitCommandType Upgrade;

    public static UnitCommandType Set_Rally_Position;

    public static UnitCommandType Set_Rally_Unit;

    public static UnitCommandType Move;

    public static UnitCommandType Patrol;

    public static UnitCommandType Hold_Position;

    public static UnitCommandType Stop;

    public static UnitCommandType Follow;

    public static UnitCommandType Gather;

    public static UnitCommandType Return_Cargo;

    public static UnitCommandType Repair;

    public static UnitCommandType Burrow;

    public static UnitCommandType Unburrow;

    public static UnitCommandType Cloak;

    public static UnitCommandType Decloak;

    public static UnitCommandType Siege;

    public static UnitCommandType Unsiege;

    public static UnitCommandType Lift;

    public static UnitCommandType Land;

    public static UnitCommandType Load;

    public static UnitCommandType Unload;

    public static UnitCommandType Unload_All;

    public static UnitCommandType Unload_All_Position;

    public static UnitCommandType Right_Click_Position;

    public static UnitCommandType Right_Click_Unit;

    public static UnitCommandType Halt_Construction;

    public static UnitCommandType Cancel_Construction;

    public static UnitCommandType Cancel_Addon;

    public static UnitCommandType Cancel_Train;

    public static UnitCommandType Cancel_Train_Slot;

    public static UnitCommandType Cancel_Morph;

    public static UnitCommandType Cancel_Research;

    public static UnitCommandType Cancel_Upgrade;

    public static UnitCommandType Use_Tech;

    public static UnitCommandType Use_Tech_Position;

    public static UnitCommandType Use_Tech_Unit;

    public static UnitCommandType Place_COP;

    public static UnitCommandType None;

    public static UnitCommandType Unknown;


    private static Map<Long, UnitCommandType> instances = new HashMap<Long, UnitCommandType>();

    private UnitCommandType(long pointer) {
        this.pointer = pointer;
    }

    private static UnitCommandType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        UnitCommandType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new UnitCommandType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
