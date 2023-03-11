package Seminar2.DescendantClasses;

import Seminar2.GeneralClass.Bird;

public class Stork extends Bird {
    public Stork(int flightAltitude, int weight, int height, String eyeColor) {
        super(flightAltitude, weight, height, eyeColor);
    }
    public Stork(){
        this(3000,3,100,"чёрный");
    }
    @Override
    public void makeASound() {
        System.out.println("Клк-клк-клк");
    }
    @Override
    public void fly(){
        super.fly();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.insert(8,"аист, ");
        return sb.toString();
    }
}
