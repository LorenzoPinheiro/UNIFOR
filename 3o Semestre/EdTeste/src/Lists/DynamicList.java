package Lists;

public abstract class DynamicList<E> implements List<E> {

    // linked Lists.List x --> y --> z --> w...
    // nesse caso x é o HEAD(primeiro) e o w é o TAIL(ultimo)

    //OBS: UM ELEMENTO PODE SER HEAD E TAIL AO MESMO TEMPO

    class Node{ // CRIAÇÃO DO OBJETO "NODE"

        E value;
        Node next;
        Node before;

        public Node(E value) {
            this.value = value;
        }
    }

    protected int size;
    protected Node head;
    protected Node tail;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    protected Node getNode(int index){
        Node auxNode = head;
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.next;
        }
        return auxNode;
    }

    protected void checkIndex(int index){
        if(index < 0 || index >=size) throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        String dataString = "[";
        Node auxNode = head;
        while (auxNode!=null){
            dataString += auxNode.value;
            if (auxNode.next != null) dataString += " -> ";
            auxNode = auxNode.next;
        }
        return dataString + "]";
    }
}
