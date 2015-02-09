package bwapi4;

import bwapi4.Position;

/**
 * Interrmediate class used to translate getPoint() calls to getPosition() calls.
 */
public abstract class PositionedObject extends AbstractPoint<Position> {

    public Position getPoint(){
        return getPosition();
    }

    public abstract Position getPosition();
}