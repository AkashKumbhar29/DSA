
/*Syntax
    returnType functionName(type arg1 , type arg2,..){
    //Block of code
    }  
    Steps to create a function
    1.Name the function
    2.Define the input
    3.Write the code inside the function,what you want the function to do.
    4.Define teh return value.  
    
//Ex_1
//public static void main(String[]args){
import java.util.*;

public class Functions {
    public static void printMyName(String name){
            System.out.println(name);
            return;
    }
    public static void main(String args[]){
        System.out.println("Enter your name :");
        System.out.println("Name should be of max 10 words");
        Scanner sc = new Scanner(System.in);
            String name = sc.next();
        

        printMyName(name);
    }
}
*/
//Make a function to add 2 numbers and return the sum
import java.util.*;

public class Functions{
    public static double addNumbers(double x,double y){
        
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double x = sc.nextDouble();

        System.out.println("Enter second Number");
        double y = sc.nextDouble();
       
        double sum = addNumbers(x,y);

        System.out.println("The sum is: " + sum);

        sc.close();
    }
}


