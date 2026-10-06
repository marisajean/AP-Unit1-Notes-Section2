import java.util.Scanner;
/*

Primitive Type - storing simple information/data (ex. int x = 5;)
Object (Reference) Type - storing complex data/objects (ex. Creature cat = new Creature())

Primitive Variable Types to Know: 
1. int - stores integers/positive or negative whole numbers 
2. double - store decimal numbers (ex. double x = 5.0;) (ex. double y = 4.25;)
3. boolean - stores logic (only two options are True or False)

Object Variable Type to Know:
1. String - stores text between quotes (ex. "5.0", "Hello, world!") 

Setting Up Variables In Code: 
Declaring + Assigning go together 
1. Declare Variable  --> int x;  String name;
2. Assign Variable --> x = 5; name = "Ms. Dinko"

Or do it in one step!
3. Initialize Variable --> int x = 5; String name = "Ms. Dinko"

Concatenating - put more than one string together using "+"

*/

public class Main {
   public static void main(String []args) {
      int num;
      num = 4;           
      System.out.println(num);

      //declare a variable 
      double myGradeAverage;
      // assign a value 
      myGradeAverage = 95.0;

      //initialize a variable -- declare and assign in one statement 
      double myDreamGrade = 100.0;

      // we can format strings using concatenation (+)
     // System.out.println("My current grade is: " + myGradeAverage);
      // print statement for ideal grade 
     // System.out.println("My dream grade is " + myDreamGrade + "!");

      // printing a quote using an escape sequence 
      // escape sequences always use a \
      // \n gives a new line 
      // we use \\ to actually print one \
    //  System.out.println("My teacher \\always says,\n\"Study for your test!\"");

      // arithmetic operations (+ - * /)
      // working with only ints, output will be an int 
      // int / int does TRUNCATING DIVISION removes the decimal, does not round
     // System.out.println(19/10);
      // if we want to divide and get a decimal, we need to divide with a double
      //System.out.println(19/10.5);
     // System.out.println(10 + 12.0);
      // % gives us the remainder
      //System.out.println(12%10);

      int myNum = 7;
      int newNum = myNum;
      newNum = 8;

     // System.out.println(myNum);
     // System.out.println(newNum);

      // incrementing variable 
      myNum = myNum + 1;
      myNum = myNum + 1;

      // handles the assignment and the addition all at once 
      myNum++;

      // decrementing 
      myNum = myNum - 1;
      myNum--;

     // System.out.println(myNum);
    //  System.out.println(newNum);


      // working with Scanner class and text input 
     // System.out.println("Greetings human! What is your name?");
     // Scanner scan = new Scanner(System.in);
     // String name = scan.nextLine();
      

      /* lesson 1.5 Notes - Casting 
      Casting allows us to change from one data type to another 

      We cast using a "cast operator" written in () before our expression 
      */
      double doubleNum = 5.0;
      System.out.println((int) doubleNum / 2);

      // cast from a double to an int, it will truncate our double 
      // casting from an int to a double will just add .0 to the end 
      System.out.println((int) 4.3);
      System.out.println((double) 8);

      double number;    // positive value from somewhere
      double negNumber; // negative value from somewhere

      number = 4.9;
      negNumber = -3.6;
      int nearestInt = (int)(number + 0.5);
      int nearestNegInt = (int)(negNumber - 0.5);

      System.out.println(nearestInt);
      System.out.println(nearestNegInt);

      // Coding Challenge Average 3 Numbers 
      int grade1 = 85;
      int grade2 = 96;
      int grade3 = 92;

      int sum;
      double average;
      sum = grade1 + grade2 + grade3;
      average = ((double) sum) / 3;
      System.out.println(average);

      // Lesson 1.6 Compound Assignment Operators 
      // compound assignment operators always have the math symbol first, and then the equal sign 
      average = average + 1;
      average += 1;
      average++;
      System.out.println(average);

      // we can do compound operators with any number, not just 1. 
      average -= 2;
      // our most condensed version only increments or decrements by 1. 
      average--;
      System.out.println(average);
      
   }
}
