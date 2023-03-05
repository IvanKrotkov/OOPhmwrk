package Seminar1;

public class HygieneItems extends Product{
    protected int amountPackaged;
    public HygieneItems(int amountPackaged){
        this.amountPackaged = amountPackaged;
    }
    public HygieneItems(){
        this(1);
    }
    @Override
    public String toString() {
        return String.format("%s, Amount in Package: %d", super.toString(), amountPackaged);
    }
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
}

