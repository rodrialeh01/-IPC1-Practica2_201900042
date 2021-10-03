package practica2;
import NuevoJuego.Jugador;
import Principal.Principal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Practica2 {
    public static Jugador[] jugadores;
    public static int cjugadores = CantidadJugadores();
    static ObjectInputStream oiss,oisp,oisc,oisv,oisve;
    static ObjectOutputStream ooss,oosp,oosc,oosv,oosve;
    
    public static void AgregarJugador(Jugador jugador){
        if (cjugadores < jugadores.length) {
            jugadores[cjugadores] = jugador;
            cjugadores++;
        }
        EscribirJugadores(jugadores);
    }
    //METODO PARA MOSTRAR LOS SUCURSALES
    public static void LeerJugadores(){
        System.out.println("=====================================");
        System.out.println("==      LISTADO DE JUGADORES       ==");
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                jugadores[i].MostrarPlayers();
            }            
        }
        if (jugadores == null) {
            System.out.println("NO HAY SUCURSALES");
        }
    }

    public static void ordenamientoJugadores(Jugador[] player){
        try {
            for (int i = 1; i < player.length; i++){ 
                Jugador aux = player[i];
                int j = i - 1;
                while ((j >= 0) && (aux.getMovimientos() < player[j].getMovimientos())){  
                    player[j + 1] = player[j]; 
                    j--;
                }
                player[j + 1] = aux;
            }
        } catch (Exception e) {
        }
    }
    
    //METODO PARA CREAR EL ARCHIVO BINARIO PARA LA SERIALIZACION DE LOS PRODUCTOS
    public static void EscribirJugadores(Object objectp){
        try{
            oosp = new ObjectOutputStream(new FileOutputStream("Serializados/Jugadores.bin"));
            oosp.writeObject(objectp);
            oosp.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //METODO PARA ABRIR EL ARCHIVO BINARIO SERIALIZADO DONDE SE GUARDO LOS PRODUCTOS
    public static Object CargarJugadores(){
        Object object;
        try{
            oisp = new ObjectInputStream(new FileInputStream("Serializados/Jugadores.bin"));
            object = oisp.readObject();
            oisp.close();
            return object;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    //RETORNAR LA CANTIDAD DE CLIENTES QUE HAY
    public static int CantidadJugadores(){
        int contador = 0;
        try {
            for (int i = 0; i < 100; i++) {
                if (jugadores[i] != null) {
                    contador++;
                }
            }
        } catch (Exception e) {

        }
        return contador;
    } 
    
    public static void main(String[] args) {        
        jugadores =(Jugador[]) CargarJugadores();
        if (jugadores == null) {
            System.out.println("No ha sido creado el archivo Jugadores.bin");
            jugadores = new Jugador[1000];
            cjugadores = 0;
        }else{
            System.out.println("Se abrio correctamente");
            cjugadores = CantidadJugadores();
            System.out.println(cjugadores);
            LeerJugadores();
        }
        Principal p = new Principal();
    }
}
