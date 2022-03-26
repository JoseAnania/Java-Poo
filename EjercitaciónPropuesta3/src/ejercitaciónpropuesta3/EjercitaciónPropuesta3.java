
package ejercitaciónpropuesta3;

import java.util.Scanner;


public class EjercitaciónPropuesta3 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        Mozo M1=new Mozo();
        Mozo M2=new Mozo();
        
        System.out.println("Número de Mozo: ");
        M1.setNroMozo(SC.nextInt());       
        System.out.println("Nombre del Mozo Nº "+M1.getNroMozo());
        M1.setNombre(SC.next());
        System.out.println("Apellido de "+M1.getNombre());
        M1.setApellido(SC.next());
        System.out.println("Total recaudado por "+M1.getNombre());
        M1.setRecaudacion(SC.nextFloat());
        
        System.out.println("Número de Mozo: ");
        M2.setNroMozo(SC.nextInt());       
        System.out.println("Nombre del Mozo Nº "+M2.getNroMozo());
        M2.setNombre(SC.next());
        System.out.println("Apellido de "+M2.getNombre());
        M2.setApellido(SC.next());
        System.out.println("Total recaudado por "+M2.getNombre());
        M2.setRecaudacion(SC.nextFloat());
        
        System.out.println("Total recaudado entre "+M1.getNombre()+" y "+M2.getNombre()+": $"+(M1.getRecaudacion()+M2.getRecaudacion()));
        
        if(M1.getRecaudacion()>M2.getRecaudacion())
        {
            System.out.println(M1.toString()+" es el mozo que más vendió");
        }
        else
        {
            System.out.println(M2.toString()+" es el mozo que más vendió");
        }
    }
    
}
