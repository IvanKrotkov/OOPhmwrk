package Seminar2;

import java.util.Date;

public class Tiger extends WildAnimal implements MakeASound{
    public Tiger(String habitat, Date dateOfFinding, int weight, int height, String eyeColor){
        super(habitat, dateOfFinding, weight, height, eyeColor);
    }
    public Tiger(){
        this("тропический лес",new Date(),110,115,"зелёный");
    }
    @Override
    public void makeASound() {
        System.out.println("ар-р-н-х");
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(17,"тигр, ");
        return str.toString();
    }
}
