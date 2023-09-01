import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Boletos_circo extends JFrame{

    final int COSTO=124;
    JTextField t1= new JTextField(3);
    JLabel lResultado = new JLabel("");
    JLabel Msg =new JLabel("");
    public Boletos_circo(){
    super("Compra de Boletos de Circo");
    JLabel l1= new JLabel("Costo del boleto: $124");
    JLabel l2= new JLabel("Total de boletos: ");
    JLabel l3= new JLabel("Total a pagar $:");

    JButton bt1 = new JButton();
    JButton bt2 = new JButton();
    Container cp = getContentPane();

    setLayout(new FlowLayout());
    add(l1);
    add(l3);
    add(t1);
    add(bt1);
    add(bt2);
    add(l3);
    add(lResultado);
    add(Msg);
    bt1.addActionListener(new Eventos());
    bt2.addActionListener(new Eventos2());
    setSize(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    class Eventos2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

    class Eventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        try{
                Msg.setText("");
                long resultado = Integer.parseInt(t1.getText())*COSTO;
                lResultado.setText(Long.toString(resultado));
            }
            catch(Exception ex){
            Msg.setText("Debes de primero escribir el total de boletos a pagar"+ex.toString());
        }
        }
    }
    public static void main(String[] args) {
        Boletos_circo bc = new Boletos_circo();
        bc.setVisible(true);
    }
}
