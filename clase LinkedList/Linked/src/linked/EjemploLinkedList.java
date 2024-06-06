import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {
       
        List<String> ciudades = new LinkedList<>();
        
       
        ciudades.add("Nueva York");
        ciudades.add("Los Ángeles");
        ciudades.add("Chicago");
        
       
        System.out.println("Elementos en la lista: " + ciudades);
        
        
        String ciudadEnIndiceUno = ciudades.get(1);
        System.out.println("Elemento en el índice 1: " + ciudadEnIndiceUno);
        
       
        ciudades.set(2, "Miami");
        System.out.println("Lista después de modificar el elemento en el índice 2: " + ciudades);
        
    
        ciudades.add(1, "San Francisco");
        System.out.println("Lista después de insertar 'San Francisco' en el índice 1: " + ciudades);
        
     
        ciudades.remove(0);
        System.out.println("Lista después de eliminar el elemento en el índice 0: " + ciudades);
        
     
        int indiceDeMiami = ciudades.indexOf("Miami");
        System.out.println("Índice de 'Miami' en la lista: " + indiceDeMiami);
        
     
        ((LinkedList<String>) ciudades).addFirst("Seattle");
        ((LinkedList<String>) ciudades).addLast("Boston");
        System.out.println("Lista después de añadir 'Seattle' al principio y 'Boston' al final: " + ciudades);
        
     
        System.out.println("Lista después de eliminar el primer y último elemento: " + ciudades);
    }
}
