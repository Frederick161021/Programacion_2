package PrimerSemestre;

public class Test_Colegial {

    public static void main(String[] args) {
        Fecha fi = new Fecha(25,1,2000);
        Fecha fe = new Fecha(16,6,2004);
        
        Colegial c1 = new Colegial("Erick Toledo",17,19017291,fi,fe,93);
        System.out.println("Los datos del alumno son: "+c1.toString());
    }
    
}
