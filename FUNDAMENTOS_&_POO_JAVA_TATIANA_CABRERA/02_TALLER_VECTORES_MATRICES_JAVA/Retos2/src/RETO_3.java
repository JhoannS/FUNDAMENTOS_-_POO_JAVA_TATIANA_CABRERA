import java.util.Scanner;

public class RETO_3 {

    public static void main(String[] args) {
     Scanner Lector = new Scanner(System.in);


        String[][] Productos = new String[16][3];

        for (int fila = 0; fila < 16; fila++) {
            System.out.println("Ingresa el código del Producto #" + (fila+1) + ":");
            String codigo = Lector.nextLine();

            System.out.println("Ingresa el nombre del Producto #" + (fila+1) + ":");
            String nombre = Lector.nextLine();

            System.out.println("Ingresa el precio del Producto #" + (fila+1) + ":");
            String precio = Lector.nextLine();

            Productos[fila][0] = codigo;
            Productos[fila][1] = nombre;
            Productos[fila][2] = precio;
        }

        for (int fila = 0; fila < 16; fila++) {
            for (int j = 0; j <1; j++) {
            System.out.println("---------------");
            System.out.println(Productos[fila][0]); 
            System.out.println(Productos[fila][1]); 
            System.out.println(Productos[fila][2]);
            System.out.println("---------------");
        }
    }
        Lector.close();
    }
}
