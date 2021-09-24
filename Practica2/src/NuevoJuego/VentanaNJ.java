package NuevoJuego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaNJ extends JFrame implements ActionListener{
    Color fondoc = new Color(79,201,247);
    
    //CONSTRUCTOR
    public VentanaNJ(){
        //ICONO DE LA APLICACION
        setIconImage(new ImageIcon(getClass().getResource("torre.png")).getImage());
        
        //VENTANA DEL JUEGO
        this.setTitle("Torres de Hanoi | Nuevo Juego");
        this.setBounds(200,100,1000,550);
        this.getContentPane().setBackground(fondoc);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    //METODOS ABSTRACTOS
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }    
}
