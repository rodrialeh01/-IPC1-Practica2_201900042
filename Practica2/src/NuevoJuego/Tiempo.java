package NuevoJuego;

//============ LIBRERIAS ===========
//UTIL
import java.util.logging.Level;
import java.util.logging.Logger;
//AWT-SWING
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//============ PAQUETES ============
import Principal.Principal;

public class Tiempo extends Thread{
    //ATRIBUTOS
    private int segundos;
    JFrame ventana;
    
    //CONSTRUCTOR
    public Tiempo(int segundos, JFrame ventana) {
        this.segundos = segundos;
        this.ventana = ventana;
    }
    
    //VARIABLE GLOBAL PARA CONTROLAR EL HILO
    public static boolean estadot = true;
    
    //METODO RUN PARA EJECUTAR EL HILO
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
    
    //METODO PARA PARAR Y MATAR EL HILO
    public static void detener(){
        estadot = false;
    }
    
    //METODO PARA QUE EL HILO INICIE DE NUEVO
    public static void reiniciar(){
        estadot = true;
    }
}
