import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);

        System.out.println("Rango de edad de entrar a la discoteca");
        System.out.println("Digite su edad");
        int Años = Lector.nextInt();


        if (Años > 18) {
            System.out.println("Esta apto para ingresar");
        } else if (Años == 18){
            System.out.println("Espere unos mesesitos mas para que pueda ingresar");
        } else if (Años < 18){
            System.out.println("Aun no es apto para entrar, lo siento");
        }


        Lector.close();

    }
}