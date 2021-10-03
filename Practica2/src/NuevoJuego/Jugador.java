package NuevoJuego;

import java.io.Serializable;

public class Jugador implements Serializable{
    //ATRIBUTOS
    private String nombre;
    private int tiempo;
    private int movimientos;
    
    //CONSTRUCTOR
    public Jugador(String nombre, int tiempo, int movimientos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.movimientos = movimientos;
    }
    
    //METODO PARA MOSTRAR LOS OBJETOS
    public void MostrarPlayers(){
        System.out.println("===================================");
        System.out.println("==            JUGADORES          ==");
        System.out.println("Nombre: " + nombre);
        System.out.println("Movimientos: " + movimientos);
        System.out.println("Tiempo: " + tiempo);
    }
    
    //ENCAPSULAMIENTO
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the movimientos
     */
    public int getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }
}
