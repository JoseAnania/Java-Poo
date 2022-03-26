
package práctico1;

import java.util.Scanner;

public class Práctico1 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        Persona P=new Persona();
        
        System.out.println("Ingrese Nombre: ");
        P.setNombre(SC.next());
        
        System.out.println("Ingrese Apellido: ");
        P.setApellido(SC.next());
        
        System.out.println("Ingrese D.N.I.: ");
        P.setDni(SC.nextInt());
        
        System.out.println("Ingrese año de nacimiento: ");
        P.setNacimiento(SC.nextInt());
        
        System.out.println(P.toString());
        
        System.out.println("La edad de "+P.getNombre()+" es de "+P.Edad()+" años");
    }
    
}
