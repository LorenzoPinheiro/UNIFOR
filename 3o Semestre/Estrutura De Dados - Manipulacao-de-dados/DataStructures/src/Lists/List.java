package Lists;

import Exceptions.EmptyListException;

public interface List<E> {

    void add(E value); // ADICIONAR NO FINAL DA LISTA
    void insert(E value); // ADICIONAR NO INICIO DA LISTA
    void insert(int index, E value); // ADICIONAR NO INDEX ESCOLHIDO


    E removeLast() throws EmptyListException;
    E removeFirst() throws EmptyListException;
    E removeByIndex(int index) throws EmptyListException;

    void set(int index, E value) throws EmptyListException;
    E get(int index) throws EmptyListException;

    int size();
    boolean isEmpty();

    // lista estáticas ---> Array
}
