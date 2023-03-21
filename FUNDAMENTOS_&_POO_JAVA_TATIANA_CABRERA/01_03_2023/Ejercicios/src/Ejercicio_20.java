import java.util.Scanner;

// Taller 2 con FOR

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Bienvenido maistro");

         Scanner Lector = new Scanner(System.in);

         System.out.println("cuantos alumnos que desea registrar?");
         int Cantidad_Alumno = Lector.nextInt();

         int contador=0;
         for(int i=0; i < Cantidad_Alumno; i++){
            System.out.println("digite el nombre del alumno #" + (i+1));
            String Nombre_Alumno = Lector.nextLine();
            
            System.out.println("El alumno #" + (i+1) + " Asistio?");
            String Asistencia = Lector.nextLine();

            contador = 


         }

         Lector.close();
    }
}