import structure.node.Node;
import structure.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
    }

    private static void runIntTree() {
        //Creacion del molde para el arbol
        IntTree arbolNumero = new IntTree();
        Node<Integer> nodeRoot = new Node<Integer>(50);
        Node<Integer> node2 = new Node<Integer>(10);
         Node<Integer> node3 = new Node<Integer>(30);

        arbolNumero.add(50);
        

        // arbolNumero.setRoot(nodeRoot);
        // Node<Integer> node2 = new Node<Integer>(10);
        // Node<Integer> node3 = new Node<Integer>(30);
        // System.out.println(arbolNumero.getRoot());
    }
}
