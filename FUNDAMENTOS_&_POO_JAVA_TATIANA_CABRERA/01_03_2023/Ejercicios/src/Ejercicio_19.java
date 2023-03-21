import java.util.Scanner;

// Taller 1 con while

public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Bienvenido Maistro");

        Scanner Lector = new Scanner(System.in);

        int i = 0;
        int suma = 0 ;
        int promedio = 0;
       while(i<=31){

        System.out.println("digite la edad del alumno #" + (i+1);
        int Edad_alumnos = Lector.nextInt();

        int Suma_edades = Edad_alumnos ;
        suma = suma + Suma_edades;
        promedio = suma/31;

        i++;
       }
       System.out.println("El promedio de edades es: " + promedio);
       Lector.close();
    }
}
