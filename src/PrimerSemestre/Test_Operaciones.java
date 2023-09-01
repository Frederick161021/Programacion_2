package PrimerSemestre;
import javax.swing.JOptionPane;
public class Test_Operaciones {

    public static void main(String[] args) {
        String mensaje="", mensaje2="";
        int opcion=0;
        double num1,num2;
        
        Operaciones OP = new Operaciones();
        
        mensaje="Menu:\n"+"1.Suma\n"+"2.Resta\n"+"3.Multiplicación\n"+
                "4.División\n"+"5.Salir del programa\n"+"Seleccione una opcion:";
        mensaje2= "Digite un numero:";
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                
            switch(opcion){
                case 1:
                    num1=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    num2=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    OP.suma(num1, num2);
                    JOptionPane.showMessageDialog(null,"El resultado es:"+OP.obtenerResultado());
                    break;
                case 2:
                    num1=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    num2=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    OP.resta(num1, num2);
                    JOptionPane.showMessageDialog(null,"El resultado es:"+OP.obtenerResultado());
                    break;
                case 3:
                    num1=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    num2=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    OP.multiplicacion(num1, num2);
                    JOptionPane.showMessageDialog(null,"El resultado es:"+OP.obtenerResultado());
                    break;
                case 4:
                    num1=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    num2=Double.parseDouble(JOptionPane.showInputDialog(mensaje2));
                    OP.division(num1, num2);
                    JOptionPane.showMessageDialog(null,"El resultado es:"+OP.obtenerResultado());
                    break;
                }
        }
        while(opcion!=5);
    }
}
