package Salud;

public class Inicio {
    public static void main(String[] args) {
        Persona pers = new Persona();
        float peso = peso=0;
        float estatura = estatura=0;
        

        pers.pedirDatos();
        pers.mostrarPersona();
        float IMC = pers.calcularImc(peso, estatura);
        pers.mayorEdad();


    }
}
