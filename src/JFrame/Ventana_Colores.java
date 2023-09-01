package JFrame;
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class Ventana_Colores extends JFrame{
//
//    JButton rojo = new JButton ("rojo");
//    JButton azul = new JButton ("azul");
//    Container p;
//    
//    public Ventana_Colores(){
//        super("color de fondo creando una clase interna para manejar los eventos");
//        p=this.getContentPane();
//        setLayout(new FlowLayout());
//        add (rojo);
//        add(azul);
//        rojo.addActionListener(new OyenteRojo());
//        azul.addActionListener(new OyenteAzul());
//        setSize (200,200);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//    
//    //desarrolllo
//    class OyenteRojo implements ActionListener{
//    public void actionPerfomed(ActionEvent evento){
//        p.setBackground(Color.red);
//    }    
//    }
//    class OyenteAzul implements ActionListener{
//       public void actionPerfomed(ActionEvent evento){
//        p.setBackground(Color.blue);
//    }  
//    }
//    
//    public static void main(String[] args) {
//        Ventana_Colores ventana = new Ventana_Colores();
//    }
//    
//}
 import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;



public class Ventana_Colores extends JFrame{

JButton rojo = new JButton("Rojo");
JButton azul = new JButton("Azul");
Container p;

public Ventana_Colores(){
super("Color de Fondo");
p = this.getContentPane();
setLayout(new FlowLayout());
add(rojo);
add(azul);
rojo.addActionListener(new OyenteRojo());
azul.addActionListener(new OyenteAzul());
setSize(200,200);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}



class OyenteRojo implements ActionListener{
public void actionPerformed(ActionEvent evento){
p.setBackground(Color.red);
}
}

class OyenteAzul implements ActionListener{
public void actionPerformed(ActionEvent evento){
p.setBackground(Color.BLUE);
}
}



public static void main(String[] args) {
Ventana_Colores vce = new Ventana_Colores();
vce.setVisible(true);
}

}