package PrimerSemestre;
import java.util.Scanner;

public class Test_Estudiante {
static Scanner s = new Scanner(System.in);
    
public static void main(String[] args) {
        Estudiante E1 = new Estudiante("Erick Toledo","Saltillo, Las quintas", 1844832357,19017291,"Sistmeas",6,98.75);
        String nom,dir,car;
        int semestre;
        double prom;
        long telefono, matricula;
         
        System.out.println("\nEscribe la informacion que se te solicita para crear la instancia E2;");
        System.out.println("Nombre: ");
        nom=s.nextLine();
        System.out.println("Direccion: ");
        dir=s.nextLine();
        System.out.println("Carrera: ");
        car=s.nextLine();
        
        System.out.println("Telefono: ");
        telefono=s.nextLong();
        System.out.println("Matricula: ");
        matricula=s.nextLong();
        
        System.out.println("Semeste: ");
        semestre=s.nextInt();
        System.out.println("Promedio: ");
        prom=s.nextDouble();
        Estudiante E2 = new Estudiante(nom,dir,telefono,matricula,car,semestre,prom);
        System.out.println("La informacion del estudiante E2: "+ E2.toString());
    }
    
}
