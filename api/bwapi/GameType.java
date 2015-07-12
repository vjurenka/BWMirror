package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

/**
A class that represents game types in Broodwar. A game type is selected when creating a game. See also GameTypes
*/
/**
Expected type constructor. If the type is an invalid type, then it becomes Types::Unknown. A type is invalid if its value is less than 0 or greater than Types::Unknown. Parameters id The id that corresponds to this type. It is typically an integer value that corresponds to an internal Broodwar type. If the given id is invalid, then it becomes Types::Unknown.
*/
public class GameType {

    public String toString() {
        return toString_native(pointer);
    }

    public static GameType Melee;

    public static GameType Free_For_All;

    public static GameType One_on_One;

    public static GameType Capture_The_Flag;

    public static GameType Greed;

    public static GameType Slaughter;

    public static GameType Sudden_Death;

    public static GameType Ladder;

    public static GameType Use_Map_Settings;

    public static GameType Team_Melee;

    public static GameType Team_Free_For_All;

    public static GameType Team_Capture_The_Flag;

    public static GameType Top_vs_Bottom;

    public static GameType None;

    public static GameType Unknown;


    private static Map<Long, GameType> instances = new HashMap<Long, GameType>();

    private GameType(long pointer) {
        this.pointer = pointer;
    }

    private static GameType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        GameType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new GameType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
