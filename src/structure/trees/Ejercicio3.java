package structure.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structure.node.Node;

public class Ejercicio3 {

    public void insert(int [] numeros){
        BinaryTree<Integer> arbolEntero = new BinaryTree<>();
        for(int numero: numeros){
            arbolEntero.add(numero);
        }
        imprimirList(listLevels(arbolEntero.getRoot()));

    }
    public List<List<Node>> listLevels(Node<Integer> root) {
       List<List<Node>> resultado = new ArrayList<>();
       if(root == null) return null;

       Queue<Node> colaControlNivel = new LinkedList<>();
       colaControlNivel.add(root);

       while(!colaControlNivel.isEmpty()){

            int tamanio = colaControlNivel.size();
            List<Node> nivelActual = new ArrayList<>();

            for(int i = 0;i<tamanio;i++){
                
                Node<Integer> nodoActual = colaControlNivel.remove();
                nivelActual.add(nodoActual);

                if(nodoActual.getLeft() != null){
                    colaControlNivel.add(nodoActual.getLeft());
                }

                if(nodoActual.getRight() != null){
                    colaControlNivel.add(nodoActual.getRight());
                }
            }
            
            resultado.add(nivelActual);
       }

        return resultado;
    }
    public void imprimirList(List<List<Node>> imprime){
        for(List<Node> nivel : imprime){
            for(int i = 0 ; i < nivel.size(); i++){
                if((i == nivel.size() - 1) || (nivel.size() == 1)){
                    System.out.print(nivel.get(i));
                }else{
                    System.out.print(nivel.get(i) + "->");
                }

            }
            System.out.println();

        }
    }
}
