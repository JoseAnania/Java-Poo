
package tareaguía4;

import java.util.Scanner;

public class TareaGuía4 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        Equipo E=new Equipo();
        
        System.out.println("Nombre del equipo: ");
        E.setNomEquipo(SC.nextLine());
        
        System.out.println("Partidos ganados: ");
        E.setGanados(SC.nextInt());
        
        System.out.println("Partidos empatados: ");
        E.setEmpatados(SC.nextInt());
        
        System.out.println("Partidos perdidos: ");
        E.setPerdidos(SC.nextInt());
        
        System.out.println("Goles realizados: ");
        E.setGolesFavor(SC.nextInt());
        
        System.out.println("Goles en contra: ");
        E.setGolesContra(SC.nextInt());
        
        System.out.println("Posición en el campeonato: ");
        E.setPosicion(SC.nextInt());
        
        System.out.println("Puntos obtenidos: "+E.Puntaje());
        System.out.println("Diferencia de Goles: "+E.diferenciaGoles());
        
    }
    
}
