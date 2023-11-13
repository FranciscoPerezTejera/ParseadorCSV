package actividad_2_2_1.clases;

import java.io.Serializable;

public class Alumnado implements Serializable {
    
    private String dni;
    private String nombre;
    private int edad;

    public Alumnado() {
    }

    public Alumnado(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
}
