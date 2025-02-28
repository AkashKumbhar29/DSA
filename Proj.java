
import java.util.*;
public class Proj{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    /*     int sum = 0;
        int n = 4;

        for(int i=1 ; i<=n ; i++ ){
            sum = sum + i;
           // System.out.println(sum);
        }
        System.out.println(sum); 

//print the table of a number input by the user
      Scanner sc = new Scanner(System.in);
       int m = 0;

        System.out.println("Enter the number of table you want");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
          m = n * i;
          System.out.println(m);
        } */

// print all even numbers till n
/* 
int j =0;
if(j<=n){
for(; j%2==0 ;j++){
  System.out.println(j);
}
}
else{
  System.out.println("Invalid number");
}

//using while loop
int n= 11;
int i = 2;
while(i<=n){
  System.out.println(i);
  i = i + 2;
}

// using for loop

int m = 11;
for(int j = 0; j<=n ; j+=2){
System.out.println(j);
}

for(; ;) {
  System.out.println("Apna College");
}


Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)

*/
System.out.println("Enter the number(0 or 1)");
int x = sc.nextInt();

if(x==0){
  System.out.println("Marks dont matter but our effort does, Better luck next time");
}

else if(x==1){
  
  System.out.println("Enter your marks out of 100");
  int m = sc.nextInt();

 
    if(m>=90 || m<=100){
      System.out.println("This is Good");
    }

    else if(89>=m||m>=69){
      System.out.println("This is also Good");
    }

    else if(59>=m ||m>=0){
      System.out.println("This is Good as well");
    }

    else{
      System.out.println("Invalid marks");
    }
    //else if(=(m)>=60){
    
  
    /*do{
      System.out.println("marks don’t matter but our effort does.");
    }while(m>0); */
  }
 
else{
  System.out.println("Invalid choice");
}

    }
  }





