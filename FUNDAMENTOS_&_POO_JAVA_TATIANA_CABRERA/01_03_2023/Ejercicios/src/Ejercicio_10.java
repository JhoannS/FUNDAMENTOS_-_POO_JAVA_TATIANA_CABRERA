import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String []args) {
        System.out.println("Bienvenido al promediador de notas");
        
        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String Nombre = Lector.nextLine();

        System.out.println("Ingrese las siguientes notas a promediar:");
        System.out.println("Nota 1 - Desempeño:");
        System.out.println("Nota 2 - Productividad:");
        System.out.println("Nota 3 - Conocimiento:");

      
    for ( int i = 1; i <= 3; i++) {

        System.out.println("Digite su nota #" + i);
        int Nota = Lector.nextInt();

        int Suma = 0;
        Suma = Suma + Nota; 
        int Total = Suma/3;

        System.out.println("Resumen:");
        System.out.println("Señor@ " + Nombre);
        System.out.println("Promedio: " + Total); 
        
         
    }
    Lector.close(); 
    }  
    }
    

