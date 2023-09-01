package PrimerSemestre;
import java.util.Scanner;

public class Test_Time {

    public static void main(String[] args) {
        Time t =new Time();
        int hr, min, seg;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite la Hora: ");
        hr=s.nextInt();
        System.out.println("Digite los Minutos: ");
        min=s.nextInt();
        System.out.println("Digite los Segundos: ");
        seg=s.nextInt();
        
        t.setHora(hr);
        t.setMinutos(min);
        t.setSegundos(seg);
        
        System.out.println("La hora es: "+ t.Tiempo());
    }
    
}
