
package tareaguía2;

import java.util.Scanner;

public class TareaGuía2 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        Auto A=new Auto();
        
        System.out.println("Ingrese Marca del automóvil: ");
        A.setMarca(SC.next());
        
        System.out.println("Ingrese Modelo del automóvil: ");
        A.setModelo(SC.nextInt());
        
        System.out.println("Ingrese Precio del automóvil: ");
        A.setPrecio(SC.nextInt());
        
        System.out.println("Ingrese Kilometraje del automóvil: ");
        A.setKilometros(SC.nextInt());
        
        System.out.println("La antiguedad del auto es de " + A.Antiguedad()+" años");
    }
    
}
