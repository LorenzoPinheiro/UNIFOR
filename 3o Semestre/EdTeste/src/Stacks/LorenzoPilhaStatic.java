package Stacks;

public class LorenzoPilhaStatic<E> implements Stack<E> {

    protected int height;
    protected E[] stack;
    protected int MAX_SIZE = 5;

    public LorenzoPilhaStatic(){
        stack = (E[]) new Object[MAX_SIZE];
    }

    public LorenzoPilhaStatic(int maxSize){
        stack = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E value) {
        stack[height++] = value;

    }

    @Override
    public E pop() {
        E value = top();
        height--;
        return value;
    }

    public E popUntil(int index){
        LorenzoPilhaStatic<E> newStack = new LorenzoPilhaStatic<>();
        if (index > height+1) throw new FullStackException("Não existe esse indice");
        if (index == 0){
            for (int i = 0; i < stack.length ; i++) {
                height--;
                newStack.push(stack[i]);
             }
         }
        else{
            for (int i = index; i < stack.length ; i++) {
                height--;
                newStack.push(stack[i]);
             }
          }
        return (E) newStack;
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

    public String reverse(){
        String dataPilha = " top -> ";

        for (int i = 0; i <= height-1; i++) {
            dataPilha += stack[i];
            if (i < height-1) dataPilha += "\n       ";
        }
        return dataPilha + " <- bottom";

    }

    @Override
    public String toString() {
        String dataPilha = "top -> ";

        for (int i = height-1; i >=0; i--) {
            dataPilha += stack[i];
            if (i>0) dataPilha += "\n       ";
        }

        return dataPilha + " <- bottom";
    }
}
