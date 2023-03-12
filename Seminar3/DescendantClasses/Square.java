package Seminar3.DescendantClasses;

import Seminar3.Interfaces.Perimetrable;

public class Square extends Rectangle implements Perimetrable {
    public Square(int side) {
        super(side,side);
    }
    public Square() {
        this(5);
    }
}
