package bwapi4;

import bwapi4.*;

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

    public static PlayerType None;

    public static PlayerType Computer;

    public static PlayerType Player;

    public static PlayerType RescuePassive;

    public static PlayerType EitherPreferComputer;

    public static PlayerType EitherPreferHuman;

    public static PlayerType Neutral;

    public static PlayerType Closed;

    public static PlayerType PlayerLeft;

    public static PlayerType ComputerLeft;

    public static PlayerType Unknown;


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
