package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class BulletType {

    public String toString() {
        return toString_native(pointer);
    }

    public static final BulletType Melee = new BulletType(0);

    public static final BulletType Fusion_Cutter_Hit = new BulletType(0);

    public static final BulletType Gauss_Rifle_Hit = new BulletType(0);

    public static final BulletType C_10_Canister_Rifle_Hit = new BulletType(0);

    public static final BulletType Gemini_Missiles = new BulletType(0);

    public static final BulletType Fragmentation_Grenade = new BulletType(0);

    public static final BulletType Longbolt_Missile = new BulletType(0);

    public static final BulletType ATS_ATA_Laser_Battery = new BulletType(0);

    public static final BulletType Burst_Lasers = new BulletType(0);

    public static final BulletType Arclite_Shock_Cannon_Hit = new BulletType(0);

    public static final BulletType EMP_Missile = new BulletType(0);

    public static final BulletType Dual_Photon_Blasters_Hit = new BulletType(0);

    public static final BulletType Particle_Beam_Hit = new BulletType(0);

    public static final BulletType Anti_Matter_Missile = new BulletType(0);

    public static final BulletType Pulse_Cannon = new BulletType(0);

    public static final BulletType Psionic_Shockwave_Hit = new BulletType(0);

    public static final BulletType Psionic_Storm = new BulletType(0);

    public static final BulletType Yamato_Gun = new BulletType(0);

    public static final BulletType Phase_Disruptor = new BulletType(0);

    public static final BulletType STA_STS_Cannon_Overlay = new BulletType(0);

    public static final BulletType Sunken_Colony_Tentacle = new BulletType(0);

    public static final BulletType Acid_Spore = new BulletType(0);

    public static final BulletType Glave_Wurm = new BulletType(0);

    public static final BulletType Seeker_Spores = new BulletType(0);

    public static final BulletType Queen_Spell_Carrier = new BulletType(0);

    public static final BulletType Plague_Cloud = new BulletType(0);

    public static final BulletType Consume = new BulletType(0);

    public static final BulletType Ensnare = new BulletType(0);

    public static final BulletType Needle_Spine_Hit = new BulletType(0);

    public static final BulletType Invisible = new BulletType(0);

    public static final BulletType Optical_Flare_Grenade = new BulletType(0);

    public static final BulletType Halo_Rockets = new BulletType(0);

    public static final BulletType Subterranean_Spines = new BulletType(0);

    public static final BulletType Corrosive_Acid_Shot = new BulletType(0);

    public static final BulletType Neutron_Flare = new BulletType(0);

    public static final BulletType None = new BulletType(0);

    public static final BulletType Unknown = new BulletType(0);


    private static Map<Long, BulletType> instances = new HashMap<Long, BulletType>();

    private BulletType(long pointer) {
        this.pointer = pointer;
    }

    private static BulletType get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        BulletType instance = instances.get(pointer);
        if (instance == null ) {
            instance = new BulletType(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native String toString_native(long pointer);


}
