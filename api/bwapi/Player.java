package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;

public class Player {

    public int getID() {
        return getID_native(pointer);
    }

    public String getName() {
        return getName_native(pointer);
    }

    public List<Unit> getUnits() {
        return getUnits_native(pointer);
    }

    public Race getRace() {
        return getRace_native(pointer);
    }

    public PlayerType getType() {
        return getType_native(pointer);
    }

    public Force getForce() {
        return getForce_native(pointer);
    }

    public boolean isAlly(Player player) {
        return isAlly_native(pointer, player);
    }

    public boolean isEnemy(Player player) {
        return isEnemy_native(pointer, player);
    }

    public boolean isNeutral() {
        return isNeutral_native(pointer);
    }

    public TilePosition getStartLocation() {
        return getStartLocation_native(pointer);
    }

    public boolean isVictorious() {
        return isVictorious_native(pointer);
    }

    public boolean isDefeated() {
        return isDefeated_native(pointer);
    }

    public boolean leftGame() {
        return leftGame_native(pointer);
    }

    public int minerals() {
        return minerals_native(pointer);
    }

    public int gas() {
        return gas_native(pointer);
    }

    public int gatheredMinerals() {
        return gatheredMinerals_native(pointer);
    }

    public int gatheredGas() {
        return gatheredGas_native(pointer);
    }

    public int repairedMinerals() {
        return repairedMinerals_native(pointer);
    }

    public int repairedGas() {
        return repairedGas_native(pointer);
    }

    public int refundedMinerals() {
        return refundedMinerals_native(pointer);
    }

    public int refundedGas() {
        return refundedGas_native(pointer);
    }

    public int spentMinerals() {
        return spentMinerals_native(pointer);
    }

    public int spentGas() {
        return spentGas_native(pointer);
    }

    public int supplyTotal() {
        return supplyTotal_native(pointer);
    }

    public int supplyTotal(Race race) {
        return supplyTotal_native(pointer, race);
    }

    public int supplyUsed() {
        return supplyUsed_native(pointer);
    }

    public int supplyUsed(Race race) {
        return supplyUsed_native(pointer, race);
    }

    public int allUnitCount() {
        return allUnitCount_native(pointer);
    }

    public int allUnitCount(UnitType unit) {
        return allUnitCount_native(pointer, unit);
    }

    public int visibleUnitCount() {
        return visibleUnitCount_native(pointer);
    }

    public int visibleUnitCount(UnitType unit) {
        return visibleUnitCount_native(pointer, unit);
    }

    public int completedUnitCount() {
        return completedUnitCount_native(pointer);
    }

    public int completedUnitCount(UnitType unit) {
        return completedUnitCount_native(pointer, unit);
    }

    public int incompleteUnitCount() {
        return incompleteUnitCount_native(pointer);
    }

    public int incompleteUnitCount(UnitType unit) {
        return incompleteUnitCount_native(pointer, unit);
    }

    public int deadUnitCount() {
        return deadUnitCount_native(pointer);
    }

    public int deadUnitCount(UnitType unit) {
        return deadUnitCount_native(pointer, unit);
    }

    public int killedUnitCount() {
        return killedUnitCount_native(pointer);
    }

    public int killedUnitCount(UnitType unit) {
        return killedUnitCount_native(pointer, unit);
    }

    public int getUpgradeLevel(UpgradeType upgrade) {
        return getUpgradeLevel_native(pointer, upgrade);
    }

    public boolean hasResearched(TechType tech) {
        return hasResearched_native(pointer, tech);
    }

    public boolean isResearching(TechType tech) {
        return isResearching_native(pointer, tech);
    }

    public boolean isUpgrading(UpgradeType upgrade) {
        return isUpgrading_native(pointer, upgrade);
    }

    public Color getColor() {
        return getColor_native(pointer);
    }

    public char getTextColor() {
        return getTextColor_native(pointer);
    }

    public int maxEnergy(UnitType unit) {
        return maxEnergy_native(pointer, unit);
    }

    public double topSpeed(UnitType unit) {
        return topSpeed_native(pointer, unit);
    }

    public int weaponMaxRange(WeaponType weapon) {
        return weaponMaxRange_native(pointer, weapon);
    }

    public int sightRange(UnitType unit) {
        return sightRange_native(pointer, unit);
    }

    public int weaponDamageCooldown(UnitType unit) {
        return weaponDamageCooldown_native(pointer, unit);
    }

    public int armor(UnitType unit) {
        return armor_native(pointer, unit);
    }

    public int damage(WeaponType wpn) {
        return damage_native(pointer, wpn);
    }

    public int getUnitScore() {
        return getUnitScore_native(pointer);
    }

    public int getKillScore() {
        return getKillScore_native(pointer);
    }

    public int getBuildingScore() {
        return getBuildingScore_native(pointer);
    }

    public int getRazingScore() {
        return getRazingScore_native(pointer);
    }

    public int getCustomScore() {
        return getCustomScore_native(pointer);
    }

    public boolean isObserver() {
        return isObserver_native(pointer);
    }

    public int getMaxUpgradeLevel(UpgradeType upgrade) {
        return getMaxUpgradeLevel_native(pointer, upgrade);
    }

    public boolean isResearchAvailable(TechType tech) {
        return isResearchAvailable_native(pointer, tech);
    }

    public boolean isUnitAvailable(UnitType unit) {
        return isUnitAvailable_native(pointer, unit);
    }

    public boolean hasUnitTypeRequirement(UnitType unit) {
        return hasUnitTypeRequirement_native(pointer, unit);
    }

    public boolean hasUnitTypeRequirement(UnitType unit, int amount) {
        return hasUnitTypeRequirement_native(pointer, unit, amount);
    }


    private static Map<Long, Player> instances = new HashMap<Long, Player>();

    private Player(long pointer) {
        this.pointer = pointer;
    }

    private static Player get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Player instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Player(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native int getID_native(long pointer);

    private native String getName_native(long pointer);

    private native List<Unit> getUnits_native(long pointer);

    private native Race getRace_native(long pointer);

    private native PlayerType getType_native(long pointer);

    private native Force getForce_native(long pointer);

    private native boolean isAlly_native(long pointer, Player player);

    private native boolean isEnemy_native(long pointer, Player player);

    private native boolean isNeutral_native(long pointer);

    private native TilePosition getStartLocation_native(long pointer);

    private native boolean isVictorious_native(long pointer);

    private native boolean isDefeated_native(long pointer);

    private native boolean leftGame_native(long pointer);

    private native int minerals_native(long pointer);

    private native int gas_native(long pointer);

    private native int gatheredMinerals_native(long pointer);

    private native int gatheredGas_native(long pointer);

    private native int repairedMinerals_native(long pointer);

    private native int repairedGas_native(long pointer);

    private native int refundedMinerals_native(long pointer);

    private native int refundedGas_native(long pointer);

    private native int spentMinerals_native(long pointer);

    private native int spentGas_native(long pointer);

    private native int supplyTotal_native(long pointer);

    private native int supplyTotal_native(long pointer, Race race);

    private native int supplyUsed_native(long pointer);

    private native int supplyUsed_native(long pointer, Race race);

    private native int allUnitCount_native(long pointer);

    private native int allUnitCount_native(long pointer, UnitType unit);

    private native int visibleUnitCount_native(long pointer);

    private native int visibleUnitCount_native(long pointer, UnitType unit);

    private native int completedUnitCount_native(long pointer);

    private native int completedUnitCount_native(long pointer, UnitType unit);

    private native int incompleteUnitCount_native(long pointer);

    private native int incompleteUnitCount_native(long pointer, UnitType unit);

    private native int deadUnitCount_native(long pointer);

    private native int deadUnitCount_native(long pointer, UnitType unit);

    private native int killedUnitCount_native(long pointer);

    private native int killedUnitCount_native(long pointer, UnitType unit);

    private native int getUpgradeLevel_native(long pointer, UpgradeType upgrade);

    private native boolean hasResearched_native(long pointer, TechType tech);

    private native boolean isResearching_native(long pointer, TechType tech);

    private native boolean isUpgrading_native(long pointer, UpgradeType upgrade);

    private native Color getColor_native(long pointer);

    private native char getTextColor_native(long pointer);

    private native int maxEnergy_native(long pointer, UnitType unit);

    private native double topSpeed_native(long pointer, UnitType unit);

    private native int weaponMaxRange_native(long pointer, WeaponType weapon);

    private native int sightRange_native(long pointer, UnitType unit);

    private native int weaponDamageCooldown_native(long pointer, UnitType unit);

    private native int armor_native(long pointer, UnitType unit);

    private native int damage_native(long pointer, WeaponType wpn);

    private native int getUnitScore_native(long pointer);

    private native int getKillScore_native(long pointer);

    private native int getBuildingScore_native(long pointer);

    private native int getRazingScore_native(long pointer);

    private native int getCustomScore_native(long pointer);

    private native boolean isObserver_native(long pointer);

    private native int getMaxUpgradeLevel_native(long pointer, UpgradeType upgrade);

    private native boolean isResearchAvailable_native(long pointer, TechType tech);

    private native boolean isUnitAvailable_native(long pointer, UnitType unit);

    private native boolean hasUnitTypeRequirement_native(long pointer, UnitType unit);

    private native boolean hasUnitTypeRequirement_native(long pointer, UnitType unit, int amount);


    public boolean equals(Object that){
        if(!(that instanceof Player)){
            return false;
        }
        return getID() == ((Player)that).getID();
    }

    public int hashCode(){
        return getID();
    }

}
