 import java.util.Scanner;
public class Ejercicio_26{
    public static void main(String[] args) {
        // ARRAY: es un tipo de dato
        // int tamaño;
        

        // int[] Marca_carro = new int[tamaño];

        // String[] Nombre_carro1 = new String[5];

        // Nombre_carro1[0] = "Mazda";
        // Nombre_carro1[1] = "Ford";
        // Nombre_carro1[2] = "Chevrolet";
        // Nombre_carro1[3] = "Ferrari";
        // Nombre_carro1[4] = "Porche";

         int tamaño;
      
         Scanner Lector = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de carros que desea ingresar");
         tamaño = Lector.nextInt();

        String[] Marca_carro = new String[tamaño];

          for (int i = 0; i<tamaño; i++){
             System.out.println("Ingrese el carro #" + i);
             Marca_carro[i] = Lector.next();             
          }

          System.out.println("los carros ingresados fueron: ");
          
          for (int i =0; i<tamaño; i++){
            System.out.println( "#" + (i+1) + " " + Marca_carro[i]);
          }
          
         Lector.close();





        // Lector.close();
    }
}