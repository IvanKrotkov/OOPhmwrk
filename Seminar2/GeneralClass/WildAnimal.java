package Seminar2.GeneralClass;

import Seminar2.GeneralClass.Animal;

import java.util.Date;

public class WildAnimal extends Animal {
    protected String habitat;
    protected Date dateOfFinding;
    protected WildAnimal(String habitat, Date dateOfFinding,int weight, int height, String eyeColor){
        super(weight, height, eyeColor);
        this.habitat = habitat;
        this.dateOfFinding = dateOfFinding;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(0,"Дикое животное - ");
        str.append(String.format("место нахождения: %s, дата нахождения: %tD, ",habitat,dateOfFinding));
        return str.toString();
    }
}
