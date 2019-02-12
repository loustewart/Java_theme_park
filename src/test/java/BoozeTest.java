import Stalls.Booze;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoozeTest {


    Booze booze;
    Visitor visitor;

    @Before
    public void setUp()  {
        booze = new Booze("Park Bar", "Peggy", 1, 73);
        visitor = new Visitor("Kelly", 15, 150, 40);
}

    @Test
    public void hasName() {
        assertEquals("Park Bar", booze.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Peggy", booze.getOwner());
    }

    @Test
    public void hasParkingBay() {
        assertEquals(1, booze.getParkingBay());
    }

    @Test
    public void hasRating() {
        assertEquals(73, booze.getRating());
    }

    @Test
    public void checkIsPermitted() {
        assertEquals(false, booze.isPermitted(visitor));
    }
}
