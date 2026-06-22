package structure.trees;

import java.util.ArrayDeque;
import java.util.Queue;

import structure.node.Node;

public class Ejercicio1 {
    public void insert(int [] numeros){
        //Crear arbol entero;
        //Insertar cada numero 

        //imprimir el arbol

        BinaryTree<Integer> arbolEntero = new BinaryTree<>();
        for(int numero: numeros){
            arbolEntero.add(numero);
        }
        imprimirArbol(arbolEntero.getRoot(),0);

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
}