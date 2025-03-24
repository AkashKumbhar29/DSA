
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

//Make a function to add 2 numbers and return the sum
import java.util.*;

public class Functions{
    public static double addNumbers(double x,double y){
        double sum = x + y;
        return sum;
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

import java.util.*;

public class Functions{
    public static int multiplyNumbers(int a , int b){
        int multiply = a * b;
        return multiply;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int multiply = multiplyNumbers(a,b);

        System.out.println("The multiply is: " + multiply);

        sc.close();
    }
}

//factorial

import java.util.*;

public class Functions{
    public static void factorialOfNumbers(int n){
        if(n<0){
            System.out.println("invalid input");
            return;
        }
        int factorial = 1;

        for(int i=n;i>0;i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " +n+ " is " +factorial);
        return;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            factorialOfNumbers(n);
        }

    }
        
        
//Make a function to check if a number is prime or not
import java.lang.annotation.Retention;
import java.util.*;
public class Functions{
    public static int findPrime(int p){
        if(p<0){
            System.out.println("Invalid number");
        
        }
        else{

            System.out.println();
        }

    }
    public static void main(String [] args){
        scanner sc = new Scanner
    }

}

// normal functions
public class Functions{

    //This is
    public static void helloWorld(String name){
        System.out.println("Hello " + name);
        return;
    }

    public static void main(String[] args){
        helloWorld("akash");
    }
}
    */
public class Functions{
    //Function that returns a sum
    public static int add(int a,int b){
        return a+b; //This sends back the sum
    }
    public static void main(String[] args){
        int result = add(4,5);  //storing teh result
        System.out.println("Result :"+ result);
    }
}