package Principal;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Principal extends JFrame implements ActionListener{
    Color fondoc = new Color(79,201,247);
    JLabel titulo, imagenlados;
    JButton bnuevoj, bjuegoa, bconfig, btop5, bsalir; 
    //CONSTRUCTOR
    public Principal(){
        //BOTÓN DE NUEVO JUEGO
        Image imgeb1 = new ImageIcon("Imagenes/Boton1.png").getImage();
        ImageIcon ib1 = new ImageIcon(imgeb1.getScaledInstance(200, 60, Image.SCALE_SMOOTH));
        bnuevoj = new JButton(ib1);
        bnuevoj.setLayout(null);
        bnuevoj.setBounds(390,130, 200, 60);
        bnuevoj.setVisible(true);
        bnuevoj.addActionListener(this);
        this.add(bnuevoj);
        
        //BOTON JUEGO AUTOMATICO
        Image imgeb2 = new ImageIcon("Imagenes/Boton2.png").getImage();
        ImageIcon ib2 = new ImageIcon(imgeb2.getScaledInstance(200, 60, Image.SCALE_SMOOTH));
        bjuegoa = new JButton(ib2);
        bjuegoa.setLayout(null);
        bjuegoa.setBounds(390,230, 200, 60);
        bjuegoa.setVisible(true);
        bjuegoa.addActionListener(this);
        this.add(bjuegoa);
        
        //BOTON TOP 5
        Image imgeb3 = new ImageIcon("Imagenes/Boton3.png").getImage();
        ImageIcon ib3 = new ImageIcon(imgeb3.getScaledInstance(200, 60, Image.SCALE_SMOOTH));
        btop5 = new JButton(ib3);
        btop5.setLayout(null);
        btop5.setBounds(390,330,200, 60);
        btop5.setVisible(true);
        btop5.addActionListener(this);
        this.add(btop5);
        
        //BOTON CONFIGURACION
        Image imgeb4 = new ImageIcon("Imagenes/Boton4.png").getImage();
        ImageIcon ib4 = new ImageIcon(imgeb4.getScaledInstance(200, 60, Image.SCALE_SMOOTH));
        bconfig = new JButton(ib4);
        bconfig.setLayout(null);
        bconfig.setBounds(390,430, 200, 60);
        bconfig.setVisible(true);
        bconfig.addActionListener(this);
        this.add(bconfig);
        
        //BOTON CONFIGURACION
        Image imgeb5 = new ImageIcon("Imagenes/Boton5.png").getImage();
        ImageIcon ib5 = new ImageIcon(imgeb5.getScaledInstance(100, 30, Image.SCALE_SMOOTH));
        bsalir = new JButton(ib5);
        bsalir.setLayout(null);
        bsalir.setBounds(850,30, 100, 30);
        bsalir.setVisible(true);
        bsalir.addActionListener(this);
        this.add(bsalir);
        
        //LABEL CON IMAGEN DE LA TORRE DERECHA
        Image imgei = new ImageIcon("Imagenes/torre.png").getImage();
        ImageIcon ii = new ImageIcon(imgei.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        imagenlados = new JLabel(ii);
        imagenlados.setLayout(null);
        imagenlados.setBounds(750,300, 200, 200);
        imagenlados.setVisible(true);
        this.add(imagenlados);
        
        //LABEL CON IMAGEN DE LA TORRE IZQUIERDA
        imagenlados = new JLabel(ii);
        imagenlados.setLayout(null);
        imagenlados.setBounds(50,300, 200, 200);
        imagenlados.setVisible(true);
        this.add(imagenlados);
        
        //LABEL CON IMAGEN DE TITULO (POR LA TIPOGRAFIA)
        Image imgentitulo = new ImageIcon("Imagenes/titulo2.png").getImage();
        ImageIcon ititulo = new ImageIcon(imgentitulo.getScaledInstance(300, 50, Image.SCALE_SMOOTH));
        titulo = new JLabel(ititulo);
        titulo.setLayout(null);
        titulo.setBounds(200,50, 570, 50);
        titulo.setVisible(true);
        this.add(titulo);
        
        //VENTANA DEL MENU PRINCIPAL
        this.setTitle("Torres de Hanoi | Menú Principal");
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
        //BOTÓN JUEGO NUEVO
        if (ae.getSource()==bnuevoj) {
            
        }
        //BOTON JUEGO AUTOMÁTICO
        else if (ae.getSource()==bjuegoa) {
            
        }
        //BOTON TOP 5
        else if (ae.getSource()==btop5) {
            
        }
        //BOTON CONFIGURACIÓN
        else if (ae.getSource()==bconfig) {
            
        }
        //BOTON SALIR
        else if (ae.getSource()==bsalir) {
            System.exit(0);
        }
    }    
}
