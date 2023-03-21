import java.util.Scanner;
public class RETO_2 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la competencia de natacion...");


        Scanner Lector = new Scanner(System.in);
        System.out.println("Digite por favor cuantos competidores participaran:");
        int competidores = Lector.nextInt();

        float[] tiempo = new float[competidores];
        String[] nombre_comp = new String[competidores];

        int i;
        for ( i = 0; i < competidores; i++){
            System.out.println("Digite el nombre del participante #" + i);
            nombre_comp[i] = Lector.next();

            System.out.println("Digite cuanto tardo en segundos: #" + i);
            tiempo[i] = Lector.nextFloat();
        }
        for ( i = 0; i < nombre_comp.length && i < tiempo.length; i++) {
            System.out.println("Resumen.....");
            System.out.println("participante #" + i + ": \n" + nombre_comp[i]+ " - " + " Tiempo: \n" + tiempo[i] + " segundos \n");
        }
    
        Lector.close();
    }
}
