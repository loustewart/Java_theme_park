import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp()  {
        park = new Park("Whirlies", 66);
    }


    @Test
    public void hasName() {
        assertEquals("Whirlies", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(66, park.getRating());
    }
}
