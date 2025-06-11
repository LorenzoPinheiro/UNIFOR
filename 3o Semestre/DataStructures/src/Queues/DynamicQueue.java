package Queues;

import Exceptions.EmptyQueueException;

public class DynamicQueue<E> implements Queue<E>{

    class Node{
        Node next;
        E value;

        @Override
        public String toString() {
            return "" + value + "";
        }

        public Node(E value) {
            this.value = value;

        }
    }

    private int size;
    private Node first;
    private Node last;

    @Override
    public void enqueue(E value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        E value = first();
        if (size==1){
            first = null;
            last = null;
        }else{
            first = first.next;
        }
        size--;
        return value;
    }

    @Override
    public E first() throws EmptyQueueException {
        return first.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        String queueData = "[";
        Node auxNode = first;
        while (auxNode != null){
            queueData += auxNode;
            auxNode = auxNode.next;

            if (auxNode != null){
                queueData += ", ";
            }
        }
        return queueData + "]";
    }
}
