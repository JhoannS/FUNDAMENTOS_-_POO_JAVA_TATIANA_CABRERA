import java.util.Scanner;
public class Ejercicio_24 {
    public static void main(String[] args) {
        // int [] numeros = {1,2,3,4,5};
        // for(int pares:numeros){
        //     System.out.println(pares);
        // }
        System.out.println("Bienvenido");

        Scanner Lector = new Scanner(System.in);
        System.out.println("digite cuantos numeros ingresara");
        int Cantidad = Lector.nextInt();

        String[] numero = new String[Cantidad];

        
        int contador = 0;

        for(int i = 0; i < Cantidad; i++){
            System.out.println("Digite un numero");
            numero[i] = Lector.next();
            System.out.println("El numero "+numero+" se repite " + contador + " veces");

        }


        int [] acumulador = new int[Cantidad];

        for (int i = 0; i < Cantidad; i++) {
            if(acumulador[i] == Cantidad){
                contador ++;
            }
        }

        
        
       Lector.close();
    }
}
