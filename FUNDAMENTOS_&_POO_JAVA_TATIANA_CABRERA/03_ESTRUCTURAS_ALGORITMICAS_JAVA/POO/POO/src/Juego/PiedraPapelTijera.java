package Juego;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego{
   private int opcion;
   private String jugador;
   private int jugada;

   Scanner Lector= new Scanner (System.in);
   
    public void iniciar() {
        
        System.out.println("Ingrese el nombre del jugador");
        jugador = Lector.next();
    }

    public void jugar() {
       System.out.println(jugador + "Ingrese la opcion que desee para jugar");
       System.out.println("1. Piedra");
       System.out.println("2. Papel");
       System.out.println("3. Tijera");
    
       opcion=Lector.nextInt();
       Random aleatorio= new Random();
       jugada=aleatorio.nextInt(3);
    }


    public void finalizar() {
        if (opcion==1) {
            if (jugada==1) {
                System.out.println("Señor@ " + jugador + ", selecciono: " + opcion + " y salio PAPEL, perdido ");
            } else {
                
                System.out.println("Señor@ " + jugador + ", selecciono: " + opcion + " y salio TIJERA, gano");
            }
        } else if (opcion==2) {
            if (jugada==1) {
                System.out.println("Señor@ " + jugador + ", selecciono: " + opcion + " y salio TIJERA, perdido ");
            } else {
                
                System.out.println("Señor@ " + jugador + ", selecciono: " + opcion + " y salio PIEDRA, gano ");
            }
        } else if (opcion==3) {
            if (jugada==1) {
                System.out.println("Señor@ " + jugador + ", selecciono: " + opcion + " y salio PIEDRA, perdido");
            } else {
               
                System.out.println("Señor@ " + jugador + ", selecciono: " + opcion + " y salio, PIEDRA, gano ");

            }
        } 
        }
    }
    

