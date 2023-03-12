package Seminar3;

public class Rectangle extends Figure implements Perimetrable {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        if (length <= 0 | width <= 0) {
            throw new RuntimeException("Такого прямоугольника не существует");
        } else {
            this.length = length;
            this.width = width;
        }
    }
    public Rectangle() {
        this(4, 3);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Прямоугольник со сторонами %d, %d", width,length));
        return sb.toString();
    }
    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimetr() {
        return 2 * (this.length + this.width);
    }
}
