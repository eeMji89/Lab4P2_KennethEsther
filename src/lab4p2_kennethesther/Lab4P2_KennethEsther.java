
package lab4p2_kennethesther;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Lab4P2_KennethEsther {
static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       ArrayList <Jugadores> jugadores = new ArrayList();
       ArrayList <Vehiculos> vehiculos = new ArrayList();
        
       boolean flag = true;
        while (flag == true) {            
            System.out.println("MENU");
            System.out.println("0. Salir");
            System.out.println("1. Crear jugadores y equipos");
            System.out.println("2. Jugar");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Hola");
                case 1:
                   boolean crear = true;
                   String jug [] = {"Hernesto", "Carlos", "Andrés", "Momia", "Goku", "Hector", "Luis", "Rigoberto", "Kenneth", "Esther", "Cassidy", "Bloodhound", "Pedro", "Mario", "Naruto", "Pepe", "Orlando", "Max", "Jonathan", "Lobo"};
                   String veh [] = {"Ingrid", "Hola", "Adios", "Blood", "Hound", "Sombra", "Reinhard", "Mercy", "Bye", "Joseph", "Rigo", "No", "Si", "MaL", "Bien", "Lab", "Luigi", "Bayoneta", "Roblox", "Juan", "Orlando", "James", "Andrecito"};
                    while (crear == true) {                        
                        System.out.println("1. Crear jugadores");
                        System.out.println("2. Crear vehiculos");
                        System.out.println("3. Salir");
                        int opcion2 = lea.nextInt();
                        
                        switch (opcion2){
                            case 1:{
                                int pos, victorias = 0;                                                          
                                pos = r.nextInt(jug.length-1);
                                String nombre = jug[pos];
                                jugadores.add(new Jugadores(nombre, victorias));
                                System.out.println(jugadores);                                
                            }
                            break;
                            case 2:{
                                
                            }
                            break;
                            case 3:{
                                crear = false;
                            }
                            break;
                            default:
                                System.out.println("Hola");
                            
                        }// fin switch crear jugadores
                        
                    }
                    
                    break;
                case 2:
                    
                    break;
                    
            }
            
        }
        
        
        
    }
    
    
}
