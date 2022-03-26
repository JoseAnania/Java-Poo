package práctico1;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + apellido + ", " + nombre;
    }
    
    public int Edad()
    {
        return 2018-nacimiento;
    }
    
    
    
}
