import structure.trees.BinaryTree;
import structure.trees.IntTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
    }

    private static void runBinaryTree() {
        BinaryTree <String> arbolStrings = new BinaryTree<>();
        BinaryTree <Persona> arbolPersona = new BinaryTree<>();
        arbolPersona.add(new Persona("Pablo", 30));
        arbolPersona.add(new Persona("Ana", 25));
        arbolPersona.add(new Persona("Luis", 35));
        arbolPersona.add(new Persona("Maria", 28));
        arbolPersona.add(new Persona("Carlos", 25));
    }

    private static void runIntTree() {
        //Creacion del molde para el arbol
        IntTree arbolNumero = new IntTree();
        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);
        arbolNumero.add(60);
        arbolNumero.add(75);
        arbolNumero.add(55);

        System.out.println("=== Pre Orden ===");
        arbolNumero.preOrden();
        System.out.println("=== Post Orden ===");
        arbolNumero.posOrder();
        System.out.println("=== In Order ===");
        arbolNumero.inOrder();

        System.out.println("=== Altura ===");
        System.out.println(arbolNumero.getHeight());

        System.out.println("=== Peso sin recursivo ===");
        System.out.println(arbolNumero.getWeightSinRecursivo());

    }
}
