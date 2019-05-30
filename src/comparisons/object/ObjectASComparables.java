package comparisons.object;

import comparisons.Comparables;

public class ObjectASComparables implements Comparables<Location> {

    @Override
    public int compare(Location a, Location b) {
        if (a.getLatitude() < b.getLatitude()) {
            return -1;
        }
        if (a.getLatitude() == b.getLatitude()) {
            if (a.getLongitude() < b.getLongitude()) {
                return -1;
            }
            if (a.getLongitude() == b.getLongitude()) {
                return 0;
            }
        }
        return 1;
    }
}
