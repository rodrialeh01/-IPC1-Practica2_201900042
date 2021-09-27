package NuevoJuego;

import Principal.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Tiempo extends Thread{
    private int segundos;
    JFrame ventana;

    public Tiempo(int segundos, JFrame ventana) {
        this.segundos = segundos;
        this.ventana = ventana;
    }
    
    @Override
    public void run(){
        for (int i = this.segundos; i >=0; i--) {
            try {
                System.out.println(this.segundos);                
                sleep(1000);
                VentanaNJ.lctiempo.setText(String.valueOf(this.segundos));
                this.segundos--;
                if (this.segundos < 0) {
                    Principal p = new Principal();
                    this.ventana.dispose();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //ENCAPSULAMIENTO
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
