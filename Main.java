import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Coding ");
        

        //Create a scanner object
           Scanner input = new Scanner(System.in);

        //taking int input and printing result 
           System.out.println("Enter the number :");
           System.out.println("The number is : " + input.nextInt()); 
           
        //taking string as input
            System.out.println("Enter your name :");
            System.out.println(input.next());

        // taking boolean as string
            System.out.println("Enter the float value :");
            System.out.println("The number is : " + input.nextFloat()); 
        
    }    
}
