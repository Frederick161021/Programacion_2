package Try_Catch;

public class Natural {
    public static int suma (int x, int y) throws Exception{
        if (x < 0 || y < 0) {
            throw new Exception ("Numero NO Natural");
        }
        else{return x+y;}
    }
}
