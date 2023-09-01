package Superponer;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class Capas extends JFrame{
    
    public Capas(){
    
        setSize(1200,600);
        setTitle("Super Poner");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    
    }
    
    public static void main(String[] ARGS){
    
        Capas ventana = new Capas();
        
        ventana.setVisible(true);
        
        JLayeredPane PanelBase = new JLayeredPane();
        
        PanelBase.setLayout(null);
        PanelBase.setBackground(Color.DARK_GRAY);
        PanelBase.setBounds(0, 0, 1200, 600);
        PanelBase.setOpaque(true);
        
        
        JPanel panelbajo = new JPanel();
        panelbajo.setSize(new Dimension(500, 100));
        panelbajo.setLocation(600 - (500/2), 300 - (100/2));
        panelbajo.setBackground(Color.yellow);
        PanelBase.add(panelbajo, new Integer(1));
        
        JPanel panelMedio = new JPanel();
        panelMedio.setSize(new Dimension(400, 100));
        panelMedio.setLocation(600 - (400/2), 300 - (100/2));
        panelMedio.setBackground(Color.red);
        PanelBase.add(panelMedio, new Integer(2));
        
        JPanel panelTop = new JPanel();
        panelTop.setSize(new Dimension(300, 100));
        panelTop.setLocation(600 - (300/2), 300 - (100/2));
        panelTop.setBackground(Color.BLUE);
        PanelBase.add(panelTop, new Integer(3));
        
        ventana.getContentPane().add(PanelBase);
        
    }
    
}
