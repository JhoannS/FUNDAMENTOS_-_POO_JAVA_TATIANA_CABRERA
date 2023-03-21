import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        System.out.println("Bienvenido");

        Scanner Lector = new Scanner(System.in);
        System.out.println("Digite una Letra");
        String Caracter = Lector.nextLine();

        if (Caracter.equals("a") || Caracter.equals("e")||Caracter.equals("i")||Caracter.equals("o")||Caracter.equals("u")) {
            System.out.println("La letra es una vocal");

        } else {
            System.out.println("La letra es una consonante");
        }
        Lector.close();
    }
}
