
package lab4p2_kennethesther;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Lab4P2_KennethEsther {
static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       ArrayList <Jugadores> jugadores = new ArrayList();
       ArrayList <Vehiculos> vehiculos = new ArrayList();
        
       boolean flag = false;
        while (flag== false) {            
            System.out.println("MENU");
            System.out.println("0. Salir");
            System.out.println("1. Crear jugadores y equipos");
            System.out.println("2. Jugar");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 0:
                    
                    break;
                case 1:
                   boolean crear = false;
                    while (crear == true) {                        
                        System.out.println("1. Crear un jugador");
                        System.out.println("2. Crear un vehiculo");
                        System.out.println("3. Salir");
                        int opcion2 = lea.nextInt();
                        
                        switch (opcion2){
                            case 1:{
                                
                            }
                            break;
                            case 2:{
                                
                            }
                            break;
                            case 3:{
                                
                            }
                            break;
                            
                            
                        }
                        
                    }
                    
                    break;
                case 2:
                    break;
                    
                default:
                    
            }
            
        }
        
        
        
    }
    
    
}
