
package práctico2;

public class Punto {
    
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distanciaOrigen()
    {
        return Math.sqrt(x*x+y*y);
    }
    
    public int Cuadrante()
    {
        int cuad=0;
        
        if(x>0 && y>0)
        {
            cuad=1;
        }
        if(x<0 && y>0)
        {
            cuad=2;
        }
        
        if(x<0 && y<0)
        {
            cuad=3;
        }
        if (x>0 && y<0)
        {
            cuad=4;
        }
        
        return cuad;
    }
}
