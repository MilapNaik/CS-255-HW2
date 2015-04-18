// Test program for cs255 hw2
// DO NOT make any changes to this program
//
// For hw2, you must write another program in file "NovenNumber.java"
// that contains the static methods:
//
//         public static int parseNoven(String s)
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

      String s;
      int x, y, z;

      System.out.print ("Enter first Novendecimal number x = ");
      s = in.next();
      x = NovenNumber.parseNoven(s);  // Convert novendecimal number to binary

      System.out.print ("Enter second Novendecimal number y = ");
      s = in.next();
      y = NovenNumber.parseNoven(s);  // Convert novendecimal number to binary

      z = x + y;
      System.out.println ("x + y = " + NovenNumber.toString(z) );
   }
}

