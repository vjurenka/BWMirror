package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class ExplosionType {

    public String toString() {
        return toString_native(pointer);
    }

    public static final ExplosionType None = new ExplosionType(0);

    public static final ExplosionType Normal = new ExplosionType(0);

    public static final ExplosionType Radial_Splash = new ExplosionType(0);

    public static final ExplosionType Enemy_Splash = new ExplosionType(0);

    public static final ExplosionType Lockdown = new ExplosionType(0);

    public static final ExplosionType Nuclear_Missile = new ExplosionType(0);

    public static final ExplosionType Parasite = new ExplosionType(0);

    public static final ExplosionType Broodlings = new ExplosionType(0);

    public static final ExplosionType EMP_Shockwave = new ExplosionType(0);

    public static final ExplosionType Irradiate = new ExplosionType(0);

    public static final ExplosionType Ensnare = new ExplosionType(0);

    public static final ExplosionType Plague = new ExplosionType(0);

    public static final ExplosionType Stasis_Field = new ExplosionType(0);

    public static final ExplosionType Dark_Swarm = new ExplosionType(0);

    public static final ExplosionType Consume = new ExplosionType(0);

    public static final ExplosionType Yamato_Gun = new ExplosionType(0);

    public static final ExplosionType Restoration = new ExplosionType(0);

    public static final ExplosionType Disruption_Web = new ExplosionType(0);

    public static final ExplosionType Corrosive_Acid = new ExplosionType(0);

    public static final ExplosionType Mind_Control = new ExplosionType(0);

    public static final ExplosionType Feedback = new ExplosionType(0);

    public static final ExplosionType Optical_Flare = new ExplosionType(0);

    public static final ExplosionType Maelstrom = new ExplosionType(0);

    public static final ExplosionType Air_Splash = new ExplosionType(0);

    public static final ExplosionType Unknown = new ExplosionType(0);


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
