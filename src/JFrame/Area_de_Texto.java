package JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Area_de_Texto extends JFrame implements ActionListener{
    
    JTextArea txNombres;
    JTextField nombre;
    JButton copiar;
    JLabel instruccion;
    Container p;
    JButton salir;
    public Area_de_Texto(){
        super ("Utilizando JTextArea");
        p=this.getContentPane();
        setLayout(new FlowLayout());
        instruccion= new JLabel("Escribe una linea de Texto, luego\"copiar\"");
        nombre=new JTextField(15);
        txNombres= new JTextArea();
        copiar= new JButton("copiar");
        salir= new JButton("Salir");
        txNombres.setBounds(20, 20, 200, 300);
        txNombres.setText("Estos son los nombre que has escrito");
        p.add(instruccion);
        p.add(nombre);
        p.add(copiar);
        p.add(txNombres);
        p.add(salir);
        copiar.addActionListener(this);
        salir.addActionListener(this);
        setSize(300,200);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==copiar){
            txNombres.append("\n"+nombre.getText());
        }
        if (e.getSource()==salir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Area_de_Texto AR = new Area_de_Texto();
        AR.setVisible(true);
    }
    
}
