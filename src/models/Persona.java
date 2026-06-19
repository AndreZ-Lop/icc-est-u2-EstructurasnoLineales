package models;

//Si no se implementa la Interfaz Comparable en alguna clase creadad y que se almacene en arboles
//Saltara un error ya que nuestro arbol generico siempre necesitara tener metodos compareTo
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    
    public Persona() {
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    //Metodo compareTo
    @Override
    public int compareTo(Persona otraPersona) {
        //se puede modificar este metodo para poder añadir mas filtros en casos donde un valor sea igual 
        int compEdad =Integer.compare(edad, otraPersona.getEdad());
        if(compEdad != 0)
            return compEdad;
        // si durante la comparacion anterior salio 0 entonces se comparar por nombres
        int compNombre = this.nombre.compareTo(otraPersona.getNombre());
        return compNombre;

    }

    
    
}
