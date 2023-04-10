package HW_3_4_2;

public interface Stack<T> {
    void push(T item);      //добавить элемент на вершину стека
    T pop();                //взять элемент с вершины стека

    boolean isEmpty();
}