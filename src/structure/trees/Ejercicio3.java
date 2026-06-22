package structure.trees;

public class Ejercicio3 {

    public void insert(int [] numeros){
        BinaryTree<Integer> arbolEntero = new BinaryTree<>();
        for(int numero: numeros){
            arbolEntero.add(numero);
        }
    }
}
