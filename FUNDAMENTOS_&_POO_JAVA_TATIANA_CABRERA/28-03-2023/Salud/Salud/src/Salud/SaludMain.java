package Salud;
import java.util.Scanner;
public class SaludMain{
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        System.out.println("Bienvenido");

        System.out.println("Digite el tipo de documento (CC,TI)");
        String tipoDoc = Lector.nextLine();

        System.out.println("Digite el documento ");
        int documento = Lector.nextInt();

        System.out.println("Digite su nombre");
        String nombre = Lector.next();

        System.out.println("Digite su apellido");
        String apellido = Lector.next();

        System.out.println("Digite su peso actual");
        int peso = Lector.nextInt();

        System.out.println("Digite su estatura");
        int estatura = Lector.nextInt();

        System.out.println("Digite su edad");
        int edad = Lector.nextInt();

        System.out.println("Digite su sexo (M o F))");
        String sexo = Lector.next();

        Persona mostrar = new Persona(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo); 
        mostrar.mostrarPersona();
        mostrar.calcularImc();
        mostrar.mayorEdad();

        Lector.close();
    }
}