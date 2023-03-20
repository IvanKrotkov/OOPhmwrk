package Seminar5.Infrasructure.People;

import Seminar5.Infrasructure.Exception.ExceptionGettingHuman;
import Seminar5.Infrasructure.Identificate;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyGroup<T extends Human> implements Iterable<T> {
    private ArrayList<T> group;
    private String numGroup;
    public StudyGroup(ArrayList<T> group) {
        this.group = group;
    }
    public String getNumGroup() {
        return this.numGroup;
    }
    public StudyGroup(ArrayList<T> group, String numGroup) {
        this.group = group;
        this.numGroup = numGroup;
        setNameGroup();
    }
    public void setNameGroup() {
        for (Student o : (ArrayList<Student>) group) {
            o.setNumGroup(numGroup);
        }
    }
    public T getElement(Identificate human) throws ExceptionGettingHuman {
        for (T s : this.group) {
            if (s.equals(human)) return s;
        }
        throw new ExceptionGettingHuman("Такого человека в данной группе нет");
    }
    public T getElement(String specialization) throws ExceptionGettingHuman {
        for (T s : this.group) {
            if (s.equals(specialization)) return s;
        }
        throw new ExceptionGettingHuman("Преподаватель по данному предмету отсутсвует");
    }
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < group.size();
            }

            @Override
            public T next() {
                return group.get(index++);
            }
        };
        return it;
    }
    @Override
    public String toString() {
        return group.toString();
    }
}
