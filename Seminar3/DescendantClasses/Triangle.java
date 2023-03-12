package Seminar3.DescendantClasses;

import Seminar3.GeneralClasses.Figure;
import Seminar3.Interfaces.Perimetrable;

public class Triangle extends Figure implements Perimetrable {
    private int sideFirst;
    private int sideSecond;
    private int sideThird;
    public Triangle(int sideFirst, int sideSecond, int sideThird) {
        if (sideFirst + sideSecond < sideThird | sideSecond + sideThird < sideFirst
                | sideFirst + sideThird < sideSecond) {
            throw new RuntimeException("Такого треугольника не существует");
        } else {
            this.sideFirst = sideFirst;
            this.sideSecond = sideSecond;
            this.sideThird = sideThird;
        }
    }
    public Triangle() {
        this(3, 4, 5);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Треугольник со сторонами %d, %d, %d ",this.sideFirst,this.sideSecond,this.sideThird));
        return sb.toString();
    }
    @Override
    public double area() {
        double p = perimetr()/2;
        return Math.sqrt(p*(p-this.sideFirst)*(p-this.sideSecond)*(p-sideThird));
    }
    @Override
    public double perimetr() {
        return this.sideFirst + this.sideSecond + this.sideThird;
    }
}
