
package ejercitaciónpropuesta1;

import java.util.Scanner;

public class EjercitaciónPropuesta1 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        Triangulo T=new Triangulo();
        
        System.out.println("Valor del 1º Lado: ");
        T.setLado1(SC.nextInt());
        
        System.out.println("Valor del 2º Lado: ");
        T.setLado2(SC.nextInt());
        
        System.out.println("Valor del 3º Lado: ");
        T.setLado3(SC.nextInt());
        
        System.out.println("El Perímetro del Triángulo es: "+T.calcularPerimetro());
        
        if (T.calcularPerimetro()>10)
        {
            System.out.println("El perímetro del triángulo es mayor a 10");
        }
        else
        {
            System.out.println("El perímetro del triángulo es menor a 10");
        }
        
    }
    
}
