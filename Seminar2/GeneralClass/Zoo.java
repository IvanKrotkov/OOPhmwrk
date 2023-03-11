package Seminar2.GeneralClass;

import Seminar2.DescendantClasses.*;
import Seminar2.GeneralClass.Animal;
import Seminar2.GeneralClass.ConsoleMenu;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Zoo implements ConsoleMenu {
    private LinkedList<Animal> park = new LinkedList<>();
    public Zoo(LinkedList<Animal> park){
        this.park = park;
    }
    public Zoo(){
        Animal[] animals = {new Cat(), new Dog(), new Chicken(), new Stork(), new Tiger(), new Wolf()};
        this.park.addAll(Arrays.asList(animals));
    }
    public void addAnimalInZoo(Animal animal){
        this.park.add(animal);
    }
    public void removeFromTheZoo(int num){
        this.park.remove(num - 1);
    }
    public void makeASoundAnimal(int num){
       this.park.get(num-1).makeASound();
    }
    public void getInfoAnimal(int num){
        System.out.println(this.park.get(num-1).toString());
    }
    public void getInfoAllAnimal(){
        for (Animal an: this.park) {
            System.out.println(an.toString());
        }
    }
    public void makeASoundAllAnimal(){
        for (Animal an: this.park){
            an.makeASound();
        }
    }
    @Override
    public void Menu() throws IOException {
        System.out.println("Выберите функию:\n" +
                "'add' - добавить животное\n" +
                "'rem' - убрать животное\n" +
                "'get' - получить информацию о животном\n" +
                "'getA' - получить информацию о всех животных\n" +
                "'sound' - животное издаст звук\n" +
                "'soundAll' - все животные издадут звук");
        Scanner scanner = new Scanner(System.in);
        String request = scanner.nextLine();
        switch (request){
            case "getA":
                getInfoAllAnimal();
                break;
            case "add":
                System.out.println("Какое животное ты добавишь: 'кошка','cобака','волк','аист" +
                        "'курица','тигр'");
                switch (scanner.nextLine()){
                    case "кошка":
                        addAnimalInZoo(new Cat());
                    case "собака":
                        addAnimalInZoo(new Dog());
                    case "волк":
                        addAnimalInZoo(new Wolf());
                    case "аист":
                        addAnimalInZoo(new Stork());
                    case "курица":
                        addAnimalInZoo(new Chicken());
                    case "тигр":
                        addAnimalInZoo(new Tiger());
                }
                break;
            case "rem":
                System.out.println("Введи номер животного");
                removeFromTheZoo(Integer.parseInt(scanner.nextLine()));
                break;
            case "get":
                System.out.println("Введи номер животного");
                getInfoAnimal(Integer.parseInt(scanner.nextLine()));
                break;
            case "soundAll":
                makeASoundAllAnimal();
                break;
            case "sound":
                makeASoundAnimal(Integer.parseInt(scanner.nextLine()));
                break;
        }
        scanner.close();
    }
}
