import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner Lector=new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("digite 3 numeros que desea comparar");  

        System.out.println("digite el primer numero");
        int Num_1= Lector.nextInt();

        System.out.println("digite el segundo numero");
        int Num_2= Lector.nextInt();

        System.out.println("digite el tercer numero");
        int Num_3= Lector.nextInt();

        
        if (Num_1 > Num_2 && Num_1 > Num_3) {

            int Mayor = Num_1;
            if (Num_2 < Num_3) {

                int Medio = Num_3;
                int Menor = Num_2;

                System.out.print("El número Mayor es: " + Mayor);
                System.out.println("El numero Medio es: " + Medio);
                System.out.println("El numero Menor es: " + Menor);

            } else {

                int Medio = Num_2;
                int Menor = Num_3;

                System.out.print("El número Mayor es: " + Mayor);
                System.out.println("El numero Medio es: " + Medio);
                System.out.println("El numero Menor es: " + Menor);

            }
        } else if ( Num_2 > Num_1 && Num_2 > Num_3) {

            int Mayor = Num_2;

            if (Num_1 < Num_3) {

                int Medio = Num_3;
                int Menor = Num_1;

                System.out.print("El número Mayor es: " + Mayor);
                System.out.println("El numero Medio es: " + Medio);
                System.out.println("El numero Menor es: " + Menor);

            } else {

                int Medio = Num_1;
                int Menor = Num_3;

                System.out.print("El número Mayor es: " + Mayor);
                System.out.println("El numero Medio es: " + Medio);
                System.out.println("El numero Menor es: " + Menor);

            }
        } else {

            int Mayor = Num_3;

            if (Num_1 < Num_2) {

                int Medio = Num_2;
                int Menor = Num_1;

                System.out.print("El número Mayor es: " + Mayor);
                System.out.println("El numero Medio es: " + Medio);
                System.out.println("El numero Menor es: " + Menor);

            } else {

                int Medio = Num_1;
                int Menor = Num_2;

                System.out.print("El número Mayor es: " + Mayor);
                System.out.println("El numero Medio es: " + Medio);
                System.out.println("El numero Menor es: " + Menor);

            }
        } 
     Lector.close();         
    }
}
