package JuegoAutomatico;

import Principal.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaJA extends JFrame implements ActionListener{
    Color fondoc = new Color(79,201,247);
    static TextArea ta;
    static int contador = 0;
    public static JLabel titulo, ldisc, lcdisc, lmov, lcmov;
    public static int disc = 3;
    JButton biniciar, bregresar;
    
    //CONSTRUCTOR
    public VentanaJA(){       
        //LABEL DE TITULO
        titulo = new JLabel("Juego Automático");
        titulo.setFont(new Font("Century Gothic", Font.BOLD,30));
        titulo.setBounds(370,20,300,35);
        titulo.setVisible(true);
        this.add(titulo);
        
        //LABEL DE DISCO
        ldisc = new JLabel("Discos");
        ldisc.setFont(new Font("Century Gothic", Font.BOLD,20));
        ldisc.setBounds(130,80,100,30);
        ldisc.setVisible(true);
        this.add(ldisc);
        
        //LABEL DE CONTADOR DE DISCOS
        lcdisc = new JLabel(String.valueOf(disc));
        lcdisc.setFont(new Font("Century Gothic", Font.BOLD,20));
        lcdisc.setBounds(155,110,100,30);
        lcdisc.setVisible(true);
        this.add(lcdisc);
        
        //LABEL DE MOVIMIENTOS
        lmov = new JLabel("Movimientos");
        lmov.setFont(new Font("Century Gothic", Font.BOLD,20));
        lmov.setBounds(230,80,150,30);
        lmov.setVisible(true);
        this.add(lmov);
        
        //LABEL DE CONTADOR DE MOVIMIENTOS
        lcmov = new JLabel(String.valueOf(contador));
        lcmov.setFont(new Font("Century Gothic", Font.BOLD,20));
        lcmov.setBounds(280, 110, 100, 30);
        lcmov.setVisible(true);
        this.add(lcmov);
        
        //TEXTAREA
        ta = new TextArea();
        ta.setBounds(100, 150, 800, 250);
        ta.setVisible(true);
        ta.setEditable(false);
        ta.setFont(new Font("Century Gothic", Font.PLAIN,15));
        this.add(ta);
        
        //BOTON INICIAR
        Image imgeb8 = new ImageIcon("Imagenes/Boton8.png").getImage();
        ImageIcon b8 = new ImageIcon(imgeb8.getScaledInstance(140, 40, Image.SCALE_SMOOTH));
        biniciar = new JButton(b8);
        biniciar.setBorder(null);
        biniciar.setLayout(null);
        biniciar.setBounds(600,450, 140, 40);
        biniciar.setVisible(true);
        biniciar.addActionListener(this);
        this.add(biniciar);
        
        //BOTON REGRESAR
        Image imgeb9 = new ImageIcon("Imagenes/Boton9.png").getImage();
        ImageIcon b9 = new ImageIcon(imgeb9.getScaledInstance(140, 40, Image.SCALE_SMOOTH));
        bregresar = new JButton(b9);
        bregresar.setBorder(null);
        bregresar.setLayout(null);
        bregresar.setBounds(800,450, 140, 40);
        bregresar.setVisible(true);
        bregresar.addActionListener(this);
        this.add(bregresar);
        
        //ICONO DE LA APLICACION
        setIconImage(new ImageIcon(getClass().getResource("torre.png")).getImage());
        
        //VENTANA DEL JUEGO
        this.setTitle("Torres de Hanoi | Juego Automático");
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
        int discos = Integer.parseInt(lcdisc.getText()); 
        Juego j = new Juego(discos,1,2,3);
        contador = 0;
        if (ae.getSource() == biniciar) {
            contador = 0;
            ta.setText("");
            j.start();
            j.reiniciar();
        }else if(ae.getSource() == bregresar) {
            contador = 0;
            j.detener();
            Principal p = new Principal();            
            this.dispose();
        }
    }    
}
