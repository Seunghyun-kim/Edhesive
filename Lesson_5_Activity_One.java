/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_One {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
    	double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println(num2-num1);


    }
}