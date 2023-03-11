package Seminar2;

public class Stork extends Bird implements MakeASound{
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
        sb.insert(7,"Аист");
        return sb.toString();
    }
}
