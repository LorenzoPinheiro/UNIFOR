package Queues;

import Exceptions.EmptyQueueException;
import Exceptions.FullQueueException;

public class StaticQueue<E> implements Queue<E>{

    private int size;
    private E[] queue;
    private final int MAX_SIZE = 4;

    public StaticQueue() {
        queue = (E[]) new Object[MAX_SIZE];
    }

    public StaticQueue(int maxSize) {
        queue = (E[]) new Object[maxSize];
    }

    public boolean isFull(){
        return size == queue.length;
    }
    @Override
    public void enqueue(E value) throws FullQueueException {
        if (isFull()) throw new FullQueueException("FILA ESTÁ CHEIA");
        queue[size++] = value;
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        E value = first();
        size--;
        for (int i = 0; i < size; i++) {
            queue[i] = queue[i+1];
        }
        return value;
    }

    @Override
    public E first() throws EmptyQueueException{
        if (isEmpty()) throw new EmptyQueueException("FILA ESTÁ VAZIA");
        return queue[0];
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
        String queueData = "[";
        for (int i = 0; i < size; i++) {
            queueData += queue[i];
            if (i < size-1){
                queueData += ", ";
            }
        }
        return queueData + "]";
    }
}
