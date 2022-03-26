
package tareaguía3;

import java.util.Scanner;


public class TareaGuía3 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        Punto P=new Punto();
        
        System.out.println("Ingrese las coordenadas X e Y del punto 1");
        P.setX1(SC.nextInt());
        P.setY1(SC.nextInt());
        
        System.out.println("Ingrese las coordenadas X e Y del punto 2");
        P.setX2(SC.nextInt());
        P.setY2(SC.nextInt());
        
        System.out.println("La distancia del punto 1 al origen es: "+P.distanciaOrigen());
        
        System.out.println("El punto 1 se encuentra en el cuadrante: "+P.cuadrante());
        
        System.out.println("La distancia entre el punto 1 y 2 es de: "+P.distanciaPuntos());
    }
    
}
