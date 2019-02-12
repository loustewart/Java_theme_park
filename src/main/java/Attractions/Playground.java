package Attractions;

import Attractions.Attraction;
import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isPermitted(Visitor visitor) {
        if (visitor.getAge() > 12 ) {
            return false;
        }
        return true;
    }
}
