import java.util.Random;
public class Ejercicio_25 {
    public static void main(String[] args) {
        String Casilla[][] = {{" "," "," "," "," "," ","4 "," "," ","  ", " ", " Cielo "}, {"1 ","2 ","3 ","5 ","","","7 ","8 ","9 ","10 ", "",""}, {" "," "," "," "," "," ","6 "," "," "," "," ", " Infierno "}};

        for (int i = 0; i<3; i++){
            for (int j = 0; j<12; j++){
                System.out.print(Casilla[i][j]);
            }  
            System.out.println("");     
        }

        Random dado = new Random();
        int numeroAle;

        numeroAle = dado.nextInt(10);
        System.out.println("salio el numero: " + numeroAle);
        System.out.println("ahora esta en la casilla: " + numeroAle);
    }
}