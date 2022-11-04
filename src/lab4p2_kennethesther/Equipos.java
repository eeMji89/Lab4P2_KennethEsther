
package lab4p2_kennethesther;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Equipos {
    protected Color color;
    protected int nvictoria;
    protected ArrayList <Vehiculos> vehiculos = new ArrayList();
    protected ArrayList<Jugadores> jugadores = new ArrayList();

    public Equipos() {
    }

    public Equipos(Color color, int nvictoria, ArrayList<Jugadores> jugadores) {
        this.color = color;
        this.nvictoria = nvictoria;
        this.jugadores = jugadores;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNvictoria() {
        return nvictoria;
    }

    public void setNvictoria(int nvictoria) {
        this.nvictoria = nvictoria;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipos{" + "color=" + color + ", nvictoria=" + nvictoria + ", vehiculos=" + vehiculos + ", jugadores=" + jugadores + '}';
    }
    
    
}
