
package poopersona;


public class Prueba {

    
    public static void main(String[] args) {
        Persona p1=new Persona("Raul", "50148147J", "C/Cardenal Cisneros,23", 37);
        System.out.println(p1.consultaPersona());
        Persona p2=new Persona("Pedro", "50148147J", "C/Cardenal Cisneros,23", 37);
        System.out.println(p2.consultaPersona());
    }
    
}
