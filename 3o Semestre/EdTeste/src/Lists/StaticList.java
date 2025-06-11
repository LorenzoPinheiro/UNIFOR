package Lists;

public class StaticList<E> implements List<E> {


    public int size;
    protected E[] list;
    protected final int MaxSize = 10;


    public StaticList(int maxSize){
        list = (E[]) new Object[maxSize];
    }
    public StaticList(){
        list = (E[]) new Object[MaxSize];
    }

    public boolean isFull(){
        return size == list.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(E value) throws FullListException { // Big O constante
        if(isFull()) throw  new FullListException("Static list is full!");

        list[size] = value;
        size++;
    }


    @Override
    public void insert(E value) { // Big O de N
        if(isFull()) throw  new FullListException("Static list is full!");
        for (int i = size; i> 0 ; i--) {
            list[i] = list[i - 1];
        }
        list[0] = value;
        size++;
    }

    @Override
    public void insert(int index, E value) {
        if(isFull()) throw  new FullListException("Static list is full!");
        if(index ==0){
            insert(value);
        } else if (index >= size) {
            add(value);
        }
        else{
            for (int i = size; i> index ; i--) {
                list[i] = list[i - 1];
            }
            list[index] = value;
            size++;
        }
    }


    @Override
    public E removeLast() throws EmptyListException {
        if(isEmpty()) throw  new EmptyListException("Lists.List Estatic is Empty");
        return list[--size];
    }

    @Override
    public E removeFirst() throws EmptyListException {
        if(isEmpty()) throw  new EmptyListException("Lists.List Estatic is Empty");

        E value = list[0];
        size = size - 1;
        for (int i = 0; i < size; i++) {
            list[i] = list[i + 1];
        }
        return value;
    }

    @Override
    public E removeByIndex(int index) throws EmptyListException, IndexOutOfBoundsException{
        if(isEmpty()) throw  new EmptyListException("Lists.List Estatic is Empty");
        checkIndex(index);

        E value = list[index];
        size = size - 1;
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        return value;
    }

    public void checkIndex(int index){
        if (index<0 || index>=size) throw new IndexOutOfBoundsException("indices disponiveis são ---> " + (size-1)+ "");
    }


    public boolean contains(E value){
        for (int i = 0; i < size; i++) {
            if(value == list[i]) return true;
        }
        return false;
    }

    @Override
    public void set(int index, E value) throws EmptyListException {
        if(isEmpty()) throw  new EmptyListException("Lists.List Estatic is Empty");
        checkIndex(index);
        list[index] = value;
    }

    @Override
    public E get(int index) throws EmptyListException {
        if(isEmpty()) throw  new EmptyListException("Lists.List Estatic is Empty");
        checkIndex(index);
        return list[index];
    }

    @Override
    public int size() {
        return size;
    }



    @Override
    public String toString() {
        String listData = "[";
        for (int i = 0; i < size; i++) {
            listData += list[i];
            if(i < size - 1){
                listData += ", ";
            }
        }
        return listData + "]";
    }
}
