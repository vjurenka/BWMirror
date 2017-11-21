package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Force {

    public int getID() {
        return getID_native(pointer);
    }

    public String getName() {
        return getName_native(pointer);
    }

    public List<Player> getPlayers() {
        return getPlayers_native(pointer);
    }


    private static Map<Long, Force> instances = new HashMap<Long, Force>();

    private Force(long pointer) {
        this.pointer = pointer;
    }

    private static Force get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Force instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Force(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native int getID_native(long pointer);

    private native String getName_native(long pointer);

    private native List<Player> getPlayers_native(long pointer);


    public boolean equals(Object that){
        if(!(that instanceof Force)){
            return false;
        }
        return getID() == ((Force)that).getID();
    }

    public int hashCode(){
        return getID();
    }

}
