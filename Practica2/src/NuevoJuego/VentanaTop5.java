package NuevoJuego;

//============ LIBRERIAS ===========
//AWT-SWING
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//============ PAQUETES ============
import Principal.Principal;
import practica2.Practica2;

public class VentanaTop5 extends JFrame implements ActionListener{
   Color fondoc = new Color(79,201,247);
   public static JButton bsalir;
   JLabel titulo, t1, t2, top1, mov1, top2, mov2, top3, mov3, top4, mov4, top5, mov5;
   public static Jugador[] arreglotemporal  = new Jugador[1000];
    //CONSTRUCTOR
    public VentanaTop5(){
        for (int i = 0; i < arreglotemporal.length; i++) {
            arreglotemporal[i] = Practica2.jugadores[i];
        }
        Practica2.ordenamientoJugadores(arreglotemporal);
        try {
            //LABEL TITULO
            titulo = new JLabel("TOP 5 ");
            titulo.setForeground(Color.YELLOW);
            titulo.setBounds(420, 50, 300, 50);
            titulo.setFont(new Font("Century Gothic", Font.BOLD, 40));
            titulo.setVisible(true);
            this.add(titulo);
            
            //LABEL 1
            titulo = new JLabel("Nombre");
            titulo.setForeground(Color.BLACK);
            titulo.setBounds(210, 105, 300, 30);
            titulo.setFont(new Font("Century Gothic", Font.BOLD, 25));
            titulo.setVisible(true);
            this.add(titulo);
            
            //LABEL 1
            titulo = new JLabel("Movimientos");
            titulo.setForeground(Color.BLACK);
            titulo.setBounds(580, 105, 300, 30);
            titulo.setFont(new Font("Century Gothic", Font.BOLD, 25));
            titulo.setVisible(true);
            this.add(titulo);
            
            //LABEL 1
            top1 = new JLabel();
            top1.setText("1. " + arreglotemporal[0].getNombre());
            top1.setForeground(Color.YELLOW);
            top1.setBounds(200, 150, 300, 40);
            top1.setFont(new Font("Century Gothic", Font.BOLD, 30));
            top1.setVisible(true);
            this.add(top1);
            
            //LABEL 1.1
            mov1 = new JLabel();
            mov1.setText(String.valueOf(arreglotemporal[0].getMovimientos()));
            mov1.setForeground(Color.YELLOW);
            mov1.setBounds(650, 150, 300, 40);
            mov1.setFont(new Font("Century Gothic", Font.BOLD, 30));
            mov1.setVisible(true);
            this.add(mov1);
            
            //LABEL 2
            top2 = new JLabel();
            top2.setText("2. " + arreglotemporal[1].getNombre());
            top2.setForeground(Color.GRAY);
            top2.setBounds(200, 220, 300, 40);
            top2.setFont(new Font("Century Gothic", Font.BOLD, 30));
            top2.setVisible(true);
            this.add(top2);
            
            //LABEL 2.1
            mov2 = new JLabel();
            mov2.setText(String.valueOf(arreglotemporal[1].getMovimientos()));
            mov2.setForeground(Color.GRAY);
            mov2.setBounds(650, 220, 300, 40);
            mov2.setFont(new Font("Century Gothic", Font.BOLD, 30));
            mov2.setVisible(true);
            this.add(mov2);

            //LABEL 3
            top3 = new JLabel();
            top3.setText("3. " + arreglotemporal[2].getNombre());
            top3.setForeground(Color.RED);
            top3.setBounds(200, 290, 300, 40);
            top3.setFont(new Font("Century Gothic", Font.BOLD, 30));
            top3.setVisible(true);
            this.add(top3);
            
            //LABEL 3.1
            mov3 = new JLabel();
            mov3.setText(String.valueOf(arreglotemporal[2].getMovimientos()));
            mov3.setForeground(Color.RED);
            mov3.setBounds(650, 290, 300, 40);
            mov3.setFont(new Font("Century Gothic", Font.BOLD, 30));
            mov3.setVisible(true);
            this.add(mov3);

            //LABEL 4
            top4 = new JLabel();
            top4.setText("4. " + arreglotemporal[3].getNombre());
            top4.setForeground(Color.BLACK);
            top4.setBounds(200, 360, 300, 40);
            top4.setFont(new Font("Century Gothic", Font.BOLD, 30));
            top4.setVisible(true);
            this.add(top4);
            
            //LABEL 4.1
            mov4 = new JLabel();
            mov4.setText(String.valueOf(arreglotemporal[3].getMovimientos()));
            mov4.setForeground(Color.BLACK);
            mov4.setBounds(650, 360, 300, 40);
            mov4.setFont(new Font("Century Gothic", Font.BOLD, 30));
            mov4.setVisible(true);
            this.add(mov4);

            //LABEL 5
            top5 = new JLabel();
            top5.setText("5. " + arreglotemporal[4].getNombre());
            top5.setForeground(Color.BLACK);
            top5.setBounds(200, 440, 300, 40);
            top5.setFont(new Font("Century Gothic", Font.BOLD, 30));
            top5.setVisible(true);
            this.add(top5);
            
            //LABEL 5.1
            mov5 = new JLabel();
            mov5.setText(String.valueOf(arreglotemporal[4].getMovimientos()));
            mov5.setForeground(Color.BLACK);
            mov5.setBounds(650, 440, 300, 40);
            mov5.setFont(new Font("Century Gothic", Font.BOLD, 30));
            mov5.setVisible(true);
            this.add(mov5);
        } catch (Exception e) {            
        }
        
        //BOTON SALIR
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
            this.dispose();
        }
    }
    
}
