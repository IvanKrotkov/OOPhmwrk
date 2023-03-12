package Seminar3;

public abstract class Figure {
    abstract public double area();

    @Override
    public String toString() {
        return "Фигура - ";
    }
}

interface Perimetrable {
    double perimetr();
}

interface Lenghtable {
    double lenght();
}