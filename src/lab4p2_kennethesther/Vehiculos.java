
package lab4p2_kennethesther;

import java.awt.Color;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Vehiculos{
    protected String nombre;
    protected int dano;
    protected int x;
    protected int y;
    protected int vida;
    protected Jugadores conductor;
    protected String color;

    public Vehiculos() {
    }

    public Vehiculos(String nombre, int dano, int x, int y, int vida, Jugadores conductor, String color) {
        this.nombre = nombre;
        this.dano = dano;
        this.x = x;
        this.y = y;
        this.vida = vida;
        this.conductor = conductor;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Jugadores getConductor() {
        return conductor;
    }

    public void setConductor(Jugadores conductor) {
        this.conductor = conductor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "nombre=" + nombre + ", dano=" + dano + ", x=" + x + ", y=" + y + ", vida=" + vida + ", conductor=" + conductor + ", color=" + color + '}';
    }

    
  
    
}
