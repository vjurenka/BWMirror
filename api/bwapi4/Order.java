package bwapi4;

import bwapi4.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Order {

    public static Order Die;

    public static Order Stop;

    public static Order Guard;

    public static Order PlayerGuard;

    public static Order TurretGuard;

    public static Order BunkerGuard;

    public static Order Move;

    public static Order AttackUnit;

    public static Order AttackTile;

    public static Order Hover;

    public static Order AttackMove;

    public static Order InfestedCommandCenter;

    public static Order UnusedNothing;

    public static Order UnusedPowerup;

    public static Order TowerGuard;

    public static Order VultureMine;

    public static Order Nothing;

    public static Order CastInfestation;

    public static Order InfestingCommandCenter;

    public static Order PlaceBuilding;

    public static Order CreateProtossBuilding;

    public static Order ConstructingBuilding;

    public static Order Repair;

    public static Order PlaceAddon;

    public static Order BuildAddon;

    public static Order Train;

    public static Order RallyPointUnit;

    public static Order RallyPointTile;

    public static Order ZergBirth;

    public static Order ZergUnitMorph;

    public static Order ZergBuildingMorph;

    public static Order IncompleteBuilding;

    public static Order BuildNydusExit;

    public static Order EnterNydusCanal;

    public static Order Follow;

    public static Order Carrier;

    public static Order ReaverCarrierMove;

    public static Order CarrierIgnore2;

    public static Order Reaver;

    public static Order TrainFighter;

    public static Order InterceptorAttack;

    public static Order ScarabAttack;

    public static Order RechargeShieldsUnit;

    public static Order RechargeShieldsBattery;

    public static Order ShieldBattery;

    public static Order InterceptorReturn;

    public static Order BuildingLand;

    public static Order BuildingLiftOff;

    public static Order DroneLiftOff;

    public static Order LiftingOff;

    public static Order ResearchTech;

    public static Order Upgrade;

    public static Order Larva;

    public static Order SpawningLarva;

    public static Order Harvest1;

    public static Order Harvest2;

    public static Order MoveToGas;

    public static Order WaitForGas;

    public static Order HarvestGas;

    public static Order ReturnGas;

    public static Order MoveToMinerals;

    public static Order WaitForMinerals;

    public static Order MiningMinerals;

    public static Order Harvest3;

    public static Order Harvest4;

    public static Order ReturnMinerals;

    public static Order Interrupted;

    public static Order EnterTransport;

    public static Order PickupIdle;

    public static Order PickupTransport;

    public static Order PickupBunker;

    public static Order Pickup4;

    public static Order PowerupIdle;

    public static Order Sieging;

    public static Order Unsieging;

    public static Order InitCreepGrowth;

    public static Order SpreadCreep;

    public static Order StoppingCreepGrowth;

    public static Order GuardianAspect;

    public static Order ArchonWarp;

    public static Order CompletingArchonSummon;

    public static Order HoldPosition;

    public static Order Cloak;

    public static Order Decloak;

    public static Order Unload;

    public static Order MoveUnload;

    public static Order FireYamatoGun;

    public static Order CastLockdown;

    public static Order Burrowing;

    public static Order Burrowed;

    public static Order Unburrowing;

    public static Order CastDarkSwarm;

    public static Order CastParasite;

    public static Order CastSpawnBroodlings;

    public static Order CastEMPShockwave;

    public static Order NukeWait;

    public static Order NukeTrain;

    public static Order NukeLaunch;

    public static Order NukePaint;

    public static Order NukeUnit;

    public static Order CastNuclearStrike;

    public static Order NukeTrack;

    public static Order CloakNearbyUnits;

    public static Order PlaceMine;

    public static Order RightClickAction;

    public static Order CastRecall;

    public static Order Teleport;

    public static Order CastScannerSweep;

    public static Order Scanner;

    public static Order CastDefensiveMatrix;

    public static Order CastPsionicStorm;

    public static Order CastIrradiate;

    public static Order CastPlague;

    public static Order CastConsume;

    public static Order CastEnsnare;

    public static Order CastStasisField;

    public static Order CastHallucination;

    public static Order Hallucination2;

    public static Order ResetCollision;

    public static Order Patrol;

    public static Order CTFCOPInit;

    public static Order CTFCOPStarted;

    public static Order CTFCOP2;

    public static Order ComputerAI;

    public static Order AtkMoveEP;

    public static Order HarassMove;

    public static Order AIPatrol;

    public static Order GuardPost;

    public static Order RescuePassive;

    public static Order Neutral;

    public static Order ComputerReturn;

    public static Order SelfDestructing;

    public static Order Critter;

    public static Order HiddenGun;

    public static Order OpenDoor;

    public static Order CloseDoor;

    public static Order HideTrap;

    public static Order RevealTrap;

    public static Order EnableDoodad;

    public static Order DisableDoodad;

    public static Order WarpIn;

    public static Order Medic;

    public static Order MedicHeal;

    public static Order HealMove;

    public static Order MedicHealToIdle;

    public static Order CastRestoration;

    public static Order CastDisruptionWeb;

    public static Order CastMindControl;

    public static Order DarkArchonMeld;

    public static Order CastFeedback;

    public static Order CastOpticalFlare;

    public static Order CastMaelstrom;

    public static Order JunkYardDog;

    public static Order Fatal;

    public static Order None;

    public static Order Unknown;


    private static Map<Long, Order> instances = new HashMap<Long, Order>();

    private Order(long pointer) {
        this.pointer = pointer;
    }

    private static Order get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Order instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Order(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;


}
