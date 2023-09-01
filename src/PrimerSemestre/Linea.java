package PrimerSemestre;

public class Linea {
    private double Linea;
    private Punto Pa;
    private Punto Pb;
    private double longitud, restaX, restaY;
    private boolean CLinea;
    public Linea(){}
    public Linea(Punto a, Punto b){
         Pa =a; 
         Pb= b;
    }
    
    public double LongitudLinea(){
        double suma;
        restaX=Pb.getX()-Pa.getX();
        restaY=Pb.getY()-Pa.getY();
        suma=(Math.pow(restaX,2))+(Math.pow(restaY,2));
        return longitud =Math.sqrt(suma);
    }
    
    public boolean ComprobanteLinea(Punto P3){
        double m, ecuacion;
        m=restaY/restaX;
        ecuacion=(m*(P3.getX()-Pb.getX()))+(Pb.getY()-P3.getY());
        if (ecuacion==0){
            return CLinea=true;
        }
        else{
            return CLinea=false;
        }
    }
    
    public void setPuntoA(Punto a){
        this.Pa=a;
    }
    public void setPuntoB(Punto b){
        this.Pb=b;
    }
    
    public Punto getPuntoA(){
        return Pa;
    }
    public Punto getPuntoB(){
        return Pb;
    }
    public double getLinea(){
        return Linea;
    } 

}
