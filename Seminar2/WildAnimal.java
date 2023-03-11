package Seminar2;

import java.util.Date;

public class WildAnimal extends Animal {
    protected String habitat;
    protected Date dateOfFinding;

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(0,"Дикое животное - ");
        str.append(String.format("место нахождения: %s, дата нахождения: %tD, ",habitat,dateOfFinding));
        return str.toString();
    }
}
