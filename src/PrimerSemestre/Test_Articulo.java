package PrimerSemestre;

public class Test_Articulo {
    
    public static void main(String[] args) {
    Articulo a1=new Articulo();
		System.out.println("invocando el método obtenerDatos"+a1.obtenerDatos());
		Articulo a2=new Articulo("Sabritas 230gr.",1233,31.56,400);
		System.out.println("------Ahora TRABAJANDO CON AERICULO a2");
		System.out.println(a2.obtenerDatos());
		System.out.println("invocando el método Disponible del articulo a2:  "+a2.disponible());
		System.out.println("Ahora le asignamos a cantidad cero, para despues comprobar si está disponible");
		a2.asignarCantidad(0);
		
		System.out.println("invocando el método Disponible del articulo a2:  "+a2.disponible());
		System.out.println(a2);
    }
    
}
