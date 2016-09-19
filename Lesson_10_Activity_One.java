import java.util.Scanner;
import java.lang.Math;

class Lesson_10_Activity_One {
  public static void main(String[] args) {
    
    System.out.println("Please enter two decimal values:");
    Scanner scan = new Scanner (System.in);
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    
  
    System.out.println("The difference is: " + (double)(Math.abs((int)1000*num1) - ((int)1000*num2))/1000);
  }
}