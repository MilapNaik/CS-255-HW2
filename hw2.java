// Test program for cs255 hw2
// DO NOT make any changes to this program
//
// For hw2, you must write another program in file "NovenNumber.java"
// that contains the static methods:
//
//         public static int parseNoven(String input)
//         public static String toString(int a)
//
// Compile the program (after you have written "NovenNumber.java"
// with:
//         javac hw2.java
//
// and run it with the command:
//         java hw2
//

import java.util.Scanner;


public class hw2
{
   public static void main (String[] args) 
   {
      Scanner in = new Scanner(System.in);

      String input;
      int First, Second, output;

      System.out.print ("Enter first Novendecimal number First = ");
      input = in.next();
      First = NovenNumber.parseNoven(input);  // Convert novendecimal number to binary

      System.out.print ("Enter second Novendecimal number Second = ");
      input = in.next();
      Second = NovenNumber.parseNoven(input);  // Convert novendecimal number to binary

      output = First + Second;
      System.out.println ("First + Second = " + NovenNumber.toString(output) );
      
      in.close(); //close scanner
   }
}

