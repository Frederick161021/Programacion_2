package PrimerSemestre;

public class Distancia {

    public static void main(String[] args) {
        Punto p1 = new Punto (2,0);
        Punto p2 = new Punto (7,20);
        Punto p3 = new Punto (6,10);
        Punto p4 = new Punto (6,2);
        Punto p5 = new Punto (2,0);
        Linea l1 = new Linea(p1,p2);
        Linea l2 = new Linea(p2,p3);
        Linea l3 = new Linea(p3,p4);
        Linea l4 = new Linea(p4,p5);
        double suma= l1.LongitudLinea()+l2.LongitudLinea()+l3.LongitudLinea()+l4.LongitudLinea();
        System.out.println("La distacia que recorrio el automovil es de: "+suma); 
    }
    
}
//Erick Toledo