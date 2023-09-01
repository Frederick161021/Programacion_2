package PrimerSemestre;

public class OperacionesAritmeticas_TryCatch {
    public static int dividir (int m, int n){
    int resultado = 0;
    try{
    resultado = m/n;}
    catch(Exception e){
        System.out.println(e.toString());
    }
    return resultado;
}

public static int restar (int m, int n){
    int resta = m-n;
    return resta;
}
}
