package Configuracion;

import Principal.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JuegoAutomatico.VentanaJA;
import NuevoJuego.VentanaNJ;

public class VentanaConfig extends JFrame implements ActionListener{
    Color fondoc = new Color(79,201,247);
    JComboBox cdiscos;
    JTextField tftiempo;
    JLabel titulo, ldiscos, ltiempo;
    JButton guardar, salir;
    
    //CONSTRUCTOR
    public VentanaConfig(){
        //JLABEL DE TITULO
        titulo = new JLabel("Configuración");
        titulo.setBounds(400,50,300,40);
        titulo.setFont(new Font("Century Gothic", Font.BOLD,30));
        titulo.setVisible(true);
        this.add(titulo);
        
        //JLALBEL DE DISCOS
        ldiscos = new JLabel("Cantidad de discos");
        ldiscos.setBounds(150,150,350,30);
        ldiscos.setFont(new Font("Century Gothic", Font.BOLD,25));
        this.add(ldiscos);
        
        //COMBOBOX DE LA CANTIDAD DE DISCOS
        int[] cantidad = {3,4,5,6,7};
        cdiscos = new JComboBox();
        for (int i = 0; i < cantidad.length; i++) {
            cdiscos.addItem(cantidad[i]);
        }
        cdiscos.setSelectedItem(VentanaJA.disc);
        cdiscos.setFont(new Font("Century Gothic", Font.PLAIN,15));
        cdiscos.setVisible(true);
        cdiscos.setBounds(100,200,350,30);
        this.add(cdiscos);
        
        //JLALBEL DE TIEMPO
        ltiempo = new JLabel("Tiempo de partida");
        ltiempo.setBounds(600,150,350,30);
        ltiempo.setFont(new Font("Century Gothic", Font.BOLD,25));
        this.add(ltiempo);
        
        //TEXTFIELD DEL TIEMPO
        tftiempo = new JTextField(String.valueOf(VentanaNJ.contador));
        tftiempo.setBounds(550,200,350,30);
        tftiempo.setVisible(true);
        tftiempo.setFont(new Font("Century Gothic", Font.PLAIN,15));
        this.add(tftiempo);
        
        //BOTON DE GUARDAR
        Image imgeb10 = new ImageIcon("Imagenes/Boton10.png").getImage();
        ImageIcon b10 = new ImageIcon(imgeb10.getScaledInstance(200, 50, Image.SCALE_SMOOTH));
        guardar = new JButton(b10);
        guardar.setBorder(null);
        guardar.setLayout(null);
        guardar.setBounds(400,400, 200, 50);
        guardar.setVisible(true);
        guardar.addActionListener(this);
        this.add(guardar);
        
        //BOTON DE SALIR
        Image imgeb5 = new ImageIcon("Imagenes/Boton5.png").getImage();
        ImageIcon b5 = new ImageIcon(imgeb5.getScaledInstance(140, 50, Image.SCALE_SMOOTH));
        salir = new JButton(b5);
        salir.setBorder(null);
        salir.setLayout(null);
        salir.setBounds(800,400, 100, 40);
        salir.setVisible(true);
        salir.addActionListener(this);
        this.add(salir);
        
        //ICONO DE LA APLICACION
        setIconImage(new ImageIcon(getClass().getResource("torre.png")).getImage());
        
        //VENTANA DEL JUEGO
        this.setTitle("Torres de Hanoi | Configuración");
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
        int time = Integer.parseInt(tftiempo.getText());
        if (ae.getSource()==salir) {
            Principal p = new Principal();
            this.dispose();
        }else if (ae.getSource()==guardar) {
            try {
                if (time > 0) {
                    VentanaJA.disc = (int) cdiscos.getSelectedItem();
                    VentanaNJ.contador = time;
                    VentanaNJ.cdiscos = (int) cdiscos.getSelectedItem();
                    JOptionPane.showMessageDialog(null, "Se guardarón los cambios exitosamente");
                    Principal p = new Principal();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un tiempo valido");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese un tiempo valido");
            }            
        }
    }    
}
