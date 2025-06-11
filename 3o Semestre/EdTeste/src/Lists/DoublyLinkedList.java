package Lists;

public class DoublyLinkedList <E> extends DynamicList<E>{
    @Override
    public void add(E value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode; // para de apontar para null e passa a apontar a um NewNode
            newNode.before = tail;
        }
        tail = newNode;
        size++;
    }


    public String printReserves(){
        if (isEmpty()) return "[]";
        String listData = "[";
        Node auxNode = tail;

        while (auxNode !=null){
            listData += auxNode.value;
            if (auxNode.before != null) listData += " ⇄ ";
            auxNode = auxNode.before;
        }
        return listData + "]";
    }
    @Override
    public void insert(E value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head; // null para Newnode
            head.before = newNode; // NewNode para null
        }
        head = newNode;
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
            Node auxNode = index >= size/2 ? getNodeFromTail(index) : getNode(index);
            Node newNode = new Node(value);
            newNode.next = auxNode; // newNode passa de null para apontar a auxNode
            newNode.before = auxNode.before;
            auxNode.before.next = newNode;
            auxNode.before = newNode;
            size++;
        }
    }


    private Node getNodeFromTail(int index){
        Node auxNode = tail;
        for (int i = size-1; i < index; i--) {
            auxNode = auxNode.before;
        }
        return auxNode;
    }

    @Override
    public E removeLast() throws EmptyListException {
        if (isEmpty()) throw new EmptyListException("vazio");

        E value = tail.value;

        if (size == 1){
            head = null;
            tail = null;
        }else {
            tail = tail.before;
            tail.next = null;

        }
        size--;
        return value;
    }

    @Override
    public E removeFirst() throws EmptyListException {
        if (isEmpty()) throw new EmptyListException("vazio");
        E value = head.value;
        if (size == 1){
            head = null;
            tail = null;
            size--;
        }else {
            head = head.next;
            head.before = null;
            size--;
        }
        return value;
    }

    @Override
    public E removeByIndex(int index) throws EmptyListException {
        E value = null;
        if (index == 0){
            value = removeFirst();
        }if (index >= size){
            value = removeLast();
        }else{

            Node auxNode = index <=size/2 ? getNode(index) : getNodeFromTail(index);
            value = auxNode.value;
            auxNode.before.next = auxNode.next;
            auxNode.next.before = auxNode.before;
            size--;
        }
        return value;
    }


    @Override
    public E get(int index) throws EmptyListException {
        if (index > size + 1) {
            throw new FullListException("Passou do limite");
        }
        Node auxNode = getNode(index);
        return auxNode.value;
        //       OU
        //Node auxNode = head;
        //for (int i = 0; i < index; i++) {
        //    auxNode = auxNode.next;
        //}
        //return auxNode.value;
    }

    @Override
    public void set(int index, E value) throws EmptyListException {
        if (index > size + 1) {
            throw new FullListException("Passou do limite");
        }
        Node auxNode = head;
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.next;
        }
        auxNode.value = value;
        System.out.println(value);

    }


    public DoublyLinkedList<E> copia(){
        DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
        Node auxNode = head;

        while (auxNode != null){
            newList.add(auxNode.value);
            auxNode = auxNode.next;
        }
        return newList;
    }

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(E[]array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                this.add(array[i]);
            }
        }
    }


    public DoublyLinkedList<E> removeFirst(int index){
        for (int i = 0; i <= index; i++) {
            head = head.next;
            head.before = null;
            size--;
        }
        return copia();
    }

    public DoublyLinkedList<E> removeLast(int index){
        for(int i = size-1; i >=index; i--){
            tail.next = null;
            tail = tail.before;
            size--;
        }
        tail.next = null;
        return copia();
    }

    public DoublyLinkedList<E> removeByIndex(int index1, int index2){
        Node auxNode = getNode(index1);
        Node auxNode2 = getNode(index2);
        if (index1 == 0){
            removeFirst(index2);
            return copia();
        }

        auxNode.before.next = auxNode2.next;
        auxNode2.next.before= auxNode.before;

        for (int i = index1; i < index2; i++) {
            size--;
        }
        return copia();
    }

    @Override
    public String toString() {
        String dataString = "[";
        Node auxNode = head;
        while (auxNode!=null){
            dataString += auxNode.value;
            if (auxNode.next != null) dataString += " ⇄ ";
            auxNode = auxNode.next;
        }
        return dataString + "]";

    }
}
