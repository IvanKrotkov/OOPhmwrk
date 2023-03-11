package Seminar2;

public class Chicken extends Bird implements MakeASound{
    public Chicken(int flightAltitude, int weight, int height, String eyeColor) {
        super(flightAltitude, weight, height, eyeColor);
    }
    public Chicken(){
        this(7,3,50,"orange");
    }
    @Override
    public void fly() {
        System.out.println(String.format("Я лечу на %d метрах", flightAltitude));
    }
    @Override
    public void makeASound() {
        System.out.println("Ку-ка-ре-ку");
    }
}
