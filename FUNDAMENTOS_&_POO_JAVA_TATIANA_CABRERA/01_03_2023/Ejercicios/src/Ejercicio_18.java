import java.util.Scanner;

// Taller 1 con while do

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Bienvenido Admin");

        Scanner Lector = new Scanner(System.in);
        
        int i = 0;
        int suma = 0 ;
        int promedio = 0;
        do{
            System.out.println("digite la edad del alumno #" + (i+1));
            int Edad_alumnos = Lector.nextInt();

            int Suma_edades = Edad_alumnos ;
            suma = suma + Suma_edades;
            promedio = suma/31;
            i++;
        }
        while(i <= 31);
        System.out.println("El promedio de edades es: " + promedio);
        Lector.close();

    }
}


