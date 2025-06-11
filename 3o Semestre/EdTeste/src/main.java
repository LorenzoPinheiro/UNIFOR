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
import Stacks.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Estrutura de dados");

        byte n1 = -128; // Limite (2^8) (-128---127)
        short n2 = -420; // Limite (2^16) (2 bytes)
        int n3 = 124555; // Limite (2^32) (4 bytes)
        long n4 = 39346856; //Limite (2^64)
        float n5 = 12757575.75f; // Limite (2^32)
        double n6 = 12345678; // Limite (2^64)


        //VARIAÇÕES DE SELEÇÃO
        String operador = "35";
        switch (operador){
            case "1":
                System.out.println("Krl");
                break;
            case "35":
                System.out.println("\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80");
                break;
            default:
                System.out.println("N EXISTE ISSO");
        }
        System.out.println();

        int numero = 8;

        String resultado = (numero%2 == 0) ? " É PAR" : " É IMPAR";

        System.out.println(numero + resultado);
        System.out.println();

        //VEOTRES E ARRAYS

        int [] vectorBizarro = new int[10]; // tamanho definido, porém sem elementos

        int [] vectorBizarro2 = new int[] {1,2,3}; // elementos definidos

        System.out.println(vectorBizarro2);

        int [] vectorBizarro3 = vectorBizarro2;
        vectorBizarro3[0] = 99;
        System.out.println(vectorBizarro3); // desse jeito imprime apenas a mémoria HEAP
        System.out.println();

        printArray(vectorBizarro2);

        int [][] vector2Dimensoes = new int[3][4];

        int [][] vector2Dimensoes2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(vector2Dimensoes2));
        System.out.println();

        //RECURSSÃO
        int n = 6;
        System.out.println(Recurssao.fatorial(n)); // o n colocado aqui será enviado para a clss Recurssao
        // porem o n não é o mesmo pois está em outra classe (stack)

        int[] arrayInt = {1,2,3,4,5};
        System.out.println(Recurssao.somaLinear(arrayInt));
        //metodoRecursivoErrado(5);
        System.out.println();




        System.out.println(Recurssao.fibonacci(1)+" ");
        System.out.println(Recurssao.fibonacci(2)+" ");
        System.out.println(Recurssao.fibonacci(3)+" ");
        System.out.println(Recurssao.fibonacci(4)+" ");
        System.out.println(Recurssao.fibonacci(5)+" ");
        System.out.println(Recurssao.fibonacci(6)+" ");
        System.out.println(Recurssao.fibonacci(7)+" ");
        System.out.println(Recurssao.fibonacci(8)+" ");
        System.out.println(Recurssao.fibonacci(9)+" ");
        System.out.println(Recurssao.fibonacci(10)+" ");
        System.out.println();

        System.out.println(Recurssao.regressiva(5));
        System.out.println();

        System.out.println(Recurssao.caixas(10));
        System.out.println();



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

        System.out.println(minhaLista);
        System.out.println("Removi: " + minhaLista.removeLast());
        System.out.println(minhaLista);
        System.out.println();

        System.out.println(minhaLista);
        System.out.println("Removi: " + minhaLista.removeFirst());
        System.out.println(minhaLista);
        System.out.println();

        System.out.println(minhaLista);
        System.out.println("Removi: " + minhaLista.removeByIndex(2));
        System.out.println(minhaLista);
        System.out.println();

        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        minhaLista.add(10);
        System.out.println(minhaLista);
        System.out.println();


        // LINKED LIST
        LinkedList<Integer> minhaLinkedList = new LinkedList<>();
        minhaLinkedList.add(10);
        minhaLinkedList.add(9);
        System.out.println(minhaLinkedList);
        System.out.println();
        minhaLinkedList.insert(90);
        minhaLinkedList.insert(100);
        minhaLinkedList.insert(1000);
        minhaLinkedList.insert(0,35000);
        System.out.println(minhaLinkedList);
        System.out.println();


        System.out.println(minhaLinkedList.removeFirst());
        System.out.println(minhaLinkedList);


        System.out.println();
        System.out.println(minhaLinkedList.removeLast());
        System.out.println(minhaLinkedList);


        System.out.println();
        System.out.println(minhaLinkedList.removeByIndex(1));
        System.out.println(minhaLinkedList);
        System.out.println();



//        Lists.DoublyLinkedList <Integer> mlDLL = new Lists.DoublyLinkedList<>();
//        mlDLL.insert(12);
//        mlDLL.insert(13);
//        mlDLL.insert(1);
//        mlDLL.insert(2);
//        mlDLL.insert(3);
//        mlDLL.insert(4);
//        mlDLL.insert(5);
//        mlDLL.insert(6);
//        System.out.println(mlDLL);
//        System.out.println(mlDLL.printReserves());
//        System.out.println("SIZE = " + mlDLL.size());
//        System.out.println();
//
//        mlDLL.insert(2,5500000);
//
//        System.out.println(mlDLL);
//        System.out.println(mlDLL.printReserves());
//        System.out.println();
//
//        mlDLL.removeFirst();
//        System.out.println(mlDLL);
//        System.out.println(mlDLL.printReserves());
//        System.out.println();
//
//        mlDLL.removeLast();
//        System.out.println(mlDLL);
//        System.out.println(mlDLL.printReserves());
//        System.out.println();
//
//        mlDLL.removeByIndex(3);
//        System.out.println(mlDLL);
//        System.out.println(mlDLL.printReserves());
//        System.out.println();;
//
//        System.out.println(mlDLL.copia());
//        System.out.println("SIZE = " + mlDLL.size());
//        System.out.println();
//
//        System.out.println(mlDLL.removeFirst(2));
//        System.out.println(mlDLL.printReserves());
//        System.out.println("SIZE = " + mlDLL.size());
//        System.out.println();
//
//        System.out.println(mlDLL.removeLast(2));
//        System.out.println(mlDLL.printReserves());
//        System.out.println("SIZE = " + mlDLL.size());
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        mlDLL.insert(8);
//        mlDLL.insert(14);
//        mlDLL.insert(22);
//        mlDLL.insert(189);
//        mlDLL.insert(92);
//        mlDLL.insert(67);
//        System.out.println(mlDLL);
//        System.out.println();
//        System.out.println(mlDLL.removeByIndex(2,4));
//        System.out.println(mlDLL.printReserves());
//        System.out.println("SIZE = " + mlDLL.size());
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        mlDLL.insert(24555);
//        mlDLL.insert(3333666);
//        mlDLL.insert(542788);
//        mlDLL.insert(5546);
//        mlDLL.insert(144414);
//        mlDLL.insert(222217);
//        System.out.println(mlDLL);
//        System.out.println("SIZE = "+ mlDLL.size());
//        System.out.println();
//        System.out.println(mlDLL.removeByIndex(0,4));
//        System.out.println("SIZE = " + mlDLL.size());
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//
//        Lists.CircularList <Integer> circular = new Lists.CircularList<>();
//        circular.add(10);
//        circular.add(20);
//        circular.add(30);
//        System.out.println(circular);
//        System.out.println();
//        circular.add(40);
//        System.out.println(circular);
//        System.out.println();
//        circular.insert(645);
//        System.out.println(circular);
//        System.out.println();


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



        StaticStack2<Integer> pilha2 = new StaticStack2<>();
        pilha2.push(1);
        pilha2.push(3);
        pilha2.push(5);
        System.out.println(pilha2);
        System.out.println();

        DynamicStack<Integer> pilhaDynamic = new DynamicStack<>();
        pilhaDynamic.push(10);
        pilhaDynamic.push(30);
        System.out.println(pilhaDynamic);
        System.out.println();




        StaticQueue<String> staticQueue = new StaticQueue<>();
        staticQueue.enqueue("Artur Wermont");
        staticQueue.enqueue("Victor Lins");
        staticQueue.enqueue("Digga");
        System.out.println(staticQueue);
        System.out.println("SIZE = " + staticQueue.size());
        System.out.println("REMOVENDO O PRIMEIRO: " + staticQueue.dequeue());
        System.out.println(staticQueue);
        System.out.println();



        DynamicQueue<String> dynamicQueue = new DynamicQueue<>();
        dynamicQueue.enqueue("lili larila");
        dynamicQueue.enqueue("tung tung tung sahur");
        System.out.println(dynamicQueue);
        System.out.println("REMOVENDO O PRIMEIRO: " + dynamicQueue.dequeue());
        System.out.println(dynamicQueue);
        System.out.println();




        LorenzoPilhaStatic<Integer> lorenzoPilhaStatic = new LorenzoPilhaStatic<>();
        System.out.println("MINHA STACK RIDÍCULA");
        lorenzoPilhaStatic.push(10);
        lorenzoPilhaStatic.push(50);
        lorenzoPilhaStatic.push(110);
        lorenzoPilhaStatic.push(350);
        lorenzoPilhaStatic.push(790);
        System.out.println(lorenzoPilhaStatic);
        System.out.println();
        System.out.println("REVERSO:");
        System.out.println(lorenzoPilhaStatic.reverse());
        System.out.println();
        System.out.println("ITENS REMOVIDOS DA STACK: ");
        System.out.println(lorenzoPilhaStatic.popUntil(3));
        System.out.println();
        System.out.println("NOVA STACK:");
        System.out.println(lorenzoPilhaStatic);
        System.out.println();
        System.out.println("TOPO: " + lorenzoPilhaStatic.top());


        CircularStaticQueue<String> circularFila = new CircularStaticQueue<>();
        circularFila.enqueue("Eu");
        circularFila.enqueue("Queria");
        circularFila.enqueue("Saber");
        System.out.println(circularFila);
        System.out.println(circularFila.dequeue());
        System.out.println(circularFila);
        System.out.println();


        DynamicDeque<String> dynamicDeque = new DynamicDeque<String>();
        dynamicDeque.add("GABRIEL");
        dynamicDeque.add("LORAX");
        dynamicDeque.add("DIGAS");
        dynamicDeque.insert("BALKAN");
        System.out.println(dynamicDeque);
        System.out.println(dynamicDeque.reverse());
        System.out.println();

        StaticDeque<String> staticDeque = new StaticDeque<String>();
        staticDeque.add("THOSE");
        staticDeque.insert("ZZZZ PAPAIN");
        staticDeque.add("YT SGAO_ER");
        staticDeque.insert("IRIKIRARILA");
        System.out.println(staticDeque);
        System.out.println();




        LorenzoPilhaDynamic<Integer> lorenzoPilha = new LorenzoPilhaDynamic<>();
        lorenzoPilha.push(1254);
        lorenzoPilha.push(666);
        lorenzoPilha.push(222);
        lorenzoPilha.push(10000);
        lorenzoPilha.push(16);
        System.out.println(lorenzoPilha);
        System.out.println();

        System.out.println("REMOVENDO");
        System.out.println( lorenzoPilha.popUntil(2));
       // System.out.println(lorenzoPilha);
       // System.out.println("REMOVENDO O TOPO: " + lorenzoPilha.pop());
        System.out.println();
        System.out.println(lorenzoPilha);
        System.out.println(lorenzoPilha.height());
        lorenzoPilha.push(238464504);
        lorenzoPilha.push(1255555512);
        System.out.println(lorenzoPilha);
        System.out.println(lorenzoPilha.height());


        Heap<String,String> meuHeap = new Heap<String, String>();
        meuHeap.enqueue("Emanuel", "Emanuel");
        meuHeap.enqueue("VIVIAN", "VIVIAN");
        meuHeap.enqueue("Wermont", "Wermont");
        meuHeap.enqueue("THOSE", "THOSE");
        System.out.println(meuHeap);
        System.out.println(meuHeap.dequeue());
        System.out.println(meuHeap.dequeue());
        System.out.println(meuHeap);

        Heap<Integer,String> meuHeap2 = new Heap<Integer, String>();
        meuHeap2.enqueue(18, "18");
        meuHeap2.enqueue(5, "5");
        meuHeap2.enqueue(12, "12");
        meuHeap2.enqueue(20, "20");
        meuHeap2.enqueue(9, "9");
        meuHeap2.enqueue(7, "7");
        System.out.println(meuHeap2);
        meuHeap2.dequeue();
        meuHeap2.dequeue();
        System.out.println(meuHeap2);
        System.out.println();

        SortedPriorityQueue<Integer,String> filaOrdenada = new SortedPriorityQueue<>();
        System.out.println("FILA SORTED:");
        filaOrdenada.enqueue(0,"Artur Wermont");
        filaOrdenada.enqueue(3,"Victor Lins");
        filaOrdenada.enqueue(1,"Digga");
        filaOrdenada.enqueue(5,"Balkan");
        System.out.println(filaOrdenada);
//        System.out.print("REMOVENDO PRIORIDADE: ");
//        System.out.println(filaOrdenada.dequeue());
//        System.out.println(filaOrdenada);
        System.out.println();
        System.out.println("DEQUEUQUEU:");
        System.out.println(filaOrdenada.dequeuqeuq());
        System.out.println(filaOrdenada);
        System.out.println();
        System.out.println("ENQUEQUEUQ:");
        filaOrdenada.enqueuqueu(2,"CURIO SaHURRRR 22 CP");
        System.out.println(filaOrdenada);


        System.out.println();


        UnsortedPriorityQueue<Integer,String> minhaFilaPrioridade = new UnsortedPriorityQueue<>();
        System.out.println("FILA UNSORTED:");
        minhaFilaPrioridade.enqueue(1, "Diogo");
        minhaFilaPrioridade.enqueue(-2, "Lorenzo");
        minhaFilaPrioridade.enqueue(5, "Artur Wermont");
        minhaFilaPrioridade.enqueue(2, "Vector Lins");
        System.out.println(minhaFilaPrioridade);
        System.out.println("PRINT SOR|tED:");
        System.out.println(minhaFilaPrioridade.printSorted());
        System.out.println(minhaFilaPrioridade.maxPriority());
        System.out.println();
        System.out.println("DEQUEUE:");
        System.out.println(minhaFilaPrioridade.dequeue());
        System.out.println(minhaFilaPrioridade);
        System.out.println("UPDATE KEY:");
        minhaFilaPrioridade.updateKey(5,22);
        System.out.println(minhaFilaPrioridade);
        System.out.println();
        System.out.println("FIND BY VALUE:");
        System.out.println(minhaFilaPrioridade.findByValue("Lorenzo"));
        System.out.println();
        System.out.println("CLONE:");
        System.out.println(minhaFilaPrioridade.clone());
        System.out.println();



        HashTable<String,Integer> zara = new HashTable<>(3);
        zara.set("Sapato B", 50);
        zara.set("Perfume", 88);
        zara.set("Cropped P", 120);
        zara.set("Jersey P", 320);
        zara.set("Sapato B", 237);
        System.out.println(zara);
        zara.delete("Perfume");
        System.out.println(zara);
        zara.set("those who know", 55);
        System.out.println(zara);


        System.out.println(hashCode("abcd"));
        System.out.println(zara.compression(3282116));
        System.out.println();



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
        System.out.println(myBinaryTree.delete(25));
        System.out.println(myBinaryTree);
        System.out.println("SIZE: "+myBinaryTree.size());
        System.out.println("HEIGHT: "+myBinaryTree.height());
        System.out.println(myBinaryTree.get(78));
        System.out.println("PREORDER: " + myBinaryTree.preOrder());
        System.out.println("POSTORDER: "+ myBinaryTree.postOrder());
        System.out.println("INORDER: "+ myBinaryTree.inOrder());
        System.out.println();
        System.out.println("QUANTIDADE DE FOLHAS: "+ myBinaryTree.contarFolhas(myBinaryTree.root));
        System.out.println("CHEIO?: "+ myBinaryTree.isFull(myBinaryTree.root));
        System.out.println();


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
        System.out.println(recursiveBinarySearchTree.treeTraversal("inOrder"));
        System.out.println(recursiveBinarySearchTree.treeTraversal("preOrder"));
//        System.out.println(recursiveBinarySearchTree.delete(200));
//        System.out.println(recursiveBinarySearchTree.treeTraversal("preOrder"));
        System.out.println(recursiveBinarySearchTree.treeTraversal("posOrder"));
        System.out.println(recursiveBinarySearchTree.treeTraversal());

//
//        String key = "daCD";
//        int tableSize = 5;
//
//        int hashIndex = asciiHash(key, tableSize);
//        System.out.println("Hash index para \"" + key + "\": " + hashIndex);
    }

    public static int hashCode(String key){
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = (hashCode<<5) | hashCode>>>27; // OLHAR ISSO AQUI!!!!!!!!!!!!!!!!!!!!
            hashCode += key.charAt(i);
//            hashCode +=key.charAt(i)*Math.pow(3,i);
        }
        return hashCode;
    }

    public  static int compresson(int hashCode, int N){
        return hashCode>=0? hashCode%N : (hashCode*-1)%N; //OLHAR ISSO AQUI !!!!!!!!!!!!!!!!!!!!!!!!!
    }



    public static void printArray(int[] array){
        System.out.print("vectorBizarro2 = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +",");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
    }

    public static <E> void printArrayE(E[] array){  // E type (Para Arrays que começam com: Integer, Double, String...)
        System.out.print("vectorBizarro2 = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +",");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
    }

    //public static int metodoRecursivoErrado(int x){
        //System.out.println(x);
        //return metodoRecursivoErrado(x);

        // trava (stack overflow) além do limite
    //}
}
