import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_One {
    public static void main(String[] args) {
      
     Scanner scan = new Scanner (System.in);
      int num1;
      int num2;
     
      System.out.println("Please enter two integers:");
      num1 = scan.nextInt();
      num2 = scan.nextInt(); // allows input of integers
   
      
      double num3 = (1.0*num1 + 1.0*num2)/2; //1.0 * int converts the integer to double form
      System.out.println("The average is "+ num3);
    }
}
        