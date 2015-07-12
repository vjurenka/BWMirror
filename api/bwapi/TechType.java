package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

/**
The TechType (or Technology Type, also referred to as an Ability) represents a Unit's ability which can be researched with UnitInterface::research or used with UnitInterface::useTech. In order for a Unit to use its own specialized ability, it must first be available and researched. See also TechTypes
*/
/**
Expected type constructor. If the type is an invalid type, then it becomes Types::Unknown. A type is invalid if its value is less than 0 or greater than Types::Unknown. Parameters id The id that corresponds to this type. It is typically an integer value that corresponds to an internal Broodwar type. If the given id is invalid, then it becomes Types::Unknown.
*/
public class TechType {

    public String toString() {
        return toString_native(pointer);
    }

/**
Retrieves the race that is required to research or use the TechType. Note There is an exception where Infested Kerrigan can use Psionic Storm. This does not apply to the behavior of this function. Returns Race object indicating which race is designed to use this technology type.
*/
    public Race getRace() {
        return getRace_native(pointer);
    }

/**
Retrieves the mineral cost of researching this technology. Returns Amount of minerals needed in order to research this technology.
*/
    public int mineralPrice() {
        return mineralPrice_native(pointer);
    }

/**
Retrieves the vespene gas cost of researching this technology. Returns Amount of vespene gas needed in order to research this technology.
*/
    public int gasPrice() {
        return gasPrice_native(pointer);
    }

/**
Retrieves the number of frames needed to research the tech type. Returns The time, in frames, it will take for the research to complete. See also UnitInterface::getRemainingResearchTime
*/
    public int researchTime() {
        return researchTime_native(pointer);
    }

/**
Retrieves the amount of energy needed to use this TechType as an ability. Returns Energy cost of the ability. See also UnitInterface::getEnergy
*/
    public int energyCost() {
        return energyCost_native(pointer);
    }

/**
Retrieves the UnitType that can research this technology. Returns UnitType that is able to research the technology in the game. Return values UnitTypes::None If the technology/ability is either provided for free or never available.
*/
    public UnitType whatResearches() {
        return whatResearches_native(pointer);
    }

/**
Retrieves the Weapon that is attached to this tech type. A technology's WeaponType is used to indicate the range and behaviour of the ability when used by a Unit. Returns WeaponType containing information about the ability's behavior. Return values WeaponTypes::None If there is no corresponding WeaponType.
*/
    public WeaponType getWeapon() {
        return getWeapon_native(pointer);
    }

/**
Checks if this ability can be used on other units. Returns true if the ability can be used on other units, and false if it can not.
*/
    public boolean targetsUnit() {
        return targetsUnit_native(pointer);
    }

/**
Checks if this ability can be used on the terrain (ground). Returns true if the ability can be used on the terrain.
*/
    public boolean targetsPosition() {
        return targetsPosition_native(pointer);
    }

/**
Retrieves the Order that a Unit uses when using this ability. Returns Order representing the action a Unit uses to perform this ability
*/
    public Order getOrder() {
        return getOrder_native(pointer);
    }

    public static TechType Stim_Packs;

    public static TechType Lockdown;

    public static TechType EMP_Shockwave;

    public static TechType Spider_Mines;

    public static TechType Scanner_Sweep;

    public static TechType Tank_Siege_Mode;

    public static TechType Defensive_Matrix;

    public static TechType Irradiate;

    public static TechType Yamato_Gun;

    public static TechType Cloaking_Field;

    public static TechType Personnel_Cloaking;

    public static TechType Burrowing;

    public static TechType Infestation;

    public static TechType Spawn_Broodlings;

    public static TechType Dark_Swarm;

    public static TechType Plague;

    public static TechType Consume;

    public static TechType Ensnare;

    public static TechType Parasite;

    public static TechType Psionic_Storm;

    public static TechType Hallucination;

    public static TechType Recall;

    public static TechType Stasis_Field;

    public static TechType Archon_Warp;

    public static TechType Restoration;

    public static TechType Disruption_Web;

    public static TechType Mind_Control;

    public static TechType Dark_Archon_Meld;

    public static TechType Feedback;

    public static TechType Optical_Flare;

    public static TechType Maelstrom;

    public static TechType Lurker_Aspect;

    public static TechType Healing;

    public static TechType None;

    public static TechType Nuclear_Strike;

    public static TechType Unknown;


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


}
