package PrimerSemestre;
import java.util.Scanner;
public class Test_Linea {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Punto p = new Punto ();
        
        double x1,x2,x3, y1,y2,y3;
               
        System.out.println("Digite las cordenada X del primer punto: ");
        x1=s.nextDouble();
        System.out.println("Digite las cordenada Y del primer punto: ");
        y1=s.nextDouble();
        Punto p1 = new Punto(x1,y1);
        
        System.out.println("Digite las cordenada X del primer punto: ");
        x2=s.nextDouble();
        System.out.println("Digite las cordenada Y del primer punto: ");
        y2=s.nextDouble();
        Punto p2 = new Punto(x2,y2);
        
        Linea l = new Linea(p1,p2);
        Punto p3 = new Punto(5,18);
        
        System.out.println("El punto medio de la linea es: "+ p.PuntoMedio(p1, p2));
        System.out.println("La longitud de la linea es de: "+l.LongitudLinea());
        System.out.println("El punto (5,18) pertenece a la linea? = "+l.ComprobanteLinea(p3));
    }
    
}
