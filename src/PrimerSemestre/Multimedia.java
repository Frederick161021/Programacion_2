
package PrimerSemestre;

public class Multimedia {
    private String titulo="", autor="",formato="";
    private double duracion=0;
    
    public Multimedia(String t, String a, String f, double d){
      setTitulo(t);
      setAutor(a);
      setFormato(f);
      setDuracion(d);
    }
    
    //setters
    public void setTitulo(String t){this.titulo=t;}
    public void setAutor(String a){this.autor=a;}
    public void setFormato(String f){this.formato=f;}
    public void setDuracion(double d){this.duracion=d;}
    
    //getters
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public String getFormato(){return formato;}
    public double getDuracion(){return duracion;}
    
    //toString
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+
                "\nDuracion: "+duracion+" Horas";
    }
}
//Erick Ivan Toledo Galeana