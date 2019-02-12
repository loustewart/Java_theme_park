import Stalls.CandyFloss;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    CandyFloss candyFloss;

    @Before
    public void setUp()  {
        candyFloss = new CandyFloss("Mrs Flossy", "Betty", 7, 84);
    }

    @Test
    public void hasName() {
        assertEquals("Mrs Flossy", candyFloss.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Betty", candyFloss.getOwner());
    }

    @Test
    public void hasParkingBay() {
        assertEquals(7, candyFloss.getParkingBay());
    }

    @Test
    public void hasRating() {
        assertEquals(84, candyFloss.getRating());
    }
}
