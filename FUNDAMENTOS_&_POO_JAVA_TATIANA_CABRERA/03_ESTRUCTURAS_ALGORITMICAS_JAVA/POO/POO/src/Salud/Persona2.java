package Salud;

import java.util.Scanner;

public class Persona2 {
    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    int edad;
    String sexo;
    double pesoActual;

    public void pedirDatos(){
        Scanner Lector= new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=Lector.next();
        System.out.println("Ingrese numero de documento");
        documento=Lector.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=Lector.next();
        System.out.println("Ingrese su apellido");
        apellido=Lector.next();
        System.out.println("Ingrese su edad");
        edad=Lector.nextInt();
        System.out.println("Ingrese su sexo");
        sexo=Lector.next();
        Lector.close();
    }
    public void mostrarPersona(){
        System.out.println("Su tipo de documento es "+tipoDoc);
        System.out.println("Su numero de documento es "+documento);
        System.out.println("su nombre es "+nombre);
        System.out.println("su apellido es "+apellido);
        System.out.println("su edades "+edad);
        System.out.println("su sexo es "+sexo);


    }
    //IMC NEW
    public double calcularImc(double peso, double estatura ){
        double imc=0;
         pesoActual =peso/(estatura*estatura);
        if(pesoActual<20){
            System.out.println("Su IMC  es "+pesoActual);
            System.out.println("El peso esta por debajo de lo ideal");
        }else if(pesoActual>20 && pesoActual<25){
            System.out.println("Su IMC  es "+pesoActual);
            System.out.println("El peso es ideal");
        }else if(pesoActual>25){
            System.out.println("Su IMC  es "+pesoActual);
            System.out.println("Esta en sobrepeso");
        }
        return imc;
    }
    public void mayorEdad(){
        if(edad>18){
            System.out.println("Usted es mayor de edad");
        }else if(edad <18){
        System.out.println("Usted es menor de edad");
        }else {
            System.out.println("Usted digito un numero incorrecto");
        }
    }
}
