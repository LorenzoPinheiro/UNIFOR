package Deque;

import Exceptions.EmptyQueueException;
import Exceptions.FullQueueException;

public class StaticDeque<E> implements Deque<E> {

    protected int size;
    private E[] deque;
    private int last; // indice do Array que tem o last
    private int first; // indice do Array que tem o first
    private final int MAX_SIZE = 5;

    public StaticDeque(){
        deque = (E[]) new Object[MAX_SIZE];
    }

    public StaticDeque(int maxSize){
        deque = (E[]) new Object[maxSize];
    }

    public boolean isFull(){
        return size == deque.length;
    }

    @Override
    public void add(E value) throws FullQueueException {
        if (isFull()) throw new FullQueueException("FILA ESTÁ CHEIA");
        deque[(first+size)%deque.length] = value;
        size++;

    }

    @Override
    public void insert(E value) {
        if (isFull()) throw new FullQueueException("FILA ESTÁ CHEIA");
        first = ((first-1)+deque.length)%deque.length;
        deque[first] = value;
        size++;
    }

    @Override
    public E removeLast() throws EmptyQueueException {
        E value = last();
        size--;
        return value;
    }

    @Override
    public E removeFirst() throws EmptyQueueException {
        E value = first();
        first = (first+1)%deque.length;
        size--;
        return value;
    }

    @Override
    public E last() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("A FILA ESTÁ VAZIA!!!");
        return deque[(first+size-1)%deque.length];
    }

    @Override
    public E first() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("A FILA ESTÁ VAZIA!!!");
        return deque[first];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String dadaDeque = "{";
        for (int i = 0; i < size; i++) {
            dadaDeque += deque[(first+i)%deque.length];
            if (i < size-1){
                dadaDeque += ", ";
            }
        }
        return dadaDeque + "}";
    }
}
