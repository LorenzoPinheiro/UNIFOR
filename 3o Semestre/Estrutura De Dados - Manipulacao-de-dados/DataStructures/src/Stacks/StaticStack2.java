package Stacks;

import Exceptions.EmptyStackException;
import Exceptions.FullStackException;
import Lists.StaticList;

public class StaticStack2<E> implements Stack<E> {

    private StaticList<E> stack;

    public StaticStack2(int maxHeight){
        stack = new StaticList<>(maxHeight);
    }

    public StaticStack2(){
        stack = new StaticList<>();
    }

    @Override
    public void push(E value) {
        if (stack.isFull()) throw new FullStackException("Pilha cheia");
        stack.add(value);
    }

    @Override
    public E pop() {
        return stack.removeLast();
    }

    @Override
    public E top() {
        if (isEmpty()) throw new EmptyStackException("");
        return stack.get(stack.size()-1);
    }

    @Override
    public int height() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }


    public String toString(){
        String dataPilha = "top -> ";

        for (int i = stack.size-1; i >=0; i--) {
            dataPilha += stack.get(i);
            if (i>0) dataPilha += "\n       ";
        }

        return dataPilha + " <- bottom";
    }
}
