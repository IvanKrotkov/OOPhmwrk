package Seminar4;

import Seminar4.AssistantsClass.Worker;
import Seminar4.GeneralClass.Work;

public class Program {
    public static void main(String[] args) {
        Work<Worker> w = new Work<>(new Worker[]{new Worker("d", 133, 1),
                new Worker("2asd", 122, 2)});
        Work<Worker> wiw = new Work<>();
        Worker s = new Worker("2ee1", 1, 2);
        w.setElement(0, new Worker("oleg", 1234, 124));
        w.print();
//        wiw.addInArray(s);
//        wiw.print();

//        w.print();
//        w.remove(1);
//        w.print();
//        System.out.println(w.searchIndexEl(s));
//        Worker wa = w.maxValue();
        w.print();
//        w.bubbleSort();
//        w.insertionSort();
        w.selectionSort();
        System.out.println();
        w.print();
    }
}
