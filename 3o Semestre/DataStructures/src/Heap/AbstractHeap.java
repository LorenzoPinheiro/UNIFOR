package Heap;

import Queues.Entry;
import Queues.MyComparator;
import Queues.PriorityQueue;

import java.util.Comparator;

public abstract class AbstractHeap <K,V> implements PriorityQueue<K,V> {

    class HeapEntry implements Entry<K,V> {
        private K key;
        private V value;
        public HeapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getvalue() {
            return value;
        }

        @Override
        public void setValue(V value) {

        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }

    protected int size;
    protected Entry<K,V>[] heap;
    protected Comparator<K> myComparator = new MyComparator<>();;

    public AbstractHeap() {
        heap = new Entry[500];
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isFull(){
        return size == heap.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    protected int parent(int childIndex){
        return (childIndex-1)/2;
    }
    protected int leftChild(int parentIndex){
        return parentIndex*2+1;
    }
    protected int rightChild(int parentIndex){
        return leftChild(parentIndex)+1;
    }

    protected int compare(int index1, int index2){
        return myComparator.compare(heap[index1].getKey(), heap[index2].getKey());
    }

    protected void swap(int index1, int index2){
        Entry<K,V> auxEntry = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = auxEntry;
    }

    @Override
    public String toString() {
        String heapData = "";
        for (int i = 0; i < size; i++) {
            heapData += heap[i];

            if (i<size-1){
                heapData += ", ";
            }
        }
        return heapData;
    }
}
