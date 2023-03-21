import java.util.Scanner;

// Taller 2 con while

public class Ejercicio21{
    public static void main(String[] args) {
        System.out.println("Bienvenido maistro");

         Scanner Lector = new Scanner(System.in);

         System.out.println("¿cuantos alumnos que desea registrar?");
         int Cantidad_Alumno = Lector.nextInt();

         int contador=0;
         int i=0;
         while(i < Cantidad_Alumno){
            System.out.println("digite el nombre del alumno #" + (i+1));
            String Nombre_Alumno = Lector.nextLine();
            
            System.out.println("¡El alumno #" + i + " Asistio?");
            String Asistencia = Lector.nextLine();

            contador = 

            i++;
         }
    }
}
