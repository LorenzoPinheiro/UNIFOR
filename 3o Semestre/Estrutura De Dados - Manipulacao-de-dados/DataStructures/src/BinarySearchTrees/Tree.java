package BinarySearchTrees;

public interface Tree<E>{
    void insert(E value);
    E delete(E value);
    E get(E value);
    String treeTraversal();
    boolean isEmpty();
    int size();
}
