public class Persona_1 {
	private String nombre;
    private int edad;
    private  double  estatura ;
     //Constructor vacio
    public Persona_1()
    {
    	
    }
    
    
	public Persona_1 (String nom, int ed, double est)
	   {
	       nombre=nom;
		  edad=ed;
	       estatura=est;
	   }
	    
	//Metodos que para obtener o devolver valores (get)
	   public String obtenerNombre()
	  {
	        return nombre;
	   } 

	public  int obtenerEdad( ) 
	{
	  return  edad;
	}
	public  double obtenerEstatura () {
		  return estatura;
		}

	
	//Metodos Para asignar valores a los atributos (set)
	public void asignarNombre(String n){

		nombre=n;
	}
	public void asignarEdad(int e){
		edad=e;
	}
	public void asignarEstatura(double es){
		estatura=es;
	}
	
	
	
	
	//Metodo que sirve para devolver todos los atributos juntos en forma de un String
	public String obtenerDatos()
		{
		   String resultado="";

		  resultado="\nNOMBRE:"+nombre+
		    "\nEDAD: "+ edad + 
		    "\nESTATURA:"+ estatura;
		 return resultado;
		}

}//Class
