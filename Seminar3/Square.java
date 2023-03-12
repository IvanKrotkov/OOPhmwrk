package Seminar3;

public class Square extends Rectangle implements Perimetrable {
    public Square(int side) {
        super(side,side);
    }
    public Square() {
        this(5);
    }
}
