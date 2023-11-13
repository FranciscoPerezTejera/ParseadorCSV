package actividad_2_2_1.clases;


public class Estudiante extends Alumnado {
    
    private Fecha fechaMatricula;

    public Estudiante(String dni, String nombre, int edad, Fecha fechaMatricula) {
        super(dni,nombre,edad);
        this.fechaMatricula = fechaMatricula;
    }

    @Override
    public String toString() {
        return String.format(" Fecha Matrícula: %02d/%02d/%04d",fechaMatricula.getDia(), fechaMatricula.getMes(), fechaMatricula.getAnyo());
    }

    public Fecha getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public String getDni() {
        return super.getDni();
    }
    
    
}
