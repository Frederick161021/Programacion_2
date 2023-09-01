package PrimerSemestre;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private Fecha fNacimiento;
    
    public Persona(String nom, int ed, double est){
        this.nombre=nom;
        this.edad=ed;
        this.estatura=est;
        fNacimiento=new Fecha();
    }
    public Persona(String nom, int ed, double est, Fecha f){
        nombre=nom;
        edad=ed;
        estatura=est;
        fNacimiento=f;
    }
    
    public void setFecha (int d, int m, int a){
        fNacimiento.setdia(d);
        fNacimiento.setmes(m);
        fNacimiento.setaño(a);
    }
    public Fecha getFecha(){
        return fNacimiento;
    }
    public String getnombre(){
        return nombre;
    }
    public int getedad(){
        return edad;
    }
    public double getestatura(){
        return estatura;
    }
    
    public String getDatos(){
        String resultado="";
        resultado="Nombre:"+nombre+"\nEdad:"+edad+"\nEstatura"+estatura+
                "\nFecha de Nacimiento"+fNacimiento.toString();
        return resultado;
    }
}

