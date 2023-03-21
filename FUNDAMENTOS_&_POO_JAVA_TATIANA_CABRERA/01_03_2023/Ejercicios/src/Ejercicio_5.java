import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        System.out.println("Sistema de gestor de Estacion climatica:");

        System.out.println("1-  Enero");
        System.out.println("2-  Febrero");
        System.out.println("3-  Marzo");
        System.out.println("4-  Abril");
        System.out.println("5-  Mayo");
        System.out.println("6-  Junio");
        System.out.println("7-  Julio");
        System.out.println("8-  Agosto");
        System.out.println("9-  Septiembre");
        System.out.println("10- Octubre");
        System.out.println("11- Noviembre");
        System.out.println("12- Diciembre");

        String estacion1 = "Invierno";
        String estacion2 = "Verano";
        String estacion3 = "Otoño";
        String estacion4 = "Primavera";

        String Mes1 = "Enero";
        String Mes2 = "Febrero" ;
        String Mes3 = "Marzo";
        String Mes4 = "Abril";
        String Mes5 = "Mayo";
        String Mes6 = "Junio";
        String Mes7 = "Julio";
        String Mes8 = "Agosto";
        String Mes9 = "Septiembre";
        String Mes10 = "Octubre";
        String Mes11 = "Noviembre";
        String Mes12 = "Diciembre";

        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese el mes para ver la estacion climatica");
        int Registro = Lector.nextInt();


        switch (Registro){
            case 1: 
            System.out.println(Mes1 + " - " + estacion1);
            break;
            case 2:
            System.out.println(Mes2 + " - " + estacion1);
            break;
            case 3:
            System.out.println(Mes3 + " - " + estacion4);
            break;
            case 4:
            System.out.println(Mes4 + " - " + estacion4);
            break;
            case 5:
            System.out.println(Mes5 + " - " + estacion4);
            break;
            case 6:
            System.out.println(Mes6 + " - " + estacion2);
            break;
            case 7:
            System.out.println(Mes7 + " - " + estacion2);
            break;
            case 8:
            System.out.println(Mes8 + " - " + estacion3);
            break;
            case 9:
            System.out.println(Mes9 + " - " + estacion3);
            break;
            case 10:
            System.out.println(Mes10 + " - " + estacion3);
            break;
            case 11:
            System.out.println(Mes11 + " - " + estacion1);
            break;
            case 12:
            System.out.println(Mes12 + " - " + estacion1);
            break;
            
           
        
        }
        Lector.close();
    }
}