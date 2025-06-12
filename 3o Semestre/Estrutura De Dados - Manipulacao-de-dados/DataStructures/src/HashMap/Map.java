package HashMap;

import Queues.Entry;

public interface Map <K,V>{
    void set(K key, V value); //put
    Entry<K,V> get(K key);
    Entry<K,V> delete(K key);
    int size();
    boolean isEmpty();
}
