package bwapi4;

/**
 * Common ancestor for location based objects to simplify distance computation.
 * This will be refactored into interface with default methods when java 8 becomes widely used.
 *
 * Idea by Rafa³ Poniatowski
 */
public abstract class AbstractPoint<T extends AbstractPoint> {

    public abstract T getPoint();

    public int getX(){
        return getPoint().getX();
    }

    public int getY(){
        return getPoint().getY();
    }

    public double distanceTo(AbstractPoint<T> otherPosition) {
        return distanceTo(otherPosition.getX(), otherPosition.getY());
    }

    public double distanceTo(int x, int y) {
        double dx = x - getX();
        double dy = y - getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}