package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Bullet {

    public int getID() {
        return getID_native(pointer);
    }

    public boolean exists() {
        return exists_native(pointer);
    }

    public Player getPlayer() {
        return getPlayer_native(pointer);
    }

    public BulletType getType() {
        return getType_native(pointer);
    }

    public Unit getSource() {
        return getSource_native(pointer);
    }

    public Position getPosition() {
        return getPosition_native(pointer);
    }

    public double getAngle() {
        return getAngle_native(pointer);
    }

    public double getVelocityX() {
        return getVelocityX_native(pointer);
    }

    public double getVelocityY() {
        return getVelocityY_native(pointer);
    }

    public Unit getTarget() {
        return getTarget_native(pointer);
    }

    public Position getTargetPosition() {
        return getTargetPosition_native(pointer);
    }

    public int getRemoveTimer() {
        return getRemoveTimer_native(pointer);
    }

    public boolean isVisible() {
        return isVisible_native(pointer);
    }

    public boolean isVisible(Player player) {
        return isVisible_native(pointer, player);
    }


    private static Map<Long, Bullet> instances = new HashMap<Long, Bullet>();

    private Bullet(long pointer) {
        this.pointer = pointer;
    }

    private static Bullet get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Bullet instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Bullet(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native int getID_native(long pointer);

    private native boolean exists_native(long pointer);

    private native Player getPlayer_native(long pointer);

    private native BulletType getType_native(long pointer);

    private native Unit getSource_native(long pointer);

    private native Position getPosition_native(long pointer);

    private native double getAngle_native(long pointer);

    private native double getVelocityX_native(long pointer);

    private native double getVelocityY_native(long pointer);

    private native Unit getTarget_native(long pointer);

    private native Position getTargetPosition_native(long pointer);

    private native int getRemoveTimer_native(long pointer);

    private native boolean isVisible_native(long pointer);

    private native boolean isVisible_native(long pointer, Player player);


    public boolean equals(Object that){
        if(!(that instanceof Bullet)){
            return false;
        }
        return getID() == ((Bullet)that).getID();
    }

    public int hashCode(){
        return getID();
    }

}
