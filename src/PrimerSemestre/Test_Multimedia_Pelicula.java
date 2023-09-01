package PrimerSemestre;

public class Test_Multimedia_Pelicula {

    public static void main(String[] args) {
        //Test de Multimedia
        Multimedia M = new Multimedia("Video Familiar", "Erick Toledo", "mp4", 1.5);
        System.out.println("----------Test Multimedia----------\n"+M.toString()+"\n");
        
        //Test de Pelicula
        Pelicula P = new Pelicula("Spider-man","Sam Raim", "mp4",2.1,"Accion y Fantasia","B(recomendado para mayores de 13)",17,5,2002);
        System.out.println("\n----------Test Pelicula----------\n"+P.toString()+"\n");
        
        //Test de Escena
        Escena E = new Escena("Capitan america and the winter soldier", "Joe Russo y Anthony Russo", "mp4","Accion y Fantasia","B(recomendado para mayores de 13)",4,4,2014, 0.30, 0.40,6,"Elevador");
        System.out.println("\n----------Test Escena----------\n"+E.toString());
    }    
}
//Erick Ivan Toledo Galeana