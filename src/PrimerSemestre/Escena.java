package PrimerSemestre;

public class Escena extends Pelicula {
    static private double duracion=0,inicio=0,fin=0;
    private int numPersonajes=0;
    private String escenario="";
    public Escena(String t, String a, String f,String g,String c,int dia, int mes,int año, double iE, double fE,int nP,String esc){
        super(t, a, f,(fE-iE), g, c, dia, mes, año);
        setInicio(iE);
        setFin(fE);
        setNPersonajes(nP);
        setEscenario(esc);
    }
    
    //setters
    public void setInicio(double iE){inicio=iE;}
    public void setFin(double fE){fin=fE;}
    public void setNPersonajes(int nP){numPersonajes=nP;} 
    public void setEscenario(String esc){escenario=esc;}
    
    //getters
    public double getInicio(){return inicio;}
    public double getFin(){return fin;}
    public int getNPersonajes(){return numPersonajes;} 
    public String getEscenario(){return escenario;}
    
    //toString
    public String toString(){
        return super.toString()+"\nInicio de la escena: "+inicio+"\nFin de la escena: "+fin+
                "\nEscenario: "+escenario+"\nNumero de personajes: "+numPersonajes;
    }
}
//Erick Ivan Toledo Galeana