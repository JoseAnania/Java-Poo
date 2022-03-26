
package tareaguía2;

public class Auto {
    
    private String marca;
    private int modelo;
    private int precio;
    private int kilometros;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public Auto() {
    }

    public Auto(String marca, int modelo, int precio, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometros = kilometros;
    }
    
    public int Antiguedad()
    {
        return 2018-modelo;
    }
    
}
