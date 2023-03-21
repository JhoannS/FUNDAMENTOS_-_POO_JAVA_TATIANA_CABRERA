import java.util.Scanner;
public class Ejercicio_14{
  public static void main(String[] args) {
    System.out.println("Bienvenido");
    Scanner Lector = new Scanner (System.in);
    System.out.println("Digite su nombre: ");
    String Nombre = Lector.nextLine();
    System.out.println("Digite las siguientes notas en el orden:");
    System.out.println("1- Nota 1: Desempeño");
    System.out.println("2- Nota 2: Producto");
    System.out.println("3- Nota 3: Conocimiento");
    int i=1;
    int Suma = 0;
    while (i<=3){
      System.out.println("Ingrese su nota de " + i);
      int Notade = Lector.nextInt();

      Suma = Suma + Notade;

      i++;
    }
  
  int TotalFinal = 0;
  TotalFinal = Suma / 3;
  System.out.println("Señor@ " + Nombre + " Promedio: " + TotalFinal);

Lector.close();
}
}
