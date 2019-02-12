package Stalls;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Booze extends Stall implements ISecurity {

    public Booze(String name, String owner, int parkingBay, int rating) {
        super(name, owner, parkingBay, rating);
    }


    public boolean isPermitted(Visitor visitor) {
        if (visitor.getAge() < 18 ) {
            return false;
        }
        return true;
    }
}
