import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void setUp() {

        playground = new Playground("Pirate Ship", 57);
        visitor = new Visitor("Kelly", 15, 150, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Pirate Ship", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(57, playground.getRating());
    }

    @Test
    public void checkIsPermitted() {
        assertEquals(false, playground.isPermitted(visitor));
    }
}
