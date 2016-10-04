import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);
     System.out.println("On what day of the month were you born?");
     int day = scan.nextInt();
     System.out.println("In which month were you born?");
     int month = scan.nextInt(); //asks users for input of month and day as integers//
String mnom = "January";
String dnom= "first";
String sign = "horoscope"; // initialize and declare strings for month, day, and zodiac sign//
int canary = 1; /*canary variable tells whether the user has entered an invalid number for day
 * or month and will result in error at the end if so*/

     if (month == 1) {
       mnom = ("January");
     } else if(month == 2) {
       mnom = ("February");
     } else if(month == 3) {
       mnom = ("March");
     }  else if(month == 4) {
       mnom = ("April");
     } else if(month == 5) {
       mnom = ("May");
     } else if(month == 6) { //block of code translating month numbers to month names//
       mnom = ("June");
     } else if(month == 7) {
       mnom = ("July");
     } else if(month == 8) {
       mnom = ("August");
     } else if(month == 9) {
       mnom = ("September");
     } else if(month == 10) {
       mnom = ("October");
     } else if(month == 11) {
       mnom = ("November");
     } else if(month == 12) {
       mnom = ("December");
     }else {
       canary = 0;
   
     } 
       
     
     
     if (day == 1) {
       dnom = ("first");
     }else if (day == 2) {
       dnom = ("second");
     }else if (day == 3) {
       dnom = ("third");
     }else if (day == 4) {
       dnom = ("fourth");
     }else if (day == 5) {
       dnom = ("fifth");
     }else if (day == 6) {
       dnom = ("sixth");
     }else if (day == 7) {
       dnom = ("seventh"); 
     }else if (day == 8) {
       dnom = ("eighth");
     }else if (day == 9) { // block of code translating day numbers to day names//
       dnom = ("ninth");
     }else if (day == 10) {
       dnom = ("tenth");
     }else if (day == 11) {
       dnom = ("eleventh");
     }else if (day == 12) {
       dnom = ("twelfth");
     }else if (day == 13) {
       dnom = ("thirteenth");
     }else if (day == 14) {
       dnom = ("fourteenth");
     }else if (day == 15) {
       dnom = ("fifteenth");
     }else if (day == 16) {
       dnom = ("sixteenth");
     }else if (day == 17) {
       dnom = ("seventeenth");
     }else if (day == 18) {
       dnom = ("eighteenth");
     }else if (day == 19) {
       dnom = ("nineteenth");
     }else if (day == 20) {
       dnom = ("twentieth");
     }else if (day == 21) {
       dnom = ("twenty-first");
     }else if (day == 22) {
       dnom = ("twenty-second");
     }else if (day == 23) {
       dnom = ("twenty-third");
     }else if (day == 24) {
       dnom = ("twenty-fourth");
     }else if (day == 25) {
       dnom = ("twenty-fifth");
     }else if (day == 26) {
       dnom = ("twenty-sixth");
     }else if (day == 27) {
       dnom = ("twenty-seventh");
     }else if (day == 28) {
       dnom = ("twenty-eighth");
     }else if (day == 29) {
       dnom = ("twenty-ninth");
     }else if (day == 30) {
       dnom = ("thirtieth");
     }else if (day == 31) {
       dnom = ("thirty-first");
     }else {
       canary = 0;
   
     } 
     
     if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
       sign = ("Aquarius");
     }else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)){
       sign = ("Pisces");
     }else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
       sign = ("Aries");
     }else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
       sign = ("Taurus");
     }else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) { // block of code converting month and day number to a zodiac sign//
       sign = ("Gemini");
     }else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
       sign = ("Cancer");
     }else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
       sign = ("Leo");
     }else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
       sign = ("Virgo");
     }else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
       sign = ("Libra");
     }else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
       sign = ("Scorpio");
     }else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
       sign = ("Sagittarius");
     }else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
       sign = ("Capricorn");
     }else {
       canary = 0; 
       
     }
     if (canary == 1) {                    
      System.out.println("Your sign is " + sign); 
      System.out.println("Your birthday is: " + mnom + " " + dnom);
     }
     else {
       System.out.println("error");
     } 
    }
}