package bwapi;

import bwapi.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import bwapi.PositionedObject;

public class Unit extends PositionedObject 
{

    public int getID() {
        return getID_native(pointer);
    }

    public boolean exists() {
        return exists_native(pointer);
    }

    public int getReplayID() {
        return getReplayID_native(pointer);
    }

    public Player getPlayer() {
        return getPlayer_native(pointer);
    }

    public UnitType getType() {
        return getType_native(pointer);
    }

    public Position getPosition() {
        return getPosition_native(pointer);
    }

    public TilePosition getTilePosition() {
        return getTilePosition_native(pointer);
    }

    public double getAngle() {
        return getAngle_native(pointer);
    }

    public double getVelocityX() {
        return getVelocityX_native(pointer);
    }

    public double getVelocityY() {
        return getVelocityY_native(pointer);
    }

    public Region getRegion() {
        return getRegion_native(pointer);
    }

    public int getLeft() {
        return getLeft_native(pointer);
    }

    public int getTop() {
        return getTop_native(pointer);
    }

    public int getRight() {
        return getRight_native(pointer);
    }

    public int getBottom() {
        return getBottom_native(pointer);
    }

    public int getHitPoints() {
        return getHitPoints_native(pointer);
    }

    public int getShields() {
        return getShields_native(pointer);
    }

    public int getEnergy() {
        return getEnergy_native(pointer);
    }

    public int getResources() {
        return getResources_native(pointer);
    }

    public int getResourceGroup() {
        return getResourceGroup_native(pointer);
    }

    public int getDistance(Position target) {
        return getDistance_native(pointer, target);
    }

    public int getDistance(Unit target) {
        return getDistance_native(pointer, target);
    }

    public int getDistance(PositionOrUnit target) {
        return getDistance_native(pointer, target);
    }

    public boolean hasPath(Position target) {
        return hasPath_native(pointer, target);
    }

    public boolean hasPath(Unit target) {
        return hasPath_native(pointer, target);
    }

    public boolean hasPath(PositionOrUnit target) {
        return hasPath_native(pointer, target);
    }

    public int getLastCommandFrame() {
        return getLastCommandFrame_native(pointer);
    }

    public UnitCommand getLastCommand() {
        return getLastCommand_native(pointer);
    }

    public Player getLastAttackingPlayer() {
        return getLastAttackingPlayer_native(pointer);
    }

    public UnitType getInitialType() {
        return getInitialType_native(pointer);
    }

    public Position getInitialPosition() {
        return getInitialPosition_native(pointer);
    }

    public TilePosition getInitialTilePosition() {
        return getInitialTilePosition_native(pointer);
    }

    public int getInitialHitPoints() {
        return getInitialHitPoints_native(pointer);
    }

    public int getInitialResources() {
        return getInitialResources_native(pointer);
    }

    public int getKillCount() {
        return getKillCount_native(pointer);
    }

    public int getAcidSporeCount() {
        return getAcidSporeCount_native(pointer);
    }

    public int getInterceptorCount() {
        return getInterceptorCount_native(pointer);
    }

    public int getScarabCount() {
        return getScarabCount_native(pointer);
    }

    public int getSpiderMineCount() {
        return getSpiderMineCount_native(pointer);
    }

    public int getGroundWeaponCooldown() {
        return getGroundWeaponCooldown_native(pointer);
    }

    public int getAirWeaponCooldown() {
        return getAirWeaponCooldown_native(pointer);
    }

    public int getSpellCooldown() {
        return getSpellCooldown_native(pointer);
    }

    public int getDefenseMatrixPoints() {
        return getDefenseMatrixPoints_native(pointer);
    }

    public int getDefenseMatrixTimer() {
        return getDefenseMatrixTimer_native(pointer);
    }

    public int getEnsnareTimer() {
        return getEnsnareTimer_native(pointer);
    }

    public int getIrradiateTimer() {
        return getIrradiateTimer_native(pointer);
    }

    public int getLockdownTimer() {
        return getLockdownTimer_native(pointer);
    }

    public int getMaelstromTimer() {
        return getMaelstromTimer_native(pointer);
    }

    public int getOrderTimer() {
        return getOrderTimer_native(pointer);
    }

    public int getPlagueTimer() {
        return getPlagueTimer_native(pointer);
    }

    public int getRemoveTimer() {
        return getRemoveTimer_native(pointer);
    }

    public int getStasisTimer() {
        return getStasisTimer_native(pointer);
    }

    public int getStimTimer() {
        return getStimTimer_native(pointer);
    }

    public UnitType getBuildType() {
        return getBuildType_native(pointer);
    }

    public List<UnitType> getTrainingQueue() {
        return getTrainingQueue_native(pointer);
    }

    public TechType getTech() {
        return getTech_native(pointer);
    }

    public UpgradeType getUpgrade() {
        return getUpgrade_native(pointer);
    }

    public int getRemainingBuildTime() {
        return getRemainingBuildTime_native(pointer);
    }

    public int getRemainingTrainTime() {
        return getRemainingTrainTime_native(pointer);
    }

    public int getRemainingResearchTime() {
        return getRemainingResearchTime_native(pointer);
    }

    public int getRemainingUpgradeTime() {
        return getRemainingUpgradeTime_native(pointer);
    }

    public Unit getBuildUnit() {
        return getBuildUnit_native(pointer);
    }

    public Unit getTarget() {
        return getTarget_native(pointer);
    }

    public Position getTargetPosition() {
        return getTargetPosition_native(pointer);
    }

    public Order getOrder() {
        return getOrder_native(pointer);
    }

    public Order getSecondaryOrder() {
        return getSecondaryOrder_native(pointer);
    }

    public Unit getOrderTarget() {
        return getOrderTarget_native(pointer);
    }

    public Position getOrderTargetPosition() {
        return getOrderTargetPosition_native(pointer);
    }

    public Position getRallyPosition() {
        return getRallyPosition_native(pointer);
    }

    public Unit getRallyUnit() {
        return getRallyUnit_native(pointer);
    }

    public Unit getAddon() {
        return getAddon_native(pointer);
    }

    public Unit getNydusExit() {
        return getNydusExit_native(pointer);
    }

    public Unit getPowerUp() {
        return getPowerUp_native(pointer);
    }

    public Unit getTransport() {
        return getTransport_native(pointer);
    }

    public List<Unit> getLoadedUnits() {
        return getLoadedUnits_native(pointer);
    }

    public int getSpaceRemaining() {
        return getSpaceRemaining_native(pointer);
    }

    public Unit getCarrier() {
        return getCarrier_native(pointer);
    }

    public List<Unit> getInterceptors() {
        return getInterceptors_native(pointer);
    }

    public Unit getHatchery() {
        return getHatchery_native(pointer);
    }

    public List<Unit> getLarva() {
        return getLarva_native(pointer);
    }

    public List<Unit> getUnitsInRadius(int radius) {
        return getUnitsInRadius_native(pointer, radius);
    }

    public List<Unit> getUnitsInWeaponRange(WeaponType weapon) {
        return getUnitsInWeaponRange_native(pointer, weapon);
    }

    public boolean hasNuke() {
        return hasNuke_native(pointer);
    }

    public boolean isAccelerating() {
        return isAccelerating_native(pointer);
    }

    public boolean isAttacking() {
        return isAttacking_native(pointer);
    }

    public boolean isAttackFrame() {
        return isAttackFrame_native(pointer);
    }

    public boolean isBeingConstructed() {
        return isBeingConstructed_native(pointer);
    }

    public boolean isBeingGathered() {
        return isBeingGathered_native(pointer);
    }

    public boolean isBeingHealed() {
        return isBeingHealed_native(pointer);
    }

    public boolean isBlind() {
        return isBlind_native(pointer);
    }

    public boolean isBraking() {
        return isBraking_native(pointer);
    }

    public boolean isBurrowed() {
        return isBurrowed_native(pointer);
    }

    public boolean isCarryingGas() {
        return isCarryingGas_native(pointer);
    }

    public boolean isCarryingMinerals() {
        return isCarryingMinerals_native(pointer);
    }

    public boolean isCloaked() {
        return isCloaked_native(pointer);
    }

    public boolean isCompleted() {
        return isCompleted_native(pointer);
    }

    public boolean isConstructing() {
        return isConstructing_native(pointer);
    }

    public boolean isDefenseMatrixed() {
        return isDefenseMatrixed_native(pointer);
    }

    public boolean isDetected() {
        return isDetected_native(pointer);
    }

    public boolean isEnsnared() {
        return isEnsnared_native(pointer);
    }

    public boolean isFlying() {
        return isFlying_native(pointer);
    }

    public boolean isFollowing() {
        return isFollowing_native(pointer);
    }

    public boolean isGatheringGas() {
        return isGatheringGas_native(pointer);
    }

    public boolean isGatheringMinerals() {
        return isGatheringMinerals_native(pointer);
    }

    public boolean isHallucination() {
        return isHallucination_native(pointer);
    }

    public boolean isHoldingPosition() {
        return isHoldingPosition_native(pointer);
    }

    public boolean isIdle() {
        return isIdle_native(pointer);
    }

    public boolean isInterruptible() {
        return isInterruptible_native(pointer);
    }

    public boolean isInvincible() {
        return isInvincible_native(pointer);
    }

    public boolean isInWeaponRange(Unit target) {
        return isInWeaponRange_native(pointer, target);
    }

    public boolean isIrradiated() {
        return isIrradiated_native(pointer);
    }

    public boolean isLifted() {
        return isLifted_native(pointer);
    }

    public boolean isLoaded() {
        return isLoaded_native(pointer);
    }

    public boolean isLockedDown() {
        return isLockedDown_native(pointer);
    }

    public boolean isMaelstrommed() {
        return isMaelstrommed_native(pointer);
    }

    public boolean isMorphing() {
        return isMorphing_native(pointer);
    }

    public boolean isMoving() {
        return isMoving_native(pointer);
    }

    public boolean isParasited() {
        return isParasited_native(pointer);
    }

    public boolean isPatrolling() {
        return isPatrolling_native(pointer);
    }

    public boolean isPlagued() {
        return isPlagued_native(pointer);
    }

    public boolean isRepairing() {
        return isRepairing_native(pointer);
    }

    public boolean isResearching() {
        return isResearching_native(pointer);
    }

    public boolean isSelected() {
        return isSelected_native(pointer);
    }

    public boolean isSieged() {
        return isSieged_native(pointer);
    }

    public boolean isStartingAttack() {
        return isStartingAttack_native(pointer);
    }

    public boolean isStasised() {
        return isStasised_native(pointer);
    }

    public boolean isStimmed() {
        return isStimmed_native(pointer);
    }

    public boolean isStuck() {
        return isStuck_native(pointer);
    }

    public boolean isTraining() {
        return isTraining_native(pointer);
    }

    public boolean isUnderAttack() {
        return isUnderAttack_native(pointer);
    }

    public boolean isUnderDarkSwarm() {
        return isUnderDarkSwarm_native(pointer);
    }

    public boolean isUnderDisruptionWeb() {
        return isUnderDisruptionWeb_native(pointer);
    }

    public boolean isUnderStorm() {
        return isUnderStorm_native(pointer);
    }

    public boolean isPowered() {
        return isPowered_native(pointer);
    }

    public boolean isUpgrading() {
        return isUpgrading_native(pointer);
    }

    public boolean isVisible() {
        return isVisible_native(pointer);
    }

    public boolean isVisible(Player player) {
        return isVisible_native(pointer, player);
    }

    public boolean isTargetable() {
        return isTargetable_native(pointer);
    }

    public boolean issueCommand(UnitCommand command) {
        return issueCommand_native(pointer, command);
    }

    public boolean attack(Position target) {
        return attack_native(pointer, target);
    }

    public boolean attack(Unit target) {
        return attack_native(pointer, target);
    }

    public boolean attack(PositionOrUnit target) {
        return attack_native(pointer, target);
    }

    public boolean attack(Position target, boolean shiftQueueCommand) {
        return attack_native(pointer, target, shiftQueueCommand);
    }

    public boolean attack(Unit target, boolean shiftQueueCommand) {
        return attack_native(pointer, target, shiftQueueCommand);
    }

    public boolean attack(PositionOrUnit target, boolean shiftQueueCommand) {
        return attack_native(pointer, target, shiftQueueCommand);
    }

    public boolean build(UnitType type) {
        return build_native(pointer, type);
    }

    public boolean build(UnitType type, TilePosition target) {
        return build_native(pointer, type, target);
    }

    public boolean buildAddon(UnitType type) {
        return buildAddon_native(pointer, type);
    }

    public boolean train() {
        return train_native(pointer);
    }

    public boolean train(UnitType type) {
        return train_native(pointer, type);
    }

    public boolean morph(UnitType type) {
        return morph_native(pointer, type);
    }

    public boolean research(TechType tech) {
        return research_native(pointer, tech);
    }

    public boolean upgrade(UpgradeType upgrade) {
        return upgrade_native(pointer, upgrade);
    }

    public boolean setRallyPoint(Position target) {
        return setRallyPoint_native(pointer, target);
    }

    public boolean setRallyPoint(Unit target) {
        return setRallyPoint_native(pointer, target);
    }

    public boolean setRallyPoint(PositionOrUnit target) {
        return setRallyPoint_native(pointer, target);
    }

    public boolean move(Position target) {
        return move_native(pointer, target);
    }

    public boolean move(Position target, boolean shiftQueueCommand) {
        return move_native(pointer, target, shiftQueueCommand);
    }

    public boolean patrol(Position target) {
        return patrol_native(pointer, target);
    }

    public boolean patrol(Position target, boolean shiftQueueCommand) {
        return patrol_native(pointer, target, shiftQueueCommand);
    }

    public boolean holdPosition() {
        return holdPosition_native(pointer);
    }

    public boolean holdPosition(boolean shiftQueueCommand) {
        return holdPosition_native(pointer, shiftQueueCommand);
    }

    public boolean stop() {
        return stop_native(pointer);
    }

    public boolean stop(boolean shiftQueueCommand) {
        return stop_native(pointer, shiftQueueCommand);
    }

    public boolean follow(Unit target) {
        return follow_native(pointer, target);
    }

    public boolean follow(Unit target, boolean shiftQueueCommand) {
        return follow_native(pointer, target, shiftQueueCommand);
    }

    public boolean gather(Unit target) {
        return gather_native(pointer, target);
    }

    public boolean gather(Unit target, boolean shiftQueueCommand) {
        return gather_native(pointer, target, shiftQueueCommand);
    }

    public boolean returnCargo() {
        return returnCargo_native(pointer);
    }

    public boolean returnCargo(boolean shiftQueueCommand) {
        return returnCargo_native(pointer, shiftQueueCommand);
    }

    public boolean repair(Unit target) {
        return repair_native(pointer, target);
    }

    public boolean repair(Unit target, boolean shiftQueueCommand) {
        return repair_native(pointer, target, shiftQueueCommand);
    }

    public boolean burrow() {
        return burrow_native(pointer);
    }

    public boolean unburrow() {
        return unburrow_native(pointer);
    }

    public boolean cloak() {
        return cloak_native(pointer);
    }

    public boolean decloak() {
        return decloak_native(pointer);
    }

    public boolean siege() {
        return siege_native(pointer);
    }

    public boolean unsiege() {
        return unsiege_native(pointer);
    }

    public boolean lift() {
        return lift_native(pointer);
    }

    public boolean land(TilePosition target) {
        return land_native(pointer, target);
    }

    public boolean load(Unit target) {
        return load_native(pointer, target);
    }

    public boolean load(Unit target, boolean shiftQueueCommand) {
        return load_native(pointer, target, shiftQueueCommand);
    }

    public boolean unload(Unit target) {
        return unload_native(pointer, target);
    }

    public boolean unloadAll() {
        return unloadAll_native(pointer);
    }

    public boolean unloadAll(boolean shiftQueueCommand) {
        return unloadAll_native(pointer, shiftQueueCommand);
    }

    public boolean unloadAll(Position target) {
        return unloadAll_native(pointer, target);
    }

    public boolean unloadAll(Position target, boolean shiftQueueCommand) {
        return unloadAll_native(pointer, target, shiftQueueCommand);
    }

    public boolean rightClick(Position target) {
        return rightClick_native(pointer, target);
    }

    public boolean rightClick(Unit target) {
        return rightClick_native(pointer, target);
    }

    public boolean rightClick(PositionOrUnit target) {
        return rightClick_native(pointer, target);
    }

    public boolean rightClick(Position target, boolean shiftQueueCommand) {
        return rightClick_native(pointer, target, shiftQueueCommand);
    }

    public boolean rightClick(Unit target, boolean shiftQueueCommand) {
        return rightClick_native(pointer, target, shiftQueueCommand);
    }

    public boolean rightClick(PositionOrUnit target, boolean shiftQueueCommand) {
        return rightClick_native(pointer, target, shiftQueueCommand);
    }

    public boolean haltConstruction() {
        return haltConstruction_native(pointer);
    }

    public boolean cancelConstruction() {
        return cancelConstruction_native(pointer);
    }

    public boolean cancelAddon() {
        return cancelAddon_native(pointer);
    }

    public boolean cancelTrain() {
        return cancelTrain_native(pointer);
    }

    public boolean cancelTrain(int slot) {
        return cancelTrain_native(pointer, slot);
    }

    public boolean cancelMorph() {
        return cancelMorph_native(pointer);
    }

    public boolean cancelResearch() {
        return cancelResearch_native(pointer);
    }

    public boolean cancelUpgrade() {
        return cancelUpgrade_native(pointer);
    }

    public boolean useTech(TechType tech) {
        return useTech_native(pointer, tech);
    }

    public boolean useTech(TechType tech, Position target) {
        return useTech_native(pointer, tech, target);
    }

    public boolean useTech(TechType tech, Unit target) {
        return useTech_native(pointer, tech, target);
    }

    public boolean useTech(TechType tech, PositionOrUnit target) {
        return useTech_native(pointer, tech, target);
    }

    public boolean placeCOP(TilePosition target) {
        return placeCOP_native(pointer, target);
    }

    public boolean canIssueCommand(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canIssueCommand_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanBuildUnitType, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canIssueCommand(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType, boolean checkCanTargetUnit) {
        return canIssueCommand_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanBuildUnitType, checkCanTargetUnit);
    }

    public boolean canIssueCommand(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType) {
        return canIssueCommand_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanBuildUnitType);
    }

    public boolean canIssueCommand(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits) {
        return canIssueCommand_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits);
    }

    public boolean canIssueCommand(UnitCommand command, boolean checkCanUseTechPositionOnPositions) {
        return canIssueCommand_native(pointer, command, checkCanUseTechPositionOnPositions);
    }

    public boolean canIssueCommand(UnitCommand command) {
        return canIssueCommand_native(pointer, command);
    }

    public boolean canIssueCommand(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canIssueCommand_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanBuildUnitType, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canIssueCommandGrouped(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canIssueCommandGrouped_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canIssueCommandGrouped(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canIssueCommandGrouped_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canIssueCommandGrouped(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit) {
        return canIssueCommandGrouped_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanTargetUnit);
    }

    public boolean canIssueCommandGrouped(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits) {
        return canIssueCommandGrouped_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits);
    }

    public boolean canIssueCommandGrouped(UnitCommand command, boolean checkCanUseTechPositionOnPositions) {
        return canIssueCommandGrouped_native(pointer, command, checkCanUseTechPositionOnPositions);
    }

    public boolean canIssueCommandGrouped(UnitCommand command) {
        return canIssueCommandGrouped_native(pointer, command);
    }

    public boolean canIssueCommandGrouped(UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canIssueCommandGrouped_native(pointer, command, checkCanUseTechPositionOnPositions, checkCanUseTechUnitOnUnits, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canCommand() {
        return canCommand_native(pointer);
    }

    public boolean canCommandGrouped() {
        return canCommandGrouped_native(pointer);
    }

    public boolean canCommandGrouped(boolean checkCommandibility) {
        return canCommandGrouped_native(pointer, checkCommandibility);
    }

    public boolean canIssueCommandType(UnitCommandType ct) {
        return canIssueCommandType_native(pointer, ct);
    }

    public boolean canIssueCommandType(UnitCommandType ct, boolean checkCommandibility) {
        return canIssueCommandType_native(pointer, ct, checkCommandibility);
    }

    public boolean canIssueCommandTypeGrouped(UnitCommandType ct, boolean checkCommandibilityGrouped) {
        return canIssueCommandTypeGrouped_native(pointer, ct, checkCommandibilityGrouped);
    }

    public boolean canIssueCommandTypeGrouped(UnitCommandType ct) {
        return canIssueCommandTypeGrouped_native(pointer, ct);
    }

    public boolean canIssueCommandTypeGrouped(UnitCommandType ct, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canIssueCommandTypeGrouped_native(pointer, ct, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canTargetUnit(Unit targetUnit) {
        return canTargetUnit_native(pointer, targetUnit);
    }

    public boolean canTargetUnit(Unit targetUnit, boolean checkCommandibility) {
        return canTargetUnit_native(pointer, targetUnit, checkCommandibility);
    }

    public boolean canAttack() {
        return canAttack_native(pointer);
    }

    public boolean canAttack(boolean checkCommandibility) {
        return canAttack_native(pointer, checkCommandibility);
    }

    public boolean canAttack(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttack_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttack(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttack_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttack(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttack_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttack(Position target, boolean checkCanTargetUnit) {
        return canAttack_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canAttack(Unit target, boolean checkCanTargetUnit) {
        return canAttack_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canAttack(PositionOrUnit target, boolean checkCanTargetUnit) {
        return canAttack_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canAttack(Position target) {
        return canAttack_native(pointer, target);
    }

    public boolean canAttack(Unit target) {
        return canAttack_native(pointer, target);
    }

    public boolean canAttack(PositionOrUnit target) {
        return canAttack_native(pointer, target);
    }

    public boolean canAttack(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canAttack_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canAttack(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canAttack_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canAttack(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canAttack_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canAttackGrouped(boolean checkCommandibilityGrouped) {
        return canAttackGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canAttackGrouped() {
        return canAttackGrouped_native(pointer);
    }

    public boolean canAttackGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canAttackGrouped(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canAttackGrouped(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canAttackGrouped(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canAttackGrouped(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttackGrouped(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttackGrouped(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttackGrouped(Position target, boolean checkCanTargetUnit) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canAttackGrouped(Unit target, boolean checkCanTargetUnit) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canAttackGrouped(PositionOrUnit target, boolean checkCanTargetUnit) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canAttackGrouped(Position target) {
        return canAttackGrouped_native(pointer, target);
    }

    public boolean canAttackGrouped(Unit target) {
        return canAttackGrouped_native(pointer, target);
    }

    public boolean canAttackGrouped(PositionOrUnit target) {
        return canAttackGrouped_native(pointer, target);
    }

    public boolean canAttackGrouped(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canAttackGrouped(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canAttackGrouped(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canAttackMove() {
        return canAttackMove_native(pointer);
    }

    public boolean canAttackMove(boolean checkCommandibility) {
        return canAttackMove_native(pointer, checkCommandibility);
    }

    public boolean canAttackMoveGrouped(boolean checkCommandibilityGrouped) {
        return canAttackMoveGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canAttackMoveGrouped() {
        return canAttackMoveGrouped_native(pointer);
    }

    public boolean canAttackMoveGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackMoveGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canAttackUnit() {
        return canAttackUnit_native(pointer);
    }

    public boolean canAttackUnit(boolean checkCommandibility) {
        return canAttackUnit_native(pointer, checkCommandibility);
    }

    public boolean canAttackUnit(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttackUnit_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttackUnit(Unit targetUnit, boolean checkCanTargetUnit) {
        return canAttackUnit_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canAttackUnit(Unit targetUnit) {
        return canAttackUnit_native(pointer, targetUnit);
    }

    public boolean canAttackUnit(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canAttackUnit_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canAttackUnitGrouped(boolean checkCommandibilityGrouped) {
        return canAttackUnitGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canAttackUnitGrouped() {
        return canAttackUnitGrouped_native(pointer);
    }

    public boolean canAttackUnitGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackUnitGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canAttackUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canAttackUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canAttackUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canAttackUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canAttackUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit) {
        return canAttackUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canAttackUnitGrouped(Unit targetUnit) {
        return canAttackUnitGrouped_native(pointer, targetUnit);
    }

    public boolean canAttackUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canAttackUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canBuild() {
        return canBuild_native(pointer);
    }

    public boolean canBuild(boolean checkCommandibility) {
        return canBuild_native(pointer, checkCommandibility);
    }

    public boolean canBuild(UnitType uType, boolean checkCanIssueCommandType) {
        return canBuild_native(pointer, uType, checkCanIssueCommandType);
    }

    public boolean canBuild(UnitType uType) {
        return canBuild_native(pointer, uType);
    }

    public boolean canBuild(UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canBuild_native(pointer, uType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canBuild(UnitType uType, TilePosition tilePos, boolean checkTargetUnitType, boolean checkCanIssueCommandType) {
        return canBuild_native(pointer, uType, tilePos, checkTargetUnitType, checkCanIssueCommandType);
    }

    public boolean canBuild(UnitType uType, TilePosition tilePos, boolean checkTargetUnitType) {
        return canBuild_native(pointer, uType, tilePos, checkTargetUnitType);
    }

    public boolean canBuild(UnitType uType, TilePosition tilePos) {
        return canBuild_native(pointer, uType, tilePos);
    }

    public boolean canBuild(UnitType uType, TilePosition tilePos, boolean checkTargetUnitType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canBuild_native(pointer, uType, tilePos, checkTargetUnitType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canBuildAddon() {
        return canBuildAddon_native(pointer);
    }

    public boolean canBuildAddon(boolean checkCommandibility) {
        return canBuildAddon_native(pointer, checkCommandibility);
    }

    public boolean canBuildAddon(UnitType uType, boolean checkCanIssueCommandType) {
        return canBuildAddon_native(pointer, uType, checkCanIssueCommandType);
    }

    public boolean canBuildAddon(UnitType uType) {
        return canBuildAddon_native(pointer, uType);
    }

    public boolean canBuildAddon(UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canBuildAddon_native(pointer, uType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canTrain() {
        return canTrain_native(pointer);
    }

    public boolean canTrain(boolean checkCommandibility) {
        return canTrain_native(pointer, checkCommandibility);
    }

    public boolean canTrain(UnitType uType, boolean checkCanIssueCommandType) {
        return canTrain_native(pointer, uType, checkCanIssueCommandType);
    }

    public boolean canTrain(UnitType uType) {
        return canTrain_native(pointer, uType);
    }

    public boolean canTrain(UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canTrain_native(pointer, uType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canMorph() {
        return canMorph_native(pointer);
    }

    public boolean canMorph(boolean checkCommandibility) {
        return canMorph_native(pointer, checkCommandibility);
    }

    public boolean canMorph(UnitType uType, boolean checkCanIssueCommandType) {
        return canMorph_native(pointer, uType, checkCanIssueCommandType);
    }

    public boolean canMorph(UnitType uType) {
        return canMorph_native(pointer, uType);
    }

    public boolean canMorph(UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canMorph_native(pointer, uType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canResearch() {
        return canResearch_native(pointer);
    }

    public boolean canResearch(boolean checkCommandibility) {
        return canResearch_native(pointer, checkCommandibility);
    }

    public boolean canResearch(TechType type) {
        return canResearch_native(pointer, type);
    }

    public boolean canResearch(TechType type, boolean checkCanIssueCommandType) {
        return canResearch_native(pointer, type, checkCanIssueCommandType);
    }

    public boolean canUpgrade() {
        return canUpgrade_native(pointer);
    }

    public boolean canUpgrade(boolean checkCommandibility) {
        return canUpgrade_native(pointer, checkCommandibility);
    }

    public boolean canUpgrade(UpgradeType type) {
        return canUpgrade_native(pointer, type);
    }

    public boolean canUpgrade(UpgradeType type, boolean checkCanIssueCommandType) {
        return canUpgrade_native(pointer, type, checkCanIssueCommandType);
    }

    public boolean canSetRallyPoint() {
        return canSetRallyPoint_native(pointer);
    }

    public boolean canSetRallyPoint(boolean checkCommandibility) {
        return canSetRallyPoint_native(pointer, checkCommandibility);
    }

    public boolean canSetRallyPoint(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canSetRallyPoint(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canSetRallyPoint(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canSetRallyPoint(Position target, boolean checkCanTargetUnit) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canSetRallyPoint(Unit target, boolean checkCanTargetUnit) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canSetRallyPoint(PositionOrUnit target, boolean checkCanTargetUnit) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canSetRallyPoint(Position target) {
        return canSetRallyPoint_native(pointer, target);
    }

    public boolean canSetRallyPoint(Unit target) {
        return canSetRallyPoint_native(pointer, target);
    }

    public boolean canSetRallyPoint(PositionOrUnit target) {
        return canSetRallyPoint_native(pointer, target);
    }

    public boolean canSetRallyPoint(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canSetRallyPoint(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canSetRallyPoint(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canSetRallyPoint_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canSetRallyPosition() {
        return canSetRallyPosition_native(pointer);
    }

    public boolean canSetRallyPosition(boolean checkCommandibility) {
        return canSetRallyPosition_native(pointer, checkCommandibility);
    }

    public boolean canSetRallyUnit() {
        return canSetRallyUnit_native(pointer);
    }

    public boolean canSetRallyUnit(boolean checkCommandibility) {
        return canSetRallyUnit_native(pointer, checkCommandibility);
    }

    public boolean canSetRallyUnit(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canSetRallyUnit_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canSetRallyUnit(Unit targetUnit, boolean checkCanTargetUnit) {
        return canSetRallyUnit_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canSetRallyUnit(Unit targetUnit) {
        return canSetRallyUnit_native(pointer, targetUnit);
    }

    public boolean canSetRallyUnit(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canSetRallyUnit_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canMove() {
        return canMove_native(pointer);
    }

    public boolean canMove(boolean checkCommandibility) {
        return canMove_native(pointer, checkCommandibility);
    }

    public boolean canMoveGrouped(boolean checkCommandibilityGrouped) {
        return canMoveGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canMoveGrouped() {
        return canMoveGrouped_native(pointer);
    }

    public boolean canMoveGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canMoveGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canPatrol() {
        return canPatrol_native(pointer);
    }

    public boolean canPatrol(boolean checkCommandibility) {
        return canPatrol_native(pointer, checkCommandibility);
    }

    public boolean canPatrolGrouped(boolean checkCommandibilityGrouped) {
        return canPatrolGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canPatrolGrouped() {
        return canPatrolGrouped_native(pointer);
    }

    public boolean canPatrolGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canPatrolGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canFollow() {
        return canFollow_native(pointer);
    }

    public boolean canFollow(boolean checkCommandibility) {
        return canFollow_native(pointer, checkCommandibility);
    }

    public boolean canFollow(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canFollow_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canFollow(Unit targetUnit, boolean checkCanTargetUnit) {
        return canFollow_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canFollow(Unit targetUnit) {
        return canFollow_native(pointer, targetUnit);
    }

    public boolean canFollow(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canFollow_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canGather() {
        return canGather_native(pointer);
    }

    public boolean canGather(boolean checkCommandibility) {
        return canGather_native(pointer, checkCommandibility);
    }

    public boolean canGather(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canGather_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canGather(Unit targetUnit, boolean checkCanTargetUnit) {
        return canGather_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canGather(Unit targetUnit) {
        return canGather_native(pointer, targetUnit);
    }

    public boolean canGather(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canGather_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canReturnCargo() {
        return canReturnCargo_native(pointer);
    }

    public boolean canReturnCargo(boolean checkCommandibility) {
        return canReturnCargo_native(pointer, checkCommandibility);
    }

    public boolean canHoldPosition() {
        return canHoldPosition_native(pointer);
    }

    public boolean canHoldPosition(boolean checkCommandibility) {
        return canHoldPosition_native(pointer, checkCommandibility);
    }

    public boolean canStop() {
        return canStop_native(pointer);
    }

    public boolean canStop(boolean checkCommandibility) {
        return canStop_native(pointer, checkCommandibility);
    }

    public boolean canRepair() {
        return canRepair_native(pointer);
    }

    public boolean canRepair(boolean checkCommandibility) {
        return canRepair_native(pointer, checkCommandibility);
    }

    public boolean canRepair(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRepair_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRepair(Unit targetUnit, boolean checkCanTargetUnit) {
        return canRepair_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canRepair(Unit targetUnit) {
        return canRepair_native(pointer, targetUnit);
    }

    public boolean canRepair(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canRepair_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canBurrow() {
        return canBurrow_native(pointer);
    }

    public boolean canBurrow(boolean checkCommandibility) {
        return canBurrow_native(pointer, checkCommandibility);
    }

    public boolean canUnburrow() {
        return canUnburrow_native(pointer);
    }

    public boolean canUnburrow(boolean checkCommandibility) {
        return canUnburrow_native(pointer, checkCommandibility);
    }

    public boolean canCloak() {
        return canCloak_native(pointer);
    }

    public boolean canCloak(boolean checkCommandibility) {
        return canCloak_native(pointer, checkCommandibility);
    }

    public boolean canDecloak() {
        return canDecloak_native(pointer);
    }

    public boolean canDecloak(boolean checkCommandibility) {
        return canDecloak_native(pointer, checkCommandibility);
    }

    public boolean canSiege() {
        return canSiege_native(pointer);
    }

    public boolean canSiege(boolean checkCommandibility) {
        return canSiege_native(pointer, checkCommandibility);
    }

    public boolean canUnsiege() {
        return canUnsiege_native(pointer);
    }

    public boolean canUnsiege(boolean checkCommandibility) {
        return canUnsiege_native(pointer, checkCommandibility);
    }

    public boolean canLift() {
        return canLift_native(pointer);
    }

    public boolean canLift(boolean checkCommandibility) {
        return canLift_native(pointer, checkCommandibility);
    }

    public boolean canLand() {
        return canLand_native(pointer);
    }

    public boolean canLand(boolean checkCommandibility) {
        return canLand_native(pointer, checkCommandibility);
    }

    public boolean canLand(TilePosition target, boolean checkCanIssueCommandType) {
        return canLand_native(pointer, target, checkCanIssueCommandType);
    }

    public boolean canLand(TilePosition target) {
        return canLand_native(pointer, target);
    }

    public boolean canLand(TilePosition target, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canLand_native(pointer, target, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canLoad() {
        return canLoad_native(pointer);
    }

    public boolean canLoad(boolean checkCommandibility) {
        return canLoad_native(pointer, checkCommandibility);
    }

    public boolean canLoad(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canLoad_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canLoad(Unit targetUnit, boolean checkCanTargetUnit) {
        return canLoad_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canLoad(Unit targetUnit) {
        return canLoad_native(pointer, targetUnit);
    }

    public boolean canLoad(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canLoad_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUnloadWithOrWithoutTarget() {
        return canUnloadWithOrWithoutTarget_native(pointer);
    }

    public boolean canUnloadWithOrWithoutTarget(boolean checkCommandibility) {
        return canUnloadWithOrWithoutTarget_native(pointer, checkCommandibility);
    }

    public boolean canUnloadAtPosition(Position targDropPos, boolean checkCanIssueCommandType) {
        return canUnloadAtPosition_native(pointer, targDropPos, checkCanIssueCommandType);
    }

    public boolean canUnloadAtPosition(Position targDropPos) {
        return canUnloadAtPosition_native(pointer, targDropPos);
    }

    public boolean canUnloadAtPosition(Position targDropPos, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUnloadAtPosition_native(pointer, targDropPos, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUnload() {
        return canUnload_native(pointer);
    }

    public boolean canUnload(boolean checkCommandibility) {
        return canUnload_native(pointer, checkCommandibility);
    }

    public boolean canUnload(Unit targetUnit, boolean checkCanTargetUnit, boolean checkPosition, boolean checkCanIssueCommandType) {
        return canUnload_native(pointer, targetUnit, checkCanTargetUnit, checkPosition, checkCanIssueCommandType);
    }

    public boolean canUnload(Unit targetUnit, boolean checkCanTargetUnit, boolean checkPosition) {
        return canUnload_native(pointer, targetUnit, checkCanTargetUnit, checkPosition);
    }

    public boolean canUnload(Unit targetUnit, boolean checkCanTargetUnit) {
        return canUnload_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canUnload(Unit targetUnit) {
        return canUnload_native(pointer, targetUnit);
    }

    public boolean canUnload(Unit targetUnit, boolean checkCanTargetUnit, boolean checkPosition, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUnload_native(pointer, targetUnit, checkCanTargetUnit, checkPosition, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUnloadAll() {
        return canUnloadAll_native(pointer);
    }

    public boolean canUnloadAll(boolean checkCommandibility) {
        return canUnloadAll_native(pointer, checkCommandibility);
    }

    public boolean canUnloadAllPosition() {
        return canUnloadAllPosition_native(pointer);
    }

    public boolean canUnloadAllPosition(boolean checkCommandibility) {
        return canUnloadAllPosition_native(pointer, checkCommandibility);
    }

    public boolean canUnloadAllPosition(Position targDropPos, boolean checkCanIssueCommandType) {
        return canUnloadAllPosition_native(pointer, targDropPos, checkCanIssueCommandType);
    }

    public boolean canUnloadAllPosition(Position targDropPos) {
        return canUnloadAllPosition_native(pointer, targDropPos);
    }

    public boolean canUnloadAllPosition(Position targDropPos, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUnloadAllPosition_native(pointer, targDropPos, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canRightClick() {
        return canRightClick_native(pointer);
    }

    public boolean canRightClick(boolean checkCommandibility) {
        return canRightClick_native(pointer, checkCommandibility);
    }

    public boolean canRightClick(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClick_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClick(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClick_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClick(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClick_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClick(Position target, boolean checkCanTargetUnit) {
        return canRightClick_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canRightClick(Unit target, boolean checkCanTargetUnit) {
        return canRightClick_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canRightClick(PositionOrUnit target, boolean checkCanTargetUnit) {
        return canRightClick_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canRightClick(Position target) {
        return canRightClick_native(pointer, target);
    }

    public boolean canRightClick(Unit target) {
        return canRightClick_native(pointer, target);
    }

    public boolean canRightClick(PositionOrUnit target) {
        return canRightClick_native(pointer, target);
    }

    public boolean canRightClick(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canRightClick_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canRightClick(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canRightClick_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canRightClick(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canRightClick_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canRightClickGrouped(boolean checkCommandibilityGrouped) {
        return canRightClickGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canRightClickGrouped() {
        return canRightClickGrouped_native(pointer);
    }

    public boolean canRightClickGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canRightClickGrouped(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canRightClickGrouped(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canRightClickGrouped(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canRightClickGrouped(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClickGrouped(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClickGrouped(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClickGrouped(Position target, boolean checkCanTargetUnit) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canRightClickGrouped(Unit target, boolean checkCanTargetUnit) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canRightClickGrouped(PositionOrUnit target, boolean checkCanTargetUnit) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit);
    }

    public boolean canRightClickGrouped(Position target) {
        return canRightClickGrouped_native(pointer, target);
    }

    public boolean canRightClickGrouped(Unit target) {
        return canRightClickGrouped_native(pointer, target);
    }

    public boolean canRightClickGrouped(PositionOrUnit target) {
        return canRightClickGrouped_native(pointer, target);
    }

    public boolean canRightClickGrouped(Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canRightClickGrouped(Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canRightClickGrouped(PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickGrouped_native(pointer, target, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canRightClickPosition() {
        return canRightClickPosition_native(pointer);
    }

    public boolean canRightClickPosition(boolean checkCommandibility) {
        return canRightClickPosition_native(pointer, checkCommandibility);
    }

    public boolean canRightClickPositionGrouped(boolean checkCommandibilityGrouped) {
        return canRightClickPositionGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canRightClickPositionGrouped() {
        return canRightClickPositionGrouped_native(pointer);
    }

    public boolean canRightClickPositionGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickPositionGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canRightClickUnit() {
        return canRightClickUnit_native(pointer);
    }

    public boolean canRightClickUnit(boolean checkCommandibility) {
        return canRightClickUnit_native(pointer, checkCommandibility);
    }

    public boolean canRightClickUnit(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClickUnit_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClickUnit(Unit targetUnit, boolean checkCanTargetUnit) {
        return canRightClickUnit_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canRightClickUnit(Unit targetUnit) {
        return canRightClickUnit_native(pointer, targetUnit);
    }

    public boolean canRightClickUnit(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canRightClickUnit_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canRightClickUnitGrouped(boolean checkCommandibilityGrouped) {
        return canRightClickUnitGrouped_native(pointer, checkCommandibilityGrouped);
    }

    public boolean canRightClickUnitGrouped() {
        return canRightClickUnitGrouped_native(pointer);
    }

    public boolean canRightClickUnitGrouped(boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickUnitGrouped_native(pointer, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canRightClickUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped) {
        return canRightClickUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped);
    }

    public boolean canRightClickUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType) {
        return canRightClickUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType);
    }

    public boolean canRightClickUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit) {
        return canRightClickUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit);
    }

    public boolean canRightClickUnitGrouped(Unit targetUnit) {
        return canRightClickUnitGrouped_native(pointer, targetUnit);
    }

    public boolean canRightClickUnitGrouped(Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility) {
        return canRightClickUnitGrouped_native(pointer, targetUnit, checkCanTargetUnit, checkCanIssueCommandType, checkCommandibilityGrouped, checkCommandibility);
    }

    public boolean canHaltConstruction() {
        return canHaltConstruction_native(pointer);
    }

    public boolean canHaltConstruction(boolean checkCommandibility) {
        return canHaltConstruction_native(pointer, checkCommandibility);
    }

    public boolean canCancelConstruction() {
        return canCancelConstruction_native(pointer);
    }

    public boolean canCancelConstruction(boolean checkCommandibility) {
        return canCancelConstruction_native(pointer, checkCommandibility);
    }

    public boolean canCancelAddon() {
        return canCancelAddon_native(pointer);
    }

    public boolean canCancelAddon(boolean checkCommandibility) {
        return canCancelAddon_native(pointer, checkCommandibility);
    }

    public boolean canCancelTrain() {
        return canCancelTrain_native(pointer);
    }

    public boolean canCancelTrain(boolean checkCommandibility) {
        return canCancelTrain_native(pointer, checkCommandibility);
    }

    public boolean canCancelTrainSlot() {
        return canCancelTrainSlot_native(pointer);
    }

    public boolean canCancelTrainSlot(boolean checkCommandibility) {
        return canCancelTrainSlot_native(pointer, checkCommandibility);
    }

    public boolean canCancelTrainSlot(int slot, boolean checkCanIssueCommandType) {
        return canCancelTrainSlot_native(pointer, slot, checkCanIssueCommandType);
    }

    public boolean canCancelTrainSlot(int slot) {
        return canCancelTrainSlot_native(pointer, slot);
    }

    public boolean canCancelTrainSlot(int slot, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canCancelTrainSlot_native(pointer, slot, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canCancelMorph() {
        return canCancelMorph_native(pointer);
    }

    public boolean canCancelMorph(boolean checkCommandibility) {
        return canCancelMorph_native(pointer, checkCommandibility);
    }

    public boolean canCancelResearch() {
        return canCancelResearch_native(pointer);
    }

    public boolean canCancelResearch(boolean checkCommandibility) {
        return canCancelResearch_native(pointer, checkCommandibility);
    }

    public boolean canCancelUpgrade() {
        return canCancelUpgrade_native(pointer);
    }

    public boolean canCancelUpgrade(boolean checkCommandibility) {
        return canCancelUpgrade_native(pointer, checkCommandibility);
    }

    public boolean canUseTechWithOrWithoutTarget() {
        return canUseTechWithOrWithoutTarget_native(pointer);
    }

    public boolean canUseTechWithOrWithoutTarget(boolean checkCommandibility) {
        return canUseTechWithOrWithoutTarget_native(pointer, checkCommandibility);
    }

    public boolean canUseTechWithOrWithoutTarget(TechType tech, boolean checkCanIssueCommandType) {
        return canUseTechWithOrWithoutTarget_native(pointer, tech, checkCanIssueCommandType);
    }

    public boolean canUseTechWithOrWithoutTarget(TechType tech) {
        return canUseTechWithOrWithoutTarget_native(pointer, tech);
    }

    public boolean canUseTechWithOrWithoutTarget(TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTechWithOrWithoutTarget_native(pointer, tech, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTech(TechType tech, Position target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType, checkCanIssueCommandType);
    }

    public boolean canUseTech(TechType tech, Unit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType, checkCanIssueCommandType);
    }

    public boolean canUseTech(TechType tech, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType, checkCanIssueCommandType);
    }

    public boolean canUseTech(TechType tech, Position target, boolean checkCanTargetUnit, boolean checkTargetsType) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType);
    }

    public boolean canUseTech(TechType tech, Unit target, boolean checkCanTargetUnit, boolean checkTargetsType) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType);
    }

    public boolean canUseTech(TechType tech, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkTargetsType) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType);
    }

    public boolean canUseTech(TechType tech, Position target, boolean checkCanTargetUnit) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit);
    }

    public boolean canUseTech(TechType tech, Unit target, boolean checkCanTargetUnit) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit);
    }

    public boolean canUseTech(TechType tech, PositionOrUnit target, boolean checkCanTargetUnit) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit);
    }

    public boolean canUseTech(TechType tech, Position target) {
        return canUseTech_native(pointer, tech, target);
    }

    public boolean canUseTech(TechType tech, Unit target) {
        return canUseTech_native(pointer, tech, target);
    }

    public boolean canUseTech(TechType tech, PositionOrUnit target) {
        return canUseTech_native(pointer, tech, target);
    }

    public boolean canUseTech(TechType tech) {
        return canUseTech_native(pointer, tech);
    }

    public boolean canUseTech(TechType tech, Position target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTech(TechType tech, Unit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTech(TechType tech, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTech_native(pointer, tech, target, checkCanTargetUnit, checkTargetsType, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTechWithoutTarget(TechType tech, boolean checkCanIssueCommandType) {
        return canUseTechWithoutTarget_native(pointer, tech, checkCanIssueCommandType);
    }

    public boolean canUseTechWithoutTarget(TechType tech) {
        return canUseTechWithoutTarget_native(pointer, tech);
    }

    public boolean canUseTechWithoutTarget(TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTechWithoutTarget_native(pointer, tech, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTechUnit(TechType tech, boolean checkCanIssueCommandType) {
        return canUseTechUnit_native(pointer, tech, checkCanIssueCommandType);
    }

    public boolean canUseTechUnit(TechType tech) {
        return canUseTechUnit_native(pointer, tech);
    }

    public boolean canUseTechUnit(TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTechUnit_native(pointer, tech, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTechUnit(TechType tech, Unit targetUnit, boolean checkCanTargetUnit, boolean checkTargetsUnits, boolean checkCanIssueCommandType) {
        return canUseTechUnit_native(pointer, tech, targetUnit, checkCanTargetUnit, checkTargetsUnits, checkCanIssueCommandType);
    }

    public boolean canUseTechUnit(TechType tech, Unit targetUnit, boolean checkCanTargetUnit, boolean checkTargetsUnits) {
        return canUseTechUnit_native(pointer, tech, targetUnit, checkCanTargetUnit, checkTargetsUnits);
    }

    public boolean canUseTechUnit(TechType tech, Unit targetUnit, boolean checkCanTargetUnit) {
        return canUseTechUnit_native(pointer, tech, targetUnit, checkCanTargetUnit);
    }

    public boolean canUseTechUnit(TechType tech, Unit targetUnit) {
        return canUseTechUnit_native(pointer, tech, targetUnit);
    }

    public boolean canUseTechUnit(TechType tech, Unit targetUnit, boolean checkCanTargetUnit, boolean checkTargetsUnits, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTechUnit_native(pointer, tech, targetUnit, checkCanTargetUnit, checkTargetsUnits, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTechPosition(TechType tech, boolean checkCanIssueCommandType) {
        return canUseTechPosition_native(pointer, tech, checkCanIssueCommandType);
    }

    public boolean canUseTechPosition(TechType tech) {
        return canUseTechPosition_native(pointer, tech);
    }

    public boolean canUseTechPosition(TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTechPosition_native(pointer, tech, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canUseTechPosition(TechType tech, Position target, boolean checkTargetsPositions, boolean checkCanIssueCommandType) {
        return canUseTechPosition_native(pointer, tech, target, checkTargetsPositions, checkCanIssueCommandType);
    }

    public boolean canUseTechPosition(TechType tech, Position target, boolean checkTargetsPositions) {
        return canUseTechPosition_native(pointer, tech, target, checkTargetsPositions);
    }

    public boolean canUseTechPosition(TechType tech, Position target) {
        return canUseTechPosition_native(pointer, tech, target);
    }

    public boolean canUseTechPosition(TechType tech, Position target, boolean checkTargetsPositions, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canUseTechPosition_native(pointer, tech, target, checkTargetsPositions, checkCanIssueCommandType, checkCommandibility);
    }

    public boolean canPlaceCOP() {
        return canPlaceCOP_native(pointer);
    }

    public boolean canPlaceCOP(boolean checkCommandibility) {
        return canPlaceCOP_native(pointer, checkCommandibility);
    }

    public boolean canPlaceCOP(TilePosition target, boolean checkCanIssueCommandType) {
        return canPlaceCOP_native(pointer, target, checkCanIssueCommandType);
    }

    public boolean canPlaceCOP(TilePosition target) {
        return canPlaceCOP_native(pointer, target);
    }

    public boolean canPlaceCOP(TilePosition target, boolean checkCanIssueCommandType, boolean checkCommandibility) {
        return canPlaceCOP_native(pointer, target, checkCanIssueCommandType, checkCommandibility);
    }


    private static Map<Long, Unit> instances = new HashMap<Long, Unit>();

    private Unit(long pointer) {
        this.pointer = pointer;
    }

    private static Unit get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Unit instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Unit(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native int getID_native(long pointer);

    private native boolean exists_native(long pointer);

    private native int getReplayID_native(long pointer);

    private native Player getPlayer_native(long pointer);

    private native UnitType getType_native(long pointer);

    private native Position getPosition_native(long pointer);

    private native TilePosition getTilePosition_native(long pointer);

    private native double getAngle_native(long pointer);

    private native double getVelocityX_native(long pointer);

    private native double getVelocityY_native(long pointer);

    private native Region getRegion_native(long pointer);

    private native int getLeft_native(long pointer);

    private native int getTop_native(long pointer);

    private native int getRight_native(long pointer);

    private native int getBottom_native(long pointer);

    private native int getHitPoints_native(long pointer);

    private native int getShields_native(long pointer);

    private native int getEnergy_native(long pointer);

    private native int getResources_native(long pointer);

    private native int getResourceGroup_native(long pointer);

    private native int getDistance_native(long pointer, Position target);

    private native int getDistance_native(long pointer, Unit target);

    private native int getDistance_native(long pointer, PositionOrUnit target);

    private native boolean hasPath_native(long pointer, Position target);

    private native boolean hasPath_native(long pointer, Unit target);

    private native boolean hasPath_native(long pointer, PositionOrUnit target);

    private native int getLastCommandFrame_native(long pointer);

    private native UnitCommand getLastCommand_native(long pointer);

    private native Player getLastAttackingPlayer_native(long pointer);

    private native UnitType getInitialType_native(long pointer);

    private native Position getInitialPosition_native(long pointer);

    private native TilePosition getInitialTilePosition_native(long pointer);

    private native int getInitialHitPoints_native(long pointer);

    private native int getInitialResources_native(long pointer);

    private native int getKillCount_native(long pointer);

    private native int getAcidSporeCount_native(long pointer);

    private native int getInterceptorCount_native(long pointer);

    private native int getScarabCount_native(long pointer);

    private native int getSpiderMineCount_native(long pointer);

    private native int getGroundWeaponCooldown_native(long pointer);

    private native int getAirWeaponCooldown_native(long pointer);

    private native int getSpellCooldown_native(long pointer);

    private native int getDefenseMatrixPoints_native(long pointer);

    private native int getDefenseMatrixTimer_native(long pointer);

    private native int getEnsnareTimer_native(long pointer);

    private native int getIrradiateTimer_native(long pointer);

    private native int getLockdownTimer_native(long pointer);

    private native int getMaelstromTimer_native(long pointer);

    private native int getOrderTimer_native(long pointer);

    private native int getPlagueTimer_native(long pointer);

    private native int getRemoveTimer_native(long pointer);

    private native int getStasisTimer_native(long pointer);

    private native int getStimTimer_native(long pointer);

    private native UnitType getBuildType_native(long pointer);

    private native List<UnitType> getTrainingQueue_native(long pointer);

    private native TechType getTech_native(long pointer);

    private native UpgradeType getUpgrade_native(long pointer);

    private native int getRemainingBuildTime_native(long pointer);

    private native int getRemainingTrainTime_native(long pointer);

    private native int getRemainingResearchTime_native(long pointer);

    private native int getRemainingUpgradeTime_native(long pointer);

    private native Unit getBuildUnit_native(long pointer);

    private native Unit getTarget_native(long pointer);

    private native Position getTargetPosition_native(long pointer);

    private native Order getOrder_native(long pointer);

    private native Order getSecondaryOrder_native(long pointer);

    private native Unit getOrderTarget_native(long pointer);

    private native Position getOrderTargetPosition_native(long pointer);

    private native Position getRallyPosition_native(long pointer);

    private native Unit getRallyUnit_native(long pointer);

    private native Unit getAddon_native(long pointer);

    private native Unit getNydusExit_native(long pointer);

    private native Unit getPowerUp_native(long pointer);

    private native Unit getTransport_native(long pointer);

    private native List<Unit> getLoadedUnits_native(long pointer);

    private native int getSpaceRemaining_native(long pointer);

    private native Unit getCarrier_native(long pointer);

    private native List<Unit> getInterceptors_native(long pointer);

    private native Unit getHatchery_native(long pointer);

    private native List<Unit> getLarva_native(long pointer);

    private native List<Unit> getUnitsInRadius_native(long pointer, int radius);

    private native List<Unit> getUnitsInWeaponRange_native(long pointer, WeaponType weapon);

    private native boolean hasNuke_native(long pointer);

    private native boolean isAccelerating_native(long pointer);

    private native boolean isAttacking_native(long pointer);

    private native boolean isAttackFrame_native(long pointer);

    private native boolean isBeingConstructed_native(long pointer);

    private native boolean isBeingGathered_native(long pointer);

    private native boolean isBeingHealed_native(long pointer);

    private native boolean isBlind_native(long pointer);

    private native boolean isBraking_native(long pointer);

    private native boolean isBurrowed_native(long pointer);

    private native boolean isCarryingGas_native(long pointer);

    private native boolean isCarryingMinerals_native(long pointer);

    private native boolean isCloaked_native(long pointer);

    private native boolean isCompleted_native(long pointer);

    private native boolean isConstructing_native(long pointer);

    private native boolean isDefenseMatrixed_native(long pointer);

    private native boolean isDetected_native(long pointer);

    private native boolean isEnsnared_native(long pointer);

    private native boolean isFlying_native(long pointer);

    private native boolean isFollowing_native(long pointer);

    private native boolean isGatheringGas_native(long pointer);

    private native boolean isGatheringMinerals_native(long pointer);

    private native boolean isHallucination_native(long pointer);

    private native boolean isHoldingPosition_native(long pointer);

    private native boolean isIdle_native(long pointer);

    private native boolean isInterruptible_native(long pointer);

    private native boolean isInvincible_native(long pointer);

    private native boolean isInWeaponRange_native(long pointer, Unit target);

    private native boolean isIrradiated_native(long pointer);

    private native boolean isLifted_native(long pointer);

    private native boolean isLoaded_native(long pointer);

    private native boolean isLockedDown_native(long pointer);

    private native boolean isMaelstrommed_native(long pointer);

    private native boolean isMorphing_native(long pointer);

    private native boolean isMoving_native(long pointer);

    private native boolean isParasited_native(long pointer);

    private native boolean isPatrolling_native(long pointer);

    private native boolean isPlagued_native(long pointer);

    private native boolean isRepairing_native(long pointer);

    private native boolean isResearching_native(long pointer);

    private native boolean isSelected_native(long pointer);

    private native boolean isSieged_native(long pointer);

    private native boolean isStartingAttack_native(long pointer);

    private native boolean isStasised_native(long pointer);

    private native boolean isStimmed_native(long pointer);

    private native boolean isStuck_native(long pointer);

    private native boolean isTraining_native(long pointer);

    private native boolean isUnderAttack_native(long pointer);

    private native boolean isUnderDarkSwarm_native(long pointer);

    private native boolean isUnderDisruptionWeb_native(long pointer);

    private native boolean isUnderStorm_native(long pointer);

    private native boolean isPowered_native(long pointer);

    private native boolean isUpgrading_native(long pointer);

    private native boolean isVisible_native(long pointer);

    private native boolean isVisible_native(long pointer, Player player);

    private native boolean isTargetable_native(long pointer);

    private native boolean issueCommand_native(long pointer, UnitCommand command);

    private native boolean attack_native(long pointer, Position target);

    private native boolean attack_native(long pointer, Unit target);

    private native boolean attack_native(long pointer, PositionOrUnit target);

    private native boolean attack_native(long pointer, Position target, boolean shiftQueueCommand);

    private native boolean attack_native(long pointer, Unit target, boolean shiftQueueCommand);

    private native boolean attack_native(long pointer, PositionOrUnit target, boolean shiftQueueCommand);

    private native boolean build_native(long pointer, UnitType type);

    private native boolean build_native(long pointer, UnitType type, TilePosition target);

    private native boolean buildAddon_native(long pointer, UnitType type);

    private native boolean train_native(long pointer);

    private native boolean train_native(long pointer, UnitType type);

    private native boolean morph_native(long pointer, UnitType type);

    private native boolean research_native(long pointer, TechType tech);

    private native boolean upgrade_native(long pointer, UpgradeType upgrade);

    private native boolean setRallyPoint_native(long pointer, Position target);

    private native boolean setRallyPoint_native(long pointer, Unit target);

    private native boolean setRallyPoint_native(long pointer, PositionOrUnit target);

    private native boolean move_native(long pointer, Position target);

    private native boolean move_native(long pointer, Position target, boolean shiftQueueCommand);

    private native boolean patrol_native(long pointer, Position target);

    private native boolean patrol_native(long pointer, Position target, boolean shiftQueueCommand);

    private native boolean holdPosition_native(long pointer);

    private native boolean holdPosition_native(long pointer, boolean shiftQueueCommand);

    private native boolean stop_native(long pointer);

    private native boolean stop_native(long pointer, boolean shiftQueueCommand);

    private native boolean follow_native(long pointer, Unit target);

    private native boolean follow_native(long pointer, Unit target, boolean shiftQueueCommand);

    private native boolean gather_native(long pointer, Unit target);

    private native boolean gather_native(long pointer, Unit target, boolean shiftQueueCommand);

    private native boolean returnCargo_native(long pointer);

    private native boolean returnCargo_native(long pointer, boolean shiftQueueCommand);

    private native boolean repair_native(long pointer, Unit target);

    private native boolean repair_native(long pointer, Unit target, boolean shiftQueueCommand);

    private native boolean burrow_native(long pointer);

    private native boolean unburrow_native(long pointer);

    private native boolean cloak_native(long pointer);

    private native boolean decloak_native(long pointer);

    private native boolean siege_native(long pointer);

    private native boolean unsiege_native(long pointer);

    private native boolean lift_native(long pointer);

    private native boolean land_native(long pointer, TilePosition target);

    private native boolean load_native(long pointer, Unit target);

    private native boolean load_native(long pointer, Unit target, boolean shiftQueueCommand);

    private native boolean unload_native(long pointer, Unit target);

    private native boolean unloadAll_native(long pointer);

    private native boolean unloadAll_native(long pointer, boolean shiftQueueCommand);

    private native boolean unloadAll_native(long pointer, Position target);

    private native boolean unloadAll_native(long pointer, Position target, boolean shiftQueueCommand);

    private native boolean rightClick_native(long pointer, Position target);

    private native boolean rightClick_native(long pointer, Unit target);

    private native boolean rightClick_native(long pointer, PositionOrUnit target);

    private native boolean rightClick_native(long pointer, Position target, boolean shiftQueueCommand);

    private native boolean rightClick_native(long pointer, Unit target, boolean shiftQueueCommand);

    private native boolean rightClick_native(long pointer, PositionOrUnit target, boolean shiftQueueCommand);

    private native boolean haltConstruction_native(long pointer);

    private native boolean cancelConstruction_native(long pointer);

    private native boolean cancelAddon_native(long pointer);

    private native boolean cancelTrain_native(long pointer);

    private native boolean cancelTrain_native(long pointer, int slot);

    private native boolean cancelMorph_native(long pointer);

    private native boolean cancelResearch_native(long pointer);

    private native boolean cancelUpgrade_native(long pointer);

    private native boolean useTech_native(long pointer, TechType tech);

    private native boolean useTech_native(long pointer, TechType tech, Position target);

    private native boolean useTech_native(long pointer, TechType tech, Unit target);

    private native boolean useTech_native(long pointer, TechType tech, PositionOrUnit target);

    private native boolean placeCOP_native(long pointer, TilePosition target);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType, boolean checkCanTargetUnit);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command);

    private native boolean canIssueCommand_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanBuildUnitType, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command);

    private native boolean canIssueCommandGrouped_native(long pointer, UnitCommand command, boolean checkCanUseTechPositionOnPositions, boolean checkCanUseTechUnitOnUnits, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canCommand_native(long pointer);

    private native boolean canCommandGrouped_native(long pointer);

    private native boolean canCommandGrouped_native(long pointer, boolean checkCommandibility);

    private native boolean canIssueCommandType_native(long pointer, UnitCommandType ct);

    private native boolean canIssueCommandType_native(long pointer, UnitCommandType ct, boolean checkCommandibility);

    private native boolean canIssueCommandTypeGrouped_native(long pointer, UnitCommandType ct, boolean checkCommandibilityGrouped);

    private native boolean canIssueCommandTypeGrouped_native(long pointer, UnitCommandType ct);

    private native boolean canIssueCommandTypeGrouped_native(long pointer, UnitCommandType ct, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canTargetUnit_native(long pointer, Unit targetUnit);

    private native boolean canTargetUnit_native(long pointer, Unit targetUnit, boolean checkCommandibility);

    private native boolean canAttack_native(long pointer);

    private native boolean canAttack_native(long pointer, boolean checkCommandibility);

    private native boolean canAttack_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttack_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttack_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttack_native(long pointer, Position target, boolean checkCanTargetUnit);

    private native boolean canAttack_native(long pointer, Unit target, boolean checkCanTargetUnit);

    private native boolean canAttack_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit);

    private native boolean canAttack_native(long pointer, Position target);

    private native boolean canAttack_native(long pointer, Unit target);

    private native boolean canAttack_native(long pointer, PositionOrUnit target);

    private native boolean canAttack_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canAttack_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canAttack_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canAttackGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canAttackGrouped_native(long pointer);

    private native boolean canAttackGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canAttackGrouped_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canAttackGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canAttackGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canAttackGrouped_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttackGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttackGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttackGrouped_native(long pointer, Position target, boolean checkCanTargetUnit);

    private native boolean canAttackGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit);

    private native boolean canAttackGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit);

    private native boolean canAttackGrouped_native(long pointer, Position target);

    private native boolean canAttackGrouped_native(long pointer, Unit target);

    private native boolean canAttackGrouped_native(long pointer, PositionOrUnit target);

    private native boolean canAttackGrouped_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canAttackGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canAttackGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canAttackMove_native(long pointer);

    private native boolean canAttackMove_native(long pointer, boolean checkCommandibility);

    private native boolean canAttackMoveGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canAttackMoveGrouped_native(long pointer);

    private native boolean canAttackMoveGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canAttackUnit_native(long pointer);

    private native boolean canAttackUnit_native(long pointer, boolean checkCommandibility);

    private native boolean canAttackUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttackUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canAttackUnit_native(long pointer, Unit targetUnit);

    private native boolean canAttackUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canAttackUnitGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canAttackUnitGrouped_native(long pointer);

    private native boolean canAttackUnitGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canAttackUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canAttackUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canAttackUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canAttackUnitGrouped_native(long pointer, Unit targetUnit);

    private native boolean canAttackUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canBuild_native(long pointer);

    private native boolean canBuild_native(long pointer, boolean checkCommandibility);

    private native boolean canBuild_native(long pointer, UnitType uType, boolean checkCanIssueCommandType);

    private native boolean canBuild_native(long pointer, UnitType uType);

    private native boolean canBuild_native(long pointer, UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canBuild_native(long pointer, UnitType uType, TilePosition tilePos, boolean checkTargetUnitType, boolean checkCanIssueCommandType);

    private native boolean canBuild_native(long pointer, UnitType uType, TilePosition tilePos, boolean checkTargetUnitType);

    private native boolean canBuild_native(long pointer, UnitType uType, TilePosition tilePos);

    private native boolean canBuild_native(long pointer, UnitType uType, TilePosition tilePos, boolean checkTargetUnitType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canBuildAddon_native(long pointer);

    private native boolean canBuildAddon_native(long pointer, boolean checkCommandibility);

    private native boolean canBuildAddon_native(long pointer, UnitType uType, boolean checkCanIssueCommandType);

    private native boolean canBuildAddon_native(long pointer, UnitType uType);

    private native boolean canBuildAddon_native(long pointer, UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canTrain_native(long pointer);

    private native boolean canTrain_native(long pointer, boolean checkCommandibility);

    private native boolean canTrain_native(long pointer, UnitType uType, boolean checkCanIssueCommandType);

    private native boolean canTrain_native(long pointer, UnitType uType);

    private native boolean canTrain_native(long pointer, UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canMorph_native(long pointer);

    private native boolean canMorph_native(long pointer, boolean checkCommandibility);

    private native boolean canMorph_native(long pointer, UnitType uType, boolean checkCanIssueCommandType);

    private native boolean canMorph_native(long pointer, UnitType uType);

    private native boolean canMorph_native(long pointer, UnitType uType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canResearch_native(long pointer);

    private native boolean canResearch_native(long pointer, boolean checkCommandibility);

    private native boolean canResearch_native(long pointer, TechType type);

    private native boolean canResearch_native(long pointer, TechType type, boolean checkCanIssueCommandType);

    private native boolean canUpgrade_native(long pointer);

    private native boolean canUpgrade_native(long pointer, boolean checkCommandibility);

    private native boolean canUpgrade_native(long pointer, UpgradeType type);

    private native boolean canUpgrade_native(long pointer, UpgradeType type, boolean checkCanIssueCommandType);

    private native boolean canSetRallyPoint_native(long pointer);

    private native boolean canSetRallyPoint_native(long pointer, boolean checkCommandibility);

    private native boolean canSetRallyPoint_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canSetRallyPoint_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canSetRallyPoint_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canSetRallyPoint_native(long pointer, Position target, boolean checkCanTargetUnit);

    private native boolean canSetRallyPoint_native(long pointer, Unit target, boolean checkCanTargetUnit);

    private native boolean canSetRallyPoint_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit);

    private native boolean canSetRallyPoint_native(long pointer, Position target);

    private native boolean canSetRallyPoint_native(long pointer, Unit target);

    private native boolean canSetRallyPoint_native(long pointer, PositionOrUnit target);

    private native boolean canSetRallyPoint_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canSetRallyPoint_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canSetRallyPoint_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canSetRallyPosition_native(long pointer);

    private native boolean canSetRallyPosition_native(long pointer, boolean checkCommandibility);

    private native boolean canSetRallyUnit_native(long pointer);

    private native boolean canSetRallyUnit_native(long pointer, boolean checkCommandibility);

    private native boolean canSetRallyUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canSetRallyUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canSetRallyUnit_native(long pointer, Unit targetUnit);

    private native boolean canSetRallyUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canMove_native(long pointer);

    private native boolean canMove_native(long pointer, boolean checkCommandibility);

    private native boolean canMoveGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canMoveGrouped_native(long pointer);

    private native boolean canMoveGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canPatrol_native(long pointer);

    private native boolean canPatrol_native(long pointer, boolean checkCommandibility);

    private native boolean canPatrolGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canPatrolGrouped_native(long pointer);

    private native boolean canPatrolGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canFollow_native(long pointer);

    private native boolean canFollow_native(long pointer, boolean checkCommandibility);

    private native boolean canFollow_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canFollow_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canFollow_native(long pointer, Unit targetUnit);

    private native boolean canFollow_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canGather_native(long pointer);

    private native boolean canGather_native(long pointer, boolean checkCommandibility);

    private native boolean canGather_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canGather_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canGather_native(long pointer, Unit targetUnit);

    private native boolean canGather_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canReturnCargo_native(long pointer);

    private native boolean canReturnCargo_native(long pointer, boolean checkCommandibility);

    private native boolean canHoldPosition_native(long pointer);

    private native boolean canHoldPosition_native(long pointer, boolean checkCommandibility);

    private native boolean canStop_native(long pointer);

    private native boolean canStop_native(long pointer, boolean checkCommandibility);

    private native boolean canRepair_native(long pointer);

    private native boolean canRepair_native(long pointer, boolean checkCommandibility);

    private native boolean canRepair_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRepair_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canRepair_native(long pointer, Unit targetUnit);

    private native boolean canRepair_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canBurrow_native(long pointer);

    private native boolean canBurrow_native(long pointer, boolean checkCommandibility);

    private native boolean canUnburrow_native(long pointer);

    private native boolean canUnburrow_native(long pointer, boolean checkCommandibility);

    private native boolean canCloak_native(long pointer);

    private native boolean canCloak_native(long pointer, boolean checkCommandibility);

    private native boolean canDecloak_native(long pointer);

    private native boolean canDecloak_native(long pointer, boolean checkCommandibility);

    private native boolean canSiege_native(long pointer);

    private native boolean canSiege_native(long pointer, boolean checkCommandibility);

    private native boolean canUnsiege_native(long pointer);

    private native boolean canUnsiege_native(long pointer, boolean checkCommandibility);

    private native boolean canLift_native(long pointer);

    private native boolean canLift_native(long pointer, boolean checkCommandibility);

    private native boolean canLand_native(long pointer);

    private native boolean canLand_native(long pointer, boolean checkCommandibility);

    private native boolean canLand_native(long pointer, TilePosition target, boolean checkCanIssueCommandType);

    private native boolean canLand_native(long pointer, TilePosition target);

    private native boolean canLand_native(long pointer, TilePosition target, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canLoad_native(long pointer);

    private native boolean canLoad_native(long pointer, boolean checkCommandibility);

    private native boolean canLoad_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canLoad_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canLoad_native(long pointer, Unit targetUnit);

    private native boolean canLoad_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUnloadWithOrWithoutTarget_native(long pointer);

    private native boolean canUnloadWithOrWithoutTarget_native(long pointer, boolean checkCommandibility);

    private native boolean canUnloadAtPosition_native(long pointer, Position targDropPos, boolean checkCanIssueCommandType);

    private native boolean canUnloadAtPosition_native(long pointer, Position targDropPos);

    private native boolean canUnloadAtPosition_native(long pointer, Position targDropPos, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUnload_native(long pointer);

    private native boolean canUnload_native(long pointer, boolean checkCommandibility);

    private native boolean canUnload_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkPosition, boolean checkCanIssueCommandType);

    private native boolean canUnload_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkPosition);

    private native boolean canUnload_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canUnload_native(long pointer, Unit targetUnit);

    private native boolean canUnload_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkPosition, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUnloadAll_native(long pointer);

    private native boolean canUnloadAll_native(long pointer, boolean checkCommandibility);

    private native boolean canUnloadAllPosition_native(long pointer);

    private native boolean canUnloadAllPosition_native(long pointer, boolean checkCommandibility);

    private native boolean canUnloadAllPosition_native(long pointer, Position targDropPos, boolean checkCanIssueCommandType);

    private native boolean canUnloadAllPosition_native(long pointer, Position targDropPos);

    private native boolean canUnloadAllPosition_native(long pointer, Position targDropPos, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canRightClick_native(long pointer);

    private native boolean canRightClick_native(long pointer, boolean checkCommandibility);

    private native boolean canRightClick_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClick_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClick_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClick_native(long pointer, Position target, boolean checkCanTargetUnit);

    private native boolean canRightClick_native(long pointer, Unit target, boolean checkCanTargetUnit);

    private native boolean canRightClick_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit);

    private native boolean canRightClick_native(long pointer, Position target);

    private native boolean canRightClick_native(long pointer, Unit target);

    private native boolean canRightClick_native(long pointer, PositionOrUnit target);

    private native boolean canRightClick_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canRightClick_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canRightClick_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canRightClickGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canRightClickGrouped_native(long pointer);

    private native boolean canRightClickGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canRightClickGrouped_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canRightClickGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canRightClickGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canRightClickGrouped_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClickGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClickGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClickGrouped_native(long pointer, Position target, boolean checkCanTargetUnit);

    private native boolean canRightClickGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit);

    private native boolean canRightClickGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit);

    private native boolean canRightClickGrouped_native(long pointer, Position target);

    private native boolean canRightClickGrouped_native(long pointer, Unit target);

    private native boolean canRightClickGrouped_native(long pointer, PositionOrUnit target);

    private native boolean canRightClickGrouped_native(long pointer, Position target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canRightClickGrouped_native(long pointer, Unit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canRightClickGrouped_native(long pointer, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canRightClickPosition_native(long pointer);

    private native boolean canRightClickPosition_native(long pointer, boolean checkCommandibility);

    private native boolean canRightClickPositionGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canRightClickPositionGrouped_native(long pointer);

    private native boolean canRightClickPositionGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canRightClickUnit_native(long pointer);

    private native boolean canRightClickUnit_native(long pointer, boolean checkCommandibility);

    private native boolean canRightClickUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClickUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canRightClickUnit_native(long pointer, Unit targetUnit);

    private native boolean canRightClickUnit_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canRightClickUnitGrouped_native(long pointer, boolean checkCommandibilityGrouped);

    private native boolean canRightClickUnitGrouped_native(long pointer);

    private native boolean canRightClickUnitGrouped_native(long pointer, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canRightClickUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped);

    private native boolean canRightClickUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType);

    private native boolean canRightClickUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canRightClickUnitGrouped_native(long pointer, Unit targetUnit);

    private native boolean canRightClickUnitGrouped_native(long pointer, Unit targetUnit, boolean checkCanTargetUnit, boolean checkCanIssueCommandType, boolean checkCommandibilityGrouped, boolean checkCommandibility);

    private native boolean canHaltConstruction_native(long pointer);

    private native boolean canHaltConstruction_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelConstruction_native(long pointer);

    private native boolean canCancelConstruction_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelAddon_native(long pointer);

    private native boolean canCancelAddon_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelTrain_native(long pointer);

    private native boolean canCancelTrain_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelTrainSlot_native(long pointer);

    private native boolean canCancelTrainSlot_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelTrainSlot_native(long pointer, int slot, boolean checkCanIssueCommandType);

    private native boolean canCancelTrainSlot_native(long pointer, int slot);

    private native boolean canCancelTrainSlot_native(long pointer, int slot, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canCancelMorph_native(long pointer);

    private native boolean canCancelMorph_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelResearch_native(long pointer);

    private native boolean canCancelResearch_native(long pointer, boolean checkCommandibility);

    private native boolean canCancelUpgrade_native(long pointer);

    private native boolean canCancelUpgrade_native(long pointer, boolean checkCommandibility);

    private native boolean canUseTechWithOrWithoutTarget_native(long pointer);

    private native boolean canUseTechWithOrWithoutTarget_native(long pointer, boolean checkCommandibility);

    private native boolean canUseTechWithOrWithoutTarget_native(long pointer, TechType tech, boolean checkCanIssueCommandType);

    private native boolean canUseTechWithOrWithoutTarget_native(long pointer, TechType tech);

    private native boolean canUseTechWithOrWithoutTarget_native(long pointer, TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTech_native(long pointer, TechType tech, Position target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType);

    private native boolean canUseTech_native(long pointer, TechType tech, Unit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType);

    private native boolean canUseTech_native(long pointer, TechType tech, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType);

    private native boolean canUseTech_native(long pointer, TechType tech, Position target, boolean checkCanTargetUnit, boolean checkTargetsType);

    private native boolean canUseTech_native(long pointer, TechType tech, Unit target, boolean checkCanTargetUnit, boolean checkTargetsType);

    private native boolean canUseTech_native(long pointer, TechType tech, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkTargetsType);

    private native boolean canUseTech_native(long pointer, TechType tech, Position target, boolean checkCanTargetUnit);

    private native boolean canUseTech_native(long pointer, TechType tech, Unit target, boolean checkCanTargetUnit);

    private native boolean canUseTech_native(long pointer, TechType tech, PositionOrUnit target, boolean checkCanTargetUnit);

    private native boolean canUseTech_native(long pointer, TechType tech, Position target);

    private native boolean canUseTech_native(long pointer, TechType tech, Unit target);

    private native boolean canUseTech_native(long pointer, TechType tech, PositionOrUnit target);

    private native boolean canUseTech_native(long pointer, TechType tech);

    private native boolean canUseTech_native(long pointer, TechType tech, Position target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTech_native(long pointer, TechType tech, Unit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTech_native(long pointer, TechType tech, PositionOrUnit target, boolean checkCanTargetUnit, boolean checkTargetsType, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTechWithoutTarget_native(long pointer, TechType tech, boolean checkCanIssueCommandType);

    private native boolean canUseTechWithoutTarget_native(long pointer, TechType tech);

    private native boolean canUseTechWithoutTarget_native(long pointer, TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, boolean checkCanIssueCommandType);

    private native boolean canUseTechUnit_native(long pointer, TechType tech);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, Unit targetUnit, boolean checkCanTargetUnit, boolean checkTargetsUnits, boolean checkCanIssueCommandType);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, Unit targetUnit, boolean checkCanTargetUnit, boolean checkTargetsUnits);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, Unit targetUnit, boolean checkCanTargetUnit);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, Unit targetUnit);

    private native boolean canUseTechUnit_native(long pointer, TechType tech, Unit targetUnit, boolean checkCanTargetUnit, boolean checkTargetsUnits, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTechPosition_native(long pointer, TechType tech, boolean checkCanIssueCommandType);

    private native boolean canUseTechPosition_native(long pointer, TechType tech);

    private native boolean canUseTechPosition_native(long pointer, TechType tech, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canUseTechPosition_native(long pointer, TechType tech, Position target, boolean checkTargetsPositions, boolean checkCanIssueCommandType);

    private native boolean canUseTechPosition_native(long pointer, TechType tech, Position target, boolean checkTargetsPositions);

    private native boolean canUseTechPosition_native(long pointer, TechType tech, Position target);

    private native boolean canUseTechPosition_native(long pointer, TechType tech, Position target, boolean checkTargetsPositions, boolean checkCanIssueCommandType, boolean checkCommandibility);

    private native boolean canPlaceCOP_native(long pointer);

    private native boolean canPlaceCOP_native(long pointer, boolean checkCommandibility);

    private native boolean canPlaceCOP_native(long pointer, TilePosition target, boolean checkCanIssueCommandType);

    private native boolean canPlaceCOP_native(long pointer, TilePosition target);

    private native boolean canPlaceCOP_native(long pointer, TilePosition target, boolean checkCanIssueCommandType, boolean checkCommandibility);


    public boolean equals(Object that){
        if(!(that instanceof Unit)){
            return false;
        }
        return getID() == ((Unit)that).getID();
    }

    public int hashCode(){
        return getID();
    }

}
