import java.util.Scanner;
public class Ejercicio_23{
    public static void main(String[] args) {
        // int [] numeros = {1,2,3,4,5};
        // for(int pares:numeros){
        //     System.out.println(pares);
        // }
        System.out.println("bienvenido al sistema de venta de frutas");

        System.out.println("frutas disponibles:");
        System.out.println("Peras");
        System.out.println("Sandias");
        System.out.println("Mangos");
        System.out.println("melones");
        System.out.println("chontaduros");

        Scanner Lector = new Scanner(System.in);
        System.out.println("digite cuantas frutas ingresara");
        int Cantidad = Lector.nextInt();

        String[] frutas = new String[Cantidad];

        
        int contador = 0;
        int peras = 0;
        int sandias = 0;
        int mangos = 0;
        int melones = 0;
        int chontaduros = 0;


        for(int i = 0; i < Cantidad; i++){
            System.out.println("Digite su fruta #" + i);
            frutas[i] = Lector.next();

            if(frutas[i].equalsIgnoreCase("pera")){
                ++peras;
            }
            else if(frutas[i].equalsIgnoreCase("sandia")){
                ++sandias;
            }
            else if (frutas[i].equalsIgnoreCase("mango")) {
                ++mangos;
            }
            else if (frutas[i].equalsIgnoreCase("melon")) {
                ++melones;
            }
            else if (frutas[i].equalsIgnoreCase("chontaduro")) {
                ++chontaduros;
            }
            if (peras > sandias && peras > mangos && peras > melones && peras > chontaduros) {
                String Fruta_mas = "Peras";
                contador = peras;
                
                     System.out.println("La fruta que mas se repite es: " + Fruta_mas);
                    // System.out.println("Se repitio un total de: " + contador + " veces");
                
               
            }
            else if (sandias > peras && sandias > mangos && sandias > melones && sandias > chontaduros) {
                String Fruta_mas = "Sandias";
                contador = sandias;
               
                     System.out.println("La fruta que mas se repite es: " + Fruta_mas);
                     System.out.println("Se repitio un total de: " + contador + " veces");
                
               
            }
        else if (melones > sandias && melones > mangos && melones > peras && melones > chontaduros) {
            String Fruta_mas = "Melones";
            contador = melones;
           
                 System.out.println("La fruta que mas se repite es: " + Fruta_mas);
                 System.out.println("Se repitio un total de: " + contador + " veces");
            
            
        }
        else if (mangos > sandias && mangos > peras && mangos > melones && mangos > chontaduros) {
             String Fruta_mas = "Mangos";
            contador = mangos;
         
                 System.out.println("La fruta que mas se repite es: " + Fruta_mas);
                 System.out.println("Se repitio un total de: " + contador + " veces");
            
            
        }
        else if (chontaduros > sandias && chontaduros > peras && chontaduros > melones && chontaduros > mangos) {
            String Fruta_mas = "Chontaduros";
            contador = chontaduros;
                 System.out.println("La fruta que mas se repite es: " + Fruta_mas);
                 System.out.println("Se repitio un total de: " + contador + " veces");
            }


                
            
        }
        int Fruta_mas = contador;
        System.out.println("La fruta que se repite es: " + Fruta_mas);
        System.out.println("Se repitio: " + contador + " veces");
        
       Lector.close();
} 
    }
    
