package Seminar3.GeneralClasses;

import Seminar3.DescendantClasses.Circle;
import Seminar3.DescendantClasses.Rectangle;
import Seminar3.DescendantClasses.Square;
import Seminar3.DescendantClasses.Triangle;
import Seminar3.Interfaces.Lenghtable;
import Seminar3.Interfaces.Perimetrable;

import java.util.Arrays;
import java.util.LinkedList;

public class Geometry {
    private LinkedList<Figure> figures = new LinkedList<>();

    public Geometry(LinkedList<Figure> figures) {
        this.figures = figures;
    }

    public Geometry(Figure[] figures) {
        this.figures.addAll(Arrays.asList(figures));
    }

    public Geometry() {
        this(new Figure[]{new Rectangle(), new Square(), new Circle(), new Triangle()});
    }
    public void getInfoAllFigures(){
        for (Figure f:this.figures) {
            System.out.println(f.toString());
        }
    }
    public void getInfoAllAreasAndPerimetrsOrLenght() {
        for (Figure f : this.figures) {
            if (f instanceof Lenghtable) {
                StringBuilder sb = new StringBuilder(f.toString());
                sb.append(String.format(" - площадь и длина которой %.1f и %.1f соответственно",
                        f.area(),((Lenghtable) f).lenght()));
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder(f.toString());
                sb.append(String.format(" - площадь и периметр которой %.1f и %.1f соответственно",
                        f.area(),((Perimetrable) f).perimetr()));
                System.out.println(sb.toString());
            }
        }
    }
    public void changeFigure(int num,Figure fig){
        remFigure(num - 1);
        addNewFigure(fig);
    }
    public void addNewFigure(Figure fig) {
        this.figures.add(fig);
    }
    @Override
    public String toString() {
        return this.figures.toString();
    }

    public Figure remFigure(int num) {
        return this.figures.remove(num - 1);
    }
    public void sorting(){
        this.figures.sort(Figure::compareTo);
    }

    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println(g);
        g.getInfoAllAreasAndPerimetrsOrLenght();
        g.sorting();
        System.out.println(g);
    }
}
