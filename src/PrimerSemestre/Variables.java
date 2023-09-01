package PrimerSemestre;

public class Variables {

    public static void main(String[] args) {
        int hexadecimal=0XF;//Para usar numeros en hexadecimal primero debo digitar el 0X
        int octal=010;//Para digitar un numero en octal primero debo de digitar un 0
        System.out.println("El numero 15 en exadecimal: "+hexadecimal);
        System.out.println("El numero 8 en octal: "+octal);
        
        byte dato1=1;
        short dato2=100;
        int dato3=1000;
        long dato4=10000000;
        System.out.println("Dato tipo Byte "+String.valueOf(dato1));
        System.out.println("Dato tipo Short "+String.valueOf(dato2));
        System.out.println("Dato tipo Int "+String.valueOf(dato3));
        System.out.println("Dato tipo Long "+String.valueOf(dato4));
        
        double PI = 314.16e-2;//valor aproximado de Pi
        float tempDia = (float) 29.6;//float tempDia = 29.6f;
        System.out.println("El valor de PI es: "+PI+"\n La temperatura del dia es de: "+tempDia);
        
        
        int vector [] = new int [5];
        vector[0]=5;vector[1]=35;vector[2]=16;vector[3]=4;vector[4]=7;
        int otroVector [] = {1,2,3,4};//Y es asi como se representan los datos de un 
        String vNombres[] = {"Juan","Pedro","Maria"};
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        for (int i = 0; i < otroVector.length; i++) {
            System.out.println(otroVector[i]);
        }
        
        for (int i = 0; i < vNombres.length; i++) {
            System.out.println(vNombres[i]);
        }  
        
      //Matrices son celdas bidimecionales con filas y columnas
      
      int matriz [][] = new int[3][4];
      matriz [0][0] = 15; matriz [1][0] = 24; matriz [2][0] = 38;
      matriz [0][1] = 17; matriz [1][1] = 64; matriz [2][1] = 83;
      matriz [0][2] = 65; matriz [1][2] = 33; matriz [2][2] = 28;
      matriz [0][3] = 28; matriz [1][3] = 17; matriz [2][3] = 99;
        System.out.println("Contenido"+matriz[2][0]);
        System.out.println("Contenido"+matriz[0][3]);
    }
}