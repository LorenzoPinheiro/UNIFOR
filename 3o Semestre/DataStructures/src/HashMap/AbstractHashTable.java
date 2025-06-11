package HashMap;

import Queues.Entry;

public abstract class AbstractHashTable<K,V> implements Map<K,V>{

    class Node{
        Node next;
        Node before;
        Entry<K,V> entry;

        public Node(Entry<K, V> entry) {
            this.entry = entry;
        }
        public Node(K key, V value) {
            entry = new HashEntry(key, value);
        }
    }

    class HashEntry implements Entry<K,V> {
        private K key;
        private V value;

        public HashEntry(K key, V value){
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

        public void setValue(V value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "("+key + ", " + value+")";
        }
    }

    protected Node[] hashTable;
    protected int size;

    public AbstractHashTable(int mapSize) {
        hashTable = (Node[]) new Node[mapSize];
    }

    public int hashCode(String key){
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = (hashCode<<5) | hashCode>>>27;
            hashCode += key.charAt(i);
        }
        return hashCode; // provavelmente retorna um inteiro grande
    }

    public int compression(int hashCode){ // ACESSAR INDICES VÁLIDOS NO ARRAY
        return hashCode>=0? hashCode%hashTable.length : (hashCode*-1)% hashTable.length;
    }

    protected int hashFunction(K key){
        if (key instanceof String){
            return compression(hashCode((String) key));
        }
        throw new RuntimeException("KEY DATA TYPE IS NOT SUPPORTED YET");
    }


}
