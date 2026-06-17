package structure.node;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    // Creo un nodo
    // Instancio el node -> Constructor
    // Tiene que crearse con el valor

    public Node(T value){
        // El valor es la parte escencial del nodo 
        this.value = value;
        // Como en un inicio un nodo no es ni una hoja, rama o raiz sus referencias deben ser nulas
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString(){
        return "Node ["+ value +"]";
    }
}
