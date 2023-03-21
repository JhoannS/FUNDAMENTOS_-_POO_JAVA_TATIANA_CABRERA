import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la agenciaj de viajes Sena");
        System.out.println("Vuelos disponibles:");
        System.out.println("1. Turquia: $1500 USD");
        System.out.println("2. Cancún: $500 USD");
        System.out.println("3. Santorinio: $2000 USD");
        System.out.println("4. Egipto: $800 USD");

        Scanner Lector = new Scanner(System.in);
        System.out.println("digite el numero del pais de su interes");
        int Pais = Lector.nextInt();

        System.out.println("digite la cantidad de boletos a comprar");
        int Cant = Lector.nextInt();
        
        int precio1 = 1500;
        int precio2 = 500;
        int precio3 = 2000;
        int precio4 = 800;


        if (Pais == 1){
            int dolar = 4876*Cant;
            int conver1 = precio1 * dolar;
            System.out.println("Elegiste 'TURQUIA' ");
            System.out.println("Cantidad de boletos: " + Cant);
            System.out.println("Costo 1500 USD");
            System.out.println("Valor a pagar en Pesos Colombianos: " + conver1);
        } else if (Pais == 2){
            int dolar = 4876*Cant;
            int conver2 = precio2 * dolar;
            System.out.println("Elegiste 'Cancun' ");
            System.out.println("Cantidad de boletos: " + Cant);
            System.out.println("Costo 500 USD");
            System.out.println("Valor a pagar en Pesos Colombianos: " + conver2);
        } else if (Pais == 3){
            int dolar = 4876*Cant;
            int conver3 = precio3 * dolar;
            System.out.println("Elegiste 'Santorinio' ");
            System.out.println("Cantidad de boletos: " + Cant);
            System.out.println("Costo 2000 USD");
            System.out.println("Valor a pagar en Pesos Colombianos: " + conver3);
        } else if (Pais == 4){
            int dolar = 4876*Cant;
            int conver4 = precio4 * dolar;
            System.out.println("Elegiste 'Egipto' ");
            System.out.println("Cantidad de boletos: " + Cant);
            System.out.println("Costo 800 USD");
            System.out.println("Valor a pagar en Pesos Colombianos: " + conver4);
        } else{
            System.out.println("error, seleciona un numero valido");
        }
        Lector.close();
        
    }
}