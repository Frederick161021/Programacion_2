package PrimerSemestre;
import java.util.Scanner;

public class Calificaciones{

public static void main (String [] args) { 
    
//calificaciones
    Scanner s = new Scanner (System.in);
        int []Calificacion;
        Calificacion = new int [20];
        for (int i=0;i<20;i++){
            System.out.println("Digite la calificacion :");
        Calificacion[i]= s.nextInt();
        
    }
        for (int j=0; j<20; j++){
        System.out.println("Las calificacion "+j+ " es de: "+ Calificacion[j]);
        }

//promedio

        int suma=0, promedio=0;
        for (int p=0; p<20; p++){
        suma = suma + Calificacion[p];
        }
        promedio= suma/20;
        System.out.println("El promedio de las calificaciones es de: "+ promedio);


 //calificaciones por enciama del promedio
        System.out.println("Las calificaciones mayores al promedio son: \n");
        for(int c=0; c<20; c++){
            if (promedio<= Calificacion[c]){
                System.out.println(Calificacion[c]);
            }
        }
}
}