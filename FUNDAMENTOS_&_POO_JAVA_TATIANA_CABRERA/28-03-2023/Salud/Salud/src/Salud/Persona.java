package Salud;

import java.util.Scanner;


public class Persona{
    // ATRIBUTOS
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private float peso;
    private float estatura;
    private int edad;
    private String sexo;
    private float pesoActual;
    private float IMC;
    // METODOS
    public void setEmpleado(String tipoDoc, int documento, String nombre, String apellido, float peso, float estatura, int edad, String sexo, float IMC, float pesoActual){
        // super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, IMC);
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String gettipoDoc(){
        return tipoDoc;
    }
    public int getdocumento(){
        return documento;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public float getpeso(){
        return peso;
    }
    public float getestatura(){
        return estatura;
    }
    public int getedad(){
        return edad;        
    }
    public String getsexo(){
        return sexo;
    }
    public float getIMC(){
        return IMC; 
    }

    public void calcularHonorarios(){
        
    }

    public void pedirDatos(){
        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese tipo de documento");
        tipoDoc = Lector.nextLine();

        System.out.println("Ingrese su N° documento");
        documento = Lector.nextInt();

        System.out.println("Ingrese su nombre");
        nombre = Lector.next();

        System.out.println("Ingrese su apellido");
        apellido = Lector.next();

        System.out.println("Ingrese su peso actual");
        peso = Lector.nextFloat();

        System.out.println("Ingrese su estatura");
        estatura = Lector.nextFloat();

        System.out.println("Ingrese su edad");
        edad = Lector.nextInt();

        System.out.println("Ingrese su sexo ");
        sexo = Lector.next();
        Lector.close();
        
    }

    public void mostrarPersona(){
        System.out.println("Resumen:");
        System.out.println("Tipo de documento: " + gettipoDoc());
        System.out.println("Documento: " + getdocumento());
        System.out.println("Nombre: " + getnombre());
        System.out.println("Apellido: " + getapellido());
        System.out.println("Peso: " + getpeso());
        System.out.println("Estatura: " + getestatura());
        System.out.println("Edad: " + getedad());
        System.out.println("Sexo: " + getsexo());
    }

    // public void calcularImc(){
    //     pesoActual = peso/(estatura*estatura);
    //     IMC = pesoActual;

    //     if(pesoActual<20){
    //         System.out.println("IMC: " + IMC + ", el peso está por debajo de lo ideal");
    //     }else if(pesoActual <= 25 && pesoActual>=25){
    //         System.out.println("IMC: " + IMC + ", el peso es ideal");
    //     }else if(pesoActual>25){
    //         System.out.println("IMC: " + IMC + ", Tiene sobrepeso");
    //     }
    // }
    public float calcularImc(float peso, float estatura){
        pesoActual = peso/(estatura*estatura);
        IMC = pesoActual;
        return IMC;
    }

    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}