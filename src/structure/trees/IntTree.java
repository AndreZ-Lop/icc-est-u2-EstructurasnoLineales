package structure.trees;

import structure.node.Node;

public class IntTree {
    private Node <Integer> root;

    public IntTree(){
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }


    //Metodo que crea y ubica de manera automatica los nodos en el arbol
    public void add(Integer value){ // metodo que recibe un integer
       Node<Integer> node = new Node<Integer>(value); // metodo que crera un nodo con el valor
       root = addRecursividad(root, node); // llamo a mi metodo recurisvo
    }

    private Node<Integer> addRecursividad(Node<Integer> actual, Node<Integer> nodeInsertar) { // recibe el nodo actual y el que se busca ingresar
        // Caso base
        if(actual == null) return nodeInsertar; // Si no existe una raiz el nodo a insertar se vuelve la raiz o el hijo de algun nodo que no tenga referencias
        
        if(actual.getValue() > nodeInsertar.getValue()){
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
    private void preOrdenRecursivo(Node <Integer> actual) {
        if(actual == null) return;

        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }
    
}
