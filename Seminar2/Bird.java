package Seminar2;

public abstract class Bird extends Animal{
    protected int flightAltitude;
    public Bird(int flightAltitude,int weight, int height, String eyeColor) {
        super(weight, height, eyeColor);
        this.flightAltitude = flightAltitude;
    }
    abstract public void fly();
}