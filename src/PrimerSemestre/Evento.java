package PrimerSemestre;

public class Evento {
    private String Nombre, Direccion;
    private int Hora,Minutos,NumInv,NumAsis,Año,Mes,Dia;
    
    public Evento(){
        
    }
    public Evento(String Nom,String Dir,int H, int Min, int inv, int asis, int A, int Me, int D){
        setNombre(Nom);
        setDireccion(Dir);
        setHora(H,Min);
        
        setNumInv(inv);
        setNumAsis(asis);
        setFecha(A,Me,D);
        
    }
    public void setNombre(String Nom){
        Nombre=Nom;
    }
    public void setDireccion(String Dir){
        Direccion=Dir;
    }
    
    public void setHora(int H, int M){
        Hora=H;
        Minutos=M;
        
    }
    public void setNumInv(int inv){
        NumInv=inv;
    }
    public void setNumAsis(int asis){
    NumAsis=asis;
    }
    public void setFecha(int A, int Mes, int D){
        Año=A;
        this.Mes=Mes;
        Dia=D;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getDireccion(){
        return Direccion;
    }
    public int getHora(){
        return Hora;
    }
    public int getMinutos(){
        return Minutos;
    }
    public int getNumInv(){
        return NumInv;
    }
    public int getNumAsis(){
        return NumAsis;
    }
    public int getAño(){
        return Año;
    }
    public int getMes(){
        return Mes;
    }
    public int getDia(){
        return Dia;
    }
    public String toString(){
        
        return "Nombre del evento:"+Nombre+"\nDireccion:"+Direccion+"\nFecha:"+Año+"/"+Mes+"/"+Dia+"\nHora: "+Hora+":"+Minutos+"\nNumero de Invitados:"+NumInv+"\nNumero de Asistentes:"+NumAsis;
    }
}
