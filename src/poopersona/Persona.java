package poopersona;


public class Persona {
    private String nombre;
    private String dni;
    private String direccion;
    private int edad;
    private int codigo_postal; 
    private String ciudad; 
    private String aficiones; 

    /*
     * Constructores
     */
    public Persona(String nombre, String dni, String direccion, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
    }

    public Persona(String nombre, String dni, String direccion, int edad, int codigo_postal, String ciudad, String aficiones) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.codigo_postal = codigo_postal; 
        this.ciudad = ciudad; 
        this.aficiones = aficiones; 
    }
    
    /*
     * Getter y Setter
     */
    
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

    
    public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getAficiones() {
		return aficiones;
	}

	public void setAficiones(String aficiones) {
		this.aficiones = aficiones;
	}

	/*
	 * Métodos
	 */
    /*@Override
	public int compareTo(Persona p){
            if(p.getEdad()>edad){
                return -1;
            }
            else if(p.getEdad()==edad){
                return 0;
        }else return 1;
        }*/
	public String consultaPersona() {
        return "Persona{" + "nombre. " + nombre + ", dni: " + dni + ", direccion: " + direccion + ", edad: " + edad + '}';
    }
    
	public String consultaCompletaPersona() {
		return "Persona{" + "nombre: " + nombre + ", dni: " + dni + ", direccion: " + direccion + ", Codigo Postal: " + codigo_postal + ", Ciudad:  " + ciudad +  ",  edad: " + edad + ", Aficiones: " + aficiones + '}';
	}
}
