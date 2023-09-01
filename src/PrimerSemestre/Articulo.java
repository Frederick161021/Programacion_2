package PrimerSemestre;

public class Articulo {
    private String descripcion;
    private long cantidad;
    private long codigo;
    private double precio;
	
	//constructor vacio
	public Articulo(){}
	//segundo constructor, recibe informacion para los 4 atributos
	public Articulo(String desc, long cod, double pre,long cant)
	{
		descripcion=desc;
		cantidad=cant;
		codigo=cod;
		precio=pre;
		
	}	
	//desarrollo de métodos que devuelven informacion
	
	public boolean disponible()
	{
		if(cantidad>0)
		{ 
			return true;
		}
		else
		{   
			return false;
		}
	}
	public String obtenerDescripcion(){
		return descripcion;
	}
	public long obtenerCodigo(){
		return codigo;
	}
	public long obtenerCantidad(){
		return cantidad;
	}
	public double obtenerPrecio(){
		return precio;
	}
	
	public String obtenerDatos(){
		return "\nDESCRIPCION: "+descripcion+"\nCODIGO: "+codigo+"\nPRECIO $"+precio+"\nCANTIDAD EXISTENTE: "+cantidad;
	}
	//Métodos para asignar: codigo, precio, descripcion y cantidadExistente
	//Desarrollo de métodos para asignar valores
	
	public void asignarPrecio(double precio)
	{ 
		
		
		this.precio=precio;
	}
	public void asignarCodigo(long codigo){
		this.codigo=codigo;
	}
	public void asignarDescipcion(String des){
		descripcion=des;
	}
	public void asignarCantidad(long cantidad){
		//utilizo la referencia this,para distinguir el atributo del parámetro
		this.cantidad= cantidad;
	}

}
