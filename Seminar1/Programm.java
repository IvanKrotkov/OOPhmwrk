package Seminar1;


import static Seminar1.Beverages.*;
import static Seminar1.ChildrensGoods.*;
import static Seminar1.Food.*;
import static Seminar1.HygieneItems.*;

public class Programm {
    static void getInfo(Object a) {
        System.out.println(a.toString());
    }

    public static void main(String[] args) {
        Product bread = new Bread();
        bread.name = "bread";
        getInfo(bread);
        Product milk = new Milk();
        milk.name = "milk";
        getInfo(milk);
        Product lemonade = new Limonade();
        lemonade.name = "lemonade";
        getInfo(lemonade);
        Product eggs = new Eggs();
        eggs.name = "eggs";
        getInfo(eggs);
        Product mask = new Masks();
        mask.name = "mask";
        getInfo(mask);
        Product toiletP = new ToiletPaper();
        toiletP.name = "Toilet paper";
        getInfo(toiletP);
        Product diapers = new Diapers();
        diapers.name = "Diapers";
        getInfo(diapers);
        Product babysDumm = new BabysDummy();
        babysDumm.name = "Baby's dummy";
        getInfo(babysDumm);
    }
}
