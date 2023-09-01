package PrimerSemestre;

public class Punto {
    private double x;
    private double y;
    
    public Punto(){}
    public Punto(double X1, double Y1){
    setX(X1);
    setY(Y1);
    
}
    
    public void setX(double x1){
    this.x=x1;
}
    public void setY(double y1){
    this.y=y1;
}
    
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    
    public Punto PuntoMedio(double x2, double y2){
        double xm, ym;
        xm=(x+x2)/2;
        ym=(y+y2)/2;
        Punto m= new Punto(xm,ym);
        return m;
    }
    
    public Punto PuntoMedio(Punto P){
        double xm, ym;
        xm=(x+P.getX())/2;
        ym=(y+P.getY())/2;
        Punto m= new Punto(xm,ym);
        return m;
    }
    public Punto PuntoMedio (Punto P1,Punto p2){
        return P1.PuntoMedio(p2);
    }
    
    public String toString(){
        return"("+x+":"+y+")";
    }
}
