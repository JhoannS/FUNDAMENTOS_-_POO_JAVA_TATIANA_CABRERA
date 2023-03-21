import java.util.Scanner;

// Taller 1 con FOR

public class Ejercicio17{
    public static void main(String[] args) {
        
          System.out.println("Bienvenido a la ficha 2687351");


        Scanner Lector = new Scanner(System.in);
         
        int suma = 0 ;
        int promedio = 0;
         for(int i = 0; i < 31; i++){
          System.out.println("digite la edad del alumno #" + i);
            int Edad_alumnos = Lector.nextInt();
            
            int Suma_edades = Edad_alumnos ;
            suma = suma + Suma_edades;
            promedio = suma/31;
        
         }
         System.out.println("El promedio de edades es: " + promedio);
         Lector.close();
    }
}