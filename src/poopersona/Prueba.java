
package poopersona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Prueba {

    
    public static void main(String[] args) {
        ArrayList<Persona> persona= new ArrayList<Persona>();
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
        
        //Creo una nueva perosona
        Persona pers6 = new Persona("Jaime", "01234567T", "Calle Madrid, 27", 33);
        System.out.println(pers6.consultaPersona()); //llamo al m�todo y consulto la persona creada
        
        //Creo otra perosona
        Persona pers7 = new Persona("Antonio", "04223569Z", "Calle Sol, 2", 33, 28002, "Madrid", "Cantautor");
        System.out.println(pers7.consultaCompletaPersona());//llamo al m�todo restante y compruebo los datos de esa persona
        persona.add(p1);
        persona.add(p2);
        persona.add(p3);
        persona.add(p4);
        persona.add(p5);
        persona.add(pers6);
        persona.add(pers7);
        for(Persona per:persona){
            System.out.println(per.consultaCompletaPersona());
        }
        System.out.println("--------------------------------------ORDENADO CON EL MÉTODO DIFICIL---------");
        System.out.println("Ordenado por nombre---------------------------------------------------------");
        Collections.sort(persona,new Comparator<Persona>(){
        @Override
        public int compare(Persona p10,Persona p20){
            return p10.getNombre().compareTo(p20.getNombre());
            
        }
    });
        for(Persona per:persona){
            System.out.println(per.consultaCompletaPersona());
        }
        

        System.out.println("Ordenado por edad---------------------------------------------------------");
        Collections.sort(persona,new Comparator<Persona>(){
        @Override
        public int compare(Persona p10,Persona p20){
            if(p10.getEdad()>p20.getEdad()){
                return 1;}
            else if(p10.getEdad()<p20.getEdad()){
                        return -1;}
             else            return 0;
                        }
            
            
        
    });
        for(Persona per:persona){
            System.out.println(per.consultaCompletaPersona());
        }
    System.out.println("--------------------------------------ORDENADO CON EL MÉTODO FÁCIL---------");
    System.out.println("--------------------------------------por edad---------");
    Collections.sort(persona,(p10,p20)->
            p10.getEdad()-p20.getEdad());
    for(Persona per:persona){
            System.out.println(per.consultaCompletaPersona());
        }
    System.out.println("--------------------------------------por nombre---------");
     Collections.sort(persona,(p30,p40)->
            ((int)p30.getNombre().charAt(0)-(int)p40.getNombre().charAt(0)));
    for(Persona per:persona){
            System.out.println(per.consultaCompletaPersona());
        }       
    }
    
}
