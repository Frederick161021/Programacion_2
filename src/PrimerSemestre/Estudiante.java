package PrimerSemestre;

public class Estudiante extends Ciudadano{
  private String carrera;
  private int semestre;
  private long matricula;
  private double promedio;
  
  public Estudiante(String nom, String dir, long tel, long mat, String c, int n, double p){
      super (nom, dir, tel);
      carrera =c;
      semestre=n;
      promedio=p;
      matricula=mat;
  }
  
  public String getCarrera(){
      return carrera;
  }
  public int getSemestre(){
      return semestre;
  }
  public long getMatricula(){
      return matricula;
  }
  public double getPromedio(){
      return promedio;
  }
  
   public void setCarrera(String n){
      this.carrera=n;
  }
  public void setSemestre(int s){
      this.semestre=s;
  }
  public void setMatricula(long m){
       this.matricula=m;
  }
  public void setPromedio(double p){
      this.promedio=p;
  }
  
  public String toString(){
      return super.toString()+"\n Carrera: "+carrera+"\nSemestre:"+semestre;
  }
}
