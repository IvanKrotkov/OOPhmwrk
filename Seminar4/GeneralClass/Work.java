package Seminar4.GeneralClass;

import Seminar4.AssistantsClass.Exception;

import java.util.Arrays;

public class Work<T extends Comparable> implements Exception<T> {
    private Object[] array;
    private int length;
    public Work(T[] array) {
        this.array = array;
        this.length = array.length;
    }
    public Work() {
        this.array = new Object[1];
        this.length = 1;
    }
    public void addInArray(T obj) {
        if (this.array[0] == null) {
            this.array[0] = obj;
        } else {
            objectIsNull(obj);
            Object[] temp = new Object[this.length + 1];
            for (int i = 0; i < this.length; i++) {
                temp[i] = this.array[i];
            }
            temp[temp.length - 1] = obj;
            this.array = temp;
            this.length = temp.length;
        }
    }
    public T minimumValue() {
        arrayIsEmpty((T[])this.array);
        T min = (T) this.array[0];
        for (int i = 0; i < this.length; i++) {
            if (min.compareTo(this.array[i]) < 0) {
                min = (T) this.array[i];
            }
        }
        return min;
    }
    public T maxValue() {
        arrayIsEmpty((T[])this.array);
        T max = (T) this.array[0];
        for (int i = 0; i < this.length; i++) {
            if (max.compareTo(this.array[i]) > 0) {
                max = (T) this.array[i];
            }
        }
        return max;
    }
    public T remove(int index) {
        indexNotFound(index,this.length);
        arrayIsEmpty((T[])this.array);
        T res = (T) this.array[index];
        Object[] temp = new Object[this.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = this.array[i];
        }
        for (int i = index + 1; i < this.length; i++) {
            temp[i - 1] = this.array[i];
        }
        this.array = temp;
        this.length = temp.length;
        return res;
    }
    public int searchIndexEl(T obj) {
        objectIsNull(obj);
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
        objectIsNull(obj);
        for (int i = 0; i < this.length; i++) {
            if (obj.equals(this.array[i])) {
                return true;
            }
        }
        return false;
    }
    public void bubbleSort() {
        arrayIsEmpty((T[])this.array);
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length - 1; j++) {
                if (((T) this.array[j]).compareTo(this.array[j + 1]) < 0) {
                    T temp = (T) this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }
    public void setElement(int index, T obj) {
        indexNotFound(index,this.length);
        objectIsNull(obj);
        this.array[index] = obj;
    }
    public T getElement(int index) {
        indexNotFound(index,this.length);
        return (T) this.array[index];
    }
    public void selectionSort() {
        arrayIsEmpty((T[])this.array);
        for (int i = 0; i < this.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < this.length; j++) {
                if (((T) this.array[j]).compareTo(this.array[min]) > 0) min = j;
            }
            T temp = (T) this.array[min];
            this.array[min] = this.array[i];
            this.array[i] = temp;
        }
    }
    public void insertionSort() {
        arrayIsEmpty((T[])this.array);
        int i = 0;
        while (i < this.length) {
            T temp = (T) this.array[i];
            while (i != 0 && ((T) this.array[i - 1]).compareTo(temp) < 0) {
                this.array[i] = this.array[i - 1];
                i--;
            }
            this.array[i] = temp;
            i++;
        }
    }
    public int getLength() {
        return this.length;
    }
    public void print() {
        System.out.println(Arrays.toString(this.array));
    }
}
