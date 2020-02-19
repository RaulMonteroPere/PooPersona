
package poopersona;


public class Prueba {

    
    public static void main(String[] args) {
        Persona p1=new Persona("Raul", "50148147J", "C/Cardenal Cisneros,23", 37);
        System.out.println(p1.consultaPersona());
        Persona p2=new Persona("Pedro", "50148147J", "C/Cardenal Cisneros,23", 37);
        System.out.println(p2.consultaPersona());
        
        Persona p3=new Persona("Patricia", "23455667D", "Calle Sin nombre 13", 38);
        System.out.println(p3.consultaPersona());
        Persona p4=new Persona("Cristina", "98877665X", "Plaza nomeacuerdo 13", 25);
        System.out.println(p4.consultaPersona());
        Persona p5 =new Persona("Lorena", "50154154S", "C/EStocolmo,54", 45, 28040, "Sevilla", "Pescar");
        System.out.println(p5.consultaCompletaPersona());
    }
    
}
