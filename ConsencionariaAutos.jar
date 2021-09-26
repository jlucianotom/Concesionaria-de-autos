
package consencionariaautos;

import java.io.IOException;
import java.util.Scanner;

public class ConsencionariaAutos {

  
    public static void main(String[] args) throws IOException {
        
        Scanner sn = new Scanner(System.in);
       
        //FLOAT SELECION DE GAMA
        float precio;
        float SedánEconómico = (float) 18940.00;
        float Sedán = (float) 23570.00;
        float Deportivo = (float) 4100.00;
        float Híbrido = (float) 25100.00;
        float Coupe = (float) 19350.00;
        float CoupeDeportivo = (float) 24100.00;        
        float Compacto = (float) 16190.00;
        float Hatchback = (float) 20150.00;
        float EconómicoversiónRally = (float) 34700.00;
        
        //SELECCION DE AMENIDADES
        float Manual = (float) 00.00;
        float CVT = (float) 800.00;
        float ManualconTurbo = (float) 00.00;
        float CVTconTurbo = (float) 800.00;

        
        //COLOR DE PINTURA EXTERIOR
        float CosmicBlue = (float) 00.00;
        float BurgundyNight = (float) 00.00;
        float RallyeRed = (float) 00.00;
        float CrystalBlack = (float) 00.00;
        float ModernSteel = (float) 00.00;
        float TaffetaWhite = (float) 00.00;
        float EnergyGreen = (float) 00.00;
        float KonaCoffee = (float) 00.00;
        float OrangeFury = (float) 00.00;
        float HeliosYellow = (float) 00.00;
        float SonicGray = (float) 00.00;
        float PolishedMetal = (float) 00.00;
        
        //COLOR DE TAPICERIA 
        float GrayCloth = (float) 00.00;
        float BlackCloth = (float) 00.00;        
        float BlackGrayCloth = (float) 00.00;        
        float RedBlackSuedeEffectFabric = (float) 00.00;        
        
        //AROS
        float Pulgadas_15 = (float) 00.00;
        float Pulgadas_16 = (float) 00.00;        
        float Pulgadas_17 = (float) 1688.00;
        float Pulgadas_18 = (float) 1700.00;
        float Pulgadas_19 = (float) 3011.00;
        
        //ACCESORIOS EXTERIORES
        
        float BodySideMolding = (float) 217.00;
        float CarCover = (float) 230.00;
        float DecklidSpoiler = (float) 299.99;
        float DoorEdgeFilm = (float) 42.00;
        float DoorEdgeGuards = (float) 84.00;
        float DoorTrimChrome = (float) 285.00;
        float DoorVisor = (float) 185.00;
        float FrontFenderEmblems = (float) 50.00;
        float RearBumperApplique = (float) 70.00;
        float FoglLghts = (float) 325.00;
        float NoseMascs = (float) 158.00;
        float MoonrofVisor = (float) 135.00;
        float SplashGuardSet = (float) 104.00;
        float DustCover = (float) 350.00;
        float DoorMirrorCoverCarbonFiber = (float) 520.00;     
        
        //ACCESORIOS INTERIORES
        float AllSeasonsFloorMats = (float) 142.00;
        float AutomaticDimmingMirror = (float) 219.00;
        float CargoHook = (float) 12.00;
        float CargoNet = (float) 49.00;
        float ConsoleIllumination = (float) 250.00;
        float CargoOrganizer = (float) 87.00;
        float DoorPanelProtector = (float) 149.00;
        float ArmrestCompartiment = (float) 337.00;
        float DoorSillTrimIlluminated = (float) 290.00;
        float CargoCover = (float) 350.00;
        float CargoLiner = (float) 187.00;
        
        
        //ACCESORIOS ELECTRICOS
        float WirelessPhoneCharger = (float) 305.00;
        float USBCharger_2_1_Amp = (float) 120.00;
        float PuddleLight = (float) 185.00;
        float ParkingSensors = (float) 514.00;
       
        int opc, resp, respu;  
        do{
         System.out.println(" CONCESIONARIA DE AUTOS ");
            System.out.println(" Menu Principal ");
         System.out.println("1. Seleccionar Automovil");
         System.out.println("2. Salir ");
         opc = sn.nextInt();
         
         switch (opc){
             case 1 : 
                 System.out.println(" CONCESIONARIO DE AUTOS ");
                 System.out.println(" SELECCION DE GAMA DE VEHICULOS ");
                 GamaAutos();
                 break; 
             case 2:
                System.out.println("salio del la aplicacion ");
                System.exit(0); break;  
        }
                    
                    System.out.println("Deseas regresar al Menú principal          ");
                    System.out.println("    1)SI                    2)NO         ");
                    resp=sn.nextInt();
        }
    while(resp==1);
    }
         public static void GamaAutos (){
           
               Scanner sn = new Scanner(System.in);
           int opc = 0;
           String respuesta;
           do{
         System.out.println("");
         System.out.println("Ingrese la opcion que desee:");
         System.out.println("1) Sedan Economico");
         System.out.println("2) Sedán");
         System.out.println("3) Deportivo");
         System.out.println("4) Hibrido");
         System.out.println("5) Coupe");
         System.out.println("6) Coupe Deportivo");
         System.out.println("7) Compacto");
         System.out.println("8) Hatchback");
         System.out.println("9) Economico version Rally");
         System.out.println("10) Regresar al menu Principal");
         opc = sn.nextInt();
         switch (opc){
             case 1 :
                 System.out.println(" Ha seleccionado: Sedan Economico");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                 respuesta = sn.nextLine();
                 respuesta = sn.nextLine();
                 if (respuesta.equals ("Si")){
                     System.out.println("Ha seleccionado Sedan Economico");
                     SeleccionAmenidades();
                 
             }else
                 System.out.println("Gama seleccionada: Sedan Economico");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 18,940.00");
                 break;
             case 2: 
                 System.out.println(" Ha seleccionado: Sedan");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                 respuesta = sn.nextLine();
                 respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                     System.out.println("Ha seleccionado Sedan");
                     SeleccionAmenidades();
                 
             }else
                 System.out.println("Gama seleccionada: Sedan ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 23,570.00");
                 break;
             case 3:
                 System.out.println(" Ha seleccionado: Deportivo");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                 
             }else
                 System.out.println("Gama seleccionada: Deportivo ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 24,100.00");
                 break;
             case 4:
                 System.out.println(" Ha seleccionado: Hibrido");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                 System.out.println("Ha seleccionado Hibrido");
                     SeleccionAmenidades();
             }else
                 System.out.println("Gama seleccionada: Hibrido ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 25,100.00");
                 break;
             case 5:
                 System.out.println(" Ha seleccionado: Coupe");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                     System.out.println("Ha seleccionado Coupe");
                     SeleccionAmenidades();
                 
             }else
                 System.out.println("Gama seleccionada: Coupe ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 19,350.00");
                 break;
             case 6:
                 System.out.println(" Ha seleccionado: Coupe Deportivo");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                 System.out.println("Ha seleccionado Coupe Deportivo");
                     SeleccionAmenidades();
             }else
                 System.out.println("Gama seleccionada: Coupe Deportivo ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 24,100.00");
                 break;
             case 7:
                 System.out.println(" Ha seleccionado: Compacto");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                     System.out.println("Ha seleccionado Compacto");
                     SeleccionAmenidades();
                 
             }else
                 System.out.println("Gama seleccionada: Compacto ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 16,190.00");
                 break;
             case 8:
                 System.out.println(" Ha seleccionado: Hatchback");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                     System.out.println("Ha seleccionado Hatchback");
                     SeleccionAmenidades();
                 
             }else
                 System.out.println("Gama seleccionada: Hatchback ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 20,150.00");
                 break;
             case 9:
                 System.out.println(" Ha seleccionado: Economico version Rally");
                 System.out.println("¿ Desea agregar amenidades?(si/no)");
                  respuesta = sn.nextLine();
                  respuesta = sn.nextLine();
                 if (respuesta.equals ("si")){
                     System.out.println("Ha seleccionado Economico version Rally");
                     SeleccionAmenidades();
                     
             }else
                 System.out.println("Gama seleccionada: Economico version Rally ");
                 System.out.println("Amenidades: Ninguna ");
                 System.out.println("Total                US$ 34,700.00");
                 break;
         }
               System.out.println("----------------------------------------------");
          System.out.println("Deseas regresar al Menú principal          ");
                    System.out.println("    1)SI                    2)NO         ");
                    opc=sn.nextInt();
         
           }while (opc == 1);
    
         
         public static void SeleccionAmenidades (){
             Scanner sn = new Scanner(System.in);
             int op = 0;
             
             System.out.println(" Tipos de Amenidades");
             System.out.println("1- Tipo de Transmición.");
             System.out.println("2- Color de Pintura exterior.");
             System.out.println("3- Aros");
             System.out.println("4- Accesorios exteriores.");
             System.out.println("5- Accesorios interiores");
             System.out.println("6- Accesorios electronicos");
             System.out.println("7- Regresar a la selección de Gama de Vehiculo");
             op = sn.nextInt();
         }
}
}
}
   
    

