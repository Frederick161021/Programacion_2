package PrimerSemestre;

public class Circulo {
private double radio=0;
public Circulo(){}
public Circulo (double r){
    setRadio(r);
}
public void setRadio(double r){
    if (r>0) {
        this.radio=r;
    }
    else{
        this.radio=0;
    }
}
public double getRadio(){
    return radio;
}

public double Perimetro(){
    return(radio*2)*Math.PI;
}
public double Area(){
    return (Math.PI*Math.pow(radio, 2));
}
public String toString(){
    return "El Perimetro del ciculo es de: "+Perimetro()+
            "\nEl Area del ciculo es de: "+Area();
}

public String getNombre(){
    return "ciculo";
}
}
