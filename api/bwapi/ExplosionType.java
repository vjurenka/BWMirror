package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

/**
A representation of a weapon's explosion type. This indicates how the weapon behaves, such as if it deals splash damage or causes an effect to occur. See also ExplosionTypes
*/
/**
Expected type constructor. If the type is an invalid type, then it becomes Types::Unknown. A type is invalid if its value is less than 0 or greater than Types::Unknown. Parameters id The id that corresponds to this type. It is typically an integer value that corresponds to an internal Broodwar type. If the given id is invalid, then it becomes Types::Unknown.
*/
public class ExplosionType {

    public String toString() {
        return toString_native(pointer);
    }

    public static ExplosionType None;

    public static ExplosionType Normal;

    public static ExplosionType Radial_Splash;

    public static ExplosionType Enemy_Splash;

    public static ExplosionType Lockdown;

    public static ExplosionType Nuclear_Missile;

    public static ExplosionType Parasite;

    public static ExplosionType Broodlings;

    public static ExplosionType EMP_Shockwave;

    public static ExplosionType Irradiate;

    public static ExplosionType Ensnare;

    public static ExplosionType Plague;

    public static ExplosionType Stasis_Field;

    public static ExplosionType Dark_Swarm;

    public static ExplosionType Consume;

    public static ExplosionType Yamato_Gun;

    public static ExplosionType Restoration;

    public static ExplosionType Disruption_Web;

    public static ExplosionType Corrosive_Acid;

    public static ExplosionType Mind_Control;

    public static ExplosionType Feedback;

    public static ExplosionType Optical_Flare;

    public static ExplosionType Maelstrom;

    public static ExplosionType Air_Splash;

    public static ExplosionType Unknown;


    private static Map<Long, ExplosionType> instances = new HashMap<Long, ExplosionType>();

    private ExplosionType(long pointer) {
        this.pointer = pointer;
    }

    private static ExplosionType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        ExplosionType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new ExplosionType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
