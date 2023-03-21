import java.util.Scanner;

public class ejercicio13 {
  public static void main(String[] args) {

    System.out.println("Bienvenido a la agencia de viajes");

    Scanner Lector = new Scanner(System.in);
    
    System.out.println("cuantos boletos comprara?");
    int Cantidad_Bo=  Lector.nextInt();

    System.out.println("¿Todos se dirigen al mismo destino o lugar?");
    String Destino = Lector.next();

    if (Destino.equalsIgnoreCase("si")) {
        System.out.println("Digite su nombre por  favor");
        String Nombre = Lector.next();

        System.out.println("Seleccione su destino:");
        System.out.println("Turquia - 1500 USD");
        System.out.println("Cancun - 500 USD");
        System.out.println("Santorini - 2000 USD");
        System.out.println("Egipto - 1800 USD");
        String lugar_Des = Lector.next();

        int Convertidor = 0;
        int Total = 0;
        switch (lugar_Des) {
            case "turquia":

                Total=1500*Cantidad_Bo;
                Convertidor=Total*4900;

                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Convertidor + "COP");
                
            break;

            case  "cancun":
                Total=500*Cantidad_Bo;
                Convertidor=Total*4900;

                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Convertidor + "COP");

            break; 

            case "santorini":
                Total=2000*Cantidad_Bo;
                Convertidor=Total*4900;

                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Convertidor + "COP");

            break;

            case  "egipto":
                Total=1800*Cantidad_Bo;
                Convertidor=Total*4900;

                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Convertidor + "COP");
            break;       

        }
    } else {
        for (int i=1; i <= Cantidad_Bo; i++) {

          System.out.println("Digite su nombre por  favor");
        String Nombre = Lector.next();

        System.out.println("Seleccione su destino:");
        System.out.println("Turquia - 1500 USD");
        System.out.println("Cancun - 500 USD");
        System.out.println("Santorini - 2000 USD");
        System.out.println("Egipto - 1800 USD");
        String lugar_Des = Lector.next();
        
        int Total = 0;
          switch (lugar_Des) {
            case "turquia":
                Total=1500*4900;
       
                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Total + "COP");
            break;
            case  "cancun":
                Total=500*4900;
               
                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Total + "COP");
            break; 
            case "santorini":
                Total=2000*4900;
                
                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Total + "COP");
            break;
            case  "egipto":
                Total=1800*4900;
                
                System.out.println("Bienveido " + Nombre);
                System.out.println("Resumen: ");
                System.out.println("Destino: " + lugar_Des);
                System.out.println("Cantidad de boletos: " + Cantidad_Bo);
                System.out.println("Valor total: " + Total + "COP");
           
                break;
        }
        }
        
      
    }
    System.out.println("El total a pagar por todos los tiquetes es: "+ Convertidor);  
    Lector.close();
  }  
}
