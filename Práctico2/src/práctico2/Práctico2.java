
package práctico2;

import java.util.Scanner;

public class Práctico2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        Punto P=new Punto();
        
        System.out.println("Ingrese las coordenadas x e y");
        P.setX(SC.nextInt());
        P.setY(SC.nextInt());
        
        System.out.println("La distancia al origen del punto es: "+P.distanciaOrigen());
        
        System.out.println("El punto se encuentra en el cuadrante: "+P.Cuadrante());
    }
    
}
