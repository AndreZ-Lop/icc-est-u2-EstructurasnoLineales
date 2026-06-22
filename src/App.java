import structure.trees.BinaryTree;
import structure.trees.Ejercicio1;
import structure.trees.Ejercicio2;
import structure.trees.Ejercicio3;
import structure.trees.Ejercicio4;
import structure.trees.IntTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
        runInsertar();
        runInvertir();
        runNiveles();
        runProfundidad();
    }

    private static void runBinaryTree() {
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
        arbolNumero.add(1);
        arbolNumero.add(3);
        arbolNumero.add(5);
        arbolNumero.add(2);

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

    private static void runInsertar(){
        System.out.println("=== EJERCICIO 1 ===");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
    }

    private static void runInvertir(){
        System.out.println("=== EJERCICIO 2 ===");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros = new int[]{4,2,7,1,3,6,9};
        ejercicio2.insert(numeros);
    }

    private static void runNiveles(){
        System.out.println("=== EJERCICIO 3 ===");

        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros = new int[]{4,2,7,1,3,6,9};
        System.out.println("Input: ");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numero2 = new int[]{4,2,7,1,3,6,9};
        ejercicio1.insert(numero2);

        System.out.println("Output: ");
        ejercicio3.insert(numeros);
    }
     private static void runProfundidad(){
        System.out.println("=== EJERCICIO 4 ===");
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros = new int[]{4,2,7,1,3,6,9,10};

        System.out.println("Input: ");

        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numero2 = new int[]{4,2,7,1,3,6,9,10};
        ejercicio1.insert(numero2);

        System.out.print("Output: ");
        ejercicio4.insert(numeros);
    }
}
