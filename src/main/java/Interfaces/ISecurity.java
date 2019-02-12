package Interfaces;

import ThemePark.Visitor;

public interface ISecurity {
    boolean isPermitted(Visitor visitor);
}
