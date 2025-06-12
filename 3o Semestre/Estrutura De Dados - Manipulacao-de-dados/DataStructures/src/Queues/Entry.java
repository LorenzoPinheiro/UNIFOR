package Queues;

public interface Entry<K,V>{
    K getKey();
    V getvalue();
    void setValue(V value);
}
