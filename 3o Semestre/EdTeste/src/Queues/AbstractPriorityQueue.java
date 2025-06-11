package Queues;

import java.util.Comparator;

public abstract class AbstractPriorityQueue<K,V> implements PriorityQueue<K,V>{

    class Node{
        Node next;
        Node before;
        Entry<K,V> entry;
        public Node(Entry<K, V> entry) {
            this.entry = entry;
        }
        public Node(K key, V value){
            entry = new PriorityEntry(key,value);
        }

    }

    class PriorityEntry implements Entry<K,V> {
        private K key;
        private V value;

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

        public PriorityEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "("+key + ", " + value+")";
        }
    }
    protected int size;
    protected Node first;
    protected Node last;
    protected Comparator<K> myComparator;

    public AbstractPriorityQueue(){
        myComparator = new MyComparator<>();
    }

    protected int compare(Entry<K,V> k1, Entry<K,V> k2){
        return myComparator.compare(k1.getKey(),k2.getKey());
    }

    protected int compare(Node n1, Node n2){
        return compare(n1.entry,n2.entry);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }



    @Override
    public String toString() {
        String data = "{";
        Node auxNode = first;
        while (auxNode != null){
            data += auxNode.entry;
            auxNode = auxNode.next;
            if (auxNode != null){
                data += ", ";
            }
        }
        return data + "}";
    }
}
