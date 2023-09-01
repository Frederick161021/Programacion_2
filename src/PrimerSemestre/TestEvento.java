package PrimerSemestre;
import java.util.Scanner;
public class TestEvento {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String Nom,Dir;
        int Hr,Min,invi,asis,A,Me,D;
        System.out.println("Teclee el nombre del evento");
        Nom=s.nextLine();
        System.out.println("Teclee la direccion del evento");
        Dir=s.nextLine();
        System.out.println("Teclee la hora del evento");
        Hr=s.nextInt();
        System.out.println("Teclee los minutos de la hora del evento");
        Min=s.nextInt();
        System.out.println("Teclee el numero de invitados al evento");
        invi=s.nextInt();
        System.out.println("Teclee el numero de invitados ");
        asis=s.nextInt();
        System.out.println("Teclee el año del evento");
        A=s.nextInt();
        System.out.println("Teclee el mes del evento");
        Me=s.nextInt();
        System.out.println("Teclee el dia del evento");
        D=s.nextInt();
        Evento E=new Evento(Nom,Dir,Hr,Min,invi,asis,A,Me,D);
        System.out.println(""+E.toString());
        
    }
    
}
