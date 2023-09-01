package PrimerSemestre;

public class Matriz {
    public static void main(String[] args) {
         int[]matriz; 
         matriz = new int[13];
        for (int i = 0; i < matriz.length; i++) {
            if (i<6) {
                matriz[i]=2;
            }
            if (i>6) {
                matriz[i]=1;
            }
            matriz[6]=0;
            
        }
        for (int j = matriz.length-1; j >= 6; j--) {
            System.out.print(matriz[j-6]);
            System.out.print(matriz[j-5]);
            System.out.print(matriz[j-4]);
            System.out.print(matriz[j-3]);
            System.out.print(matriz[j-2]);
            System.out.print(matriz[j-1]);
            System.out.print(matriz[j]);
            System.out.print("\n");
        }
    }
}
