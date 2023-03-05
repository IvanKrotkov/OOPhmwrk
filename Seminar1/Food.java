package Seminar1;


import java.util.Calendar;
import java.util.Date;

public class Food extends Product{
    protected Date expirationDate;
    public Food(Date expirationDate){
        this.expirationDate = expirationDate;
    }
    public Food(){
        this(Food.setExpDate());
    }

    /**
     * Метод, возвращающий срок годности по умолчанию(дата создания продукта + 7 дней)
     * @return Текущая дата + 7 дней
     */
    public static Date setExpDate(){
        Date d = new Date();
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.add(Calendar.DATE,7);
        return now.getTime();
    }

    @Override
    public String toString() {
        return String.format("%s, Expiration date: %tD",super.toString(),expirationDate);
    }

    public static class Bread extends Food{
        /**
         * "Wheat" or "Rye"
         */
        String typeFlour;
        public Bread(String typeFlour){
            this.typeFlour = typeFlour;
        }
        public Bread(){
            this("Wheat");
        }
        @Override
        public String toString() {
            return String.format("%s, Type flour: %s", super.toString(),typeFlour);
        }
    }
    public static class Eggs extends Food{
        int amountInPack;
        public Eggs(int amountInPack){
            this.amountInPack = amountInPack;
        }
        public Eggs(){
            this(10);
        }

        @Override
        public String toString() {
            return String.format("%s, Amount in Package: %d",super.toString(),amountInPack);
        }
    }
}
