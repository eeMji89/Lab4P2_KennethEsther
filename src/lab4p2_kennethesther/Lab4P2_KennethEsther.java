
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
         
      ArrayList Rojo = new ArrayList();
      ArrayList Azul = new ArrayList();

        
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
                                System.out.println("Cuantos jugadores desea crear:");
                                int v = lea.nextInt();
                                for (int i = 0; i < v; i++) {
                                int pos, victorias = 0;                                                          
                                pos = r.nextInt(jug.length-1);
                                String nombre = jug[pos];
                                jugadores.add(new Jugadores(nombre, victorias));
                                }                               
                                System.out.println(jugadores);                                
                            }
                            break;
                            case 2:{                               
                                System.out.println("Cuantos vehiculos desea crear:");
                                int v = lea.nextInt();
                                vehiculos = vealeatorios(vehiculos, v);
                                /*for (int i = 0; i < v; i++) {
                                                                                     
                                System.out.println("Que tipo de vehiculo quiere ser?");
                                System.out.println("1. Avion");
                                System.out.println("2. Barco");
                                System.out.println("3. Submarino");                              
                                int ve = lea.nextInt();
                                
                                switch(ve){
                                    
                                    case 1:{
                                        int pos, pos2;
                                        String color = "";
                                        pos = r.nextInt(veh.length - 1);
                                        int daño = 100 + r.nextInt(150);
                                        int vida = 500 + r.nextInt(1000);
                                        String nombre = veh[pos];
                                        pos = r.nextInt(jugadores.size() - 1);
                                        String nombrej = jug[pos];
                                        
                                                                             
                                        vehiculos.add(new Aviones(nombre, daño, 0, 0, vida, jugadores.get(pos), color));
                                        
                                     
                                        
                                        
                                        
                                    }
                                    break;
                                    case 2:{
                                        int pos, pos2;
                                        String color = "";
                                        pos = r.nextInt(veh.length - 1);
                                        int daño = 100 + r.nextInt(150);
                                        int vida = 500 + r.nextInt(1000);
                                        String nombre = veh[pos];
                                        pos = r.nextInt(jugadores.size() - 1);
                                        String nombrej = jug[pos];
                                        
                                                                             
                                        vehiculos.add(new Barcos(nombre, daño, 0, 0, vida, jugadores.get(pos), color));
                                        
                                       
                                    }
                                    break;
                                    case 3:{
                                        int pos, pos2;
                                        String color = "";
                                        pos = r.nextInt(veh.length - 1);
                                        int daño = 100 + r.nextInt(150);
                                        int vida = 500 + r.nextInt(1000);
                                        String nombre = veh[pos];
                                        pos = r.nextInt(jugadores.size() - 1);
                                        String nombrej = jug[pos];
                                        
                                                                             
                                        vehiculos.add(new Submarinos(nombre, daño, 0, 0, vida, jugadores.get(pos), color));
                                        
                                        System.out.println("");
                                    }
                                    break;
                                    
                                }
                                                                                                   
                            }*/
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
                    System.out.println("Cuantos jugadores tendra cada equipo?:");
                    int e = lea.nextInt();
                    
                    char [][]matriz= new char [5][5];
                    
                    
                    imprimirM(matriz);
                    matriz = Matrizj(matriz,e, vehiculos);
                    imprimirM(matriz);
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
            vehiculos.add(new Barcos(nombre, daño, 0, 0, vida, j, ""));

            }
            else if (vv==2) {
            vehiculos.add(new Aviones(nombre, daño, 0, 0, vida, j, ""));

            }
            else if (vv==3) {
           vehiculos.add(new Submarinos(nombre, daño, 0, 0, vida, j, ""));

            }

        }
        return ve;
    }
    
    public static void imprimirM(char[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static char [][] Matrizj(char [][]matriz,int e,ArrayList<Vehiculos>v){
        int vn = 0+r.nextInt(v.size()-1);
       int x=0, y=0;
        for (int i = 0; i < e; i++) {
            if (v.get(i) instanceof Barcos) {
                x= 0+r.nextInt(v.size()-1);
                y = 0+r.nextInt(v.size()-2);
                matriz[x][y]='B';
            }
            else if (v.get(i) instanceof Aviones) {
                x= 0+r.nextInt(v.size()-1);
                y = 0+r.nextInt(v.size()-1);
                matriz[x][y]='A';
            }
            else if (v.get(i) instanceof Submarinos) {
                x= 0+r.nextInt(v.size()-1);
                y = 1+r.nextInt(v.size()-1);
                matriz[x][y]='S';
            }  
        }
        for (int i = e; i <= v.size()-1; i++) {
            if (v.get(i) instanceof Barcos) {
                x= 0+r.nextInt(v.size()-1);
                y = 0+r.nextInt(v.size()-2);
                matriz[x][y]='b';
            }
            else if (v.get(i) instanceof Aviones) {
                x= 0+r.nextInt(v.size()-1);
                y = 0+r.nextInt(v.size()-1);
                matriz[x][y]='a';
            }
            else if (v.get(i) instanceof Submarinos) {
                x= 0+r.nextInt(v.size()-1);
                y = 1+r.nextInt(v.size()-1);
                matriz[x][y]='s';
            }  
        }
       return matriz; 
    }
    
    public static char [][]generarM(char [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=' ';
            }
        }
        return matriz;
    }
    
    public static char [][]Jugar(char [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]=='B') {
                    
                }
            }
        }
        return matriz;
    }
}
