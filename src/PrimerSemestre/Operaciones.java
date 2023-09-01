package PrimerSemestre;

public class Operaciones {
private double numero1=0, numero2=0, resultado=0;

public Operaciones(){}
public Operaciones(double num1, double num2, double res){
    numero1=num1;
    numero2=num2;
    resultado=res;
}

public void suma(double numero1,double numero2){
    this.resultado=numero1+numero2; 
}

public void resta(double numero1,double numero2){
    this.resultado=numero1-numero2; 
}

public void division(double numero1,double numero2){
    this.resultado=numero1/numero2;
}

public void multiplicacion(double numero1,double numero2){
    this.resultado=numero1*numero2; 
}

public double obtenerResultado(){
    return resultado;
}
}
