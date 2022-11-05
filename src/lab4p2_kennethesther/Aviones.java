
package lab4p2_kennethesther;

import java.awt.Color;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Aviones extends Vehiculos {

    public Aviones() {
        super();
    }

    public Aviones(String nombre, int dano, int x, int y, int vida, Jugadores conductor, String color) {
        super(nombre, dano, x, y, vida, conductor, color);
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

    @Override
    public String toString() {
        return super.toString()+"Aviones{" + '}';
    }

    
    
    
    @Override
    public int jugada(int x,int y) {
       int o=0;
       return o;
    }

   
    
}
