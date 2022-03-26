
package tareaguía1;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int nacimiento;
    private int peso;
    private float altura;

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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int nacimiento, int peso, float altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    public int Edad()
    {
        return 2018-nacimiento;
    }
    
    public float Imc()
    {
        return peso/(altura*altura);
    }
    
    
}
