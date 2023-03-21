import java.util.Scanner;

public class Ejercicio_2 {
    
     public static void main(String[] args) {

        System.out.println("Bienvenido, a la Tienda de Frutas doña Maria");

        Scanner Lector = new Scanner (System.in);

        System.out.println("Ingrese su nombre");
        String Nombre= Lector.nextLine();

        System.out.println("Elija la fruta que desea llevar");
        System.out.println("1- Manzanas");
        System.out.println("2- Peras");
        System.out.println("3- Sandias");
        String Eleccion = Lector.nextLine();
        
        System.out.println("Digite la cantidad en numeros");
        int Cantidad = Lector.nextInt();

        System.out.println("Digite el costo de la fruta");
        int costo = Lector.nextInt();

        int Total = Cantidad*costo;
        int Descuento = Total - 1000;
        switch (Eleccion) {
            case "1" :

                System.out.println("Señor@ " + Nombre + " usted obtuvo un descuento de 1000 por la compra de Manzanas\n" + "Sub-Total: " + Total + "\nTotal: " + Descuento );

            break;

            case "2" :
            
             System.out.println("Señor@ " + Nombre + " usted obtuvo un descuento de 1500 por la compra de Peras\n" + "Sub-Total: " + Total + "\nTotal: " + Descuento );

            break;

            case "3":
            
                System.out.println("Señor@ " + Nombre + " usted obtuvo un descuento de 2000 por la compra de Sandias\n" + "Sub-Total: " + Total + "\nTotal: " + Descuento );

            break;

            default:
             System.out.println("Paila, no obtuvo descuento");
            break;
        }
       
       
        Lector.close();
    }
}
