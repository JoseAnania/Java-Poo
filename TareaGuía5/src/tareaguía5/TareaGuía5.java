
package tareaguía5;

import java.util.Scanner;

public class TareaGuía5 {

    public static void main(String[] args) {
     
        Scanner SC=new Scanner(System.in);
        Partido P=new Partido();
        
        System.out.println("Nombre del equipo Local: ");
        P.setEquipo1(SC.nextLine());
        
        System.out.println("Nombre del equipo Visitante: ");
        P.setEquipo2(SC.nextLine());
        
        System.out.println("Goles de "+P.getEquipo1());
        P.setGoles1(SC.nextInt());
        
        System.out.println("Goles de "+P.getEquipo2());
        P.setGoles2(SC.nextInt());
        
        System.out.println("El resultado fue: "+P.getEquipo1()+" "+P.getGoles1()+" a "+P.getEquipo2()+" "+P.getGoles2());
    }
    
}
