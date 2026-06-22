package structure.trees;

import structure.node.Node;

public class Ejercicio4 {
    public void insert(int [] numeros){
        BinaryTree<Integer> arbolEntero = new BinaryTree<>();
        for(int numero: numeros){
            arbolEntero.add(numero);
        }
        System.out.println(getHeight(arbolEntero.getRoot()));

    }

    private int getHeight(Node<Integer> root) {
        if(root == null) return 0;

        int getHeightLeft = getHeight(root.getLeft());
        int getHeightRight = getHeight(root.getRight());

        int max = Math.max(getHeightLeft, getHeightRight);

        return max + 1;
    }
}
