import java.util.Scanner;

public class Ejercicio_3 {
   public static void main(String[] args) {
    System.out.println("Bienvenido, aqui podra saber sus gastos a la semana");

    Scanner Lector = new Scanner(System.in);
    System.out.println("Ingrese su Nombre");
    String Nombre = Lector.nextLine();

    System.out.println("Cuanto gasto el Lunes");
    int Lunes = Lector.nextInt();

    System.out.println("Cuanto gasto el Martes");
    int Martes = Lector.nextInt();

    System.out.println("Cuanto gasto el Miercoles");
    int Miercoles = Lector.nextInt();

    System.out.println("Cuanto gasto el Jueves");
    int Jueves = Lector.nextInt();

    System.out.println("Cuanto gasto el Viernes");
    int Viernes = Lector.nextInt();

    System.out.println("Cuanto gasto el Sabado");
    int Sabado = Lector.nextInt();

    System.out.println("Cuanto gasto el Domingo");
    int Domingo = Lector.nextInt();

    int Total = Lunes + Martes + Miercoles + Jueves + Viernes + Sabado + Domingo;
    int Promedio_total = Total/7;

    if (Promedio_total < 10000) {

        System.out.println("Resumen: ");
        System.out.println("Señor@" + Nombre + "gasto medianamente: " + Promedio_total);
        System.out.println("Eres ahorrador");

    } else if (Promedio_total == 10000 ) {

        System.out.println("Resumen: ");
        System.out.println("Señor@" + Nombre + "gasto medianamente: " + Promedio_total);
        System.out.println("Gasto lo normal");

    }
    else if (Promedio_total > 10000){

        System.out.println("Resumen: ");
        System.out.println("Señor@ " + Nombre + " gasto medianamente: " + Promedio_total);
        System.out.println("Uy, se paso en gastos :/");

    } 
   else {
        System.out.println("Intentelo de nuevo, recuerde que son numeros");
   }
    Lector.close();
} 
}
