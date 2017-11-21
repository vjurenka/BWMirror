package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class PlayerType {

    public String toString() {
        return toString_native(pointer);
    }

    public boolean isLobbyType() {
        return isLobbyType_native(pointer);
    }

    public boolean isGameType() {
        return isGameType_native(pointer);
    }

    public static final PlayerType None = new PlayerType(0);

    public static final PlayerType Computer = new PlayerType(0);

    public static final PlayerType Player = new PlayerType(0);

    public static final PlayerType RescuePassive = new PlayerType(0);

    public static final PlayerType EitherPreferComputer = new PlayerType(0);

    public static final PlayerType EitherPreferHuman = new PlayerType(0);

    public static final PlayerType Neutral = new PlayerType(0);

    public static final PlayerType Closed = new PlayerType(0);

    public static final PlayerType PlayerLeft = new PlayerType(0);

    public static final PlayerType ComputerLeft = new PlayerType(0);

    public static final PlayerType Unknown = new PlayerType(0);


    private static Map<Long, PlayerType> instances = new HashMap<Long, PlayerType>();

    private PlayerType(long pointer) {
        this.pointer = pointer;
    }

    private static PlayerType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        PlayerType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new PlayerType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);

    private native boolean isLobbyType_native(long pointer);

    private native boolean isGameType_native(long pointer);


}
