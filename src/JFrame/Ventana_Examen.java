package JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana_Examen extends JFrame {
    //Publics
    public JPanel panel;
    public JComboBox listaTablas;
    public String[] resultado = new String[10];
    public JTextArea cuadro;
    //JFrame
    public Ventana_Examen(){
        JFrame v=new JFrame("Examen");
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocation(400, 200);
        v.setSize(300, 250);
        v.setLayout(new GridLayout());
        iniciarComponentes();
        v.add(panel);
        v.setVisible(true);
    }
    //Inicia todos los metodos
    public void iniciarComponentes(){
        Paneles();
        Etiquetas();
        Tablas();
        Botones();
    }
    //JLabel
    public void Etiquetas(){
        JLabel etiqueta1 = new JLabel("Tablas:");
        etiqueta1.setBounds(35, 15, 50, 15);
        etiqueta1.setFont(new Font("arial",Font.ITALIC, 12));
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("El Resultado es:");
        etiqueta2.setBounds(150, 15, 100, 15);
        etiqueta2.setFont(new Font("arial",Font.ITALIC, 12));
        panel.add(etiqueta2);
    }
    //JPanel
    public void Paneles(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.cyan);
        this.getContentPane().add(panel);
    }
    //JComboBox
    public void Tablas(){
        String tablas [] = { "1","2","3","4","5","6","7","8","9","10"};
        listaTablas = new JComboBox(tablas);
        JScrollPane barraDesplazamiento = new JScrollPane(listaTablas);
        barraDesplazamiento.setBounds(10,30,90,40);
        listaTablas.setFont(new Font("new times roman",Font.ITALIC, 12));
        cuadro=new JTextArea();
        cuadro(0);
        ActionListener lista = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 int num= Integer.parseInt(listaTablas.getSelectedItem().toString());
                 cuadro(num);
                 cuadro.selectAll();
            }
        }; 
        listaTablas.addActionListener(lista);
        panel.add(barraDesplazamiento);
    }
    //JTextArea
    public void cuadro(int num){
         for (int i = 1; i <= 10; i++) {
                    resultado[i-1]=num+"*"+i+"="+num*i+"\n";
        }
        cuadro.replaceSelection(resultado[0]+resultado[1]+resultado[2]
                +resultado[3]+resultado[4]+resultado[5]+resultado[6]+resultado[7]
                +resultado[8]+resultado[9]);
        cuadro.setBounds(135,30,130,170);
        cuadro.setBackground(Color.white);
        cuadro.setFont(new Font("arial",Font.ITALIC, 14));
        panel.add(cuadro);
    }
    //JButton
    public void Botones(){
        JButton boton = new JButton("salir");
        boton.setBounds(20, 90, 80, 40);//x,y,l,h
        boton.setForeground(Color.blue);
        boton.setFont(new Font("cooper black",Font.ITALIC,12));//Tipo de letra, negrtia italica o cursiva,tamaño
        panel.add(boton);
        ActionListener salir = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                 System.exit(0);
            }
        };
        boton.addActionListener(salir);
    }
    //main class
    public static void main(String[] args) {
        new Ventana_Examen();
    } 
}
//Erick Ivan Toledo Galeana