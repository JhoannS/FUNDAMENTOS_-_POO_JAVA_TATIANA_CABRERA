
import java.util.Scanner;

public class RETO_2 {
    public static void main(String [] args){

        System.out.println("Bienvenido a Famisalud");
        Scanner Lector = new Scanner (System.in);

        System.out.println("Ingresa tu nombre");
        String Nombre_mama = Lector.nextLine();

        System.out.println("Ingresa el nombre de tu bebe");
        String Nombre_bebe = Lector.nextLine();

        System.out.println("Ingresa el peso de tu bebe");
        double Peso_bebe = Lector.nextDouble();

        System.out.println("Ingresa la edad de tu bebe");
        double Meses_bebe = Lector.nextDouble();

        System.out.println("Ingresa el nombre de la vacuna");
        String Vacuna = Lector.next();

        double Cantidad_Dosis = ((Peso_bebe + 10) / (Meses_bebe *10)) *8;

        System.out.println("Resumen: ");
         System.out.println("Hoy aplicaremos la vacuna de " + Vacuna);
         System.out.println(" ");
         System.out.println("Datos de la madre:  ");
         System.out.println("Nombre: " + Nombre_mama);
         System.out.println(" ");
         System.out.println("Datos del bebe: ");
         System.out.println("Nombre: " + Nombre_bebe);
         System.out.println("Peso: " + Peso_bebe);
         System.out.println("Edad: " + Meses_bebe + " Meses");
         System.out.println("La dosis de " + Nombre_bebe + " Sera de: " + Cantidad_Dosis);


    Lector.close();
    }
}
