
package lab4p2_kennethesther;

import java.awt.Color;
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
static String jug [] = {"Hernesto", "Carlos", "Andrés", "Momia", "Goku", "Hector", "Luis", "Rigoberto", "Kenneth", "Esther", "Cassidy", "Bloodhound", "Pedro", "Mario", "Naruto", "Pepe", "Orlando", "Max", "Jonathan", "Lobo"};
static String veh [] = {"Ingrid", "Hola", "Adios", "Blood", "Hound", "Sombra", "Reinhard", "Mercy", "Bye", "Joseph", "Rigo", "No", "Si", "MaL", "Bien", "Lab", "Luigi", "Bayoneta", "Roblox", "Juan", "Orlando", "James", "Andrecito"};
static ArrayList <Jugadores> jugadores = new ArrayList();
       static ArrayList <Vehiculos> vehiculos = new ArrayList();    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      
        
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
                  
                    while (crear == true) {   
                        System.out.println("");
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
                                
                                System.out.println("Cuantos vehiculos desea crear:");
                                int v = lea.nextInt();
                                int cont =0;
                                for (int i = 0; i < v; i++) {
                                int pos;                                                       
                                pos = r.nextInt(veh.length-1);
                                int daño= 100+r.nextInt(150);
                                int vida= 500+r.nextInt(1000);
                                String nombre= veh[pos];
                                Jugadores j= new Jugadores();
                                j= jugadores.get(cont);
                                vehiculos.add(new Vehiculos(nombre, daño, 0, 0, vida, j, Color.yellow));
                                                                                                   
                            }
                                System.out.println(vehiculos);
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
    public static ArrayList vealeatorios(ArrayList<Vehiculos> ve,int v){
        int cont =0,vv=0;
        for (int i = 0; i < v; i++) {
            int pos;   
            vv= 1+r.nextInt(3);
            pos = r.nextInt(veh.length - 1);
            int daño = 100 + r.nextInt(150);
            int vida = 500 + r.nextInt(1000);
            
            String nombre = veh[pos];
            Jugadores j = new Jugadores();
            j = jugadores.get(cont);
            if (vv==1) {
            vehiculos.add(new Barcos(nombre, daño, 0, 0, vida, j, Color.yellow));

            }
            else if (vv==2) {
            vehiculos.add(new Aviones(nombre, daño, 0, 0, vida, j, Color.yellow));

            }
            else if (vv==3) {
           vehiculos.add(new Submarinos(nombre, daño, 0, 0, vida, j, Color.yellow));

            }

        }
        return ve;
    }
    
    
}
