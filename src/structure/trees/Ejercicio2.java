package structure.trees;

import structure.node.Node;

public class Ejercicio2 {
    public void insert(int [] numeros){
        BinaryTree<Integer> arbolEntero = new BinaryTree<>();
        for(int numero: numeros){
            arbolEntero.add(numero);
        }
        System.out.println("Original:");
        imprimirArbol(arbolEntero.getRoot(), 0);
        System.out.println("Invertido:");
        imprimirArbol(invertirArbol(arbolEntero.getRoot()), 0);

    }
    private void imprimirArbol(Node<Integer> actual, int nivel) {
        if(actual == null) return;

        imprimirArbol(actual.getRight(), nivel + 1);

        for(int i = 0;i<nivel;i++){
            System.out.print("\t");
        }
        System.out.println(actual);

        imprimirArbol(actual.getLeft(),nivel + 1);
    }

    public Node<Integer> invertirArbol(Node<Integer> actual){
        if(actual == null) return null;

        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(aux);

        invertirArbol(actual.getLeft());
        invertirArbol(actual.getRight());

        return actual;
        

    }
}
