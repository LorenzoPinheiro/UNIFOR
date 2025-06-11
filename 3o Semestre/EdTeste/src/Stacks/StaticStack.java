package Stacks;

import Lists.EmptyListException;
import Lists.FullListException;

public class StaticStack<E> implements Stack<E> {

    private int height;
    private E[] stack;
    private final int maxHeight  = 10;

    public StaticStack(){
        stack = (E[]) new Object[maxHeight];
    }

    public StaticStack(int MAX_HEIGHT){
        stack = (E[]) new Object[MAX_HEIGHT];
    }

    @Override
    public void push(E value) {
        if (isFull()) throw new FullListException("Pilha está cheia");
        stack[height++] = value;

        //  OU
      //  stack[height] = value;
      //  height++;
    }

    @Override
    public E pop() {
        if (isEmpty() ) throw new EmptyListException("Pilha vazia");

        E value = top();
        height--;
        return value;
    }

    @Override
    public E top() {
        return stack[height-1];
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return height == 0;
    }

    public boolean isFull(){
        return height == stack.length;
    }

    public String toString(){
        String dataPilha = "top -> ";

        for (int i = height-1; i >=0; i--) {
            dataPilha += stack[i];
            if (i>0) dataPilha += "\n       ";
        }

        return dataPilha + " <- bottom";
    }
}
