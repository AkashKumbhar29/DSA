
/*Syntax
    returnType functionName(type arg1 , type arg2,..){
    //Block of code
    }  
    Steps to create a function
    1.Name the function
    2.Define the input
    3.Write the code inside the function,what you want the function to do.
    4.Define teh return value.  
    */
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


