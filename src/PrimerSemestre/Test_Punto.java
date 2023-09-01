package PrimerSemestre;

public class Test_Punto {

    public static void main(String[] args) {
        Punto Pt1 = new Punto (0,0);
        Punto Pt2 = new Punto (5,3);
        Punto Pt3 = new Punto (2,-1);
        Punto Pt4 = Pt2.PuntoMedio(Pt3);
        
        System.out.println("Las coordenadas del Punto 1 son: "+Pt1.toString()+
               "\nLas coordenadas del Punto 2 son: "+Pt2.toString()+
                "\nLas coordenadas del Punto 3 son:"+Pt3.toString()+
                "\nLas coordenadas del Punto medio entre el punto 2 y del punto 3 son:"+
                Pt4);
    }
    
}
