package Deque;

import Exceptions.EmptyQueueException;

public class DynamicDeque<E> implements Deque<E> {

    class Node{
        Node next;
        Node before;
        E value;
        public Node(E value) {
            this.value = value;
        }
        public String toString(){
            return value.toString();
        }
    }

    protected int size;
    private Node first;
    private Node last;


    @Override
    public void add(E value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;
            newNode.before = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public void insert(E value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            last = newNode;
        }else{
            newNode.next = first;
            first.before = newNode;
        }
        first = newNode;
        size++;
    }

    @Override
    public E removeLast() throws EmptyQueueException {
        E value = last();
        last = last.before;
        if (size == 1){
            first = last;
        }else{
            last.next = null;
        }
        size--;
        return value;
    }

    @Override
    public E removeFirst() throws EmptyQueueException {
        E value = first();
        first = first.next;
        if (size == 1){
            last = first;
        }else{
            first.before = null;
        }
        size--;
        return value;
    }

    @Override
    public E last() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("Lista vazia");
        return last.value;
    }

    @Override
    public E first() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("Lista vazia");
        return first.value;
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
        String dataDeque = "{";
        Node auxNode = first;
        while (auxNode != null){
            dataDeque += auxNode;
            auxNode = auxNode.next;
            if (auxNode != null){
                dataDeque += ", ";
            }
        }
        return dataDeque + "}";
    }

    public String reverse() {
        String dataDeque = "{";
        Node auxNode = last;
        while (auxNode != null){
            dataDeque += auxNode;
            auxNode = auxNode.before;
            if (auxNode != null){
                dataDeque += ", ";
            }
        }
        return dataDeque + "}";
    }


}
