package Seminar2.GeneralClass;

public class Animal {
    protected int height;
    protected int weight;
    protected String eyeColor;
    protected Animal(int weight, int height, String eyeColor){
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
    }
    @Override
    public String toString() {
        return String.format("рост животного: %d, вес животного: %d,цвет глаз животного: %s, ",height,weight,eyeColor);
    }
    protected void makeASound(){
        System.out.println();
    }
}
