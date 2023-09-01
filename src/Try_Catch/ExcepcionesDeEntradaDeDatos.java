package try_Catch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesDeEntradaDeDatos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       boolean error=true;

        int numero;

        System.out.println("Teclea un numero entero: ");
       
        try{
            numero=s.nextInt();
            System.out.println("El numero es:"+numero);
            error=false;
        }
        catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("No tecleaste un numero: "+e.toString());   
        }
        System.out.println("Continua el codigo");
    }
    
}
