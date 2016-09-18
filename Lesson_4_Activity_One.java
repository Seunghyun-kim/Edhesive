/*Input two doubles and print them backwards on the screen.

  So if the user enters:
1.3 6.8
  It should output:
6.8 1.3
  Notice there is exactly one space between the numbers. */

import java.util.Scanner;

class Lesson_4_Activity_One {
    public static void main(String[] args) {
      
		Scanner input = new Scanner (System.in);  // create input read object
		double x = input.nextDouble();	// read the first input
		double y = input.nextDouble();	// read the second input
		System.out.print(y + " " + x);	// print output

	}

}
