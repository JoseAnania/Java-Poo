
package ejercitaciónpropuesta4;

import java.util.Scanner;

public class EjercitaciónPropuesta4 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        Pais P1=new Pais();
        Pais P2=new Pais();
        Pais P3=new Pais();
        
        System.out.println("Nombre del País: ");
        P1.setNombre(SC.next());
        System.out.println("Medallas obtenidas por "+P1.getNombre());
        P1.setMedallas(SC.nextInt());
        
        System.out.println("Nombre del País: ");
        P2.setNombre(SC.next());
        System.out.println("Medallas obtenidas por "+P2.getNombre());
        P2.setMedallas(SC.nextInt());
        
        System.out.println("Nombre del País: ");
        P3.setNombre(SC.next());
        System.out.println("Medallas obtenidas por "+P3.getNombre());
        P3.setMedallas(SC.nextInt());
        
        float porcentaje=0;
        System.out.println("Clasificación: ");
        if (P1.getMedallas()>P2.getMedallas() && P1.getMedallas()>P3.getMedallas())
        {
            System.out.println("1º "+P1.getNombre()+" "+P1.getMedallas());
            
            if(P2.getMedallas()>P3.getMedallas())
            {
                System.out.println("2º "+P2.getNombre()+" "+P2.getMedallas());
                System.out.println("3º "+P3.getNombre()+" "+P3.getMedallas());
            }
            else
            {
                System.out.println("2º "+P3.getNombre()+" "+P3.getMedallas());
                System.out.println("3º "+P2.getNombre()+" "+P2.getMedallas());
            }
            
            porcentaje=(P1.getMedallas()*100)/(P1.getMedallas()+P2.getMedallas()+P3.getMedallas());
        }
        
        if(P2.getMedallas()>P1.getMedallas() && P2.getMedallas()>P3.getMedallas())
        {
            System.out.println("1º "+P2.getNombre()+" "+P2.getMedallas());
            
            if(P1.getMedallas()>P3.getMedallas())
            {
                System.out.println("2º "+P1.getNombre()+" "+P1.getMedallas());
                System.out.println("3º "+P3.getNombre()+" "+P3.getMedallas());
            }
            else
            {
                System.out.println("2º "+P3.getNombre()+" "+P3.getMedallas());
                System.out.println("3º "+P1.getNombre()+" "+P1.getMedallas());
            }
            porcentaje=(P2.getMedallas()*100)/(P1.getMedallas()+P2.getMedallas()+P3.getMedallas());
        }
        
        if(P3.getMedallas()>P1.getMedallas() && P3.getMedallas()>P2.getMedallas())
        {
            System.out.println("1º "+P3.getNombre()+" "+P3.getMedallas());
            
            if(P1.getMedallas()>P2.getMedallas())
            {
                System.out.println("2º "+P1.getNombre()+" "+P1.getMedallas());
                System.out.println("3º "+P2.getNombre()+" "+P2.getMedallas());
            }
            else
            {
                System.out.println("2º "+P2.getNombre()+" "+P2.getMedallas());
                System.out.println("3º "+P1.getNombre()+" "+P1.getMedallas());
            }
            porcentaje=(P3.getMedallas()*100)/(P1.getMedallas()+P2.getMedallas()+P3.getMedallas());
        }
        
        System.out.println("Total de medallas: "+(P1.getMedallas()+P2.getMedallas()+P3.getMedallas()));
        
        System.out.println("Porcentaje de Medallas obtenidas del 1º: "+porcentaje+"%");
        
        
    }
    
}
