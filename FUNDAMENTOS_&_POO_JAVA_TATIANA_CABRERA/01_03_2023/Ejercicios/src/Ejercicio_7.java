import java.util.Scanner;

public class Ejercicio_7 {
   public static void main(String[] args) {
    System.out.println("Bienvenido al sistema de pension");

    Scanner Lector = new Scanner(System.in);

    System.out.println("Selecione su genero");
    System.out.println("Femenino");
    System.out.println("Masculino");
    String Genero = Lector.nextLine();
    
    if (Genero.equalsIgnoreCase("masculino")) {
        System.out.println("Digite su Edad");
        int Edad = Lector.nextInt();

        if (Edad>=70) {
            System.out.println("ya puedes pensionarte");
        } else {
            System.out.println("lo siento, aun no puedes pensionarte");
        }
    } else if (Genero.equalsIgnoreCase("femenino")) {
        System.out.println("Digite su Edad");
        int Edad = Lector.nextInt();

        if (Edad>=65) {
            System.out.println("ya puedes pensionarte");
        } else {
            System.out.println("lo siento, aun no puedes pensionarte");
        }
     } else {
            System.out.println("Error, verifique e intente nuevamente");
    }
    Lector.close();
   } 
}
