# Задание первого семинара
*Реализовать класс товар с дальнейшими классами - наследниками*
* Общий класс продукт - [url](Seminar1/Product.java)
    * Класс продуктов питания [url](Seminar1/Food.java)
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
    * Класс напитков [url](Seminar1/Beverages.java)
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
    * Предметы гигены [url](Seminar1/HygieneItems.java)
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
    * Товары для детей [url](Seminar1/ChildrensGoods.java)
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
* Результат [url](Seminar1/Programm.java)
# Задание второго семинара
>*Реализация классов животных и составления из них зоопарка в рамках ООП*
1. Основные классы -[url](Seminar2/GeneralClass)
   1. Класс животные - [url](Seminar2/GeneralClass/Animal.java)
   2. Класс птицы - [url](Seminar2/GeneralClass/Bird.java)
   3. Класс домашних животных - [url](Seminar2/GeneralClass/Pet.java)
   4. Класс диких животных - [url](Seminar2/GeneralClass/WildAnimal.java)
   5. Класс зоопарк - [url](Seminar2/GeneralClass/Zoo.java)
   6. Также сюда включил интерфейс менюшки - [url](Seminar2/GeneralClass/ConsoleMenu.java) 
2. Классы наследники - [url](Seminar2/DescendantClasses)
   1. Класс кошки - [url](Seminar2/DescendantClasses/Cat.java)
   2. Класс курица - [url](Seminar2/DescendantClasses/Chicken.java)
   3. Класс собака - [url](Seminar2/DescendantClasses/Dog.java)
   4. Класс аист - [url](Seminar2/DescendantClasses/Stork.java)
   5. Класс тигр - [url](Seminar2/DescendantClasses/Tiger.java)
   6. Класс волк - [url](Seminar2/DescendantClasses/Wolf.java)
3. Результат - [url](Seminar2/Programm.java)


