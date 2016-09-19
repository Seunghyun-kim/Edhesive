import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
      
     Scanner scan = new Scanner (System.in);
     int num1;
     
     System.out.println("Please enter a three digit number:");
     num1 = scan.nextInt();
     
     int num2 = num1 / 100;
     int num3 = (num1 % 100) / 10;
     int num4 = num1 % 10;
     int num5 = num2 + num3 + num4;
     
     System.out.println("Here are the digits:");
     System.out.println(num2);
     System.out.println(num3);
     System.out.println(num4);
     System.out.println(num2 + " + " + num3 + " + " + num4 + " = " + num5);
     
    }
}