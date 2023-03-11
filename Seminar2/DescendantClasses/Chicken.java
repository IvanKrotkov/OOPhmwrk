package Seminar2.DescendantClasses;

import Seminar2.GeneralClass.Bird;

public class Chicken extends Bird {
    public Chicken(int flightAltitude, int weight, int height, String eyeColor) {
        super(flightAltitude, weight, height, eyeColor);
    }
    public Chicken(){
        this(7,3,50,"orange");
    }
    @Override
    public void fly() {
        super.fly();
    }
    @Override
    public void makeASound() {
        System.out.println("Ку-ка-ре-ку");
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.insert(8,"курица, ");
        return sb.toString();
    }
}
