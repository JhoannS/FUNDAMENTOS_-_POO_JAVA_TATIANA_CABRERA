import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String [] args){

        System.out.println("Bienvenido");
        Scanner Lectura = new Scanner (System.in);

        System.out.println("Ingresa tu nombre");
        String name = Lectura.nextLine();

        System.out.println("Ingresa tu Apellido");
        String lastName = Lectura.nextLine();

        System.out.println("Ingresa la Fecha de hoy (en texto)");
        String date = Lectura.nextLine();

        System.out.println("Ingresa tu numero de ficha");
        int ficha = Lectura.nextInt();

        System.out.println("Ingresa el serial del Teclado");
        String Se_Teclado = Lectura.nextLine();

        System.out.println("Ingresa el serial de la pantalla");
        String Se_Pantalla = Lectura.nextLine();

        System.out.println("Ingresa el serial de la pantalla");
        String Se_Cpu = Lectura.nextLine();

        System.out.println("Ingresa tus observaciones");
        String Observaciones = Lectura.nextLine();

        System.out.println(" ");

        System.out.println("Aqui mostraremos tus observaciones: ");
         System.out.println("Hola " + name + " " + lastName);
         System.out.println(" ");
         System.out.println("Fecha: " + date);
         System.out.println("Numero de Ficha: "+ ficha);
         System.out.println(" ");
         System.out.println("Seial del teclado: " + Se_Teclado);
         System.out.println("Seial de la pantalla: " + Se_Pantalla);
         System.out.println("Seial de la cpu: " + Se_Cpu);
         System.out.println("Tus observaciones fueron: " + Observaciones);

         
    Lectura.close();
    }
}
