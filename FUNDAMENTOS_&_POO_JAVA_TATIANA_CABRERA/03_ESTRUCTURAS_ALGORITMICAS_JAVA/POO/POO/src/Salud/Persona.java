package Salud;
import java.util.Scanner;

public class Persona {
    //ATRIBUTOS
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;

    public Persona(){
        
    }

    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoActual = pesoActual;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

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

        System.out.println("Ingrese su peso en KL");
        peso=Lector.nextDouble();

        System.out.println("Ingrese su estatura");
        estatura=Lector.nextDouble();

        System.out.println("Ingrese su edad");
        edad=Lector.nextInt();

        System.out.println("Ingrese su sexo");
        sexo=Lector.next();

        Lector.close();
    }
    public void mostrarPersona(){
        System.out.println("Tipo documento: "+tipoDoc);
        System.out.println("N° Documento: "+documento);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
        System.out.println("Edad: "+edad);
        System.out.println("SExo: "+sexo);
    }
    public void calcularImc(){
        pesoActual = peso/(estatura*estatura);

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
    }
    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Eres es mayor de edad");
        }else 
        System.out.println("Eres es menor de edad");

    }

}
