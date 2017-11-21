package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class WeaponType {

    public String toString() {
        return toString_native(pointer);
    }

    public TechType getTech() {
        return getTech_native(pointer);
    }

    public UnitType whatUses() {
        return whatUses_native(pointer);
    }

    public int damageAmount() {
        return damageAmount_native(pointer);
    }

    public int damageBonus() {
        return damageBonus_native(pointer);
    }

    public int damageCooldown() {
        return damageCooldown_native(pointer);
    }

    public int damageFactor() {
        return damageFactor_native(pointer);
    }

    public UpgradeType upgradeType() {
        return upgradeType_native(pointer);
    }

    public DamageType damageType() {
        return damageType_native(pointer);
    }

    public ExplosionType explosionType() {
        return explosionType_native(pointer);
    }

    public int minRange() {
        return minRange_native(pointer);
    }

    public int maxRange() {
        return maxRange_native(pointer);
    }

    public int innerSplashRadius() {
        return innerSplashRadius_native(pointer);
    }

    public int medianSplashRadius() {
        return medianSplashRadius_native(pointer);
    }

    public int outerSplashRadius() {
        return outerSplashRadius_native(pointer);
    }

    public boolean targetsAir() {
        return targetsAir_native(pointer);
    }

    public boolean targetsGround() {
        return targetsGround_native(pointer);
    }

    public boolean targetsMechanical() {
        return targetsMechanical_native(pointer);
    }

    public boolean targetsOrganic() {
        return targetsOrganic_native(pointer);
    }

    public boolean targetsNonBuilding() {
        return targetsNonBuilding_native(pointer);
    }

    public boolean targetsNonRobotic() {
        return targetsNonRobotic_native(pointer);
    }

    public boolean targetsTerrain() {
        return targetsTerrain_native(pointer);
    }

    public boolean targetsOrgOrMech() {
        return targetsOrgOrMech_native(pointer);
    }

    public boolean targetsOwn() {
        return targetsOwn_native(pointer);
    }

    public static final WeaponType Gauss_Rifle = new WeaponType(0);

    public static final WeaponType Gauss_Rifle_Jim_Raynor = new WeaponType(0);

    public static final WeaponType C_10_Canister_Rifle = new WeaponType(0);

    public static final WeaponType C_10_Canister_Rifle_Sarah_Kerrigan = new WeaponType(0);

    public static final WeaponType C_10_Canister_Rifle_Samir_Duran = new WeaponType(0);

    public static final WeaponType C_10_Canister_Rifle_Infested_Duran = new WeaponType(0);

    public static final WeaponType C_10_Canister_Rifle_Alexei_Stukov = new WeaponType(0);

    public static final WeaponType Fragmentation_Grenade = new WeaponType(0);

    public static final WeaponType Fragmentation_Grenade_Jim_Raynor = new WeaponType(0);

    public static final WeaponType Spider_Mines = new WeaponType(0);

    public static final WeaponType Twin_Autocannons = new WeaponType(0);

    public static final WeaponType Twin_Autocannons_Alan_Schezar = new WeaponType(0);

    public static final WeaponType Hellfire_Missile_Pack = new WeaponType(0);

    public static final WeaponType Hellfire_Missile_Pack_Alan_Schezar = new WeaponType(0);

    public static final WeaponType Arclite_Cannon = new WeaponType(0);

    public static final WeaponType Arclite_Cannon_Edmund_Duke = new WeaponType(0);

    public static final WeaponType Fusion_Cutter = new WeaponType(0);

    public static final WeaponType Gemini_Missiles = new WeaponType(0);

    public static final WeaponType Gemini_Missiles_Tom_Kazansky = new WeaponType(0);

    public static final WeaponType Burst_Lasers = new WeaponType(0);

    public static final WeaponType Burst_Lasers_Tom_Kazansky = new WeaponType(0);

    public static final WeaponType ATS_Laser_Battery = new WeaponType(0);

    public static final WeaponType ATS_Laser_Battery_Hero = new WeaponType(0);

    public static final WeaponType ATS_Laser_Battery_Hyperion = new WeaponType(0);

    public static final WeaponType ATA_Laser_Battery = new WeaponType(0);

    public static final WeaponType ATA_Laser_Battery_Hero = new WeaponType(0);

    public static final WeaponType ATA_Laser_Battery_Hyperion = new WeaponType(0);

    public static final WeaponType Flame_Thrower = new WeaponType(0);

    public static final WeaponType Flame_Thrower_Gui_Montag = new WeaponType(0);

    public static final WeaponType Arclite_Shock_Cannon = new WeaponType(0);

    public static final WeaponType Arclite_Shock_Cannon_Edmund_Duke = new WeaponType(0);

    public static final WeaponType Longbolt_Missile = new WeaponType(0);

    public static final WeaponType Claws = new WeaponType(0);

    public static final WeaponType Claws_Devouring_One = new WeaponType(0);

    public static final WeaponType Claws_Infested_Kerrigan = new WeaponType(0);

    public static final WeaponType Needle_Spines = new WeaponType(0);

    public static final WeaponType Needle_Spines_Hunter_Killer = new WeaponType(0);

    public static final WeaponType Kaiser_Blades = new WeaponType(0);

    public static final WeaponType Kaiser_Blades_Torrasque = new WeaponType(0);

    public static final WeaponType Toxic_Spores = new WeaponType(0);

    public static final WeaponType Spines = new WeaponType(0);

    public static final WeaponType Acid_Spore = new WeaponType(0);

    public static final WeaponType Acid_Spore_Kukulza = new WeaponType(0);

    public static final WeaponType Glave_Wurm = new WeaponType(0);

    public static final WeaponType Glave_Wurm_Kukulza = new WeaponType(0);

    public static final WeaponType Seeker_Spores = new WeaponType(0);

    public static final WeaponType Subterranean_Tentacle = new WeaponType(0);

    public static final WeaponType Suicide_Infested_Terran = new WeaponType(0);

    public static final WeaponType Suicide_Scourge = new WeaponType(0);

    public static final WeaponType Particle_Beam = new WeaponType(0);

    public static final WeaponType Psi_Blades = new WeaponType(0);

    public static final WeaponType Psi_Blades_Fenix = new WeaponType(0);

    public static final WeaponType Phase_Disruptor = new WeaponType(0);

    public static final WeaponType Phase_Disruptor_Fenix = new WeaponType(0);

    public static final WeaponType Psi_Assault = new WeaponType(0);

    public static final WeaponType Psionic_Shockwave = new WeaponType(0);

    public static final WeaponType Psionic_Shockwave_TZ_Archon = new WeaponType(0);

    public static final WeaponType Dual_Photon_Blasters = new WeaponType(0);

    public static final WeaponType Dual_Photon_Blasters_Mojo = new WeaponType(0);

    public static final WeaponType Dual_Photon_Blasters_Artanis = new WeaponType(0);

    public static final WeaponType Anti_Matter_Missiles = new WeaponType(0);

    public static final WeaponType Anti_Matter_Missiles_Mojo = new WeaponType(0);

    public static final WeaponType Anti_Matter_Missiles_Artanis = new WeaponType(0);

    public static final WeaponType Phase_Disruptor_Cannon = new WeaponType(0);

    public static final WeaponType Phase_Disruptor_Cannon_Danimoth = new WeaponType(0);

    public static final WeaponType Pulse_Cannon = new WeaponType(0);

    public static final WeaponType STS_Photon_Cannon = new WeaponType(0);

    public static final WeaponType STA_Photon_Cannon = new WeaponType(0);

    public static final WeaponType Scarab = new WeaponType(0);

    public static final WeaponType Neutron_Flare = new WeaponType(0);

    public static final WeaponType Halo_Rockets = new WeaponType(0);

    public static final WeaponType Corrosive_Acid = new WeaponType(0);

    public static final WeaponType Subterranean_Spines = new WeaponType(0);

    public static final WeaponType Warp_Blades = new WeaponType(0);

    public static final WeaponType Warp_Blades_Hero = new WeaponType(0);

    public static final WeaponType Warp_Blades_Zeratul = new WeaponType(0);

    public static final WeaponType Independant_Laser_Battery = new WeaponType(0);

    public static final WeaponType Twin_Autocannons_Floor_Trap = new WeaponType(0);

    public static final WeaponType Hellfire_Missile_Pack_Wall_Trap = new WeaponType(0);

    public static final WeaponType Flame_Thrower_Wall_Trap = new WeaponType(0);

    public static final WeaponType Hellfire_Missile_Pack_Floor_Trap = new WeaponType(0);

    public static final WeaponType Yamato_Gun = new WeaponType(0);

    public static final WeaponType Nuclear_Strike = new WeaponType(0);

    public static final WeaponType Lockdown = new WeaponType(0);

    public static final WeaponType EMP_Shockwave = new WeaponType(0);

    public static final WeaponType Irradiate = new WeaponType(0);

    public static final WeaponType Parasite = new WeaponType(0);

    public static final WeaponType Spawn_Broodlings = new WeaponType(0);

    public static final WeaponType Ensnare = new WeaponType(0);

    public static final WeaponType Dark_Swarm = new WeaponType(0);

    public static final WeaponType Plague = new WeaponType(0);

    public static final WeaponType Consume = new WeaponType(0);

    public static final WeaponType Stasis_Field = new WeaponType(0);

    public static final WeaponType Psionic_Storm = new WeaponType(0);

    public static final WeaponType Disruption_Web = new WeaponType(0);

    public static final WeaponType Restoration = new WeaponType(0);

    public static final WeaponType Mind_Control = new WeaponType(0);

    public static final WeaponType Feedback = new WeaponType(0);

    public static final WeaponType Optical_Flare = new WeaponType(0);

    public static final WeaponType Maelstrom = new WeaponType(0);

    public static final WeaponType None = new WeaponType(0);

    public static final WeaponType Unknown = new WeaponType(0);


    private static Map<Long, WeaponType> instances = new HashMap<Long, WeaponType>();

    private WeaponType(long pointer) {
        this.pointer = pointer;
    }

    private static WeaponType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        WeaponType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new WeaponType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);

    private native TechType getTech_native(long pointer);

    private native UnitType whatUses_native(long pointer);

    private native int damageAmount_native(long pointer);

    private native int damageBonus_native(long pointer);

    private native int damageCooldown_native(long pointer);

    private native int damageFactor_native(long pointer);

    private native UpgradeType upgradeType_native(long pointer);

    private native DamageType damageType_native(long pointer);

    private native ExplosionType explosionType_native(long pointer);

    private native int minRange_native(long pointer);

    private native int maxRange_native(long pointer);

    private native int innerSplashRadius_native(long pointer);

    private native int medianSplashRadius_native(long pointer);

    private native int outerSplashRadius_native(long pointer);

    private native boolean targetsAir_native(long pointer);

    private native boolean targetsGround_native(long pointer);

    private native boolean targetsMechanical_native(long pointer);

    private native boolean targetsOrganic_native(long pointer);

    private native boolean targetsNonBuilding_native(long pointer);

    private native boolean targetsNonRobotic_native(long pointer);

    private native boolean targetsTerrain_native(long pointer);

    private native boolean targetsOrgOrMech_native(long pointer);

    private native boolean targetsOwn_native(long pointer);


}
