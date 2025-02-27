import java.util.*;
/* 
//1)taking input and giving the multiplication
public class Proj
{
    public static void main(String[]args)
    {
      //  System.out.print("Hello");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number :");
        int a = sc.nextInt();

        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        int mul =a*b;
        System.out.println("The result is " + mul);

    }
}


//2.using if-else[even or odd no.]
public class Proj
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }
}

//Conditions to satisfy  1. a==b 2. a>b, a is greater than b   3. b>a, b is greater than a
public class Proj
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        System.out.println("Enter the value of y");
        int y = sc.nextInt();

        if(x==y)
        {
            System.out.println("Value of x is equal to y");
        }
        else if(x>y)
        {
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }
    }
}

*/

/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
    Calculate the result according to the operation given and display it to the user. */

public class Proj{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        System.out.println("Enter the oprator[1:+ , 2:- , 3:* , 4:/, 5:%] :");
        int o = sc.nextInt();


        switch(o){
            case 1:System.out.println("The ans is :" +  (a+b)
            );
            break;
            case 2:System.out.println("The ans is :" +  (a-b));
            break;
            case 3:System.out.println("The ans is :" +  (a*b));
            break;
            case 4:
                if(b==0){
                    System.out.println("Inavlid number denominator cannot be zero");}
                else{
                System.out.println(a/b);}
                
            break;
            case 5: if(b==0){
                System.out.println("Inavlid number denominator cannot be zero");}
            else{
            System.out.println(a%b);}
            break;
            default:System.out.println("Invalid Opeartor");
                }
        
    }
}
/* 
//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
public class Proj{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Number of month :");
        int month = sc.nextInt();

      

        switch(month){
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            default:System.out.println("Invalid number");
        }
        
    }
}
    */