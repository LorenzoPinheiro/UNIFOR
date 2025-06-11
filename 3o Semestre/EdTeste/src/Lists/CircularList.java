package Lists;

public class CircularList <E> extends DynamicList <E>{

    @Override
    public void add(E value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.before = newNode;
        }else{
           // tail.next = newNode;
            //newNode.next = head;
           // newNode.before = tail;
           // tail = newNode;
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }

        size++;

    }

    @Override
    public void insert(E value) {
        Node newNode = new Node(value);
        if (tail != null){
            tail = newNode;
            tail.next = tail;
        }

        newNode.next = head.next;
        head.next = newNode;
        head = newNode;
        size++;
    }

    @Override
    public void insert(int index, E value) {

    }

    @Override
    public E removeLast() throws EmptyListException {
        return null;
    }

    @Override
    public E removeFirst() throws EmptyListException {
        return null;
    }

    @Override
    public E removeByIndex(int index) throws EmptyListException {
        return null;
    }

    @Override
    public void set(int index, E value) throws EmptyListException {

    }

    @Override
    public E get(int index) throws EmptyListException {
        return null;
    }

    @Override
    public String toString() {
        String dataString = "[";
        Node auxNode = head;
        for (int i = 0; i < size; i++) {
            dataString += auxNode.value;
            if (auxNode.next != tail.next) dataString += " ⇄ ";
            auxNode = auxNode.next;
        }
        return dataString + "]";
    }
}
