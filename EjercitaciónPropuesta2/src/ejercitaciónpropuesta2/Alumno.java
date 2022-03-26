
package ejercitaciónpropuesta2;

public class Alumno {
    
    private int legajo;
    private String nombre;
    private int nota1;
    private int nota2;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public Alumno() {
    }

    public Alumno(int legajo, String nombre, int nota1, int nota2) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String toString()
    {
        return nombre;
    }
    
    public float calcularPromedio()
    {
        float promedio=(float)(nota1+nota2)/2;
        
        return promedio;
    }
    
}
