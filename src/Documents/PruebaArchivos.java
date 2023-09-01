package Documents;
import java.io.*;
import java.util.Scanner;
public class PruebaArchivos {

    public static void main(String[] args) {
        File archivo = new File("Prueba.txt");
        try{
           archivo.createNewFile();
            System.out.println("Se creo el archivo");
        }
        catch (IOException e){
            System.out.println("No se creo nada");
        }
        
        try(FileWriter escribir = new FileWriter("Prueba.txt")){
            escribir.write("No se ni como funciona este codigo");
        }
        catch (IOException e){
            System.out.println("Imposible abrir el archivo para escribir");
        }
        
        try(FileReader leer = new FileReader("Prueba.txt")){
            int c=leer.read();
        while((c!=-1)){
            System.out.println((char)c);
            c=leer.read();
        }
        leer.close();
    }
    catch(IOException e){
            System.out.println("Imposible abrir el archivo para leer");
         }
}
}
