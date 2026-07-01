package evaluacion.controller;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import evaluacion.models.Person;

public class PersonController {
    public Set<Person> filtrarYOrdenar(List<Person> persons, int edadUmbral){
        Set<Person> filtrado = new TreeSet<>(
            (c1,c2) -> {
                int compE = Integer.compare(c2.getEdad(),c1.getEdad());
                if(compE != 0){
                    return compE;
                }
                int compN = c1.getNombre().compareToIgnoreCase(c2.getNombre());
                return compN;
            }
        );

        for(Person person: persons){
            if(person.getEdad() >edadUmbral){
                filtrado.add(person);
            }
        }
        return filtrado;
    }

    public Map<String,Set<String>> agruparPorEdad(List<Person> persons){
        Map<String,Set<String>> agrupado = new TreeMap<>();

        // como quedarse con una parte un nombre
        //split
        // 2 formas para hacer esto
        // forma 1
        String nombre = "Juan Perez";
        String[] palabras = nombre.split(" ");
        String primerNombre = palabras[0];
        // forma 2 directo

        Set<String> joven = new LinkedHashSet<>(
            (c1,c2) -> {
                int compN = c1.getNombre().compareTo(c2.getNombre());
                if(compN != 0){
                    return compN;
                }
            }
        );
        Set<String> adulto = new LinkedHashSet<>();
        Set<String> mayor = new LinkedHashSet<>();

        //Mapa
        agrupado.put("JOVEN", joven);
        agrupado.put("ADULTO", adulto);
        agrupado.put("MAYOR", mayor);



        return agrupado;
        
    }
}
