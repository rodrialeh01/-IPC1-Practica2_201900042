package JuegoAutomatico;

//==========LIBRERIAS==============
//THREAD
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Juego extends Thread{
    //ATRIBUTOS
    int discos;
    int poste_inicial;
    int poste_auxiliar;
    int poste_final;
    
    //CONSTRUCTOR
    public Juego(int discos, int poste_inicial,int poste_auxiliar, int poste_final) {
        this.discos = discos;
        this.poste_inicial = poste_inicial;
        this.poste_auxiliar = poste_auxiliar;
        this.poste_final = poste_final;
    }
    
    //VARIABLE GLOBAL PARA CONTROLAR EL HILO
    public static boolean estadoj = true;
    
    //METODO RUN PARA EJECUTAR EL HILO
    @Override
    public void run() {
        if(estadoj){
            try {
                hanoi(this.discos, this.poste_inicial, this.poste_final, this.poste_auxiliar);
                VentanaJA.ta.append("Se finalizó el juego");
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //METODO RECURSIVO DE LA SOLUCIÓN DEL ALGORITMO DE LAS TORRES DE HANOI
    public void hanoi(int n, int i, int f, int a) throws InterruptedException{
        if (n == 1) {
            VentanaJA.ta.append("Se movió el disco #" + n + " del poste #" + i + " al poste #" + f + "\n");
            VentanaJA.lcmov.setText(String.valueOf(VentanaJA.contador=VentanaJA.contador+1));
            sleep(1000);
        }else{
            hanoi(n-1,i,a,f);
            VentanaJA.ta.append("Se movió el disco #" + n + " del poste #" + i + " al poste #" + f + "\n");
            VentanaJA.lcmov.setText(String.valueOf(VentanaJA.contador=VentanaJA.contador+1));
            sleep(1000);
            hanoi(n-1,a,f,i);
        }
    }
    
    //METODO PARA DETENER EL HILO
    public static void detener(){
        estadoj = false;
    }
    
    //METODO PARA INICIAR EL HILO DE NUEVO
    public static void reiniciar(){
        estadoj = true; 
   }
}

