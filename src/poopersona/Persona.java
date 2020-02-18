
package poopersona;


public class Persona {
    private String nombre;
    private String dni;
    private String direccion;
    private int edad;

    public Persona(String nombre, String dni, String direccion, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String consultaPersona() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
}
