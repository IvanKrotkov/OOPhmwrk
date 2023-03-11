package Seminar2;

public class Cat extends Pet implements MakeASound{
    private enum thePresenceOfWool{
        bald,withWool;
    }
    private thePresenceOfWool wooliness;
    public Cat(thePresenceOfWool wooliness,String name, String breed, AvailabilityOfVaccinations availability, String woolColor, int weight, int height, String eyeColor) {
        super(name, breed, availability, woolColor, weight, height, eyeColor);
        this.wooliness = wooliness;
    }
    public Cat(thePresenceOfWool wooliness){
        this(wooliness,"Барсик","Сиамская", AvailabilityOfVaccinations.grafted,"серый",4,23,"голубые");
    }
    public Cat(){
        this(thePresenceOfWool.withWool);
    }
    @Override
    public void caress() {
        System.out.println("Мурлычит и трётся о ноги");
    }
    @Override
    public void makeASound() {
        System.out.println("мяууу");
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(20,"кошка, ");
        str.append("наличие шерсти: " + wooliness);
        return str.toString();
    }
}
