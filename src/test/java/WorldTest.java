import domain.Location;
import domain.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WorldTest {

    private World world;

    @Before
    public void beforeEach() {
        world = new World();
    }
    @Test
    public void test_a_new_world_is_empty() {
        Assert.assertTrue(world.empty());
    }

    @Test
    public void test_a_cell_can_be_added_to_the_world () {
        Location location = new Location(1,1);
        world.set_living_cell_at(location);

        Assert.assertTrue(world.alive_at());
    }

    @Test
    public void test_after_adding_a_cell_the_world_is_not_empty() {
        Location location = new Location(1,1);
        world.set_living_cell_at(location);
        Assert.assertFalse(world.empty());
    }

    @Test
    public void test_world_is_not_empty_after_setting_a_living_cel() {
        Location location = new Location(1,1);
        location = location.ramdom();

        world.set_living_cell_at(location);

        Assert.assertFalse(world.empty());
    }

    @Test
    public void test_an_empty_world_stays_empty_after_a_tick() {
        World nextWorld = world.nextGeneration();
        Assert.assertTrue(nextWorld.empty());
    }


}
