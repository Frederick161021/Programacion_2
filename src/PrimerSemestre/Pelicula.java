package PrimerSemestre;

public class Pelicula extends Multimedia {
    private String Genero="",clasificacion="";
    private int numPersonajes=0,dia=0,mes=0,año=0;  
    
    public Pelicula(String t, String a, String f, double d,String g,String c,int dia, int mes,int año){
    super(t,a,f,d);
    setFecha(dia,mes,año);
    setGenero(g);
    setClasificacion(c);
}
    
    //setters
    public void setFecha(int d,int m, int a){
        dia=d;
        mes=m;
        año=a;
    }
    public void setGenero(String g){
        Genero=g;
    }
    public void setClasificacion(String c){
        clasificacion=c;
    }
    
    //getters
    public String getFecha(){
        Fecha F = new Fecha(dia,mes,año);//Fecha
        return F.toString();
    }
    public String getGenero(){
        return Genero;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    
    //toString
    public String toString(){
        return super.toString()+"\nFecha de estreno: "+getFecha()+"\nGenero: "+Genero+
                "\nClasificaion: "+clasificacion;
    }
}
//Erick Ivan Toledo Galeana