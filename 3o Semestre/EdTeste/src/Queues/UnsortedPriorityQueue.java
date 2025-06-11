package Queues;


public class UnsortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V>{

    private Node getMaxPriorityNode(){
        if (isEmpty()) throw new EmptyQueueException("FILA VAZIA!");
        Node maxPriority = first;
        Node auxNode = first.next;
        while (auxNode != null){
            int comp =myComparator.compare(auxNode.entry.getKey(), maxPriority.entry.getKey());
            if (comp < 0){
                maxPriority = auxNode;
            }
            auxNode = auxNode.next;
        }
        return maxPriority;
    }
    @Override
    public void enqueue(K key, V value) {
        Node newNode = new Node(key, value);
        if (isEmpty()){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            newNode.before = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public Entry<K, V> dequeue() {
        Node toRemove = getMaxPriorityNode();
        if (toRemove == first){
            first = first.next;
            if (size == 1){
                last = first;
            }
            else{
                first.before = null;
            }
        } else if (toRemove == last){
            last = last.before;
            last.next = null;
        }else {
            toRemove.next.before = toRemove.before;
            toRemove.before.next = toRemove.next;
        }
        size--;
        return toRemove.entry;
    }

    @Override
    public Entry<K, V> maxPriority() {
        return getMaxPriorityNode().entry;
    }





    public void updateKey(K oldKey, K newKey){
        Node auxNode = first;
        while (auxNode != null){
            int comp = myComparator.compare(auxNode.entry.getKey(), oldKey);
            if (comp == 0){
                V value = auxNode.entry.getvalue();
               auxNode.entry = new PriorityEntry(newKey,value);
            }
            auxNode = auxNode.next;
        }
    }

    public K findByValue(V value){
        Node auxNode = first;
        while (auxNode != null){
            if (value == auxNode.entry.getvalue()){
                return auxNode.entry.getKey();
            }
            auxNode = auxNode.next;
        }
        return null;
    }

    public UnsortedPriorityQueue<K,V> clone(){
        UnsortedPriorityQueue<K,V> filaClone = new UnsortedPriorityQueue<>();
        Node auxNode = first;
        while (auxNode != null){
            filaClone.enqueue(auxNode.entry.getKey(), auxNode.entry.getvalue());
            auxNode = auxNode.next;
        }
        return filaClone;
    }

    private Node getMax(){
        Node maxPriority = first;
        Node auxNode2 = first.next;
        while (auxNode2 != null){
            int comp = myComparator.compare(maxPriority.entry.getKey(), auxNode2.entry.getKey());
            if (comp > 0){
                maxPriority = auxNode2;
            }
            auxNode2 = auxNode2.next;
        }
        return maxPriority;
    }

    public String printSorted() {
        if (isEmpty()) {
            return "";
        }
        UnsortedPriorityQueue<K, V> tempQueue = new UnsortedPriorityQueue<>();
        Node current = first;
        while (current != null) {
            tempQueue.enqueue(current.entry.getKey(), current.entry.getvalue());
            current = current.next;
        }


        String result = "";
        while (!tempQueue.isEmpty()) {
            Entry<K, V> entry = tempQueue.dequeue();
            result += entry;
        }

        return result;
    }
}
