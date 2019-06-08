package domain;

import java.util.HashSet;
import java.util.Set;

public class World {

    private boolean empty;
    private Set<LivingCell> livingCells = new HashSet<>();
    private Set<DeadCell> deadCells = new HashSet<>();

    public World() {
        this.empty = true;
    }

    public void set_living_cell_at(Location location) {
        livingCells.add(new LivingCell(location));
        this.empty = false;
    }

    public boolean empty() {
        return empty;
    }

    public boolean alive_at() {
        return true;
    }

    public World nextGeneration() {
        return new World();
    }
}
