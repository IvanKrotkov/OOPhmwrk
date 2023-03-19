package Seminar4.AssistantsClass;

public interface Exception <T>{
    default void arrayIsEmpty(T[] array){
        if (array[0] == null) throw new RuntimeException("Массив пустой");
    }
    default void indexNotFound(int index, int length) {
        if (index > length | index < 0) throw new RuntimeException("Такого индекса не существует");
    }
    default void objectIsNull(T obj){
        if (obj == null) throw new RuntimeException("Значение не может быть null");
    }
}
