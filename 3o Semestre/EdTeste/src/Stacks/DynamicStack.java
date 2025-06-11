package Stacks;

public class DynamicStack<E> implements Stack<E> {


    class Node{ // CRIAÇÃO DO OBJETO "NODE"
        E value;
        Node next;
        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "[" +value+ "]";
        }
    }

    private Node top;
    private int height;  // USUÁRIO NÃO VAI CONSEGUIR MUDAR O VALOR NA MAIN


//    public Stacks.DynamicStack() {    CONSTRUTOR OPCIONAL
//        top = null;
//        height = 0;
//    }

    @Override
    public void push(E value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        height++;
    }

    @Override
    public E pop() {
        E value = top();
        top = top.next;
        height--;
        return value;
    }

    @Override
    public E top() {
        if (isEmpty()) throw new EmptyStackException("a pilha está vazia");
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
