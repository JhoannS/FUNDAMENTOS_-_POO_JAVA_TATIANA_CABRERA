import java.util.Scanner;

public class RETO_3 {
    public static void main(String[] args) {

      Scanner Lector = new Scanner(System.in);

      System.out.println("Digite su nombre");
        String Nombre = Lector.next();

        System.out.println("Digite cuanto va apostar");
        int Monto = Lector.nextInt(); 

        if (Monto >= 10000) {
            System.out.println("seleccione CARA o SELLO : ");
            String Seleccion = Lector.next();

            float Respuesta = (int)Math.floor(Math.random()*2);

            if (Seleccion.equals("cara") || Seleccion.equals("Cara")) {
                if (Respuesta == 1) {

                    int Suma_Apuesta = Monto*2;

                    System.out.println("Señor@ " + Nombre + " ¡CARA!, usted gano: $" + Suma_Apuesta );

                } else {

                    System.out.println("Señor@ " + Nombre + " ¡SELLO!, usted perdido: $" + Monto );

                }

            } else if (Seleccion.equals("sello") || Seleccion.equals("Sello")) {

                if (Respuesta == 1) {

                    int Suma_Apuesta = Monto*2;

                    System.out.println("Señor@ " + Nombre + " ¡SELLO!, usted gano: $" + Suma_Apuesta );

                } else {

                    System.out.println("Señor@ " + Nombre + " ¡CARA!, usted perdido: $" + Monto );

                }
            } else {
                System.out.println("Error, elija 'CARA o SELLO'");
            } 
        } else {
            System.out.println("Lo siento, la apuesta debe ser de 10.000 en adelante");
        }
        Lector.close();
    }
} 
    