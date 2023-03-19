package Seminar3.GeneralClasses;

import java.util.HashMap;

public abstract class Figure implements Comparable<Figure>{
    abstract public double area();
    @Override
    public String toString() {
        return "Фигура - ";
    }
    @Override
    public int compareTo(Figure o) {
        return Integer.compare((int) this.area(), (int) o.area());
    }
}

