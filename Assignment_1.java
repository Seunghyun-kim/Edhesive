import java.util.Scanner;
import java.lang.Math;

class Assignment_1 {
    public static void main(String[] args) {
      
     Scanner scan = new Scanner (System.in);
      double test1;
      double test2;
      double test3;
      int quiz1;
      int quiz2;
      double hwk;
      
      
      System.out.println("Please enter your test grades.");
      System.out.println("Test 1: ");
      test1 = scan.nextDouble();
      System.out.println("Test 2: ");
      test2 = scan.nextDouble();
      System.out.println("Test 3: ");
      test3 = scan.nextDouble();
    
      
      System.out.println("Please enter your quiz grades.");
      System.out.println("Quiz 1: ");
      quiz1 = scan.nextInt();
      System.out.println("Quiz 2: ");
      quiz2 = scan.nextInt();
     
      
      System.out.println("Please enter your homework average.");
      System.out.println("Homework: ");
      hwk = scan.nextDouble();
      
      double testavg = (test1 + test2 + test3) / 3;
      double quizavg = (1.0*quiz1 + 1.0*quiz2) / 2;
      double totalavg = (0.40 * testavg) + (0.35 * quizavg) + (0.25 * hwk);
      System.out.println("Test Average: " + testavg + "\nQuiz Average: " + quizavg + "\nFinal Grade: " + totalavg);
    }
}