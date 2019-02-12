import Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setUp()  {

        rollercoaster = new Rollercoaster("Big Dipper", 72);
        visitor = new Visitor("Kelly", 15, 150, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Big Dipper", rollercoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(72, rollercoaster.getRating());
    }


    @Test
    public void checkIsPermitted() {
        assertEquals(true, rollercoaster.isPermitted(visitor));
    }
}
