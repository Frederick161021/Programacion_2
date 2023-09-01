package PrimerSemestre;

public class Trabajador extends Ciudadano{
    private long nss;
    private double sueldo;
    
    public Trabajador(String nom, String dir, long tel, long nss, double sueldo){
        super(nom,dir,tel);
        this.nss=nss;
        this.sueldo=sueldo;
    }
    
    public long getNss(){
        return nss;
    }
    public double getSueldo(){
        return sueldo;
    }
    
    public void setNss(long n){
        this.nss=n;
    }
    public void setSueldo(double s){
        this.sueldo=s;
    }
    
    public String toString(){
        return super.toString()+"\nEl numero de seguro social es: "+nss+
                "\nLa cantidad de su sueldo es: "+sueldo;
    }
}
