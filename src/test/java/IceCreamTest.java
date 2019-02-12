import Stalls.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void setUp()  {
        iceCream = new IceCream("Mr Whippy", "Jim", 3, 99);
    }

    @Test
    public void hasName() {
        assertEquals("Mr Whippy", iceCream.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jim", iceCream.getOwner());
    }

    @Test
    public void hasParkingBay() {
        assertEquals(3, iceCream.getParkingBay());
    }

    @Test
    public void hasRating() {
        assertEquals(99, iceCream.getRating());
    }
}
