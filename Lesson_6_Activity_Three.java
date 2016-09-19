import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_Three {
    public static void main(String[] args) {
      
     Scanner scan = new Scanner (System.in);
      double num1;
      
      System.out.println("Please input a decimal number:");
      num1 = scan.nextDouble();
 
      
      double num2 = 100*(num1 - (int) num1);
      int num3 = (int) num2;
      System.out.println("Answer: " + num3);
    }
}