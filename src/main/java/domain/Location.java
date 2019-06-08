package domain;

import java.util.HashSet;
import java.util.Set;

public class Location {
    private int X;
    private int Y;
    private Set<Location> neighbors = new HashSet<>();

    public Location(int x,int y) {
        X = x;
        Y = y;
    }

    public Set<Location> neighbors() {
       return neighbors;
    }

    public Location ramdom() {
        return new Location(1,2);
    }
}
