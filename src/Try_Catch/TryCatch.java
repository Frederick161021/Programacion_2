package Try_Catch;
import java.util.*;
public class TryCatch {

    public static void main(String[] args) {
        int nums[] = new int[5];
        //Block of code to monitor for errors
        try{
            System.out.println("Try one");
            errorMethod(nums);
            System.out.println("Try two");
        }
        //Handler for exception
        
        catch(ArrayIndexOutOfBoundsException ex){//Catch a specifically type of exception
            System.out.println("In catch 1");
        }
        //Catch all type of exceptions
        catch(Exception ex){
            System.out.println("In catch 2");
        }
        // Rest of the Program
        System.out.println("This is the rest of the program");
    }
    public static void errorMethod(int[] nums){
      nums[10] = 25;  
    }
}
