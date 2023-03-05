package Seminar1;

import java.util.Date;

public class Beverages extends Product{
    protected double volume;
    public Beverages(double volume){
        this.volume = volume;
    }
    public Beverages(){
        this(0.5);
    }
    public static class Milk extends Beverages{
        int fatPercentage;
        Date dateExpiration;
        public Milk(int fatPercentage, Date dateExpiration){
            this.fatPercentage = fatPercentage;
            this.dateExpiration = dateExpiration;
        }
        public Milk(int fatPercentage){
            this(fatPercentage, Food.setExpDate());
        }
        public Milk(){
            this(15);
        }

        @Override
        public String toString() {
            return String.format("%s, Fat percentage: %d, Expiration date: %tD",
                    super.toString(),fatPercentage,dateExpiration);
        }
    }
    public static class Limonade extends Beverages{
        String taste;
        public Limonade(String taste){
            this.taste = taste;
        }
        public Limonade(){
            this("Lemon");
        }

        @Override
        public String toString() {
            return String.format("%s, Taste: %s",super.toString(),taste);
        }
    }
}

