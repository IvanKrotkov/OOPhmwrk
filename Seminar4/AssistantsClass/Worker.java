package Seminar4.AssistantsClass;

/***
 * Класс для тестирования
 */
public class Worker implements Comparable<Worker> {
    String name;
    int age;
    int salary;
    @Override
    public String toString() {
        return String.format("Name - %s, age - %d, salary - %d", this.name, this.age, this.salary);
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

