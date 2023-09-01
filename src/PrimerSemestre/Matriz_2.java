package PrimerSemestre;

public class Matriz_2 {

    public static void main(String[] args) {
        int Matriz[][] = new int[8][7];
       
        for (int i = 0; i < 7; i++) {
            Matriz[i][i]=0;
            
                for (int j = 0; j < i; j++) {
                    Matriz[i][j]=2;
                }

                for (int j = i+1; j < 7; j++) {
                    Matriz[i][j]=1;
                }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(Matriz[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println(Matriz.length);
    } 
}
