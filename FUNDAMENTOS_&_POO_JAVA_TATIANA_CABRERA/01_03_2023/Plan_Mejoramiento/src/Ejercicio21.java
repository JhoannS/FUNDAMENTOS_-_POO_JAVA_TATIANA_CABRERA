import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        System.out.println("Recupera tu contraseña");
        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese su nueva contraseña");
        String PassNuevo = Lector.nextLine();
        
        System.out.println("Repita su nueva contraseña");
        String PassNuevo_Repetir = Lector.nextLine();

        if (PassNuevo_Repetir == PassNuevo) {
            System.out.println("Tu contraseña se ha restablecido correctamente"); 
        }else if (PassNuevo != PassNuevo_Repetir ){
            System.out.println("tu contraseña no coincide");
        }else{
            System.out.println("pinche perro");
        }

        Lector.close();
    }
}