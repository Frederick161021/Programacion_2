package PrimerSemestre;

public class Colegial {
    private String Nombre;
    private int edad;
    private long matricula;
    private Fecha fechaI, fechaE;
    private int promedioF;
    
    public Colegial (String nom, int ed, long mat, Fecha fi, Fecha fe, int prom){
        this.Nombre=nom;
        this.edad=ed;
        this.matricula=mat;
        this.fechaI=fi;
        this.fechaE=fe;
        this.promedioF=prom;
    }
    
    public void setNombre(String nom){
        this.Nombre=nom;
    }
    public void setEdad(int ed){
        this.edad=ed;
    }
    public void setMatricula(long mat){
        this.matricula=mat;
    }
    public void setFechaI(Fecha fi){
        this.fechaI=fi;
    }
    public void setFechaE(Fecha fe){
        this.fechaI=fe;
    }
    public void setPromedio(int prom){
        this.promedioF=prom;
    }
    
    
    public String getNombre(){
        return this.Nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public long getMatricula(){
        return this.matricula;
    }
    public String getFechaI(){
        return fechaI.toString();
    }
    public String getFechaE(){
        return fechaE.toString();
    }
    public int getPromedio(){
        return this.promedioF;
    }
    
    public String toString(){
        return "Nombre: "+Nombre+"\nEdad: "+edad+"\n Matricula: "+matricula+
                "\nFecha de Ingreso: "+fechaI.toString()+"\nFecha de Egreso: "+fechaE.toString()+
                "\nPromedio Final: "+promedioF+"\n Años Cursados: "+ AñosCursados();
    }
    
    public int AñosCursados(){
        int AñosCursados=0;
                AñosCursados=fechaE.getaño()-fechaI.getaño();
        return AñosCursados;
    }
}

