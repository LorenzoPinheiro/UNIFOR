package Stacks;

public interface Stack<E>{

    void push(E value);
    E pop();
    E top();
    int height();
    boolean isEmpty();
}
