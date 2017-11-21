package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class GameType {

    public String toString() {
        return toString_native(pointer);
    }

    public static final GameType Melee = new GameType(0);

    public static final GameType Free_For_All = new GameType(0);

    public static final GameType One_on_One = new GameType(0);

    public static final GameType Capture_The_Flag = new GameType(0);

    public static final GameType Greed = new GameType(0);

    public static final GameType Slaughter = new GameType(0);

    public static final GameType Sudden_Death = new GameType(0);

    public static final GameType Ladder = new GameType(0);

    public static final GameType Use_Map_Settings = new GameType(0);

    public static final GameType Team_Melee = new GameType(0);

    public static final GameType Team_Free_For_All = new GameType(0);

    public static final GameType Team_Capture_The_Flag = new GameType(0);

    public static final GameType Top_vs_Bottom = new GameType(0);

    public static final GameType None = new GameType(0);

    public static final GameType Unknown = new GameType(0);


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
