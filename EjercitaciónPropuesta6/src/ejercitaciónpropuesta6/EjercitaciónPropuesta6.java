
package ejercitaciónpropuesta6;

import java.util.Scanner;

public class EjercitaciónPropuesta6 {


    public static void main(String[] args) {
        
        float acumHabitantes=0;
        int mayor=0;
        int menor=0;
        String nomMayor=null;
        String domMenor=null;
        int cont1=0;
        String apellido=null;
        String direccion=null;
        int habitantes=0;
        
        Scanner SC=new Scanner(System.in);
        Vivienda V=new Vivienda();
        
        System.out.println("Cantidad de Viviendas Censadas ");
        int cantViviendas=SC.nextInt();
        
        for (int i = 0; i < cantViviendas; i++) {
            
            int codigo=(1+i);
            System.out.println("Código de Vivienda Autogenerada: "+codigo);
            System.out.println("Apellido de Vivienda "+codigo);
            V.setApellido(SC.next());
            System.out.println("Domicilio de Vivienda "+codigo);
            V.setDomicilio(SC.next());
            System.out.println("Cantidad de habitantes de la Vivienda "+codigo);
            V.setHabitantes(SC.nextInt());
            
            acumHabitantes+=V.getHabitantes();
            
            if(i==0 || V.getHabitantes()>mayor)
            {
                mayor=V.getHabitantes();
                nomMayor=V.getApellido();
            }
            
            if(i==0 || V.getHabitantes()<menor)
            {
                menor=V.getHabitantes();
                domMenor=V.getDomicilio();
            }
            
            if(V.getHabitantes()==1)
            {
                cont1++;
            }
            
            if((1+i)==1)
            {
                apellido=V.getApellido();
                direccion=V.getDomicilio();
                habitantes=V.getHabitantes();
            }
        }
        
        System.out.println("Cantidad Total de Habitantes: "+acumHabitantes);
        
        System.out.println("La Vivienda con mayor cantidad de habitantes es la de "+nomMayor);
        
        System.out.println("El domicilio con menor cantidad de habitantes es: "+domMenor);
        
        System.out.println("Cantidad de Viviendas con un sólo habitante: "+cont1);
        
        System.out.println("Datos de la Vivienda 1: ");
        System.out.println("Apellido: "+apellido);
        System.out.println("Dirección: "+direccion);
        System.out.println("Cantidad de Habitantes: "+habitantes);
    }
    
}
