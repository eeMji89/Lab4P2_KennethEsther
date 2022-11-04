/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_kennethesther;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Jugadores {
    
    protected String nombre;
    protected int victorias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", victorias=" + victorias + '}';
    }
    
    
}
