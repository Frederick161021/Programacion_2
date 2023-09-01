package PrimerSemestre;

public class Test_Persona {

    public static void main(String[] args) {
        Fecha fn = new Fecha(15,7,2003);
        Persona per1 = new Persona("Erick Toledo",17,1.70,fn);
        System.out.println("Los datos de la persona :"+per1.getDatos());
        per1.setFecha(25, 6, 2004);
        System.out.println("Los datos de la persona ahora son:\n"+per1.getDatos());
    }
}
