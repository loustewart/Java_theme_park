import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp() {
        dodgems = new Dodgems("Bumpy", 83);
    }

    @Test
    public void hasName() {
        assertEquals("Bumpy", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(83, dodgems.getRating());
    }
}
