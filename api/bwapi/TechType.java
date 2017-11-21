package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class TechType {

    public String toString() {
        return toString_native(pointer);
    }

    public Race getRace() {
        return getRace_native(pointer);
    }

    public int mineralPrice() {
        return mineralPrice_native(pointer);
    }

    public int gasPrice() {
        return gasPrice_native(pointer);
    }

    public int researchTime() {
        return researchTime_native(pointer);
    }

    public int energyCost() {
        return energyCost_native(pointer);
    }

    public UnitType whatResearches() {
        return whatResearches_native(pointer);
    }

    public WeaponType getWeapon() {
        return getWeapon_native(pointer);
    }

    public boolean targetsUnit() {
        return targetsUnit_native(pointer);
    }

    public boolean targetsPosition() {
        return targetsPosition_native(pointer);
    }

    public Order getOrder() {
        return getOrder_native(pointer);
    }

    public UnitType requiredUnit() {
        return requiredUnit_native(pointer);
    }

    public static final TechType Stim_Packs = new TechType(0);

    public static final TechType Lockdown = new TechType(0);

    public static final TechType EMP_Shockwave = new TechType(0);

    public static final TechType Spider_Mines = new TechType(0);

    public static final TechType Scanner_Sweep = new TechType(0);

    public static final TechType Tank_Siege_Mode = new TechType(0);

    public static final TechType Defensive_Matrix = new TechType(0);

    public static final TechType Irradiate = new TechType(0);

    public static final TechType Yamato_Gun = new TechType(0);

    public static final TechType Cloaking_Field = new TechType(0);

    public static final TechType Personnel_Cloaking = new TechType(0);

    public static final TechType Restoration = new TechType(0);

    public static final TechType Optical_Flare = new TechType(0);

    public static final TechType Healing = new TechType(0);

    public static final TechType Nuclear_Strike = new TechType(0);

    public static final TechType Burrowing = new TechType(0);

    public static final TechType Infestation = new TechType(0);

    public static final TechType Spawn_Broodlings = new TechType(0);

    public static final TechType Dark_Swarm = new TechType(0);

    public static final TechType Plague = new TechType(0);

    public static final TechType Consume = new TechType(0);

    public static final TechType Ensnare = new TechType(0);

    public static final TechType Parasite = new TechType(0);

    public static final TechType Lurker_Aspect = new TechType(0);

    public static final TechType Psionic_Storm = new TechType(0);

    public static final TechType Hallucination = new TechType(0);

    public static final TechType Recall = new TechType(0);

    public static final TechType Stasis_Field = new TechType(0);

    public static final TechType Archon_Warp = new TechType(0);

    public static final TechType Disruption_Web = new TechType(0);

    public static final TechType Mind_Control = new TechType(0);

    public static final TechType Dark_Archon_Meld = new TechType(0);

    public static final TechType Feedback = new TechType(0);

    public static final TechType Maelstrom = new TechType(0);

    public static final TechType None = new TechType(0);

    public static final TechType Unknown = new TechType(0);


    private static Map<Long, TechType> instances = new HashMap<Long, TechType>();

    private TechType(long pointer) {
        this.pointer = pointer;
    }

    private static TechType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        TechType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new TechType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);

    private native Race getRace_native(long pointer);

    private native int mineralPrice_native(long pointer);

    private native int gasPrice_native(long pointer);

    private native int researchTime_native(long pointer);

    private native int energyCost_native(long pointer);

    private native UnitType whatResearches_native(long pointer);

    private native WeaponType getWeapon_native(long pointer);

    private native boolean targetsUnit_native(long pointer);

    private native boolean targetsPosition_native(long pointer);

    private native Order getOrder_native(long pointer);

    private native UnitType requiredUnit_native(long pointer);


}
