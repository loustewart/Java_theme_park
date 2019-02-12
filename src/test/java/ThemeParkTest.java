
import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Interfaces.ITicketed;
import Stalls.Booze;
import Stalls.CandyFloss;
import Stalls.IceCream;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest  {


    ThemePark themePark;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Park park;
    Playground playground;
    IceCream iceCream;
    CandyFloss candyFloss;
    Booze booze;


    @Before
    public void setUp()  {
        rollercoaster = new Rollercoaster("Big Dipper", 72);
        dodgems = new Dodgems("Bumpy", 83);
        park = new Park("Whirlies", 66);
        playground = new Playground("Pirate Ship", 57);
        iceCream = new IceCream("Mr Whippy", "Jim", 3, 99);
        candyFloss = new CandyFloss("Mrs Flossy", "Betty", 7, 84);
        booze = new Booze("Park Bar", "Peggy", 1, 73);
        themePark = new ThemePark("CodeClan Towers", rollercoaster, dodgems, park, playground, iceCream, candyFloss, booze, 8.40);

    }


    @Test
    public void getName() {
        assertEquals("CodeClan Towers", themePark.getName());
    }


    @Test
    public void getTicketPrice() {
        assertEquals(8.40, themePark.ticketPrice(), 0.1);
    }


}
