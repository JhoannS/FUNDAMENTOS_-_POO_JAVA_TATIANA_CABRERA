import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor de asistencia ");
        
        Scanner Lector=new Scanner(System.in);

        System.out.println("Ingrese el nombre del aprendiz");
        String Nombre = Lector.nextLine();

        System.out.println("Por favor registre la asistencia del estudiante:");
        System.out.println("1- Lunes");
        System.out.println("2- Martes");
        System.out.println("3- Miercoles");
        System.out.println("4- Jueves");
        System.out.println("5- Viernes");


        int Dias = 1;
        int Asistencia_SI = 0;
        int Asistencia_NO = 0;
        while (Dias<=5) {
            System.out.println("El estudiante asistió el dia: " + Dias + " ?");
            System.out.println("Responda SI o NO");
             String Asistencia = Lector.nextLine();

            if (Asistencia.equalsIgnoreCase("si")) {
                Asistencia_SI++;
            } else {
                Asistencia_NO++;
            }
        Dias++;    
        }
        System.out.println("Resumen:");
        System.out.println("El estudiante " + Nombre);
        System.out.println("Asistio: " + Asistencia_SI + " dias");
        System.out.println("Fallo: " + Asistencia_NO + " dias");
        
        Lector.close();
    }
}