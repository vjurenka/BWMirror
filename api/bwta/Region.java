package bwta;

import bwta.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import bwapi.Position;
import bwapi.TilePosition;
import bwapi.Player;
import bwapi.Unit;
import bwapi.Pair;
import bwapi.CenteredObject;

/**
A region is a partition of the map with a polygon boundary, and is connected to other regions via <a href="Chokepoint.html">chokepoints</a>.


*/
public class Region extends CenteredObject 
{

/**
Returns the polygon border of the region.

*/
    public Polygon getPolygon() {
        return getPolygon_native(pointer);
    }

/**
Returns the center of the region.

*/
    public Position getCenter() {
        return getCenter_native(pointer);
    }

/**
Returns the set of chokepoints adjacent to the region.

*/
    public List<Chokepoint> getChokepoints() {
        return getChokepoints_native(pointer);
    }

/**
Returns the set of base locations in the region.

*/
    public List<BaseLocation> getBaseLocations() {
        return getBaseLocations_native(pointer);
    }

/**
Returns true if its possible to walk from this region to the given region.

*/
    public boolean isReachable(Region region) {
        return isReachable_native(pointer, region);
    }

/**
Returns the set of regions reachable from this region.

*/
    public List<Region> getReachableRegions() {
        return getReachableRegions_native(pointer);
    }

    public int getMaxDistance() {
        return getMaxDistance_native(pointer);
    }


    private static Map<Long, Region> instances = new HashMap<Long, Region>();

    private Region(long pointer) {
        this.pointer = pointer;
    }

    private static Region get(long pointer) {
        if (pointer == 0 ) {
            return null;
        }
        Region instance = instances.get(pointer);
        if (instance == null ) {
            instance = new Region(pointer);
            instances.put(pointer, instance);
        }
        return instance;
    }

    private long pointer;

    private native Polygon getPolygon_native(long pointer);

    private native Position getCenter_native(long pointer);

    private native List<Chokepoint> getChokepoints_native(long pointer);

    private native List<BaseLocation> getBaseLocations_native(long pointer);

    private native boolean isReachable_native(long pointer, Region region);

    private native List<Region> getReachableRegions_native(long pointer);

    private native int getMaxDistance_native(long pointer);


}
