
package ejercitaciónpropuesta3;

public class Mozo {
    
    private int nroMozo;
    private String nombre;
    private String apellido;
    private float recaudacion;

    public int getNroMozo() {
        return nroMozo;
    }

    public void setNroMozo(int nroMozo) {
        this.nroMozo = nroMozo;
    }

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

    public float getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(float recaudacion) {
        this.recaudacion = recaudacion;
    }

    public Mozo() {
    }

    public Mozo(int nroMozo, String nombre, String apellido, float recaudacion) {
        this.nroMozo = nroMozo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.recaudacion = recaudacion;
    }
    
    public String toString()
    {
        return apellido+", "+nombre;
    }
    
}
