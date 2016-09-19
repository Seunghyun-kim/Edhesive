import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner test = new Scanner (System.in);
		System.out.println("Please enter your test grades.");
		
		System.out.println("Test 1: ");
		double test1 = test.nextDouble();
		System.out.println("Test 2: ");
		double test2 = test.nextDouble();
		System.out.println("Test 3: ");
		double test3 = test.nextDouble();
		
		System.out.println("Please enter your quiz grades.");
		System.out.println("Quiz 1: ");
		int quiz1 = test.nextInt();
		System.out.println("Quiz 2: ");
		int quiz2 = test.nextInt();
				
		System.out.println("Please enter your homework average.");
		System.out.println("Homework: ");
		double homeworka = test.nextDouble();
		
		double testa = (test1 + test2 + test3)/3;
		double quiza = (double) (quiz1 + quiz2)/2;
		double grade = (0.4*testa+0.35*quiza+0.25*homeworka);
		
		System.out.println("Test Average: " + testa);
		System.out.println("Quiz Average: " + quiza);
		System.out.println("Final Grade: " + grade);
		
		
	}
}
