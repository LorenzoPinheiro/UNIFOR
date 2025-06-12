package Lists;

import Exceptions.EmptyListException;

public class LinkedList<E> extends DynamicList<E>{

    // essa lista nunca fica cheia

    @Override
    public void add(E value) { // Big O de 1
      Node newNode = new Node(value);
      if (isEmpty()){
          head = newNode; // head passa de null para um endereço de memoria
          tail = newNode; // tail passa de null para um endereço de memoria
      }
      else{
          tail.next = newNode;
      }
      tail = newNode;
      size++; // size começa a subir
    }

    @Override
    public void insert(E value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            tail = newNode;
            head = newNode;
        }
        else{
            newNode.next =head;
            head = newNode;
        }
        size++;
    }

    @Override
    public void insert(int index, E value) {
        if (index<=0){
            insert(value);
        } else if (index >= size) {
            add(value);
        }
        else{
            Node newNode = new Node(value);
            Node auxNode = getNode(index - 1);
            newNode.next = auxNode.next;
            auxNode.next = newNode;
            size++;
        }
    }

    @Override
    public E removeLast() throws EmptyListException {

        E value = tail.value;

        if (size == 1){
            head = null;
            tail = null;
        }else {
            tail = getNode(size-2);
            tail.next = null;
            size--;

        }
        return value;

    }

    @Override
    public E removeFirst() throws EmptyListException {
        if(isEmpty()) throw  new EmptyListException("Lists.List linked is Empty");

        E value = head.value;

        if(size ==1){
            tail = null;
        }else{
            head = head.next;
            size--;
        }

        return value;
    }

    @Override
    public E removeByIndex(int index) throws EmptyListException {
        checkIndex(index);
        E value = null;

        if(index==0){
            removeFirst();
        } else if (index == size-1) {
            removeLast();
        }
        else{
            Node auxNode = getNode(index-1);
            value = auxNode.next.value;
            auxNode.next = auxNode.next.next;
            size--;
        }
        return value;
    }

    @Override
    public void set(int index, E value) throws EmptyListException {

    }

    @Override
    public E get(int index) throws EmptyListException {
        return null;
    }
}
