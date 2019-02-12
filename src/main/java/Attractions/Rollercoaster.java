package Attractions;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {

        super(name, rating);
    }

    public boolean isPermitted(Visitor visitor) {
        if (visitor.getAge() < 12 || visitor.getHeight() < 1.45) {
            return false;
        }
        return true;
    }

}
