# Задание первого семинара
*Реализовать класс товар с дальнейшими подклассами*
* Общий класс продукт - [url](Product.java)
    * Класс продуктов питания [url](Food.java)
        * Класс хлеб 
        ```Java
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
        ```
        * Класс яйца 
        ```java
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
        ```
    * Класс напитков [url](Beverages.java)
        * Молоко
        ```java
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
        ```
        * Лимонад 
        ```java
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
        ```
    * Предметы гигены
        * Маски
        ```java
            public static class Masks extends HygieneItems{
        /**
         * "Night", "Cleansing" or "Regenerating";
         */
        String typeMask;
        public Masks(String typeMask){
            this.typeMask = typeMask;
        }
        public Masks(){
            this("Night");
        }

        @Override
        public String toString() {
            return String.format("%s, Type mask: %s",super.toString(),typeMask);
        }
        }
        ```
        * Туалетная бумага 
        ```java
        public static class ToiletPaper extends HygieneItems{
        int countLayers;
        public ToiletPaper(int countLayers){
            this.countLayers = countLayers;
        }
        public ToiletPaper(){
            this(2);
        }

        @Override
        public String toString() {
            return String.format("%s, Count layers: %d",super.toString(),countLayers);
        }
        }
        ```
    * Товары для детей [url](ChildrensGoods.java)
      * Подгузники
      ```java
      public static class Diapers extends ChildrensGoods {
        int size;
        int minWeight;
        int maxWeight;
        String type;

        public Diapers(int size, int minWeight, int maxWeight, String type) {
            this.size = size;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
            this.type = type;
        }

        public Diapers(int size, int minWeight) {
            this(size, minWeight, minWeight + 2, "For Boys");
        }

        public Diapers(int size) {
            this(size, 10);
        }
        public Diapers(){
            this(10);
        }

        @Override
        public String toString() {
            return String.format("%s, Size: %d, Minimal weight: %d, Maximum weight: %d, Type: %s",
                    super.toString(), size, minWeight, maxWeight, type);
        }
      }
      ```
      * Соска
      ```java
        public static class BabysDummy extends Product {
          /**
            * "Silicone" or "latex"
              */
              String type;
              public BabysDummy(String type) {
              this.type = type;
              }
              public BabysDummy(){
              this("Silicone");
              }
              @Override
              public String toString() {
              return super.toString();
              }
        }
      ```
* Результат [url](Programm.java)