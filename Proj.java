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
*/
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


