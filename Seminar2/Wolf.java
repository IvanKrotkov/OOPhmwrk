package Seminar2;

import java.util.Date;

public class Wolf extends WildAnimal implements MakeASound{
    private enum BelongingToTheClassOfTheWolfPack{
        alpha,alphaFemale,beta,motherSheWolf,warriors;
    }
    private BelongingToTheClassOfTheWolfPack title;

    public Wolf(BelongingToTheClassOfTheWolfPack title, String habitat, Date dateOfFinding,int weight, int height, String eyeColor) {
        super(habitat, dateOfFinding, weight, height, eyeColor);
        this.title = title;
    }
    public Wolf(String habitat, Date dateOfFinding,int weight, int height, String eyeColor){
        this(BelongingToTheClassOfTheWolfPack.alpha,habitat,dateOfFinding,weight,height,eyeColor);
    }
    public Wolf(int weight, int height, String eyeColor){
        this("лес",new Date(),weight,height,eyeColor);
    }
    public Wolf(){
        this(40,80,"голубые");
    }
    @Override
    public void makeASound() {
        System.out.println("у-о-у-у");
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(17,"волк, ");
        str.append("текущий титул - " + title);
        return str.toString();
    }
}

