package BinarySearchTrees;

import Queues.DynamicQueue;
import Stacks.DynamicStack;

public class BinarySearchTree<E> extends BinaryTree<E>{


    private E removeRightMinNode(Node parent){
        Node minNode = parent.right;
        while (minNode.left != null){
            parent = minNode;
            minNode = minNode.left;
        }

        if (parent.right == minNode){
            parent.right = minNode.right;
        }else{
            parent.left = minNode.right;
        }
        return minNode.value;
    }

    @Override
    public void insert(E value) {
        int height = 0;
        Node newNode = new Node(value);
        if (isEmpty()){
            root = newNode;
            height++;
        }else{
            Node auxNode = root;
            while (auxNode != null){
                if (compare(newNode,auxNode)==0){
                    return;
                }else if (compare(newNode,auxNode)<0) {
                    if (auxNode.left == null) {
                        auxNode.left = newNode;
                        break;
                    }
                        auxNode = auxNode.left;
                    height++;
                }else{
                    if (auxNode.right == null){
                        auxNode.right = newNode;
                        break;
                    }
                    auxNode = auxNode.right;
                    height++;
                }
            }
        }
        if (this.height < height) this.height = height;
        size++;
    }

    @Override
    public E delete(E value) {
        Node target = root, parent = null;

        while (target != null && compare(value,target) != 0){ // busca dos nodes na arvore
            parent = target;
            if (compare(value,target)<0){ // se value for maior que value root
                target = target.left;
            }else{
                target = target.right; // se for menor que root
            }
        }
        // Não achei o node
        if (target == null) return null;

        //  node é folha:
        E removed = target.value;
        if (target.left == null && target.right == null){
            // se for folha e tiver só 1 node na arvore
            if (target == root){
                root = null;
            }else{
                if(parent.left == target){
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }

            // pai:
        } else if (target.left != null && target.right != null) { // dois filhos
            target.value = removeRightMinNode(target);
        }else{
            Node child = target.left !=null ? target.left : target.right;
            if (target == root){
                root = child;
            }else{
                if (parent.left == target){
                    parent.left = child;
                }else{
                    parent.right = child;
                }
            }
        }
        size--;
        return removed;
    }



    @Override
    public E get(E value) {
        Node target = root;

        while (target!= null && compare(value, target) != 0){
            if (compare(value, target) < 0){
                target = target.left;
            }
            else{
                target = target.right;
            }

        }
        if (target == null) return null;
        return target.value;
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

    public String treeTraversal(){
        return breadthFirstSearch();
    }

    public String treeTraversal(String type) {
        if (type.equals("bfs")){
            return breadthFirstSearch();
        }else{
            if (type.equals("inOrder")){
                return "";
            } else if (type.equals("preOrder")) {
                return "";
            }
            else{
                return "";
            }
        }
    }

    @Override
    public String toString() {
        return breadthFirstSearch();
    }



    public String inOrder() {
        if (root == null) return null;

        DynamicStack<Node> stack = new DynamicStack<>();
        Node current = root;
        String treeData = "";

        while (current != null || !stack.isEmpty()) {
            // Empilha todos os nós da esquerda
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            treeData += current.value +", ";


            current = current.right;
        }

        return treeData;
    }


    public String preOrder(){
        if (root == null) return null;

        DynamicStack<Node> stack = new DynamicStack<>();
        stack.push(root);
        String treeData = "";

        while (!stack.isEmpty()){
            Node auxNode = stack.pop();
            treeData += auxNode.value;

            if (auxNode.right != null) stack.push(auxNode.right);

            if (auxNode.left != null) stack.push(auxNode.left);

            if (!stack.isEmpty()) treeData += ", ";
        }
        return treeData;
    }



    // Traversal pós-ordem (esquerda, direita, raiz) sem recursão
    public String postOrder() {
        if (root == null) return null;

        DynamicStack<Node> stack1 = new DynamicStack<>();
        DynamicStack<Node> stack2 = new DynamicStack<>();
        stack1.push(root);
        String treeData = "";

        while (!stack1.isEmpty()) {
            Node auxNode = stack1.pop();
            stack2.push(auxNode);       // ADIÇÃO EM COMPARAÇÃO COM PREORDER

            if (auxNode.left != null) stack1.push(auxNode.left);
            if (auxNode.right != null) stack1.push(auxNode.right);
        }

        while (!stack2.isEmpty()) {  // ADIÇÃO EM COMPARAÇÃO COM PREORDER
            Node node = stack2.pop();// ADIÇÃO EM COMPARAÇÃO COM PREORDER


            treeData += node.value;   // ACRESCENTADOS NO FINAL
            if (!stack2.isEmpty()) treeData += ", ";  // ACRESCENTADOS NO FINAL
        }

        return treeData;
    }


    public int height(){
        return height;
    }

    public int contarFolhas(Node node) {
        if (node == null)
            return 0;

        // Um nó é folha se não tem filhos
        if (node.left == null && node.right == null)
            return 1;

        // Soma as folhas das subárvores esquerda e direita
        return contarFolhas(node.left) + contarFolhas(node.right);
    }

    public boolean isFull(Node node){
        if (node == null){
            return true;
        }
        if (node.left == null && node.right == null){
            return true;
        }
        if (node.left != null && node.right != null){
            return isFull(node.left) && isFull(node.right);
        }
        return false;
    }




}
