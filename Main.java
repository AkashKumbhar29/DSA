/* 
//taking the input
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Coding ");
        
//Input
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
 

//Print the pattern
import java.util.*;
public class Main{
    public static void main(String[] args){

/* 
        System.out.println("*\n**\n***\n****");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");   

//Take 2 variable 'a'&'b' and print the sum

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        System.out.println(sc.nextInt());
        System.out.println("Enter the second number");
        System.out.println(sc.nextInt()); 
           
        
        int sum = a + b;
        
        System.out.println("the sum of a& b is :" + sum);

    }
}
*/
import java.util.*;
public class Main
{
    public static void main(String[] arg)
    {
        /* 
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Welcome " + "" + name);
        */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of a&b is: " +sum);
    }
}
