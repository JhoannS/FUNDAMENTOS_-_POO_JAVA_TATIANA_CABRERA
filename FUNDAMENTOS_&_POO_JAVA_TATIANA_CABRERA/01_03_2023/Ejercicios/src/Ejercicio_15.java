public import java.util.Scanner;
public class ejercicio15 { 
    public static void main(String[] args) {
        System.out.println("Bienvenido al evaluador de notas :D"); 

        Scanner Lector = new Scanner(System.in);
        System.out.println("digite la materia:");
        String materia = Lector.nextLine();

        System.out.println("digite la cantidad de notas a envaluar:");
        int cantidad_notas = Lector.nextInt();

        float[] notas = new float[cantidad_notas]; 
        float suma = 0;
        
        for ( int i = 0; i < cantidad_notas ;i++){
        System.out.println("Digite la nota "+i);
        notas[i] = Lector.nextFloat();

        suma = suma + notas[i];
    }
    float promedio = suma/cantidad_notas;

if (promedio<30) {
    System.out.println("RESUMEN...");
    System.out.println("Materia: " + materia);
    System.out.println("Promedio de notas: " + promedio + " REPROBASTE");

} else if (promedio<40) {
    System.out.println("RESUMEN...");
    System.out.println("Materia: " + materia);
    System.out.println("Promedio de notas: " + promedio + " PASO PERO RASPANDO");
} else if (promedio>40){
    System.out.println("RESUMEN...");
    System.out.println("Materia: " + materia);
    System.out.println("Promedio de notas: " + promedio + " APROBADO CON BUENOS RESULTADOS");
}
Lector.close();
}


}
