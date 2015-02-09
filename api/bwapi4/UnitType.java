package bwapi4;

import bwapi4.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class UnitType {

    public String toString() {
        return toString_native(pointer);
    }

    public Race getRace() {
        return getRace_native(pointer);
    }

    public TechType requiredTech() {
        return requiredTech_native(pointer);
    }

    public TechType cloakingTech() {
        return cloakingTech_native(pointer);
    }

    public UpgradeType armorUpgrade() {
        return armorUpgrade_native(pointer);
    }

    public int maxHitPoints() {
        return maxHitPoints_native(pointer);
    }

    public int maxShields() {
        return maxShields_native(pointer);
    }

    public int maxEnergy() {
        return maxEnergy_native(pointer);
    }

    public int armor() {
        return armor_native(pointer);
    }

    public int mineralPrice() {
        return mineralPrice_native(pointer);
    }

    public int gasPrice() {
        return gasPrice_native(pointer);
    }

    public int buildTime() {
        return buildTime_native(pointer);
    }

    public int supplyRequired() {
        return supplyRequired_native(pointer);
    }

    public int supplyProvided() {
        return supplyProvided_native(pointer);
    }

    public int spaceRequired() {
        return spaceRequired_native(pointer);
    }

    public int spaceProvided() {
        return spaceProvided_native(pointer);
    }

    public int buildScore() {
        return buildScore_native(pointer);
    }

    public int destroyScore() {
        return destroyScore_native(pointer);
    }

    public UnitSizeType size() {
        return size_native(pointer);
    }

    public int tileWidth() {
        return tileWidth_native(pointer);
    }

    public int tileHeight() {
        return tileHeight_native(pointer);
    }

    public TilePosition tileSize() {
        return tileSize_native(pointer);
    }

    public int dimensionLeft() {
        return dimensionLeft_native(pointer);
    }

    public int dimensionUp() {
        return dimensionUp_native(pointer);
    }

    public int dimensionRight() {
        return dimensionRight_native(pointer);
    }

    public int dimensionDown() {
        return dimensionDown_native(pointer);
    }

    public int width() {
        return width_native(pointer);
    }

    public int height() {
        return height_native(pointer);
    }

    public int seekRange() {
        return seekRange_native(pointer);
    }

    public int sightRange() {
        return sightRange_native(pointer);
    }

    public WeaponType groundWeapon() {
        return groundWeapon_native(pointer);
    }

    public int maxGroundHits() {
        return maxGroundHits_native(pointer);
    }

    public WeaponType airWeapon() {
        return airWeapon_native(pointer);
    }

    public int maxAirHits() {
        return maxAirHits_native(pointer);
    }

    public double topSpeed() {
        return topSpeed_native(pointer);
    }

    public int acceleration() {
        return acceleration_native(pointer);
    }

    public int haltDistance() {
        return haltDistance_native(pointer);
    }

    public int turnRadius() {
        return turnRadius_native(pointer);
    }

    public boolean canProduce() {
        return canProduce_native(pointer);
    }

    public boolean canAttack() {
        return canAttack_native(pointer);
    }

    public boolean canMove() {
        return canMove_native(pointer);
    }

    public boolean isFlyer() {
        return isFlyer_native(pointer);
    }

    public boolean regeneratesHP() {
        return regeneratesHP_native(pointer);
    }

    public boolean isSpellcaster() {
        return isSpellcaster_native(pointer);
    }

    public boolean hasPermanentCloak() {
        return hasPermanentCloak_native(pointer);
    }

    public boolean isInvincible() {
        return isInvincible_native(pointer);
    }

    public boolean isOrganic() {
        return isOrganic_native(pointer);
    }

    public boolean isMechanical() {
        return isMechanical_native(pointer);
    }

    public boolean isRobotic() {
        return isRobotic_native(pointer);
    }

    public boolean isDetector() {
        return isDetector_native(pointer);
    }

    public boolean isResourceContainer() {
        return isResourceContainer_native(pointer);
    }

    public boolean isResourceDepot() {
        return isResourceDepot_native(pointer);
    }

    public boolean isRefinery() {
        return isRefinery_native(pointer);
    }

    public boolean isWorker() {
        return isWorker_native(pointer);
    }

    public boolean requiresPsi() {
        return requiresPsi_native(pointer);
    }

    public boolean requiresCreep() {
        return requiresCreep_native(pointer);
    }

    public boolean isTwoUnitsInOneEgg() {
        return isTwoUnitsInOneEgg_native(pointer);
    }

    public boolean isBurrowable() {
        return isBurrowable_native(pointer);
    }

    public boolean isCloakable() {
        return isCloakable_native(pointer);
    }

    public boolean isBuilding() {
        return isBuilding_native(pointer);
    }

    public boolean isAddon() {
        return isAddon_native(pointer);
    }

    public boolean isFlyingBuilding() {
        return isFlyingBuilding_native(pointer);
    }

    public boolean isNeutral() {
        return isNeutral_native(pointer);
    }

    public boolean isHero() {
        return isHero_native(pointer);
    }

    public boolean isPowerup() {
        return isPowerup_native(pointer);
    }

    public boolean isBeacon() {
        return isBeacon_native(pointer);
    }

    public boolean isFlagBeacon() {
        return isFlagBeacon_native(pointer);
    }

    public boolean isSpecialBuilding() {
        return isSpecialBuilding_native(pointer);
    }

    public boolean isSpell() {
        return isSpell_native(pointer);
    }

    public boolean producesLarva() {
        return producesLarva_native(pointer);
    }

    public boolean isMineralField() {
        return isMineralField_native(pointer);
    }

    public boolean isCritter() {
        return isCritter_native(pointer);
    }

    public boolean canBuildAddon() {
        return canBuildAddon_native(pointer);
    }

    public static UnitType Terran_Marine;

    public static UnitType Terran_Ghost;

    public static UnitType Terran_Vulture;

    public static UnitType Terran_Goliath;

    public static UnitType Terran_Siege_Tank_Tank_Mode;

    public static UnitType Terran_SCV;

    public static UnitType Terran_Wraith;

    public static UnitType Terran_Science_Vessel;

    public static UnitType Hero_Gui_Montag;

    public static UnitType Terran_Dropship;

    public static UnitType Terran_Battlecruiser;

    public static UnitType Terran_Vulture_Spider_Mine;

    public static UnitType Terran_Nuclear_Missile;

    public static UnitType Terran_Civilian;

    public static UnitType Hero_Sarah_Kerrigan;

    public static UnitType Hero_Alan_Schezar;

    public static UnitType Hero_Jim_Raynor_Vulture;

    public static UnitType Hero_Jim_Raynor_Marine;

    public static UnitType Hero_Tom_Kazansky;

    public static UnitType Hero_Magellan;

    public static UnitType Hero_Edmund_Duke_Tank_Mode;

    public static UnitType Hero_Edmund_Duke_Siege_Mode;

    public static UnitType Hero_Arcturus_Mengsk;

    public static UnitType Hero_Hyperion;

    public static UnitType Hero_Norad_II;

    public static UnitType Terran_Siege_Tank_Siege_Mode;

    public static UnitType Terran_Firebat;

    public static UnitType Spell_Scanner_Sweep;

    public static UnitType Terran_Medic;

    public static UnitType Zerg_Larva;

    public static UnitType Zerg_Egg;

    public static UnitType Zerg_Zergling;

    public static UnitType Zerg_Hydralisk;

    public static UnitType Zerg_Ultralisk;

    public static UnitType Zerg_Broodling;

    public static UnitType Zerg_Drone;

    public static UnitType Zerg_Overlord;

    public static UnitType Zerg_Mutalisk;

    public static UnitType Zerg_Guardian;

    public static UnitType Zerg_Queen;

    public static UnitType Zerg_Defiler;

    public static UnitType Zerg_Scourge;

    public static UnitType Hero_Torrasque;

    public static UnitType Hero_Matriarch;

    public static UnitType Zerg_Infested_Terran;

    public static UnitType Hero_Infested_Kerrigan;

    public static UnitType Hero_Unclean_One;

    public static UnitType Hero_Hunter_Killer;

    public static UnitType Hero_Devouring_One;

    public static UnitType Hero_Kukulza_Mutalisk;

    public static UnitType Hero_Kukulza_Guardian;

    public static UnitType Hero_Yggdrasill;

    public static UnitType Terran_Valkyrie;

    public static UnitType Zerg_Cocoon;

    public static UnitType Protoss_Corsair;

    public static UnitType Protoss_Dark_Templar;

    public static UnitType Zerg_Devourer;

    public static UnitType Protoss_Dark_Archon;

    public static UnitType Protoss_Probe;

    public static UnitType Protoss_Zealot;

    public static UnitType Protoss_Dragoon;

    public static UnitType Protoss_High_Templar;

    public static UnitType Protoss_Archon;

    public static UnitType Protoss_Shuttle;

    public static UnitType Protoss_Scout;

    public static UnitType Protoss_Arbiter;

    public static UnitType Protoss_Carrier;

    public static UnitType Protoss_Interceptor;

    public static UnitType Hero_Dark_Templar;

    public static UnitType Hero_Zeratul;

    public static UnitType Hero_Tassadar_Zeratul_Archon;

    public static UnitType Hero_Fenix_Zealot;

    public static UnitType Hero_Fenix_Dragoon;

    public static UnitType Hero_Tassadar;

    public static UnitType Hero_Mojo;

    public static UnitType Hero_Warbringer;

    public static UnitType Hero_Gantrithor;

    public static UnitType Protoss_Reaver;

    public static UnitType Protoss_Observer;

    public static UnitType Protoss_Scarab;

    public static UnitType Hero_Danimoth;

    public static UnitType Hero_Aldaris;

    public static UnitType Hero_Artanis;

    public static UnitType Critter_Rhynadon;

    public static UnitType Critter_Bengalaas;

    public static UnitType Special_Cargo_Ship;

    public static UnitType Special_Mercenary_Gunship;

    public static UnitType Critter_Scantid;

    public static UnitType Critter_Kakaru;

    public static UnitType Critter_Ragnasaur;

    public static UnitType Critter_Ursadon;

    public static UnitType Zerg_Lurker_Egg;

    public static UnitType Hero_Raszagal;

    public static UnitType Hero_Samir_Duran;

    public static UnitType Hero_Alexei_Stukov;

    public static UnitType Special_Map_Revealer;

    public static UnitType Hero_Gerard_DuGalle;

    public static UnitType Zerg_Lurker;

    public static UnitType Hero_Infested_Duran;

    public static UnitType Spell_Disruption_Web;

    public static UnitType Terran_Command_Center;

    public static UnitType Terran_Comsat_Station;

    public static UnitType Terran_Nuclear_Silo;

    public static UnitType Terran_Supply_Depot;

    public static UnitType Terran_Refinery;

    public static UnitType Terran_Barracks;

    public static UnitType Terran_Academy;

    public static UnitType Terran_Factory;

    public static UnitType Terran_Starport;

    public static UnitType Terran_Control_Tower;

    public static UnitType Terran_Science_Facility;

    public static UnitType Terran_Covert_Ops;

    public static UnitType Terran_Physics_Lab;

    public static UnitType Terran_Machine_Shop;

    public static UnitType Terran_Engineering_Bay;

    public static UnitType Terran_Armory;

    public static UnitType Terran_Missile_Turret;

    public static UnitType Terran_Bunker;

    public static UnitType Special_Crashed_Norad_II;

    public static UnitType Special_Ion_Cannon;

    public static UnitType Powerup_Uraj_Crystal;

    public static UnitType Powerup_Khalis_Crystal;

    public static UnitType Zerg_Infested_Command_Center;

    public static UnitType Zerg_Hatchery;

    public static UnitType Zerg_Lair;

    public static UnitType Zerg_Hive;

    public static UnitType Zerg_Nydus_Canal;

    public static UnitType Zerg_Hydralisk_Den;

    public static UnitType Zerg_Defiler_Mound;

    public static UnitType Zerg_Greater_Spire;

    public static UnitType Zerg_Queens_Nest;

    public static UnitType Zerg_Evolution_Chamber;

    public static UnitType Zerg_Ultralisk_Cavern;

    public static UnitType Zerg_Spire;

    public static UnitType Zerg_Spawning_Pool;

    public static UnitType Zerg_Creep_Colony;

    public static UnitType Zerg_Spore_Colony;

    public static UnitType Zerg_Sunken_Colony;

    public static UnitType Special_Overmind_With_Shell;

    public static UnitType Special_Overmind;

    public static UnitType Zerg_Extractor;

    public static UnitType Special_Mature_Chrysalis;

    public static UnitType Special_Cerebrate;

    public static UnitType Special_Cerebrate_Daggoth;

    public static UnitType Protoss_Nexus;

    public static UnitType Protoss_Robotics_Facility;

    public static UnitType Protoss_Pylon;

    public static UnitType Protoss_Assimilator;

    public static UnitType Protoss_Observatory;

    public static UnitType Protoss_Gateway;

    public static UnitType Protoss_Photon_Cannon;

    public static UnitType Protoss_Citadel_of_Adun;

    public static UnitType Protoss_Cybernetics_Core;

    public static UnitType Protoss_Templar_Archives;

    public static UnitType Protoss_Forge;

    public static UnitType Protoss_Stargate;

    public static UnitType Special_Stasis_Cell_Prison;

    public static UnitType Protoss_Fleet_Beacon;

    public static UnitType Protoss_Arbiter_Tribunal;

    public static UnitType Protoss_Robotics_Support_Bay;

    public static UnitType Protoss_Shield_Battery;

    public static UnitType Special_Khaydarin_Crystal_Form;

    public static UnitType Special_Protoss_Temple;

    public static UnitType Special_XelNaga_Temple;

    public static UnitType Resource_Mineral_Field;

    public static UnitType Resource_Mineral_Field_Type_2;

    public static UnitType Resource_Mineral_Field_Type_3;

    public static UnitType Special_Independant_Starport;

    public static UnitType Resource_Vespene_Geyser;

    public static UnitType Special_Warp_Gate;

    public static UnitType Special_Psi_Disrupter;

    public static UnitType Special_Zerg_Beacon;

    public static UnitType Special_Terran_Beacon;

    public static UnitType Special_Protoss_Beacon;

    public static UnitType Special_Zerg_Flag_Beacon;

    public static UnitType Special_Terran_Flag_Beacon;

    public static UnitType Special_Protoss_Flag_Beacon;

    public static UnitType Special_Power_Generator;

    public static UnitType Special_Overmind_Cocoon;

    public static UnitType Spell_Dark_Swarm;

    public static UnitType Special_Floor_Missile_Trap;

    public static UnitType Special_Floor_Hatch;

    public static UnitType Special_Upper_Level_Door;

    public static UnitType Special_Right_Upper_Level_Door;

    public static UnitType Special_Pit_Door;

    public static UnitType Special_Right_Pit_Door;

    public static UnitType Special_Floor_Gun_Trap;

    public static UnitType Special_Wall_Missile_Trap;

    public static UnitType Special_Wall_Flame_Trap;

    public static UnitType Special_Right_Wall_Missile_Trap;

    public static UnitType Special_Right_Wall_Flame_Trap;

    public static UnitType Special_Start_Location;

    public static UnitType Powerup_Flag;

    public static UnitType Powerup_Young_Chrysalis;

    public static UnitType Powerup_Psi_Emitter;

    public static UnitType Powerup_Data_Disk;

    public static UnitType Powerup_Khaydarin_Crystal;

    public static UnitType Powerup_Mineral_Cluster_Type_1;

    public static UnitType Powerup_Mineral_Cluster_Type_2;

    public static UnitType Powerup_Protoss_Gas_Orb_Type_1;

    public static UnitType Powerup_Protoss_Gas_Orb_Type_2;

    public static UnitType Powerup_Zerg_Gas_Sac_Type_1;

    public static UnitType Powerup_Zerg_Gas_Sac_Type_2;

    public static UnitType Powerup_Terran_Gas_Tank_Type_1;

    public static UnitType Powerup_Terran_Gas_Tank_Type_2;

    public static UnitType None;

    public static UnitType AllUnits;

    public static UnitType Men;

    public static UnitType Buildings;

    public static UnitType Factories;

    public static UnitType Unknown;


    private static Map<Long, UnitType> instances = new HashMap<Long, UnitType>();

    private UnitType(long pointer) {
        this.pointer = pointer;
    }

    private static UnitType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        UnitType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new UnitType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);

    private native Race getRace_native(long pointer);

    private native TechType requiredTech_native(long pointer);

    private native TechType cloakingTech_native(long pointer);

    private native UpgradeType armorUpgrade_native(long pointer);

    private native int maxHitPoints_native(long pointer);

    private native int maxShields_native(long pointer);

    private native int maxEnergy_native(long pointer);

    private native int armor_native(long pointer);

    private native int mineralPrice_native(long pointer);

    private native int gasPrice_native(long pointer);

    private native int buildTime_native(long pointer);

    private native int supplyRequired_native(long pointer);

    private native int supplyProvided_native(long pointer);

    private native int spaceRequired_native(long pointer);

    private native int spaceProvided_native(long pointer);

    private native int buildScore_native(long pointer);

    private native int destroyScore_native(long pointer);

    private native UnitSizeType size_native(long pointer);

    private native int tileWidth_native(long pointer);

    private native int tileHeight_native(long pointer);

    private native TilePosition tileSize_native(long pointer);

    private native int dimensionLeft_native(long pointer);

    private native int dimensionUp_native(long pointer);

    private native int dimensionRight_native(long pointer);

    private native int dimensionDown_native(long pointer);

    private native int width_native(long pointer);

    private native int height_native(long pointer);

    private native int seekRange_native(long pointer);

    private native int sightRange_native(long pointer);

    private native WeaponType groundWeapon_native(long pointer);

    private native int maxGroundHits_native(long pointer);

    private native WeaponType airWeapon_native(long pointer);

    private native int maxAirHits_native(long pointer);

    private native double topSpeed_native(long pointer);

    private native int acceleration_native(long pointer);

    private native int haltDistance_native(long pointer);

    private native int turnRadius_native(long pointer);

    private native boolean canProduce_native(long pointer);

    private native boolean canAttack_native(long pointer);

    private native boolean canMove_native(long pointer);

    private native boolean isFlyer_native(long pointer);

    private native boolean regeneratesHP_native(long pointer);

    private native boolean isSpellcaster_native(long pointer);

    private native boolean hasPermanentCloak_native(long pointer);

    private native boolean isInvincible_native(long pointer);

    private native boolean isOrganic_native(long pointer);

    private native boolean isMechanical_native(long pointer);

    private native boolean isRobotic_native(long pointer);

    private native boolean isDetector_native(long pointer);

    private native boolean isResourceContainer_native(long pointer);

    private native boolean isResourceDepot_native(long pointer);

    private native boolean isRefinery_native(long pointer);

    private native boolean isWorker_native(long pointer);

    private native boolean requiresPsi_native(long pointer);

    private native boolean requiresCreep_native(long pointer);

    private native boolean isTwoUnitsInOneEgg_native(long pointer);

    private native boolean isBurrowable_native(long pointer);

    private native boolean isCloakable_native(long pointer);

    private native boolean isBuilding_native(long pointer);

    private native boolean isAddon_native(long pointer);

    private native boolean isFlyingBuilding_native(long pointer);

    private native boolean isNeutral_native(long pointer);

    private native boolean isHero_native(long pointer);

    private native boolean isPowerup_native(long pointer);

    private native boolean isBeacon_native(long pointer);

    private native boolean isFlagBeacon_native(long pointer);

    private native boolean isSpecialBuilding_native(long pointer);

    private native boolean isSpell_native(long pointer);

    private native boolean producesLarva_native(long pointer);

    private native boolean isMineralField_native(long pointer);

    private native boolean isCritter_native(long pointer);

    private native boolean canBuildAddon_native(long pointer);


}
