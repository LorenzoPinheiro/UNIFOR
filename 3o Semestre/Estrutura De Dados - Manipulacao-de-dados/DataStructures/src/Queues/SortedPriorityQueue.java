package Queues;

import Exceptions.EmptyQueueException;

public class SortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V>{

    @Override
    public Entry<K, V> dequeue() { //O(1)
        if (isEmpty()) throw new EmptyQueueException("VAZIO");
        Entry<K, V> toRemove = first.entry;

        first = first.next;

        if (first == null) {
            last = null;
        } else {
            first.before = null;
        }
        size--;
        return toRemove;
    }

    @Override
    public void enqueue(K key, V value) { //O(n)
        Node newNode = new Node(key, value);

        // Caso especial: fila vazia
        if (isEmpty()) {
            first = last = newNode;
            size++;
            //return;
        }
        // Caso especial: nova entrada tem prioridade menor que o primeiro elemento
        else if (compare(newNode, first) <= 0) {
            newNode.next = first;
            first.before = newNode;
            first = newNode;
            size++;
            //return;
        }
        // Caso especial: nova entrada tem prioridade maior que o último elemento
        else if (compare(newNode, last) > 0) {
            last.next = newNode;
            newNode.before = last;
            last = newNode;
            size++;
            //return;
        }
        // Caso Geral:
        else {
            Node current = first;
            while (current != null && compare(newNode, current) > 0) {
                current = current.next;
            }
            // Insere o novo nó antes do nó current
            newNode.next = current;
            newNode.before = current.before;
            current.before.next = newNode;
            current.before = newNode;
            size++;
            //return;
        }
    }

    @Override
    public Entry<K, V> maxPriority() { //O(1)
        if (isEmpty()) throw new EmptyQueueException("VAZIO");
        return first.entry;
    }
}






