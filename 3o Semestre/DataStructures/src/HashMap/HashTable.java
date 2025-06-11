package HashMap;

import Queues.Entry;

public class HashTable <K,V> extends AbstractHashTable<K,V>{


    public HashTable(int mapSize) {
        super(mapSize);
    }

    private Node getNodeByKeyAtIndex(K key, int index){
        Node auuxNode = hashTable[index];
        while (auuxNode!=null){
            if (key.equals(auuxNode.entry.getKey())){
                return auuxNode;
            }
            auuxNode = auuxNode.next;
        }
        return null; // NÃO ENCONTROU O NÓ
    }

    @Override
    public void set(K key, V value) { // EX: (those who know, 55)
        Node newNode = new Node(key, value);
        int index = hashFunction(key); // transforma o those who know em int (index)

        if (hashTable[index] == null){
            hashTable[index] = newNode;
        }else{
            Node AuxNode = hashTable[index];
            while (AuxNode!=null){
                if (key.equals(AuxNode.entry.getKey())){ // SE A CHAVE FOR A MESMA, SÓ MUDA O VALUE !!!
                    AuxNode.entry.setValue(value);
                    return;
                }
                AuxNode = AuxNode.next; // SE N, AVANÇA
            }
            newNode.next = hashTable[index];   // hashtable[index] é o FIRST!!!
            hashTable[index].before = newNode;  // hashtable[index] é o FIRST!!!
            hashTable[index] = newNode;  // hashtable[index] é o FIRST!!!
        }
        size++;
    }

    @Override
    public Entry<K, V> get(K key) {
        return getNodeByKeyAtIndex(key,hashFunction(key)).entry;
    }

    @Override
    public Entry<K, V> delete(K key) {
        int index = hashFunction(key);
        Node toRemove = getNodeByKeyAtIndex(key, index);
        if (toRemove==null) return null;

        if (toRemove == hashTable[index]){ // se for o (FIRST)!
            hashTable[index] = hashTable[index].next;
            if (hashTable[index] !=null){
                hashTable[index].before = null;
            }
        }else if (toRemove.next == null) { // se for o ultimo
            toRemove.before.next = null;
        }else {
            toRemove.next.before = toRemove.before; // caso geral
            toRemove.before.next = toRemove.next;
        }
        size--;
        return toRemove.entry;
    }

    @Override
    public String toString() {
        String hashData = "";
        for (int i = 0; i < hashTable.length; i++) {
            hashData += "["+i+"]: ";
            Node auxNode = hashTable[i];
            while (auxNode != null){
                hashData += auxNode.entry;
                auxNode = auxNode.next;
                if (auxNode != null) hashData += " -> ";
            }
            hashData +="\n";
        }

        return hashData;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
