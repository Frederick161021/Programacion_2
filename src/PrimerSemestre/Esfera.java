package PrimerSemestre;

public class Esfera extends Circulo {
    public Esfera(){}
    public  Esfera(double r){
        super(r);
    }
    public double getVolumen(){
        return 4/3*Math.PI*Math.pow(super.getRadio(), 3);
    }
    public String toString(){
        return "EL Volumen de la esfera es de: "+getVolumen();
    }
    public String Nombre(){
        return"Esfera";
    }
}
