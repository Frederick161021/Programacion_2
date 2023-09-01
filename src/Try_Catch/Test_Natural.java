package Try_Catch;

public class Test_Natural {

    public static void main(String[] args) {
        try{
            System.out.println(Natural.suma(8,5));
            System.out.println(Natural.suma(8,-5));
        }
        catch (Exception e){
            System.out.println("Error"+e.toString());
            e.printStackTrace();
        }
        System.out.println("Continua la ejecucion del programa");
    }
    
}
