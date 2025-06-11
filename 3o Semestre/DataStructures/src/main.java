import BinarySearchTrees.BinarySearchTree;
import BinarySearchTrees.RecursiveBinarySearchTree;
import Deque.DynamicDeque;
import Deque.StaticDeque;
import HashMap.HashTable;
import Heap.Heap;
import Lists.ArrayList;
import Lists.LinkedList;
import Lists.List;
import Queues.*;
import Stacks.DynamicStack;
import Stacks.StaticStack;


public class main {
    public static void main(String[] args) {
        System.out.println("Estrutura de dados");
        System.out.println();

        byte n1 = -128; // Limite (2^8) (-128---127)
        short n2 = -420; // Limite (2^16) (2 bytes)
        int n3 = 124555; // Limite (2^32) (4 bytes)
        long n4 = 39346856; //Limite (2^64)
        float n5 = 12757575.75f; // Limite (2^32)
        double n6 = 12345678; // Limite (2^64)



        //RECURSSÃO
        int n = 6;
        System.out.println("EXEMPLO DE RECURSSÃO (FATORIAL): ");
        System.out.println(Recurssao.fatorial(n));

        System.out.println("EXEMPLO DE RECURSSÃO (SOMA LINEAR): ");
        int[] arrayInt = {1,2,3,4,5};
        System.out.println(Recurssao.somaLinear(arrayInt));

        System.out.println("EXEMPLO DE RECURSSÃO (FIBONACCI): ");
        System.out.println(Recurssao.fibonacci(1)+" ");
        System.out.println(Recurssao.fibonacci(2)+" ");
        System.out.println(Recurssao.fibonacci(3)+" ");
        System.out.println(Recurssao.fibonacci(4)+" ");
        System.out.println(Recurssao.fibonacci(5)+" ");
        System.out.println(Recurssao.fibonacci(6)+" ");
        System.out.println();


        System.out.println("----------------------------ARRAY LIST----------------------------");
        List<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(2);
        minhaLista.add(4);
        minhaLista.add(6);
        minhaLista.add(10);
        System.out.println(minhaLista);

        minhaLista.insert(232, 99);
        minhaLista.insert(0,100);
        System.out.println(minhaLista);
        System.out.println();

        System.out.println("Removendo LAST: " + minhaLista.removeLast());
        System.out.println(minhaLista);
        System.out.println();

        System.out.println(minhaLista);
        System.out.println("Removendo FIRST: " + minhaLista.removeFirst());
        System.out.println(minhaLista);
        System.out.println();

        System.out.println(minhaLista);
        System.out.println("Removendo por INDEX: " + minhaLista.removeByIndex(2));
        System.out.println(minhaLista);
        System.out.println();


        System.out.println("----------------------------LINKED LIST----------------------------");
        LinkedList<Integer> minhaLinkedList = new LinkedList<>();
        minhaLinkedList.add(10);
        minhaLinkedList.add(9);
        System.out.println(minhaLinkedList);
        minhaLinkedList.insert(90);
        minhaLinkedList.insert(100);
        minhaLinkedList.insert(1000);
        minhaLinkedList.insert(0,35000);
        System.out.println(minhaLinkedList);
        System.out.println();

        System.out.println("Removendo FIRST: " + minhaLinkedList.removeFirst());
        System.out.println(minhaLinkedList);
        System.out.println();

        System.out.println("Removendo LAST: " + minhaLinkedList.removeLast());
        System.out.println(minhaLinkedList);
        System.out.println();

        System.out.println("Removendo por INDEX: " + minhaLinkedList.removeByIndex(1));
        System.out.println(minhaLinkedList);
        System.out.println();


        System.out.println("----------------------------DOUBLY LINKED LIST----------------------------");
        Lists.DoublyLinkedList <Integer> mlDLL = new Lists.DoublyLinkedList<>();
        mlDLL.insert(12);
        mlDLL.insert(13);
        mlDLL.insert(1);
        mlDLL.insert(2);
        mlDLL.insert(3);
        mlDLL.insert(4);
        mlDLL.insert(5);
        mlDLL.insert(6);
        System.out.println("LIST: "+ mlDLL);
        System.out.println("LIST REVERSE: "+mlDLL.printReserves());
        System.out.println("SIZE = " + mlDLL.size());
        System.out.println();

        mlDLL.insert(2,5500000);

        System.out.println("LIST: "+mlDLL);
        System.out.println("LIST REVERSE: "+mlDLL.printReserves());
        System.out.println();

        System.out.println("Removendo FIRST: "+ mlDLL.removeFirst());
        System.out.println("LIST: "+mlDLL);
        System.out.println("LIST REVERSE: "+mlDLL.printReserves());
        System.out.println();

        System.out.println("Removendo LAST: "+mlDLL.removeLast());
        System.out.println("LIST: "+mlDLL);
        System.out.println("LIST REVERSE: "+mlDLL.printReserves());
        System.out.println();

        System.out.println("Removendo por INDEX: "+mlDLL.removeByIndex(3));
        System.out.println("LIST: "+mlDLL);
        System.out.println("LIST REVERSE: "+mlDLL.printReserves());
        System.out.println();;


        System.out.println("----------------------------STACTIC STACK----------------------------");
        StaticStack<Integer> pilhaStatic = new StaticStack<>();
        pilhaStatic.push(10);
        pilhaStatic.push(20);
        pilhaStatic.push(30);
        System.out.println(pilhaStatic);
        System.out.println();
        System.out.println("topo: " + pilhaStatic.top());
        System.out.println("Removendo o topo: " + pilhaStatic.pop());
        System.out.println();
        System.out.println(pilhaStatic);
        System.out.println();


        System.out.println("----------------------------DYNAMIC STACK----------------------------");
        DynamicStack<Integer> pilhaDynamic = new DynamicStack<>();
        pilhaDynamic.push(10);
        pilhaDynamic.push(20);
        pilhaDynamic.push(25);
        pilhaDynamic.push(30);
        pilhaDynamic.push(65);
        pilhaDynamic.push(130);
        System.out.println(pilhaDynamic);
        System.out.println();


        System.out.println("----------------------------STATIC QUEUE----------------------------");
        StaticQueue<String> staticQueue = new StaticQueue<>();
        staticQueue.enqueue("Artur Wermont");
        staticQueue.enqueue("Victor Lins");
        staticQueue.enqueue("Diga Gifoni");
        System.out.println("QUEUE: " + staticQueue);
        System.out.println("SIZE = " + staticQueue.size());
        System.out.println("REMOVENDO FIRST: " + staticQueue.dequeue());
        System.out.println("QUEUE: " + staticQueue);
        System.out.println("SIZE = " + staticQueue.size());
        System.out.println();



        System.out.println("----------------------------DYNAMIC QUEUE----------------------------");
        DynamicQueue<String> dynamicQueue = new DynamicQueue<>();
        dynamicQueue.enqueue("Lili");
        dynamicQueue.enqueue("Tung Sahur");
        System.out.println(dynamicQueue);
        System.out.println("REMOVENDO FIRST: " + dynamicQueue.dequeue());
        System.out.println(dynamicQueue);
        System.out.println();



        System.out.println("----------------------------CIRCULAR STATIC QUEUE----------------------------");
        CircularStaticQueue<String> circularFila = new CircularStaticQueue<>();
        circularFila.enqueue("Eu");
        circularFila.enqueue("ele");
        circularFila.enqueue("ela");
        System.out.println(circularFila);
        System.out.println("removendo FIRST: " + circularFila.dequeue());
        System.out.println(circularFila);
        System.out.println();


        System.out.println("----------------------------DYNAMIC DEQUE----------------------------");
        DynamicDeque<String> dynamicDeque = new DynamicDeque<String>();
        dynamicDeque.add("GABRIEL");
        dynamicDeque.add("LORAX");
        dynamicDeque.add("DIGAS");
        dynamicDeque.insert("BALKAN");
        System.out.println("DEQUE: " + dynamicDeque);
        System.out.println("DEQUE REVERSE: " + dynamicDeque.reverse());
        System.out.println();

        System.out.println("----------------------------STATIC DEQUE----------------------------");
        StaticDeque<String> staticDeque = new StaticDeque<String>();
        staticDeque.add("THOSE");
        staticDeque.insert("ZZZZ");
        staticDeque.add("FURIA BALKONICA");
        staticDeque.insert("IRIKIRARILA");
        System.out.println(staticDeque);
        System.out.println();


        System.out.println("----------------------------SORTED PRIORITY QUEUE----------------------------");
        SortedPriorityQueue<Integer,String> filaOrdenada = new SortedPriorityQueue<>();
        System.out.print("FILA SORTED: ");
        filaOrdenada.enqueue(0,"Artur Wermont");
        filaOrdenada.enqueue(3,"Victor Lins");
        filaOrdenada.enqueue(1,"Lorax");
        filaOrdenada.enqueue(5,"Balkan");
        System.out.println(filaOrdenada);
        System.out.println();
        System.out.print("REMOVENDO PRIORIDADE: ");
        System.out.println(filaOrdenada.dequeue());
        System.out.println(filaOrdenada);
        System.out.println();
        System.out.println("Inserindo elemento: ");
        filaOrdenada.enqueue(22, "Curio Sahur");
        System.out.println(filaOrdenada);
        System.out.println();

        System.out.println("----------------------------UNSORTED PRIORITY QUEUE----------------------------");
        UnsortedPriorityQueue<Integer,String> minhaFilaPrioridade = new UnsortedPriorityQueue<>();
        System.out.println("FILA UNSORTED:");
        minhaFilaPrioridade.enqueue(1, "Diogo");
        minhaFilaPrioridade.enqueue(-2, "Lorenzo");
        minhaFilaPrioridade.enqueue(5, "Artur Wermont");
        minhaFilaPrioridade.enqueue(2, "Vector Lins");
        System.out.println(minhaFilaPrioridade);
        System.out.println();
        System.out.println("PRINT SORTED:");
        System.out.println(minhaFilaPrioridade.printSorted());
        System.out.println("Elemento de prioridade máxima: " + minhaFilaPrioridade.maxPriority());
        System.out.println();
        System.out.println("DEQUEUE:" + minhaFilaPrioridade.dequeue());
        System.out.println(minhaFilaPrioridade);
        System.out.println();
        System.out.println("UPDATE KEY:");
        minhaFilaPrioridade.updateKey(5,22);
        System.out.println(minhaFilaPrioridade);
        System.out.println();
        System.out.println("FIND BY VALUE:");
        System.out.println(minhaFilaPrioridade.findByValue("Lorenzo"));
        System.out.println();


        System.out.println("----------------------------HEAP(String, String)----------------------------");
        Heap<String,String> meuHeap = new Heap<String, String>();
        meuHeap.enqueue("EMANUEL", "emanuel");
        meuHeap.enqueue("VIVIAN", "vivian");
        meuHeap.enqueue("WERMONT", "wermont");
        meuHeap.enqueue("THOSE", "those");
        System.out.println("Heap: " + meuHeap);
        System.out.println("Removendo do HEAP: " + meuHeap.dequeue());
        System.out.println("Removendo do HEAP: " + meuHeap.dequeue());
        System.out.println("Heap: " + meuHeap);
        System.out.println();

        System.out.println("----------------------------HEAP(Integer, String)----------------------------");
        Heap<Integer,String> meuHeap2 = new Heap<Integer, String>();
        meuHeap2.enqueue(18, "A");
        meuHeap2.enqueue(5, "B");
        meuHeap2.enqueue(12, "C");
        meuHeap2.enqueue(20, "D");
        meuHeap2.enqueue(9, "E");
        meuHeap2.enqueue(7, "F");
        System.out.println("Heap: " + meuHeap2);
        System.out.println("Removendo do HEAP: " + meuHeap2.dequeue());
        System.out.println("Removendo do HEAP: " + meuHeap2.dequeue());
        System.out.println("Heap: " + meuHeap2);
        System.out.println();



        System.out.println("----------------------------HASH TABLE----------------------------");
        HashTable<String,Integer> zara = new HashTable<>(3); // <--- INSERE O TAMANHO AQUI!
        zara.set("Sapato B", 50);
        zara.set("Perfume", 88);
        zara.set("Cropped P", 120);
        zara.set("Jersey P", 320);
        zara.set("Sapato B", 237);
        System.out.println(zara);
        System.out.println("Deletando elemento: ");
        zara.delete("Perfume");
        System.out.println(zara);
        System.out.println("Inserindo Novo elemento: ");
        zara.set("those who know", 55);
        System.out.println(zara);


        System.out.println("----------------------------BINARY SEARCH TREE----------------------------");
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.insert(200);
        myBinaryTree.insert(50);
        myBinaryTree.insert(250);
        myBinaryTree.insert(25);
        myBinaryTree.insert(55);
        myBinaryTree.insert(230);
        myBinaryTree.insert(300);
        myBinaryTree.insert(60);
        myBinaryTree.insert(220);
        myBinaryTree.insert(225);
        myBinaryTree.insert(52);

        System.out.println(myBinaryTree);
        System.out.println("DELETANDO: " + myBinaryTree.delete(25));
        System.out.println(myBinaryTree);
        System.out.println("SIZE: "+myBinaryTree.size());
        System.out.println("HEIGHT: "+myBinaryTree.height());
        System.out.println("EXISTE VALOR? (78 NESSE CASO): " + myBinaryTree.get(78));
        System.out.println();
        System.out.println("preOrder: " + myBinaryTree.preOrder());
        System.out.println("postOrder: "+ myBinaryTree.postOrder());
        System.out.println("inOrder: "+ myBinaryTree.inOrder());
        System.out.println();
        System.out.println("QUANTIDADE DE FOLHAS: "+ myBinaryTree.contarFolhas(myBinaryTree.root));
        System.out.println("CHEIO?: "+ myBinaryTree.isFull(myBinaryTree.root));
        System.out.println();


        System.out.println("----------------------------RECURSIVE BINARY SEARCH TREE----------------------------");
        RecursiveBinarySearchTree<Integer> recursiveBinarySearchTree = new RecursiveBinarySearchTree<>();
        recursiveBinarySearchTree.insert(200);
        recursiveBinarySearchTree.insert(50);
        recursiveBinarySearchTree.insert(250);
        recursiveBinarySearchTree.insert(25);
        recursiveBinarySearchTree.insert(55);
        recursiveBinarySearchTree.insert(230);
        recursiveBinarySearchTree.insert(300);
        recursiveBinarySearchTree.insert(60);
        recursiveBinarySearchTree.insert(220);
        recursiveBinarySearchTree.insert(225);

        System.out.println("RECURSIVE TREE:");
        System.out.println("preOrder: " + recursiveBinarySearchTree.treeTraversal("preOrder"));
        System.out.println("inOrder: " + recursiveBinarySearchTree.treeTraversal("inOrder"));
        System.out.println("postOrder: " + recursiveBinarySearchTree.treeTraversal("posOrder"));
        System.out.println();
        System.out.println("Deletando elemento: " + recursiveBinarySearchTree.delete(200));

        System.out.println("BFS: " + recursiveBinarySearchTree.treeTraversal());
    }
}
