package Seminar2.DescendantClasses;

import Seminar2.GeneralClass.Pet;

public class Dog extends Pet {
    enum ThePreseneceOfTraining{
        trained,notTrained;
    }
    private ThePreseneceOfTraining training;
    public Dog(ThePreseneceOfTraining training,String name, String breed, AvailabilityOfVaccinations availability, String woolColor, int weight, int height, String eyeColor) {
        super(name, breed, availability, woolColor, weight, height, eyeColor);
        this.training = training;
    }
    public Dog(ThePreseneceOfTraining training){
        this(training,"Лайка", "немецкая овчарка",AvailabilityOfVaccinations.grafted,"чёрно-коричневый",30,60,"black");
    }
    public Dog(){
        this(ThePreseneceOfTraining.trained);
    }
    public void train(){
        if (training == ThePreseneceOfTraining.notTrained){
            System.out.println("Собака проходит полноценные тренировки,и в скором времени она станет дрессированная");
            training = ThePreseneceOfTraining.trained;
        }else System.out.println("Собака тренируется за вкусняшки");
    }
    @Override
    public void caress() {
        System.out.println("Лижется и усердно виляет хвостом");
    }
    @Override
    public void makeASound() {
        System.out.println("Гав-гав");
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(20,"собака, ");
        str.append("степень дрессировки: " + training);
        return str.toString();
    }
}
