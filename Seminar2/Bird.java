package Seminar2;

public class Bird extends Animal{
    protected int flightAltitude;
    public Bird(int flightAltitude,int weight, int height, String eyeColor) {
        super(weight, height, eyeColor);
        this.flightAltitude = flightAltitude;
    }
    public void fly() {
        System.out.println(String.format("Я лечу на %d метрах", flightAltitude));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(0,"Птица - ");
        str.append("высота полёта - "+flightAltitude);
        return str.toString();
    }
}