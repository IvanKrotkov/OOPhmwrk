package Seminar2;

import Seminar2.DescendantClasses.Cat;
import Seminar2.DescendantClasses.Chicken;
import Seminar2.DescendantClasses.Dog;
import Seminar2.GeneralClass.Bird;
import Seminar2.GeneralClass.Pet;
import Seminar2.GeneralClass.Zoo;

import java.io.IOException;

public class Programm {
    public static void main(String[] args) throws IOException {
        Zoo park = new Zoo();
        park.addAnimalInZoo(new Cat(Cat.thePresenceOfWool.bald,"тигрица","сиамская", Pet.AvailabilityOfVaccinations.grafted,"белый",10,10,"blue"));
        park.getInfoAnimal(2);
        park.makeASoundAllAnimal();
//        park.Menu();
        Dog dog = new Dog();
        dog.train();
        dog.caress();
        Bird ch = new Chicken();
        ch.fly();
    }
}
