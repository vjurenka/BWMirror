package bwapi;

import bwapi.*;

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

    public Pair<UnitType, Integer> whatBuilds() {
        return whatBuilds_native(pointer);
    }

    public Map<UnitType, Integer> requiredUnits() {
        return requiredUnits_native(pointer);
    }

    public TechType requiredTech() {
        return requiredTech_native(pointer);
    }

    public TechType cloakingTech() {
        return cloakingTech_native(pointer);
    }

    public List<TechType> abilities() {
        return abilities_native(pointer);
    }

    public List<UpgradeType> upgrades() {
        return upgrades_native(pointer);
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

    public boolean producesCreep() {
        return producesCreep_native(pointer);
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

    public List<TechType> researchesWhat() {
        return researchesWhat_native(pointer);
    }

    public List<UpgradeType> upgradesWhat() {
        return upgradesWhat_native(pointer);
    }

    public static final UnitType Terran_Firebat = new UnitType(0);

    public static final UnitType Terran_Ghost = new UnitType(0);

    public static final UnitType Terran_Goliath = new UnitType(0);

    public static final UnitType Terran_Marine = new UnitType(0);

    public static final UnitType Terran_Medic = new UnitType(0);

    public static final UnitType Terran_SCV = new UnitType(0);

    public static final UnitType Terran_Siege_Tank_Siege_Mode = new UnitType(0);

    public static final UnitType Terran_Siege_Tank_Tank_Mode = new UnitType(0);

    public static final UnitType Terran_Vulture = new UnitType(0);

    public static final UnitType Terran_Vulture_Spider_Mine = new UnitType(0);

    public static final UnitType Terran_Battlecruiser = new UnitType(0);

    public static final UnitType Terran_Dropship = new UnitType(0);

    public static final UnitType Terran_Nuclear_Missile = new UnitType(0);

    public static final UnitType Terran_Science_Vessel = new UnitType(0);

    public static final UnitType Terran_Valkyrie = new UnitType(0);

    public static final UnitType Terran_Wraith = new UnitType(0);

    public static final UnitType Hero_Alan_Schezar = new UnitType(0);

    public static final UnitType Hero_Alexei_Stukov = new UnitType(0);

    public static final UnitType Hero_Arcturus_Mengsk = new UnitType(0);

    public static final UnitType Hero_Edmund_Duke_Tank_Mode = new UnitType(0);

    public static final UnitType Hero_Edmund_Duke_Siege_Mode = new UnitType(0);

    public static final UnitType Hero_Gerard_DuGalle = new UnitType(0);

    public static final UnitType Hero_Gui_Montag = new UnitType(0);

    public static final UnitType Hero_Hyperion = new UnitType(0);

    public static final UnitType Hero_Jim_Raynor_Marine = new UnitType(0);

    public static final UnitType Hero_Jim_Raynor_Vulture = new UnitType(0);

    public static final UnitType Hero_Magellan = new UnitType(0);

    public static final UnitType Hero_Norad_II = new UnitType(0);

    public static final UnitType Hero_Samir_Duran = new UnitType(0);

    public static final UnitType Hero_Sarah_Kerrigan = new UnitType(0);

    public static final UnitType Hero_Tom_Kazansky = new UnitType(0);

    public static final UnitType Terran_Civilian = new UnitType(0);

    public static final UnitType Terran_Academy = new UnitType(0);

    public static final UnitType Terran_Armory = new UnitType(0);

    public static final UnitType Terran_Barracks = new UnitType(0);

    public static final UnitType Terran_Bunker = new UnitType(0);

    public static final UnitType Terran_Command_Center = new UnitType(0);

    public static final UnitType Terran_Engineering_Bay = new UnitType(0);

    public static final UnitType Terran_Factory = new UnitType(0);

    public static final UnitType Terran_Missile_Turret = new UnitType(0);

    public static final UnitType Terran_Refinery = new UnitType(0);

    public static final UnitType Terran_Science_Facility = new UnitType(0);

    public static final UnitType Terran_Starport = new UnitType(0);

    public static final UnitType Terran_Supply_Depot = new UnitType(0);

    public static final UnitType Terran_Comsat_Station = new UnitType(0);

    public static final UnitType Terran_Control_Tower = new UnitType(0);

    public static final UnitType Terran_Covert_Ops = new UnitType(0);

    public static final UnitType Terran_Machine_Shop = new UnitType(0);

    public static final UnitType Terran_Nuclear_Silo = new UnitType(0);

    public static final UnitType Terran_Physics_Lab = new UnitType(0);

    public static final UnitType Special_Crashed_Norad_II = new UnitType(0);

    public static final UnitType Special_Ion_Cannon = new UnitType(0);

    public static final UnitType Special_Power_Generator = new UnitType(0);

    public static final UnitType Special_Psi_Disrupter = new UnitType(0);

    public static final UnitType Protoss_Archon = new UnitType(0);

    public static final UnitType Protoss_Dark_Archon = new UnitType(0);

    public static final UnitType Protoss_Dark_Templar = new UnitType(0);

    public static final UnitType Protoss_Dragoon = new UnitType(0);

    public static final UnitType Protoss_High_Templar = new UnitType(0);

    public static final UnitType Protoss_Probe = new UnitType(0);

    public static final UnitType Protoss_Reaver = new UnitType(0);

    public static final UnitType Protoss_Scarab = new UnitType(0);

    public static final UnitType Protoss_Zealot = new UnitType(0);

    public static final UnitType Protoss_Arbiter = new UnitType(0);

    public static final UnitType Protoss_Carrier = new UnitType(0);

    public static final UnitType Protoss_Corsair = new UnitType(0);

    public static final UnitType Protoss_Interceptor = new UnitType(0);

    public static final UnitType Protoss_Observer = new UnitType(0);

    public static final UnitType Protoss_Scout = new UnitType(0);

    public static final UnitType Protoss_Shuttle = new UnitType(0);

    public static final UnitType Hero_Aldaris = new UnitType(0);

    public static final UnitType Hero_Artanis = new UnitType(0);

    public static final UnitType Hero_Danimoth = new UnitType(0);

    public static final UnitType Hero_Dark_Templar = new UnitType(0);

    public static final UnitType Hero_Fenix_Dragoon = new UnitType(0);

    public static final UnitType Hero_Fenix_Zealot = new UnitType(0);

    public static final UnitType Hero_Gantrithor = new UnitType(0);

    public static final UnitType Hero_Mojo = new UnitType(0);

    public static final UnitType Hero_Raszagal = new UnitType(0);

    public static final UnitType Hero_Tassadar = new UnitType(0);

    public static final UnitType Hero_Tassadar_Zeratul_Archon = new UnitType(0);

    public static final UnitType Hero_Warbringer = new UnitType(0);

    public static final UnitType Hero_Zeratul = new UnitType(0);

    public static final UnitType Protoss_Arbiter_Tribunal = new UnitType(0);

    public static final UnitType Protoss_Assimilator = new UnitType(0);

    public static final UnitType Protoss_Citadel_of_Adun = new UnitType(0);

    public static final UnitType Protoss_Cybernetics_Core = new UnitType(0);

    public static final UnitType Protoss_Fleet_Beacon = new UnitType(0);

    public static final UnitType Protoss_Forge = new UnitType(0);

    public static final UnitType Protoss_Gateway = new UnitType(0);

    public static final UnitType Protoss_Nexus = new UnitType(0);

    public static final UnitType Protoss_Observatory = new UnitType(0);

    public static final UnitType Protoss_Photon_Cannon = new UnitType(0);

    public static final UnitType Protoss_Pylon = new UnitType(0);

    public static final UnitType Protoss_Robotics_Facility = new UnitType(0);

    public static final UnitType Protoss_Robotics_Support_Bay = new UnitType(0);

    public static final UnitType Protoss_Shield_Battery = new UnitType(0);

    public static final UnitType Protoss_Stargate = new UnitType(0);

    public static final UnitType Protoss_Templar_Archives = new UnitType(0);

    public static final UnitType Special_Khaydarin_Crystal_Form = new UnitType(0);

    public static final UnitType Special_Protoss_Temple = new UnitType(0);

    public static final UnitType Special_Stasis_Cell_Prison = new UnitType(0);

    public static final UnitType Special_Warp_Gate = new UnitType(0);

    public static final UnitType Special_XelNaga_Temple = new UnitType(0);

    public static final UnitType Zerg_Broodling = new UnitType(0);

    public static final UnitType Zerg_Defiler = new UnitType(0);

    public static final UnitType Zerg_Drone = new UnitType(0);

    public static final UnitType Zerg_Egg = new UnitType(0);

    public static final UnitType Zerg_Hydralisk = new UnitType(0);

    public static final UnitType Zerg_Infested_Terran = new UnitType(0);

    public static final UnitType Zerg_Larva = new UnitType(0);

    public static final UnitType Zerg_Lurker = new UnitType(0);

    public static final UnitType Zerg_Lurker_Egg = new UnitType(0);

    public static final UnitType Zerg_Ultralisk = new UnitType(0);

    public static final UnitType Zerg_Zergling = new UnitType(0);

    public static final UnitType Zerg_Cocoon = new UnitType(0);

    public static final UnitType Zerg_Devourer = new UnitType(0);

    public static final UnitType Zerg_Guardian = new UnitType(0);

    public static final UnitType Zerg_Mutalisk = new UnitType(0);

    public static final UnitType Zerg_Overlord = new UnitType(0);

    public static final UnitType Zerg_Queen = new UnitType(0);

    public static final UnitType Zerg_Scourge = new UnitType(0);

    public static final UnitType Hero_Devouring_One = new UnitType(0);

    public static final UnitType Hero_Hunter_Killer = new UnitType(0);

    public static final UnitType Hero_Infested_Duran = new UnitType(0);

    public static final UnitType Hero_Infested_Kerrigan = new UnitType(0);

    public static final UnitType Hero_Kukulza_Guardian = new UnitType(0);

    public static final UnitType Hero_Kukulza_Mutalisk = new UnitType(0);

    public static final UnitType Hero_Matriarch = new UnitType(0);

    public static final UnitType Hero_Torrasque = new UnitType(0);

    public static final UnitType Hero_Unclean_One = new UnitType(0);

    public static final UnitType Hero_Yggdrasill = new UnitType(0);

    public static final UnitType Zerg_Creep_Colony = new UnitType(0);

    public static final UnitType Zerg_Defiler_Mound = new UnitType(0);

    public static final UnitType Zerg_Evolution_Chamber = new UnitType(0);

    public static final UnitType Zerg_Extractor = new UnitType(0);

    public static final UnitType Zerg_Greater_Spire = new UnitType(0);

    public static final UnitType Zerg_Hatchery = new UnitType(0);

    public static final UnitType Zerg_Hive = new UnitType(0);

    public static final UnitType Zerg_Hydralisk_Den = new UnitType(0);

    public static final UnitType Zerg_Infested_Command_Center = new UnitType(0);

    public static final UnitType Zerg_Lair = new UnitType(0);

    public static final UnitType Zerg_Nydus_Canal = new UnitType(0);

    public static final UnitType Zerg_Queens_Nest = new UnitType(0);

    public static final UnitType Zerg_Spawning_Pool = new UnitType(0);

    public static final UnitType Zerg_Spire = new UnitType(0);

    public static final UnitType Zerg_Spore_Colony = new UnitType(0);

    public static final UnitType Zerg_Sunken_Colony = new UnitType(0);

    public static final UnitType Zerg_Ultralisk_Cavern = new UnitType(0);

    public static final UnitType Special_Cerebrate = new UnitType(0);

    public static final UnitType Special_Cerebrate_Daggoth = new UnitType(0);

    public static final UnitType Special_Mature_Chrysalis = new UnitType(0);

    public static final UnitType Special_Overmind = new UnitType(0);

    public static final UnitType Special_Overmind_Cocoon = new UnitType(0);

    public static final UnitType Special_Overmind_With_Shell = new UnitType(0);

    public static final UnitType Critter_Bengalaas = new UnitType(0);

    public static final UnitType Critter_Kakaru = new UnitType(0);

    public static final UnitType Critter_Ragnasaur = new UnitType(0);

    public static final UnitType Critter_Rhynadon = new UnitType(0);

    public static final UnitType Critter_Scantid = new UnitType(0);

    public static final UnitType Critter_Ursadon = new UnitType(0);

    public static final UnitType Resource_Mineral_Field = new UnitType(0);

    public static final UnitType Resource_Mineral_Field_Type_2 = new UnitType(0);

    public static final UnitType Resource_Mineral_Field_Type_3 = new UnitType(0);

    public static final UnitType Resource_Vespene_Geyser = new UnitType(0);

    public static final UnitType Spell_Dark_Swarm = new UnitType(0);

    public static final UnitType Spell_Disruption_Web = new UnitType(0);

    public static final UnitType Spell_Scanner_Sweep = new UnitType(0);

    public static final UnitType Special_Protoss_Beacon = new UnitType(0);

    public static final UnitType Special_Protoss_Flag_Beacon = new UnitType(0);

    public static final UnitType Special_Terran_Beacon = new UnitType(0);

    public static final UnitType Special_Terran_Flag_Beacon = new UnitType(0);

    public static final UnitType Special_Zerg_Beacon = new UnitType(0);

    public static final UnitType Special_Zerg_Flag_Beacon = new UnitType(0);

    public static final UnitType Powerup_Data_Disk = new UnitType(0);

    public static final UnitType Powerup_Flag = new UnitType(0);

    public static final UnitType Powerup_Khalis_Crystal = new UnitType(0);

    public static final UnitType Powerup_Khaydarin_Crystal = new UnitType(0);

    public static final UnitType Powerup_Mineral_Cluster_Type_1 = new UnitType(0);

    public static final UnitType Powerup_Mineral_Cluster_Type_2 = new UnitType(0);

    public static final UnitType Powerup_Protoss_Gas_Orb_Type_1 = new UnitType(0);

    public static final UnitType Powerup_Protoss_Gas_Orb_Type_2 = new UnitType(0);

    public static final UnitType Powerup_Psi_Emitter = new UnitType(0);

    public static final UnitType Powerup_Terran_Gas_Tank_Type_1 = new UnitType(0);

    public static final UnitType Powerup_Terran_Gas_Tank_Type_2 = new UnitType(0);

    public static final UnitType Powerup_Uraj_Crystal = new UnitType(0);

    public static final UnitType Powerup_Young_Chrysalis = new UnitType(0);

    public static final UnitType Powerup_Zerg_Gas_Sac_Type_1 = new UnitType(0);

    public static final UnitType Powerup_Zerg_Gas_Sac_Type_2 = new UnitType(0);

    public static final UnitType Special_Floor_Gun_Trap = new UnitType(0);

    public static final UnitType Special_Floor_Missile_Trap = new UnitType(0);

    public static final UnitType Special_Right_Wall_Flame_Trap = new UnitType(0);

    public static final UnitType Special_Right_Wall_Missile_Trap = new UnitType(0);

    public static final UnitType Special_Wall_Flame_Trap = new UnitType(0);

    public static final UnitType Special_Wall_Missile_Trap = new UnitType(0);

    public static final UnitType Special_Pit_Door = new UnitType(0);

    public static final UnitType Special_Right_Pit_Door = new UnitType(0);

    public static final UnitType Special_Right_Upper_Level_Door = new UnitType(0);

    public static final UnitType Special_Upper_Level_Door = new UnitType(0);

    public static final UnitType Special_Cargo_Ship = new UnitType(0);

    public static final UnitType Special_Floor_Hatch = new UnitType(0);

    public static final UnitType Special_Independant_Starport = new UnitType(0);

    public static final UnitType Special_Map_Revealer = new UnitType(0);

    public static final UnitType Special_Mercenary_Gunship = new UnitType(0);

    public static final UnitType Special_Start_Location = new UnitType(0);

    public static final UnitType None = new UnitType(0);

    public static final UnitType AllUnits = new UnitType(0);

    public static final UnitType Men = new UnitType(0);

    public static final UnitType Buildings = new UnitType(0);

    public static final UnitType Factories = new UnitType(0);

    public static final UnitType Unknown = new UnitType(0);


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

    private native Pair<UnitType, Integer> whatBuilds_native(long pointer);

    private native Map<UnitType, Integer> requiredUnits_native(long pointer);

    private native TechType requiredTech_native(long pointer);

    private native TechType cloakingTech_native(long pointer);

    private native List<TechType> abilities_native(long pointer);

    private native List<UpgradeType> upgrades_native(long pointer);

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

    private native boolean producesCreep_native(long pointer);

    private native boolean producesLarva_native(long pointer);

    private native boolean isMineralField_native(long pointer);

    private native boolean isCritter_native(long pointer);

    private native boolean canBuildAddon_native(long pointer);

    private native List<TechType> researchesWhat_native(long pointer);

    private native List<UpgradeType> upgradesWhat_native(long pointer);


}
