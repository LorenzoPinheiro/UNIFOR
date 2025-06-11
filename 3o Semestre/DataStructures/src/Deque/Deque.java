package Deque;

import Exceptions.EmptyQueueException;

public interface Deque<E> {

    void add(E value); // ADICIONAR NO FINAL DA LISTA
    void insert(E value); // ADICIONAR NO INICIO DA LISTA

    E removeLast() throws EmptyQueueException;
    E removeFirst() throws EmptyQueueException;
    E last() throws EmptyQueueException;
    E first() throws EmptyQueueException;

    int size();
    boolean isEmpty();

}
