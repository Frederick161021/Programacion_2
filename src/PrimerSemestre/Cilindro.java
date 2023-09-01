package PrimerSemestre;

public class Cilindro extends Circulo{
    private double altura=0;
public Cilindro(){}    
public Cilindro(double h, double r){
    super(r);
    setAltura(h);
}

public void setAltura(double h){
    if (h>0) {
        this.altura=h;
    }
    else{
        this.altura=0;
    }
}

public double getVolumen(){
    return super.Area()*altura;
}

public double getArea(){
    return (super.Area()*2)+(super.Perimetro()*altura);
}

public String toString(){
    return "El Volumen del cilindro es de: "+getVolumen()+
            "\nEl Area del cilindro es de: "+getArea()+
            "\nLa altura del cilindro es de: "+altura;
}
public String Nombre(){
    return "Cilindro";
}
}
