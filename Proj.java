
import java.util.*;

public class Proj{
    public static void main(String[] args){
    /*     int sum = 0;
        int n = 4;

        for(int i=1 ; i<=n ; i++ ){
            sum = sum + i;
           // System.out.println(sum);
        }
        System.out.println(sum); */

//print the table of a number input by the user
     Scanner sc = new Scanner(System.in);
       int m = 0;

        System.out.println("Enter the number of table you want");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
          m = n * i;
          System.out.println(m);
        }
    }
}

