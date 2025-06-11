package Queues;

public interface PriorityQueue<K,V>{

    void enqueue(K key, V value);
    Entry<K,V> dequeue();
    Entry<K,V> maxPriority();
    int size();
    boolean isEmpty();


}
