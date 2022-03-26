
package ejercitaciónpropuesta5;

import java.util.Scanner;

public class EjercitaciónPropuesta5 {

    public static void main(String[] args) {
        
        float acumPromedio=0;
        float mayor=0;
        String nomMayor=null;
        int contRegular=0;
        int contLibre=0;
        
        Scanner SC=new Scanner(System.in);
        Alumno A=new Alumno();
        
        System.out.println("Cantidad de Alumnos");
        int cantAlumnos=SC.nextInt();
        
        for (int i = 0; i < cantAlumnos; i++) {
            
            System.out.println("Nombre del alumno "+(i+1));
            A.setNombre(SC.next());
            
            System.out.println("Nota 1 de "+A.getNombre());
            A.setNota1(SC.nextInt());
            
            System.out.println("Nota 2 de "+A.getNombre());
            A.setNota2(SC.nextInt());
            
            System.out.println("Nota 3 de "+A.getNombre());
            A.setNota3(SC.nextInt());
            
            System.out.println("Promedio de "+A.getNombre()+" "+A.calcularPromedio());
            
            acumPromedio+=A.calcularPromedio();
            
            if(i==0 || A.calcularPromedio()>mayor)
            {
                mayor=A.calcularPromedio();
                nomMayor=A.getNombre();
            }
            
            if(A.calcularPromedio()>=4)
            {
                System.out.println("El Alumno está REGULAR");
                contRegular++;
            }
            else
            {
                System.out.println("El Alumno está LIBRE");
                contLibre++;
            }
            
        }
        System.out.println("El Promedio General del Curso es: "+(acumPromedio/cantAlumnos));
        
        System.out.println("El Alumno con Mayor Promedio es: "+nomMayor);
        
        System.out.println("Cantidad de Alumnos Regulares: "+contRegular);
        System.out.println("Cantidad de Alumnos Libres: "+contLibre);
        
    }
    
}
