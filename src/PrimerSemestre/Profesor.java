package PrimerSemestre;

public class Profesor extends Trabajador{
    private long numControl=0;
    private String Materia="";
    private int numAlumnos=0;
    public Profesor(String Nom,String dir, long tel, long nss, double sueldo, long nc, String mat,int Alumn){
        super (Nom,dir,tel,nss,sueldo);
        setNC(nc);
        setMateria(mat);
        setNumAlumnos(Alumn);
    }
    
    public void setNC(long nc){
    numControl=nc;
    }
    
    public long getNC(){
        return numControl;
    }
    
    public void setMateria(String mat){
    Materia=mat;
    }
    
    public long getMateria(){
        return numControl;
    }
    
    public void setNumAlumnos(int Alumn){
    numAlumnos=Alumn;
    }
    
    public long getNumALumnos(){
        return numAlumnos;
    }
    
    public String toString (){
        return super.toString()+"\nEl numero de control es: "+numControl+
        "El numero de alunos es: "+numAlumnos+"La materia que impar es: "+Materia;
    }
}
