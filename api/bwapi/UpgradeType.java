package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class UpgradeType {

    public String toString() {
        return toString_native(pointer);
    }

    public Race getRace() {
        return getRace_native(pointer);
    }

    public int mineralPrice() {
        return mineralPrice_native(pointer);
    }

    public int mineralPrice(int level) {
        return mineralPrice_native(pointer, level);
    }

    public int mineralPriceFactor() {
        return mineralPriceFactor_native(pointer);
    }

    public int gasPrice() {
        return gasPrice_native(pointer);
    }

    public int gasPrice(int level) {
        return gasPrice_native(pointer, level);
    }

    public int gasPriceFactor() {
        return gasPriceFactor_native(pointer);
    }

    public int upgradeTime() {
        return upgradeTime_native(pointer);
    }

    public int upgradeTime(int level) {
        return upgradeTime_native(pointer, level);
    }

    public int upgradeTimeFactor() {
        return upgradeTimeFactor_native(pointer);
    }

    public int maxRepeats() {
        return maxRepeats_native(pointer);
    }

    public UnitType whatUpgrades() {
        return whatUpgrades_native(pointer);
    }

    public UnitType whatsRequired() {
        return whatsRequired_native(pointer);
    }

    public UnitType whatsRequired(int level) {
        return whatsRequired_native(pointer, level);
    }

    public static final UpgradeType Terran_Infantry_Armor = new UpgradeType(0);

    public static final UpgradeType Terran_Vehicle_Plating = new UpgradeType(0);

    public static final UpgradeType Terran_Ship_Plating = new UpgradeType(0);

    public static final UpgradeType Terran_Infantry_Weapons = new UpgradeType(0);

    public static final UpgradeType Terran_Vehicle_Weapons = new UpgradeType(0);

    public static final UpgradeType Terran_Ship_Weapons = new UpgradeType(0);

    public static final UpgradeType U_238_Shells = new UpgradeType(0);

    public static final UpgradeType Ion_Thrusters = new UpgradeType(0);

    public static final UpgradeType Titan_Reactor = new UpgradeType(0);

    public static final UpgradeType Ocular_Implants = new UpgradeType(0);

    public static final UpgradeType Moebius_Reactor = new UpgradeType(0);

    public static final UpgradeType Apollo_Reactor = new UpgradeType(0);

    public static final UpgradeType Colossus_Reactor = new UpgradeType(0);

    public static final UpgradeType Caduceus_Reactor = new UpgradeType(0);

    public static final UpgradeType Charon_Boosters = new UpgradeType(0);

    public static final UpgradeType Zerg_Carapace = new UpgradeType(0);

    public static final UpgradeType Zerg_Flyer_Carapace = new UpgradeType(0);

    public static final UpgradeType Zerg_Melee_Attacks = new UpgradeType(0);

    public static final UpgradeType Zerg_Missile_Attacks = new UpgradeType(0);

    public static final UpgradeType Zerg_Flyer_Attacks = new UpgradeType(0);

    public static final UpgradeType Ventral_Sacs = new UpgradeType(0);

    public static final UpgradeType Antennae = new UpgradeType(0);

    public static final UpgradeType Pneumatized_Carapace = new UpgradeType(0);

    public static final UpgradeType Metabolic_Boost = new UpgradeType(0);

    public static final UpgradeType Adrenal_Glands = new UpgradeType(0);

    public static final UpgradeType Muscular_Augments = new UpgradeType(0);

    public static final UpgradeType Grooved_Spines = new UpgradeType(0);

    public static final UpgradeType Gamete_Meiosis = new UpgradeType(0);

    public static final UpgradeType Metasynaptic_Node = new UpgradeType(0);

    public static final UpgradeType Chitinous_Plating = new UpgradeType(0);

    public static final UpgradeType Anabolic_Synthesis = new UpgradeType(0);

    public static final UpgradeType Protoss_Ground_Armor = new UpgradeType(0);

    public static final UpgradeType Protoss_Air_Armor = new UpgradeType(0);

    public static final UpgradeType Protoss_Ground_Weapons = new UpgradeType(0);

    public static final UpgradeType Protoss_Air_Weapons = new UpgradeType(0);

    public static final UpgradeType Protoss_Plasma_Shields = new UpgradeType(0);

    public static final UpgradeType Singularity_Charge = new UpgradeType(0);

    public static final UpgradeType Leg_Enhancements = new UpgradeType(0);

    public static final UpgradeType Scarab_Damage = new UpgradeType(0);

    public static final UpgradeType Reaver_Capacity = new UpgradeType(0);

    public static final UpgradeType Gravitic_Drive = new UpgradeType(0);

    public static final UpgradeType Sensor_Array = new UpgradeType(0);

    public static final UpgradeType Gravitic_Boosters = new UpgradeType(0);

    public static final UpgradeType Khaydarin_Amulet = new UpgradeType(0);

    public static final UpgradeType Apial_Sensors = new UpgradeType(0);

    public static final UpgradeType Gravitic_Thrusters = new UpgradeType(0);

    public static final UpgradeType Carrier_Capacity = new UpgradeType(0);

    public static final UpgradeType Khaydarin_Core = new UpgradeType(0);

    public static final UpgradeType Argus_Jewel = new UpgradeType(0);

    public static final UpgradeType Argus_Talisman = new UpgradeType(0);

    public static final UpgradeType Upgrade_60 = new UpgradeType(0);

    public static final UpgradeType None = new UpgradeType(0);

    public static final UpgradeType Unknown = new UpgradeType(0);


    private static Map<Long, UpgradeType> instances = new HashMap<Long, UpgradeType>();

    private UpgradeType(long pointer) {
        this.pointer = pointer;
    }

    private static UpgradeType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        UpgradeType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new UpgradeType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);

    private native Race getRace_native(long pointer);

    private native int mineralPrice_native(long pointer);

    private native int mineralPrice_native(long pointer, int level);

    private native int mineralPriceFactor_native(long pointer);

    private native int gasPrice_native(long pointer);

    private native int gasPrice_native(long pointer, int level);

    private native int gasPriceFactor_native(long pointer);

    private native int upgradeTime_native(long pointer);

    private native int upgradeTime_native(long pointer, int level);

    private native int upgradeTimeFactor_native(long pointer);

    private native int maxRepeats_native(long pointer);

    private native UnitType whatUpgrades_native(long pointer);

    private native UnitType whatsRequired_native(long pointer);

    private native UnitType whatsRequired_native(long pointer, int level);


}
