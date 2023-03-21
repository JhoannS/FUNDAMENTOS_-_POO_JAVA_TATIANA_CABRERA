import java.util.Scanner;

public class Ejercicio_8 {
   public static void main(String[] args) {

    Scanner Lector=new Scanner(System.in);   

    System.out.println("Seleccione un número del 1 al 10");
    int Numeros = Lector.nextInt();

    switch (Numeros) {
        case 1:
          System.out.println(Numeros + ": Uno");  
        break;
        case 2:
            System.out.println(Numeros + ": Dos");    
        break;
        case 3:
            System.out.println(Numeros + ": Tres");  
        break;
        case 4:
            System.out.println(Numeros + ": Cuatro");  
        break;
        case 5:
        System.out.println(Numeros + ": Cinco");  
        break;
        case 6:
        System.out.println(Numeros + ": Seis");  
        break;
        case 7:
        System.out.println(Numeros + ": Siete");  
        break;
        case 8:
        System.out.println(Numeros + ": Ocho");     
        break;
        case 9:
        System.out.println(Numeros + ": Nueve");    
        break;
        case 10:
        System.out.println(Numeros + ": Diez");     
        break;
        default:
        System.out.println("Recuerde que es del 1 al 10 :/"); 
            break;
    }
    Lector.close();
   }
}
