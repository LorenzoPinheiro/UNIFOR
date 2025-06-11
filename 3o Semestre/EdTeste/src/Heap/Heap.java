package Heap;

import Queues.Entry;
import Stacks.FullStackException;

public class Heap<K,V> extends AbstractHeap<K,V>{
    @Override
    public void enqueue(K key, V value) {
        if (isFull()) throw new FullStackException("CHEIA");
        heap[size] = new HeapEntry(key, value);
        bubblingUp(size);
        size++;
    }

    public void bubblingUp(int atual){
        int parent = parent(atual);
        while (atual > 0 && compare(atual,parent)<0){
            // key1 = heap[atual].getKey()
            // key2 = heap[parent].getKey()
            // if (key1 > key2) -> compare(atual, parent) > 0 ::: Entra
            // if (key1 < key2) -> compare(atual, parent) < 0 ::: Não entra
            // if (key1 == key2) -> compare(atual, parent) == 0 ::: Não entr

            swap(atual,parent);
            atual = parent;
            parent = parent(atual);
        }
    }

    @Override
    public Entry<K, V> dequeue() {
        Entry<K,V> entry = maxPriority();
        heap[0] = heap[size-1];
        if (size>1){
            sinkDown(0);
        }
        size--;
        return entry;
    }

    public void sinkDown(int min){
        int leftChild, rightChild, atual;

        do {
            atual = min;
            leftChild = leftChild(atual);
            rightChild = rightChild(atual);

            if (leftChild < size-1 && compare(leftChild, min)<0){  // >
                // key1 = heap[atual].getKey()
                // key2 = heap[parent].getKey()
                // if (key1 > key2) -> compare(atual, parent) > 0 ::: Entra
                // if (key1 < key2) -> compare(atual, parent) < 0 ::: Não entra
                // if (key1 == key2) -> compare(atual, parent) == 0 ::: Não entr
                min = leftChild;
            }

            if (rightChild < size-1 && compare(rightChild, min)<0){ // >
                // key1 = heap[atual].getKey()
                // key2 = heap[parent].getKey()
                // if (key1 > key2) -> compare(atual, parent) > 0 ::: Entra
                // if (key1 < key2) -> compare(atual, parent) < 0 ::: Não entra
                // if (key1 == key2) -> compare(atual, parent) == 0 ::: Não entr
                min = rightChild;
            }
            if (atual != min){
                swap(atual,min);
            }
        }while (atual!=min);

    }

    @Override
    public Entry<K, V> maxPriority() {
        return heap[0];
    }
}
