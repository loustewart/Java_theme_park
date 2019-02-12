package ThemePark;

import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Stalls.Booze;
import Stalls.CandyFloss;
import Stalls.IceCream;

import java.util.ArrayList;

public class ThemePark implements ITicketed {

    private String name;
    private Rollercoaster rollercoaster;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private IceCream iceCream;
    private CandyFloss candyFloss;
    private Booze booze;
    private double ticketPrice;

    public ThemePark(String name, Rollercoaster rollercoaster, Dodgems dodgems, Park park, Playground playground, IceCream iceCream, CandyFloss candyFloss, Booze booze, double ticketPrice) {
        this.name = name;
        this.rollercoaster = rollercoaster;
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.iceCream = iceCream;
        this.candyFloss = candyFloss;
        this.booze = booze;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public double ticketPrice() {
        return ticketPrice;
    }


}
