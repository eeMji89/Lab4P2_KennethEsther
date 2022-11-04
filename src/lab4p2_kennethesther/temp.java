/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_kennethesther;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class temp {
    static Random r = new Random();
    public static char [][] jugar(char [][]matriz,ArrayList<Vehiculos>v, ArrayList<Vehiculos>ve){
        int vn = 0+r.nextInt(v.size()-1);
       int x=0, y=0;
        for (int i = 0; i < v.size()-1; i++) {
            if (v.get(i) instanceof Barcos) {
                x= 0+r.nextInt(v.size()-1);
                y = 1;
                matriz[x][y]='B';
            }
            else if (v.get(i) instanceof Aviones) {
                x= 0+r.nextInt(v.size()-1);
                y = 0+r.nextInt(v.size()-1);
                matriz[x][y]='A';
            }
            else if (v.get(i) instanceof Submarinos) {
                x= 0+r.nextInt(v.size()-1);
                y = 0;
                matriz[x][y]='S';
            }  
        }
        for (int i = 0; i < ve.size()-1; i++) {
            if (ve.get(i) instanceof Barcos) {
                x= 0+r.nextInt(v.size()-1);
                y = 8;
                matriz[x][y]='b';
            }
            else if (ve.get(i) instanceof Aviones) {
                x= 0+r.nextInt(v.size()-1);
                y = 0+r.nextInt(v.size()-1);
                matriz[x][y]='a';
            }
            else if (ve.get(i) instanceof Submarinos) {
                x= 0+r.nextInt(v.size()-1);
                y = 9;
                matriz[x][y]='s';
            }  
        }
       return matriz; 
    }
    
    public char [][]generarM(char [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=' ';
            }
        }
        return matriz;
    }
    
}
