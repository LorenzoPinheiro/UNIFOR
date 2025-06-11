package BinarySearchTrees;

import Queues.MyComparator;

import java.util.Comparator;

public abstract class BinaryTree<E> implements Tree<E>{

    class Node{
        Node left;
        Node right;
        E value;
        public Node(E value){
            this.value = value;
        }
    }

    public Node root;
    protected int size;
    protected int height;
    protected Comparator<E> comparator;

    public BinaryTree(){
        comparator = new MyComparator<>();
    }

    public int compare(Node n1, Node n2){
        return comparator.compare(n1.value,n2.value);
    }

    public int compare (E value, Node node){
        return comparator.compare(value,node.value);
    }


    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return size;
    }

}
