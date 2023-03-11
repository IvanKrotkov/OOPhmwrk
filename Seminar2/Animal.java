package Seminar2;

public class Animal {
    protected int height;
    protected int weight;
    protected String eyeColor;

    @Override
    public String toString() {
        return String.format("рост животного: %d, вес животного: %d,цвет глаз животного: %s, ",height,weight,eyeColor);
    }
}
interface MakeASound {
    void makeASound();
}