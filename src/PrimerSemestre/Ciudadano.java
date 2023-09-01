package PrimerSemestre;

public class Ciudadano {
    private String nombre="",direccion="";
    private long tel;
    
    public Ciudadano(String nom, String dir, long tel){
        nombre=nom;
        direccion=dir;
        tel=tel;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public long getTel(){
        return tel;
    }
    public String toString(){
        return"Nombre:"+nombre+"\nDireccion:"+direccion+"\nTelefono:"+tel;
    }
}
