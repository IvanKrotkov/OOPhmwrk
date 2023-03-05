package Seminar1;

import static Seminar1.Product.*;

public class ChildrensGoods extends Product {
    protected int minYearOld;
    /**
     * "Yes" or "No"
     */
    protected String hypoallergenicity;

    public ChildrensGoods(int minYearOld, String hypoallergenicity) {
        this.minYearOld = minYearOld;
        this.hypoallergenicity = hypoallergenicity;
    }

    public ChildrensGoods(int minYearOld) {
        this(minYearOld, "Yes");
    }

    public ChildrensGoods() {
        this(1);
    }

    @Override
    public String toString() {
        return String.format("%s, For children from %d years old, Hypoallergenicity: %s",
                super.toString(), minYearOld, hypoallergenicity);
    }

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
}
