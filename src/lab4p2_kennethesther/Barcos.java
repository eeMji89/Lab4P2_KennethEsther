/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_kennethesther;

import java.awt.Color;

/**
 *
 * @author Kenneth
 */
public class Barcos extends Vehiculos{

    public Barcos() {
        super();
    }

    public Barcos(String nombre, int dano, int x, int y, int vida, Jugadores conductor, String color) {
        super(nombre, dano, x, y, vida, conductor, color);
    }
    

  

    @Override
    public String toString() {
        return "Barcos{" +super.toString()+ '}';
    }
    
}
