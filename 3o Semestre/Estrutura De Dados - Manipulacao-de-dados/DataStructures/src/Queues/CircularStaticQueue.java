package Queues;

import Exceptions.EmptyQueueException;
import Exceptions.FullQueueException;

public class CircularStaticQueue<E> implements Queue<E> {


    public int first; // indice do Array que tem o primeiro
    public E[] queue;
    public int size;
    public int MAX_SIZE = 5;

    public CircularStaticQueue() {
        queue = (E[]) new Object[MAX_SIZE];
    }

    public CircularStaticQueue(int maxSize){
        queue = (E[]) new Object[maxSize];
    }

    public boolean isFull(){
        return size == queue.length;
    }

    @Override
    public void enqueue(E value) {
        if (isFull()) throw new FullQueueException("Fila está cheia");
        int index = ((first+size) % queue.length);
        queue[index] = value;
        size++;

    }

    @Override
    public E dequeue() throws EmptyQueueException {
        E value = first();
        first = (first+1) % queue.length;
        size--;
        return value;
    }

    @Override
    public E first() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("FILA ESTÁ VAZIA");
        return queue[first];
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
            queueData += queue[(first+i) % queue.length];
            if (i < size-1){
                queueData += ", ";
            }
        }
        return queueData + "]";
    }
}
