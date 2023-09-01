package PrimerSemestre;

public class Test_OperacionesAritmeticas {

    public static void main(String[] args) {
//        OperacionesAritmeticas OA = new OperacionesAritmeticas();
//        System.out.println(OA.dividir(3,0));
        OperacionesAritmeticas_TryCatch OA = new OperacionesAritmeticas_TryCatch();
        System.out.println(OA.dividir(3,0));
        System.out.println("Continuacion del prgrama\n"+OA.restar(3,0));
    }
    
}
