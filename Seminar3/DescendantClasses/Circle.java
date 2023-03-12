package Seminar3.DescendantClasses;

import Seminar3.GeneralClasses.Figure;
import Seminar3.Interfaces.Lenghtable;

public class Circle extends Figure implements Lenghtable {
    private int radius;
    public Circle(int radius) {
        if (radius <= 0) throw new RuntimeException("Невозможно создать такой круг");
        else this.radius = radius;
    }
    public Circle() {
        this(5);
    }
    @Override
    public String toString() {StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Окружность с радиусом - %d", this.radius));
        return sb.toString();
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public double lenght() {
        return 2 * Math.PI * this.radius;
    }
}
