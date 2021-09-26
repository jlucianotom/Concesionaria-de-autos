/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author j.menchu
 */
public class Dato1 {

    private static int option;

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        //DECLARACIONES PARA EL CODIGO
       
        boolean salir = false;
        int opcion;
        
        while (!salir) {  
        System.out.println("CONSECIONARIO DE AUTOS MENU PRINCIPAL: ");
        System.out.println("----------------------------------------/n");
        System.out.println("1. Seleciona automóvil");
        System.out.println("2. Salir");
        System.out.println("Ingrese el numero de la opción que Desea");              
        opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Selecione automovil");
                    break;
                case 2:
                    System.out.println("Ha salido del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            switch (opcion) {
                case 1:
                //SELECCION DE GAMA// 
                System.out.println("GAMA DE VEHICULOS: ");
                System.out.println("----------------------------------------");
                System.out.println("1. Sedán Económico: "+SedánEconómico);
                System.out.println("2. Sedán:");
                System.out.println("3. Deportivo:");
                System.out.println("4. Híbrido:");
                System.out.println("5. Coupe:");
                System.out.println("6. Coupe Deportivo:");
                System.out.println("7. Compacto:");
                System.out.println("8. Hatchback: ");
                System.out.println("9. Económico versión Rally:");
                System.out.println("10.Regresar al menu principal");
                System.out.println("Ingrese el numero de la opción que Desea");
                opcion = sn.nextInt();
        
                switch (opcion) {
                    case 1:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;

                    case 2:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;
                    case 3:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;                        
                    case 4:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;
                    case 5:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;                        
                     case 6:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;
                    case 7:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;                        
                    case 8:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;                        
                    case 9:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1: SI");
                        System.out.println("2: NO");
                        opcion = sn.nextInt();
                        break;                        
                    case 10:
                        //SELECCIONA AMENIDAD SI O NO//
                        System.out.println("DESEA SELECCIONAR AMENIDADES SI/NO: ");
                        System.out.println("----------------------------------------");
               
                }
                
                switch (opcion) {
                    case 1:
                        System.out.println("----------------------------------------");
                        System.out.println("SELECIONA AMENIDADES: ");
                    case 2:    
                        System.out.println("1.Tipo de Transmición");    
                    case 3:    
                        System.out.println("2.Color de Pintura Exterior");    
                    case 4:    
                        System.out.println("3.Aros");
                    case 5:    
                        System.out.println("4.Accesorios Exteriores");
                    case 6:    
                        System.out.println("5.Accesorios Interiores");
                    case 7:    
                        System.out.println("6.Accesorios Electricos");        
                    case 8:    
                        System.out.println("7.Regresar a la seleccion de Gama de Vehículos");
                        
                        System.out.println("Ingrese el numero de la opción que Desea");
                    opcion = sn.nextInt();
                        break;
                 
                }
                    
                      
                }
                switch (opcion) {
                    case 1:
                        System.out.println("DECLRACIÓN DE AMENIDADES: ");
                        System.out.println("----------------------------------------");
                        System.out.println("SELECIONA AMENIDADES: ");
                    case 2:    
                        System.out.println("1.Tipo de Transmición");    
                    case 3:    
                        System.out.println("2.Color de Pintura Exterior");    
                    case 4:    
                        System.out.println("3.Aros");
                    case 5:    
                        System.out.println("4.Accesorios Exteriores");
                    case 6:    
                        System.out.println("5.Accesorios Interiores");
                    case 7:    
                        System.out.println("6.Accesorios Electricos");        
                    case 8:    
                        System.out.println("7.Regresar a la seleccion de Gama de Vehículos");
                        
                        System.out.println("Ingrese el numero de la opción que Desea");
                    opcion = sn.nextInt();
                        break;
                
        
                  switch (opcion) {  
                    case 1:
                        //*TIPO DE TRANSMICIÓN*//
                        System.out.println("SELECCIONE TIPO DE TRANSMICION: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1. Manual");
                    case 2:
                        System.out.println("2. CVT");
                    case 3:
                        System.out.println("3. Manual con Turbo");
                    case 4:    
                        System.out.println("4. CVT con Turbo");
                    case 5:    
                        System.out.println("5. Regresar");
                        System.out.println("Ingrese el numero de la opción que Desea \n"); 
                        opcion = sn.nextInt(); 
                  
                  
                switch (opcion) {
                    case 2:
                        /*COLOR DE TAPICERIA*/
                        System.out.println("COLOR DE TAPICERIA: ");
                        System.out.println("----------------------------------------");    
                        System.out.println("1. Gray Cloth");
                        System.out.println("2. Black Cloth");
                        System.out.println("3. Black/Gray Cloth");
                        System.out.println("4. Red/Black Suede Effect-Fabric");
                        System.out.println("5. Regresar");
                        System.out.println("Ingrese el numero de la opción que Desea");
                        opcion = sn.nextInt();     
               
                }
                
                switch (opcion) {
                    case 1:    
                        /*NUMERO DE PULGADAS*/
                       System.out.println("SELECIONE EL ARO PARA SU VEHICULO: ");
                       System.out.println("----------------------------------------");   
                       System.out.println("1. 15”");
                       System.out.println("2. 16”");   
                       System.out.println("3. 17");
                       System.out.println("4. 18”");
                       System.out.println("5. 19”");
                       System.out.println("6. Regresar");
                       System.out.println("Ingrese el numero de la opción que Desea");
                       opcion = sn.nextInt();
                }       
                switch (opcion) {
                    case 1:
                        //ACCESORIO PARA SU VEHICULO//
                        System.out.println("SELECIONE EL ACCESORIO PARA SU VEHICULO: ");
                        System.out.println("----------------------------------------");      
                        System.out.println("1. Body Side Molding");
                        System.out.println("2. Car Cover");
                        System.out.println("3. Decklid Spoiler");
                        System.out.println("4. Door Edge Film");
                        System.out.println("5. Door Edge Guards");
                        System.out.println("6. Door Trim Chrome");
                        System.out.println("7. Door Visor");
                        System.out.println("8. Front Fender Emblems");
                        System.out.println("9. Rear Bumper Applique");
                        System.out.println("10. Fog Lights");
                        System.out.println("11. Nose Mascs");
                        System.out.println("12. Moonrof Visor");
                        System.out.println("13. Splash Guard Set");
                        System.out.println("14. Dust Cover");
                        System.out.println("15. Door Mirror Cover - Carbon Fiber");        
                        System.out.println("16. Regresar");   
                        System.out.println("Ingrese el numero de la opción que Desea");
                        opcion = sn.nextInt();
                }
                        
                switch (opcion) {
                    case 1:        
                        //ACCESORIO PARA EL INTERIOR//
                        System.out.println("SELECIONE ACCESORIO PARA EL INTERIOR: ");
                        System.out.println("----------------------------------------");      
                        System.out.println("1. All-Seasons Floor Mats");
                        System.out.println("2. Automatic-Dimming Mirror");
                        System.out.println("3. Cargo Hook");
                        System.out.println("4. Cargo Net");
                        System.out.println("5. Console Illumination");
                        System.out.println("6. Cargo Organizer");
                        System.out.println("7. Door Panel Protector");
                        System.out.println("8. Armrest Compartiment");
                        System.out.println("9. Door Sill Trim-Illuminated");
                        System.out.println("10. Cargo Cover");
                        System.out.println("11. Cargo Liner");
                        System.out.println("12. Regresar");
                        System.out.println("Ingrese el numero de la opción que Desea");
                        opcion = sn.nextInt();
                }
                        
                switch (opcion) {
                    case 1:
                        /*ACCESORIOS ELECTRICOS*/
                        System.out.println("SELECIONE EL ACCESORIO ELECTRICO: ");
                        System.out.println("----------------------------------------");      
                        System.out.println("1. Wireless Phone Charger");
                        System.out.println("2. USB Charger - 2.1 Amp.");
                        System.out.println("3. Puddle Light");
                        System.out.println("4. Parking Sensors");
                        System.out.println("5. Regresar");
                        System.out.println("Ingrese el numero de la opción que Desea");
                        opcion = sn.nextInt();
                        break;
                }
                  }
                                         
                    
                    
                    
                        
    
                }
            
            }//SWITCH
        
     
        System.out.println("Debes introducir un numero");
        salir = true;
        sn.next();
                }
    } 
    }//MAIN
    
   // System.out.println("Fin del menu");
