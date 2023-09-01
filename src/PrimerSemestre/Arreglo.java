package PrimerSemestre;
import java.util.Scanner;
public class Arreglo {
    Scanner s = new Scanner (System.in); 
    private int[] a;
    private int t;
    
   public Arreglo(){}
   
   public Arreglo(int a, int a1, int a2,int a3,int a4, int a5,int a6){
       
   }
   
   public void llenar(){
       System.out.println("Digite cuantas variables quiere guardar en el arreglo:");
       this.t=s.nextInt();
       a = new int[t];
       for (int i = 0; i < a.length; i++) {
           System.out.println("Digite un valor del arreglo: ");   
           this.a[i]=s.nextInt();
       }
   }
   
   public void imprimirArreglo(){
       System.out.println("Los valores del arreglo son: ");
       for (int s = 0; s < a.length; s++) {
           System.out.println(a[s]+"\n");
       }
   }    
   
   public void imprimirEnOrdenInverso(){
        System.out.println("Los valores del arreglo pero inversamente son: ");
        for (int r = a.length-1; r >= 0; r--) {
            System.out.println(a[r]+"\n");
       }
   }
   
   public void obtenerElMayorDelArreglo(){
       int arregloMayor=a[0];
       for (int M = 0; M < a.length; M++) {
           if (arregloMayor<a[M]){
               arregloMayor=a[M];
           }
       }
     System.out.print("El arreglo con un valor mayor es de: "+arregloMayor+"\n");
   }
   
   public void obtenerElMenorDelArreglo(){
       int arregloMenor=a[0];
       for (int m = 0; m < a.length; m++) {
           if (arregloMenor>a[m]){
               arregloMenor=a[m];
           }
       }
     System.out.print("El arreglo con un valor menor es de: "+arregloMenor+"\n");
   }
   public void Promedio(){
       double prom=0,suma=0;
       
       for (int s = 0; s < a.length; s++) {
           suma=suma+a[s];
       }
       prom=suma/a.length;
       System.out.println("El promedio de los arreglos es de: "+ prom+"\n");
   }
   public int getTamaño(){
       return a.length;
   }
   public void numerosPrimos(){
       int residuo=0;
       boolean primo=true;
       
       System.out.println("Los numeros primos del arreglo son:");
       
       for (int n = 0; n < a.length; n++) {
           if (a[n]==0 || a[n]==1 || a[n]==4) {
               primo=false;
           }
           for (int p = 2; p < a[n]; p++) {
               residuo=a[n]%p;
               if (residuo==0) {
                   primo=false;
               }
           }
           if (primo==true) {
               System.out.println(a[n]);
           }
           primo=true;
       }
   }
}
