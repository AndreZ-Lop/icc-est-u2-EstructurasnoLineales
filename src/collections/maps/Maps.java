package collections.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    
    //Un mapa siempre esta compuesto por una clave y un valor
    //Si se repite una clave se sobrescribe el valor que contiene esa clave
    public static Map<String, Integer>construirHashMap(){
        Map<String, Integer> mapa = new HashMap<>();
        // Se usa put para poder agregar valores a un mapa
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);

        // forma para recorrer solo los valores no con las claves
        for(int i = 0;i<mapa.size();i++){
            //este metodo dara todos los valores del mapa en un arreglo
            System.out.println(mapa.values().toArray()[i]);
        }
        // forma para recorrer solo las llaves no con las claves
        for(String key: mapa.keySet()){
            //este metodo dara las claves del mapa en un set ya que las llaves no se pueden repetir
            System.out.println(key);
        }
        
        //se puede imprimir un unico valor sabiendo su llave
        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));

        // putIfAbsent nos permite añadir valores a llaves que tiene un valor null
        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public static Map<String,Integer> cLinkedHashMap(){
        Map<String, Integer> mapa = new LinkedHashMap<>();
        // un linkedHashMap busca mantener el enorme de los valores segun como entraron
        mapa.put("J", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);
        return mapa;
    }

     public static Map<String,Integer> cTreeHashMap(){
        Map<String, Integer> mapa = new TreeMap<>();
        // El treeMap guarda el orden natural de las claves
        mapa.put("a", 10);
        mapa.put("AB", 20);
        mapa.put("A", 30);
        mapa.put("aA", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);
        return mapa;
    }


    public Set<Contacto> ordenarUnicos(List<Contacto> contactos){
        // Retornar contactos unicos
        // Unicos -> nombre
        // Ordene segun el apellido
        Set<Contacto> hCSet = new TreeSet<>(
            (c1,c2) -> {
                if(c1.getNombre().equals(c2.getNombre())){
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
            });
        for(Contacto contacto : contactos){
            hCSet.add(contacto);
        }
        return null;
    }
}
