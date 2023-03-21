import java.util.Scanner;

public class RETO_5 {
    public static void main(String[] args) {
        System.out.println("bienvenido");

        Scanner Lector = new Scanner(System.in);
        String User = "Sebas28.";
        System.out.println("ingrese su usuario");
        String Usuario = Lector.nextLine();

        if(Usuario.equals("Sebas28.")){
            System.out.println("bienvenido nuevamente " + User);
            System.out.println("Cuantos productos desea lleavr?");
            int Cantidad = Lector.nextInt();

            int Total = 0;
            for(int i = 0; i< Cantidad; i++){
                System.out.println("ingrese el nombre del producto #" + (i+1));
                String Producto = Lector.next();

                System.out.println("ingrese el precio del producto #" + (i+1));
                int PrecioPro = Lector.nextInt();

                
                Total = Total + PrecioPro;
            }
            System.out.println("Resumen:...");
            System.out.println("El total es: " + Total);
            System.out.println("Con cuando desea pagar?");
            int Pago = Lector.nextInt();

            if (Pago>Total){
                int Cambio = Pago - Total;
                System.out.println("perfecto, aqui tiene su cambio:" + Cambio);
            }else{
                System.out.println("lo siento no le alcanza, regrese cuando tenga el dinero completo");
            }
        }else{
            System.out.println("Lo siento no se encuentra registrado, vaya a donde lo puedan registrar");
        }
        Lector.close();

    }
}
