package Seminar2;

public abstract class Pet extends Animal{
    protected String name;
    protected String breed;
    enum AvailabilityOfVaccinations{
        grafted,unvaccinate;
    }
    private AvailabilityOfVaccinations availability;
    protected String woolColor;
    public abstract void caress();
    public Pet(String name, String breed,AvailabilityOfVaccinations availability, String woolColor,int weight, int height, String eyeColor){
        super(weight, height, eyeColor);
        this.name = name;
        this.breed = breed;
        this.availability = availability;
        this.woolColor = woolColor;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(0,"Домашнее животное - ");
        str.append(String.format("кличка: %s, порода: %s, цвет шерсти: %s, ",name,breed,woolColor));
        str.append("наличие прививок: " + availability + ", ");
        return str.toString();
    }
}
