package NuevoJuego;

import Principal.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaNJ extends JFrame implements ActionListener{
    Color fondoc = new Color(79,201,247);
    public static JLabel ltiempo, lmov, lctiempo, lcmov, lposte1, lposte2, lposte3;
    JButton i1, d1, i2, d2, i3, d3;
    public static JButton bsalir;
    public static int contador = 120;
    public static int cdiscos = 3;
    JButton[] disco = new JButton[cdiscos];
    public Tiempo t = new Tiempo(contador, this);
    //CONSTRUCTOR
    public VentanaNJ(){
        //LABEL DE TIEMPO
        ltiempo = new JLabel("Tiempo");
        ltiempo.setFont(new Font("Century Gothic", Font.BOLD,20));
        ltiempo.setBounds(50,20,100,30);
        ltiempo.setVisible(true);
        this.add(ltiempo);
        
        //LABEL DE CONTADOR DE MOVIMIENTOS
        lctiempo = new JLabel(String.valueOf(contador));
        lctiempo.setFont(new Font("Century Gothic", Font.BOLD,20));
        lctiempo.setBounds(65, 50, 100, 30);
        lctiempo.setVisible(true);
        this.add(lctiempo);
        
        //LABEL DE MOVIMIENTOS
        lmov = new JLabel("Movimientos");
        lmov.setFont(new Font("Century Gothic", Font.BOLD,20));
        lmov.setBounds(150,20,150,30);
        lmov.setVisible(true);
        this.add(lmov);
        
        //LABEL DE CONTADOR DE MOVIMIENTOS
        lcmov = new JLabel("000");
        lcmov.setFont(new Font("Century Gothic", Font.BOLD,20));
        lcmov.setBounds(190, 50, 100, 30);
        lcmov.setVisible(true);
        this.add(lcmov);
        
        Discos();
        
        //LABEL DE LA IMAGEN DEL POSTE 1
        Image imgep1 = new ImageIcon("Imagenes/poste.png").getImage();
        ImageIcon p1 = new ImageIcon(imgep1.getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        lposte1 = new JLabel(p1);
        lposte1.setLayout(null);
        lposte1.setBounds(100,150, 200, 300);
        lposte1.setVisible(true);
        this.add(lposte1);
        
        //BOTON DE IZQUIERDA POSTE 1
        Image imgepi1 = new ImageIcon("Imagenes/Boton6.png").getImage();
        ImageIcon pi1 = new ImageIcon(imgepi1.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
        i1 = new JButton(pi1);
        i1.setLayout(null);
        i1.setBorder(null);
        i1.setBounds(135,460, 50, 50);
        i1.setVisible(true);
        i1.addActionListener(this);
        this.add(i1);
        
        //BOTON DE DERECHA POSTE 1
        Image imgepd1 = new ImageIcon("Imagenes/Boton7.png").getImage();
        ImageIcon pd1 = new ImageIcon(imgepd1.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
        d1 = new JButton(pd1);
        d1.setLayout(null);
        d1.setBorder(null);
        d1.setBounds(205,460, 50, 50);
        d1.setVisible(true);
        d1.addActionListener(this);
        this.add(d1);
        
        //LABEL DE LA IMAGEN DEL POSTE 2
        Image imgep2 = new ImageIcon("Imagenes/poste.png").getImage();
        ImageIcon p2 = new ImageIcon(imgep2.getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        lposte2 = new JLabel(p2);
        lposte2.setLayout(null);
        lposte2.setBounds(400,150, 200, 300);
        lposte2.setVisible(true);
        this.add(lposte2);
        
        //BOTON DE IZQUIERDA POSTE 2
        Image imgepi2 = new ImageIcon("Imagenes/Boton6.png").getImage();
        ImageIcon pi2 = new ImageIcon(imgepi2.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
        i2 = new JButton(pi2);
        i2.setLayout(null);
        i2.setBorder(null);
        i2.setBounds(435,460, 50, 50);
        i2.setVisible(true);
        i2.addActionListener(this);
        this.add(i2);
        
        //BOTON DE DERECHA POSTE 2
        Image imgepd2 = new ImageIcon("Imagenes/Boton7.png").getImage();
        ImageIcon pd2 = new ImageIcon(imgepd2.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
        d2 = new JButton(pd2);
        d2.setLayout(null);
        d2.setBorder(null);
        d2.setBounds(505,460, 50, 50);
        d2.setVisible(true);
        d2.addActionListener(this);
        this.add(d2);
        
        //LABEL DE LA IMAGEN DEL POSTE 3
        Image imgep3 = new ImageIcon("Imagenes/poste.png").getImage();
        ImageIcon p3 = new ImageIcon(imgep3.getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        lposte3 = new JLabel(p3);
        lposte3.setLayout(null);
        lposte3.setBounds(700,150, 200, 300);
        lposte3.setVisible(true);
        this.add(lposte3);
        
        //BOTON DE IZQUIERDA POSTE 3
        Image imgepi3 = new ImageIcon("Imagenes/Boton6.png").getImage();
        ImageIcon pi3 = new ImageIcon(imgepi3.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
        i3 = new JButton(pi3);
        i3.setLayout(null);
        i3.setBorder(null);
        i3.setBounds(735,460, 50, 50);
        i3.setVisible(true);
        i3.addActionListener(this);
        this.add(i3);
        
        //BOTON DE DERECHA POSTE 3
        Image imgepd3 = new ImageIcon("Imagenes/Boton7.png").getImage();
        ImageIcon pd3 = new ImageIcon(imgepd3.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
        d3 = new JButton(pd3);
        d3.setLayout(null);
        d3.setBorder(null);
        d3.setBounds(805,460, 50, 50);
        d3.setVisible(true);
        d3.addActionListener(this);
        this.add(d3);
        
        //BOTON DE SALIR
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
        this.setTitle("Torres de Hanoi | Nuevo Juego");
        this.setBounds(200,100,1000,550);
        this.getContentPane().setBackground(fondoc);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    //DISCOS
    public void Discos(){
        for (int i = 0; i < disco.length; i++) {
            disco[i] = new JButton("" + (i+1));
            disco[i].setVisible(true);
            disco[i].setBounds((175-(20*i)), (380-(30*(disco.length-i-1))), (50 + (40*i)), 30);
            disco[i].setEnabled(false);
            disco[i].setBorderPainted(false);
            disco[i].setForeground(Color.BLACK);
            this.add(disco[i]);
        }
        //PONERLE COLOR A CADA BOTON:
        try {
            disco[0].setBackground(Color.RED);
            disco[1].setBackground(Color.BLUE);
            disco[2].setBackground(Color.YELLOW);
            disco[3].setBackground(Color.CYAN);
            disco[4].setBackground(Color.MAGENTA);
            disco[5].setBackground(Color.ORANGE);
            disco[6].setBackground(Color.PINK);
        } catch (Exception e) {

        }
    }
    
    //METODOS ABSTRACTOS
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== bsalir) {
            Principal p = new Principal();
            t.detener();
            this.dispose();
        }
    }

    public void failtiempo(){
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Se terminó el tiempo");
            Principal pr = new Principal();
            this.dispose();
        }
    }
}
