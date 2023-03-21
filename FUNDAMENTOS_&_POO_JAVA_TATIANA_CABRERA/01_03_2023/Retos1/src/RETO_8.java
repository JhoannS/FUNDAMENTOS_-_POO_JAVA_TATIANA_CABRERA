import java.util.Random;
import java.util.Scanner;
public class RETO_8 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego adivina el numero");
        System.out.println("tendras que adivinar un numero del 1 al 100");

        Random dado = new Random();
        int numeroAle;
        numeroAle = dado.nextInt(100);

        Scanner Lector = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        

        int vidas = 3;
        do{
        System.out.println("Intento #"+(4-vidas)+": ");
        int Numero = Lector.nextInt();

        if(Numero == numeroAle){
            System.out.println("Felcidades, fuera de que eres adivino, ganaste jaja");
        }
        else if (Numero < numeroAle){
            System.out.println("el numero que ingresaste es menor al numero que debes adivinar");
        }
        else if (Numero > numeroAle){
            System.out.println("el numero que ingresaste es mayor al numero que debes adivinar");
        }
        else{
            System.out.println("digita un numero por favorrrrr");
        }
        vidas--;
    }while(vidas>0);
    System.out.println("jaja, perdio, el numero era: " + numeroAle);
        Lector.close();


    }
}
