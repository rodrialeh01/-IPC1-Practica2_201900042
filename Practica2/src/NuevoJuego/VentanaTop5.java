package NuevoJuego;

import Principal.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaTop5 extends JFrame implements ActionListener{
   Color fondoc = new Color(79,201,247);
   public static JButton bsalir;
   JLabel titulo, top1, top2, top3, top4, top5;
   
    //CONSTRUCTOR
    public VentanaTop5(){
        
        //LABEL 1
        top1 = new JLabel("TOP 5 ");
        top1.setForeground(Color.YELLOW);
        top1.setBounds(420,50,300,50);
        top1.setFont(new Font("Century Gothic", Font.BOLD,40));
        top1.setVisible(true);
        this.add(top1);
        
        //LABEL 1
        top1 = new JLabel("1. ");
        top1.setForeground(Color.YELLOW);
        top1.setBounds(300,150,300,40);
        top1.setFont(new Font("Century Gothic", Font.BOLD,30));
        top1.setVisible(true);
        this.add(top1);
        
        //LABEL 2
        top2 = new JLabel("2. ");
        top2.setForeground(Color.GRAY);
        top2.setBounds(300,220,300,40);
        top2.setFont(new Font("Century Gothic", Font.BOLD,30));
        top2.setVisible(true);
        this.add(top2);
        
        //LABEL 3
        top3 = new JLabel("3. ");
        top3.setForeground(Color.RED);
        top3.setBounds(300,290,300,40);
        top3.setFont(new Font("Century Gothic", Font.BOLD,30));
        top3.setVisible(true);
        this.add(top3);
        
        //LABEL 4
        top4 = new JLabel("4. ");
        top4.setForeground(Color.BLACK);
        top4.setBounds(300,360,300,40);
        top4.setFont(new Font("Century Gothic", Font.BOLD,30));
        top4.setVisible(true);
        this.add(top4);
        
        //LABEL 5
        top5 = new JLabel("5. ");
        top5.setForeground(Color.BLACK);
        top5.setBounds(300,440,300,40);
        top5.setFont(new Font("Century Gothic", Font.BOLD,30));
        top5.setVisible(true);
        this.add(top5);
        
        Image imgeexit = new ImageIcon("Imagenes/Boton5.png").getImage();
        ImageIcon pex = new ImageIcon(imgeexit.getScaledInstance(140, 40, Image.SCALE_SMOOTH));
        bsalir = new JButton(pex);
        bsalir.setBorder(null);
        bsalir.setLayout(null);
        bsalir.setBounds(800,30, 140, 40);
        bsalir.setVisible(true);
        bsalir.addActionListener(this);
        this.add(bsalir);
        
        //ICONO DE LA APLICACION
        setIconImage(new ImageIcon(getClass().getResource("torre.png")).getImage());
        
        //VENTANA DEL JUEGO
        this.setTitle("Torres de Hanoi | Top 5");
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
        if (ae.getSource()== bsalir) {
            Principal p = new Principal();
        }
    }
    
}
