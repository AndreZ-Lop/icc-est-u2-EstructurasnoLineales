package structure.trees;

import structure.node.Node;
// Para que un arbol tenga la posibilidad de comparar datos genericos debe declarar el arbol de esta manera
public class BinaryTree<T extends Comparable<T>> {
    // Cualquier dato que tenga metodos compareTo se le podra añadir a este arbol
    // Caso contrario no se podra almacenar hasta que se implemente el compareTo en esa clase 
    private Node <T> root;
    private int weight;

    public BinaryTree(){
        this.root = null;
        // Este atriuto nos deja saber cuantos elemtentos existe dentro del arbol se ira sumando conforme se elminine o se añada nodos al arbol 
        this.weight = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public int getWeightSinRecursivo(){
        return weight;
    }


    //Metodo que crea y ubica de manera automatica los nodos en el arbol
    public void add(T value){ // metodo que recibe un integer
       Node<T> node = new Node<T>(value); // metodo que crera un nodo con el valor
       root = addRecursividad(root, node); // llamo a mi metodo recurisvo
        weight++;
    }

    private Node<T> addRecursividad(Node<T> actual, Node<T> nodeInsertar) { // recibe el nodo actual y el que se busca ingresar
        // Caso base
        if(actual == null) return nodeInsertar; // Si no existe una raiz el nodo a insertar se vuelve la raiz o el hijo de algun nodo que no tenga referencias
        if(actual.getValue().compareTo(nodeInsertar.getValue())> 0){
            // se tendra que añadir a la izquierda la referencia
            // para no perder referencias del anterior se debera hacer llamados recursivos a este mismo metodo
            actual.setLeft(addRecursividad(actual.getLeft(), nodeInsertar));
        }else{
            // se tendra que añadir a la derecha la referencia
            // para no perder referencias del anterior se debera hacer llamados recursivos a este mismo metodo
            actual.setRight(addRecursividad(actual.getRight(), nodeInsertar));
        }
        return actual; // retorna el nodo actual con el que se esta comparndo los nodos a incertar    
    }

    // Recorrido PreOrder
    public void preOrden(){
        preOrdenRecursivo(root);
    }
    //siempre se le pasa la raiz 
    private void preOrdenRecursivo(Node <T> actual) {
        if(actual == null) return;

        //se procesa el nodo actual
        System.out.println(actual);
        //luego se procesa sus hijos
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    //Recorrido PostOrder
    public void posOrder(){
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<T> actual) {
        if(actual == null) return;
        //se procesa la izquierda
        preOrdenRecursivo(actual.getLeft());
        //se procesa la derecha
        preOrdenRecursivo(actual.getRight());
        // al final se procesa el actual
        System.out.println(actual);
    }
    // Recorrido inOrder
    public void inOrder(){
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<T> actual) {
        if(actual == null) return;
        //se procesa la izquierda
        preOrdenRecursivo(actual.getLeft());
        //se precesa el actual
        System.out.println(actual);
        //se procesa la derecha 
        preOrdenRecursivo(actual.getRight());
    }

    public int getHeight(){
        return getHeightRecursiva(root);
    }

    private int getHeightRecursiva(Node<T> actual) {
        // cuando se llegue a un nodo sin hijos su altura terminara ahi
        if(actual == null) return 0;
        //obtenemos la altura de la izquierda de la derecha 
        int heightLeft = getHeightRecursiva(actual.getLeft());
        int heightRight = getHeightRecursiva(actual.getRight());
        //aqui solo nos quedaremos con el mas alto entre los 2;
        int max = Math.max(heightLeft, heightRight);
        //durante el caso recursivo tenemos la base de que cuando llegue a ser null uno de sus hijos retorna 0 por eso le debemos sumar 1
        return max + 1;
    }
}
