/*2. Ask the user their name and age and print out how many years until they are 100. Note that age should be an integer, not a double.

  Sample run:

Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years. 

import java.util.Scanner; */


class Lesson_4_Activity_Two {
    public static void main(String[] args) {
      
    	System.out.println("Hi there. What is your name?"); //Print Question 1
    	Scanner x = new Scanner (System.in); //Request Input 
    	String name = x.nextLine(); //Identify "name" as the String first typed into input x
    	System.out.println("Hi " +name+ ". How old are you?"); //Print Question 2
		int age = x.nextInt(); //Identify "age" as the integer typed into input x
		int years = 100-age; //Identify "years" as the number of years till the given person turns 100
		System.out.print(name+ ", you will be 100 in " +years+ " years.");	//Print final statement 

    }
}