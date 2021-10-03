package NuevoJuego;

import Principal.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tiempo extends Thread{
    private int segundos;
    JFrame ventana;

    public Tiempo(int segundos, JFrame ventana) {
        this.segundos = segundos;
        this.ventana = ventana;
    }
    public static boolean estadot = true;
    @Override
    public void run(){
        for (int i = this.segundos; i >=0; i--) {
            if (estadot) {
                try {
                    System.out.println(this.segundos);
                    sleep(1000);
                    VentanaNJ.lctiempo.setText(String.valueOf(this.segundos));
                    this.segundos--;
                    if (this.segundos < 0) {
                        JOptionPane.showMessageDialog(null, "!FAIL! Se terminó el tiempo D:");
                        Principal pr = new Principal();
                        this.ventana.dispose();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
        }
    }
    
    public static void detener(){
        estadot = false;
    }
    
    public static void reiniciar(){
        estadot = true;
    }
}
