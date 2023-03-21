import java.util.Scanner;

public class RETO_4 {

    public static void main(String[] args) {

        Scanner Lector = new Scanner(System.in);

        System.out.println("Digite su nombre");
        String Nombre = Lector.next();

        System.out.println("Digite cuanto va apostar");
        int Monto = Lector.nextInt(); 

   if ( Monto >= 10000) {

    System.out.println("Elige una: piedra, papel, tijera:");

        String Eleccion = Lector.next();

        int Aleatorio = (int)Math.floor(Math.random()*3) ;


        if (Eleccion.equals("piedra")||Eleccion.equals("Piedra")) {

            if (Aleatorio==1) {

                System.out.println("Señor@ " + Nombre + ", selecciono: " + Eleccion + " y salio PAPEL, perdido $:" + Monto);

            } else {

                int Total = 0;
                Total= Monto *2;

                System.out.println("Señor@ " + Nombre + ", selecciono: " + Eleccion + " y salio TIJERA, gano $:"+Total);

            }
        } else if (Eleccion.equals("papel")||Eleccion.equals("Papel")) {

            if (Aleatorio==1) {

                System.out.println("Señor@ " + Nombre + ", selecciono: " + Eleccion + " y salio TIJERA, perdido $:"+ Monto);

            } else {

                int Total = 0;
                Total= Monto *2;

                System.out.println("Señor@ " + Nombre + ", selecciono: " + Eleccion + " y salio PIEDRA, gano $:" +Total);

            }

        } else if (Eleccion.equals("tijera")||Eleccion.equals("Tijera")) {

            if (Aleatorio==1) {

                System.out.println("Señor@ " + Nombre + ", selecciono: " + Eleccion + " y salio PIEDRA, perdido $:"+ Monto);

            } else {

                int Total = 0;
                Total= Monto *2;

                System.out.println("Señor@ " + Nombre + ", selecciono: " + Eleccion + " y salio, PIEDRA, ganado $:" + Total);

            }
        }
        else {

            System.out.println("Lo siento, la apuesta debe ser de 10.000 en adelante");
        
        }
    }
    Lector.close();
}
}

