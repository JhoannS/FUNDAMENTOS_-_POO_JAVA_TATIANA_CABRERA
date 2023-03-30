package Principal;

import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;
import Salud.Persona2;

public class Inicio {
    public static void main(String[] args) {
        //RETO 1
         Persona nueva=new Persona();
        //  MOSTRAR METODOS (INVOCAR)
         nueva.pedirDatos();
         nueva.mostrarPersona();
         nueva.mayorEdad();
         nueva.calcularImc();
    
        // RETO 2
        Persona2 ver2=new Persona2();
        double peso, estatura;
        Scanner Lector= new Scanner(System.in);
        System.out.println("Ingrese su peso en KL");
        peso=Lector.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=Lector.nextDouble();
        ver2.pedirDatos();
        ver2.mostrarPersona();
        ver2.mayorEdad();
        ver2.calcularImc( peso, estatura);
        Lector.close();

        
        //RETO 3
    Scanner Lector= new Scanner(System.in);

    String cargo;
    int valorhora;
    int horastrabajadas;      
    String departamento;
       
       System.out.println("Escriba su cargo ");
       cargo=Lector.next();
       System.out.println("Escriba el valor de la hora ");
       valorhora=Lector.nextInt();
    System.out.println("Escriba sus horas trabajadas ");
    horastrabajadas=Lector.nextInt();
    System.out.println("Escriba su departamento ");
       departamento=Lector.next();
        

     Persona X = new Persona();
        X.pedirDatos();
         Empleado empleado= new Empleado(X.getTipoDoc(),X.getDocumento(),X.getNombre(),X.getApellido()
         ,X.getPeso(),X.getEstatura(),X.getEdad(),X.getSexo(),X.getPesoActual());

         empleado.setCargo(cargo);
         empleado.setValorhora(valorhora);
         empleado.setHorastrabajadas(horastrabajadas);
         empleado.setDepartamento(departamento);
         empleado.mostrarPersona();
         empleado.calcularHonorarios();
         Lector.close();
    }


}