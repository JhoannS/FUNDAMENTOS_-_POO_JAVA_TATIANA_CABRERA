import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

            System.out.println("Bienvenido al generador de tablas de multiplicar :D");

            Scanner Lector = new Scanner(System.in);
            System.out.println("digite el numero para ver su tabla de multiplicar :D");       
            int Numero = Lector.nextInt();

            int Repite = 1;
            int Total = 0 ;
            do{ 
            
            Total= Numero * Repite;

            System.out.println(Numero + " * " + Repite + " = " + Total );

            Repite++;

             } while(Repite <= 10);  
            Lector.close();   
        }   
         
    }  
