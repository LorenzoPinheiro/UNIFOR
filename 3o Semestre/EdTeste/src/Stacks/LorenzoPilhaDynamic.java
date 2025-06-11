package Stacks;

public class LorenzoPilhaDynamic<E> implements Stack<E> {

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

    private Node top;
    private int height;


    @Override
    public void push(E value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        height++;
    }

    public Node getNode(int index){
        Node auxNode = top;
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.next;
        }
        return auxNode;
    }

    public E popUntil(int index){
        LorenzoPilhaDynamic<E> newDynamic = new LorenzoPilhaDynamic<E>();
        if (isEmpty()) throw new EmptyStackException("Pilha está vazia");

        //v2
        for (int i = 0; i < index; i++) {
            E value = pop();
            newDynamic.push(value);
            newDynamic.height++;
        }
        //v1
//        E value = top.value;
//        for (int i = 0; i < index; i++) {
//            newDynamic.push(value);
//            value = top.next.value;
//            top = top.next;
//            newDynamic.height++;
//            height--;
//        }
        return (E) newDynamic;
    }

    @Override
    public E pop() {
        if (isEmpty()) throw new EmptyStackException("Pilha está vazia");
        E value = top.value;
        top = top.next;
        height--;
        return value;
    }

    @Override
    public E top() {
        if (isEmpty()) throw new EmptyStackException("Pilha está vazia");
        return top.value;
    }

    @Override
    public int height() {

        return height;
    }

    @Override
    public boolean isEmpty() {
        return height == 0;
    }


    public String toString(){
        String dataString = "top -> ";
        Node auxNode = top;
        while (auxNode != null){
            dataString += auxNode;
            auxNode = auxNode.next;
            if (auxNode != null){
                dataString += "\n       ";
            }


        }
        //return dataString + " <- bottom";
        return isEmpty()?"": dataString + " <- bottom";

    }
}
