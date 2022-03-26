
package ejercitaciónpropuesta6;

public class Vivienda {
    
    private String apellido;
    private String domicilio;
    private int habitantes;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public Vivienda() {
    }

    public Vivienda(String apellido, String domicilio, int habitantes) {
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.habitantes = habitantes;
    }
    
    
    
}
