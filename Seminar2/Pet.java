package Seminar2;

public abstract class Pet extends Animal{
    protected String name;
    protected String breed;
    protected Boolean availabilityOfVaccinations;
    protected String coatColor;
    public abstract void caress();

    @Override
    public String toString() {
        return "Домашнее животное";
    }
}
