package Seminar4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Work<T extends Comparable> {
    private Object[] array;
    private int length;
    public Work(T[] array) {
        this.array = array;
        this.length = array.length;
    }
    public Work() {
        this((T[]) new Object[10]);
    }
    private void addInArray(T obj) {
        Object[] temp = new Object[this.length + 1];
        for (int i = 0; i < this.length; i++) {
            temp[i] = this.array[i];
        }
        temp[temp.length - 1] = obj;
        this.array = temp;
        this.length = temp.length;
    }
    public T minimumValue() {
        T min = (T) this.array[0];
        for (int i = 0; i < this.length; i++) {
            if (min.compareTo(this.array[i]) < 0) {
                min = (T) this.array[i];
            }
        }
        return min;
    }
    public T maxValue() {
        T max = (T) this.array[0];
        for (int i = 0; i < this.length; i++) {
            if (max.compareTo(this.array[i]) > 0) {
                max = (T) this.array[i];
            }
        }
        return max;
    }
    public T remove(int index) {
        T res = (T) this.array[index];
        Object[] temp = new Object[this.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = this.array[i];
        }
        for (int i = index + 1; i < this.length ; i++) {
            temp[i-1] = this.array[i];
        }
        System.out.println(Arrays.toString(this.array));
        System.out.println(Arrays.toString(temp));
        this.array = temp;
        this.length = temp.length;
        return res;
    }
    public int searchIndexEl(T obj) {
        if (existsInArray(obj)) {
            for (int i = 0; i < this.length; i++) {
                if (obj.equals(this.array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean existsInArray(T obj) {
        for (int i = 0; i < this.length; i++) {
            if (obj.equals(this.array[i])) {
                return true;
            }
        }
        return false;
    }
    public void bubbleSort() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length - 1; j++) {
                if (((T) this.array[j]).compareTo(this.array[j + 1]) < 0) {
                    T temp = (T) this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = temp;
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.array[i].toString());
        }
    }



    public static void main(String[] args) {
        Work<Worker> w = new Work<>(new Worker[]{new Worker("d", 133, 1),
                new Worker("2asd", 122, 2)});
        Worker s = new Worker("2ee1",1,2);
        w.addInArray(s);
        w.print();
        w.remove(1);
        w.print();
        System.out.println(w.searchIndexEl(s));
        Worker wa = w.maxValue();
        w.print();
        w.bubbleSort();
        System.out.println();
        w.print();
    }

    public static class Worker implements Comparable<Worker> {
        String name;
        int age;
        int salary;
        @Override
        public String toString() {
            return name;
        }
        public Worker(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        @Override
        public int compareTo(Worker o) {
            return o.age - this.age;
        }
        public boolean equals(Worker obj) {
            return obj.name == this.name & obj.age == this.age;
        }
    }
}
