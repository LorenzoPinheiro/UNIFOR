package BinarySearchTrees;

import Queues.DynamicQueue;

public class RecursiveBinarySearchTree<E> extends BinaryTree<E>{
    @Override
    public void insert(E value) {
        root = insert(root,value);
    }

    private Node insert(Node curret, E value){ // sobrecarga do insert recursivo  current é null
        if (curret == null){ // sempre no inicio para criar  o newNode
            return new Node(value);
        }
        if (compare(value,curret)<0){ // se tiver já 1 Node  novo valor compara com o valor do primeiro node, ai cria na esquerda do root o newNode recursivamente
            curret.left = insert(curret.left,value);
        } else if (compare(value,curret)>0) { // se tiver já 1 Node  novo valor compara com o valor do primeiro node, ai cria na direita do root o newNode recursivamente
            curret.right = insert(curret.right, value);
        }
        return curret;
    }

    private Node getMinNode(Node current){
        if (current.left == null){
            return current;
        }
        return getMinNode(current.left);
    }
    private Node delete(Node current, E value){
        if (current == null){
            return null;
        }
        if (compare(value, current) == 0){
            if (current.left != null && current.right != null){ // se tiver os dois filhos
                current.value = getMinNode(current.right).value;
                current.right = delete(current.right, current.value);
            }else{
                size--;
                current = current.left != null ? current.left : current.right;
            }
        }else{
            if (compare(value, current) < 0){
                current.left = delete(current.left, value);
            }else{
                current.right = delete(current.right, value);
            }
        }
        return current;
    }
    @Override
    public E delete(E value) {
        int auxSize = size;
        root = delete(root, value);
        return auxSize!=size ? value : null;
    }

    @Override
    public E get(E value) {
        return null;
    }

    @Override
    public String treeTraversal() {
        return breadthFirstSearch();
    }

    public String treeTraversal(String type) {
        if (type.equals("bfs")){
            return breadthFirstSearch();
        }else{
            if (type.equals("inOrder")){
                return inOrder("",root);
            } else if (type.equals("preOrder")) {
                return preOrder("",root);
            } else if (type.equals("posOrder")) {
                return posOrder("",root);
            } else{
                return "";
            }
        }
    }

    protected String preOrder(String treeData, Node current){
        if (current != null){
            treeData += current.value + " ";
            treeData = preOrder(treeData, current.left);
            treeData = preOrder(treeData, current.right);
        }
        return treeData;
    }

    protected String inOrder(String treeData, Node current){
        if (current != null){
            treeData = inOrder(treeData, current.left);
            treeData += current.value + " ";
            treeData = inOrder(treeData, current.right);
        }
        return treeData;
    }

    protected String posOrder(String treeData, Node current){
        if (current != null){
            treeData = posOrder(treeData, current.left);
            treeData = posOrder(treeData, current.right);
            treeData += current.value + " ";
        }
        return treeData;
    }


    private String breadthFirstSearch(){
        DynamicQueue<Node> queue= new DynamicQueue<>();
        if (!isEmpty()){
            queue.enqueue(root);
        }
        String treeData = "";
        while (!queue.isEmpty()){
            Node auxNode = queue.dequeue();
            treeData += auxNode.value;

            if (auxNode.left != null) queue.enqueue(auxNode.left);

            if (auxNode.right != null) queue.enqueue(auxNode.right);

            if (!queue.isEmpty()) treeData += ", ";
        }
        return treeData;
    }


}
