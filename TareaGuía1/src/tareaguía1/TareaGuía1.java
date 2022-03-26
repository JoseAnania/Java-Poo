
package tareaguía1;

import java.util.Scanner;

public class TareaGuía1 {


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
        
        System.out.println("Ingrese Peso: ");
        P.setPeso(SC.nextInt());
        
        System.out.println("Ingrese Altura: ");
        P.setAltura(SC.nextFloat());
        
        System.out.println("Nombre Completo: "+P.toString());
        System.out.println("Edad: "+P.Edad()+" años");
        System.out.println("Indice de masa corporal: "+P.Imc());
    }
    
}
