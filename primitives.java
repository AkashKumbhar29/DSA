import java.util.*;
/* 
public class Primitives {
    public static void main(String[] args){

        
            int numbers = 2; //Storage capacity is 4 byte
            char word = 'A'; //2 bytes
            long largeint = 245632667746L; //8 bytes
            float marks = 99.69f;  //4 bytes
            double large_float_no = 22.23456754; //8 bytes
            boolean check = true ;  //1 byte

            System.out.println(numbers);
            System.out.println(word);
            System.out.println(largeint);
            System.out.println(marks);
            System.out.println(large_float_no);
            System.out.println(check);


int a =10;
int b =5;
int ansu = a*b / a-b;
int an = (a*b )/(a-b);

    System.out.print(ansu);
    System.out.print(an);
    }
    
}

*/

//Switch case
public class Primitives{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the button no.");
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Namaste");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("invalid Button");
        }
    }
}