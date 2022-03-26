
package ejercitaciónpropuesta2;

import java.util.Scanner;


public class EjercitaciónPropuesta2 {

    public static void main(String[] args) {
         
        Scanner SC=new Scanner(System.in);
        
        Alumno A1=new Alumno();
        Alumno A2=new Alumno();
        
        System.out.println("Ingrese legajo del 1º alumno: ");
        A1.setLegajo(SC.nextInt());
        System.out.println("Ingrese nombre: ");
        A1.setNombre(SC.next());
        System.out.println("Ingrese las 2 notas de "+A1.getNombre());
        A1.setNota1(SC.nextInt());
        A1.setNota2(SC.nextInt());
        System.out.println("El promedio de "+A1.getNombre()+" es de "+A1.calcularPromedio());
        
        System.out.println("Ingrese legajo del 2º alumno: ");
        A2.setLegajo(SC.nextInt());
        System.out.println("Ingrese nombre: ");
        A2.setNombre(SC.next());
        System.out.println("Ingrese las 2 notas de "+A2.getNombre());
        A2.setNota1(SC.nextInt());
        A2.setNota2(SC.nextInt());
        System.out.println("El promedio de "+A2.getNombre()+" es de "+A2.calcularPromedio());
        
        if(A1.calcularPromedio()>A2.calcularPromedio())
        {
            System.out.println(A1.getNombre()+" tiene mayor promedio que "+A2.getNombre());
        }
        else
        {
            System.out.println(A2.getNombre()+" tiene mayor promedio que "+A1.getNombre());
        }
        
    }
    
}
