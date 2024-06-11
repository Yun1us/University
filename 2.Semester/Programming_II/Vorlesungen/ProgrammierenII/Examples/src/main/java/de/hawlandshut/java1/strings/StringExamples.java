package de.hawlandshut.java1.strings;

import java.util.Scanner;

import de.hawlandshut.java1.oopbasics.shapes.Point2D;

import static java.lang.System.out;

public class StringExamples
{
  public static void stringLiteralsExample() {
    // snippet: stringLiteralsExample
    // *@\Gradle{runStringLiteralsExample}@*
    out.print("Hello World");
    out.print(""); // leerer String
    out.print("\nOne\nTwo\nThree\n"); 
    out.print("S\u00FC\u00DF\u00F6lgef\u00E4\u00DF\n"); 
    // snippet: /stringLiteralsExample
  }

  public static void stringConcatExample() {
    // snippet: stringConcatExample
    // *@\Gradle{runStringConcatExample}@*
    String truth = "Half the Truth: ";
    String all = truth + 20 + 1;
    out.println(all);
    // snippet: /stringConcatExample
  }

  public static void stringConcatExample2() {
    // snippet: stringConcatExample2
    // *@\Gradle{runStringConcatExample2}@*
    String truth = "Half the Truth: ";
    String all = truth + (20 + 1);
    out.println(all);
    // snippet: /stringConcatExample2
  }

  public static void stringConcatExample3() {
    // snippet: stringConcatExample3
    // *@\Gradle{runStringConcatExample3}@*
    String s1 = "Hello";
    String s2 = "World";
    String s3 = s1 + " " + s2;
    out.printf("s1 == s3 = %b%n", s1 == s3);
    // snippet: /stringConcatExample3
  }

  public static void stringConversionExample() {
    // snippet: stringConversionExample
    // *@\Gradle{runStringConversionExample}@*
    Point2D p = new Point2D(1,2);
    String s = "p = " + p;
    out.println(s);
    // snippet: /stringConversionExample
  }

  public static void stringConversionExample2() {
    // snippet: stringConversionExample2
    // *@\Gradle{runStringConversionExample2}@*
    out.println("PI = " + Math.PI);
    out.println("Truth/2 = " + 21);
    out.println(true + " that!");
    // snippet: /stringConversionExample2
  }

  public static void stringConversionExample3() {
    // snippet: stringConversionExample2
    // *@\Gradle{runStringConversionExample2}@*
    out.println("PI = " + Double.toString(Math.PI));
    out.println("Truth/2 = " + Integer.toString(21));
    out.println(Boolean.toString(true) + " that!");
    // snippet: /stringConversionExample2
  }

  public static void stringFormatExample() {
    // snippet: stringFormatExample
    // *@\Gradle{runStringFormatExample}@*
    String s = String.format("%.2f, %b, %d, %x", 
        Math.PI, true, 42, 42);
    out.println(s);
    // snippet: /stringFormatExample
  }

  public static void stringParseIntDoubleExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: stringParseIntDoubleExample
    // *@\Gradle{runStringParseIntDoubleExample}@*
    String stringX = scanner.next();
    int x = Integer.parseInt(stringX);

    String stringY = scanner.next();
    double y = Double.parseDouble(stringY);

    out.printf("%d * %f = %f", x, y, x * y);
    // snippet: /stringParseIntDoubleExample
  }

  public static void stringCharAtExample() {
    // snippet: stringCharAtExample
    // *@\Gradle{runStringCharAtExample}@*
    String s = "YMCA";
    for (int i = 0; i < s.length(); i++)
      out.println(s.charAt(i));
    // snippet: /stringCharAtExample
  }

  public static void stringTrimExample() {
    // snippet: stringTrimExample
    // *@\Gradle{runStringTrimExample}@*
    String s = " \t\n\r I need my hair cut!\n \t";
    out.println(s.trim());
    // snippet: /stringTrimExample
  }

  public static void stringIndexOfExample() {
    // snippet: stringIndexOfExample
    // *@\Gradle{runStringIndexOfExample}@*
    String s = "Yeah Yeah Yeah!";
    out.println(s.indexOf("Yeah")); // 0
    out.println(s.lastIndexOf("Yeah")); // 10
    // snippet: /stringIndexOfExample
  }

  public static void stringIsBlankExample() {
    // snippet: stringIsBlankExample
    // *@\Gradle{runStringIsBlankExample}@*
    String s = "   \t\n";
    out.println("Empty: " + s.isEmpty());
    out.println("Blank: " + s.isBlank());
    // snippet: /stringIsBlankExample
  }

  public static void stringSubstringExample() {
    // snippet: stringSubstringExample
    // *@\Gradle{runStringSubstringExample}@*
    String s = "All glory to the Hypnotoad!";
    out.println(s.substring(17)); // Hypnotoad!
    out.println(s.substring(4, 9)); // glory
    // snippet: /stringSubstringExample
  }

  public static void stringToUpperCaseExample() {
    // snippet: stringToUpperCaseExample
    // *@\Gradle{runStringToUpperCaseExample}@*
    String input = "Yes";
    if (input.toUpperCase().equals("YES"))
      out.println("Agreed!");
    // snippet: /stringToUpperCaseExample
  }

  public static void stringReplaceExample() {
    // snippet: stringReplaceExample
    // *@\Gradle{runStringReplaceExample}@*
    String s = "The CAKE is a lie!";
    String s2 = s.replace('A', 'O');
    out.println(s2); // The COKE is a lie!
    // snippet: /stringReplaceExample
  }

  public static void stringStartsEndsWithExample() {
    // snippet: stringStartsEndsWithExample
    // *@\Gradle{runStringStartsEndsWithExample}@*
    String story = "Once upon a time...";
    out.println(story.startsWith("Once")); // true
    out.println(story.endsWith("...")); // true
    // snippet: /stringStartsEndsWithExample
  }

  public static void stringIdentityExample() {
    // snippet: stringIdentityExample
    // *@\Gradle{runStringIdentityExample}@*
    String x = "Cake";
    String y = "Coke".replace('o', 'a');
    out.printf("%s == %s : %b%n", x, y, x == y);
    // snippet: /stringIdentityExample
  }

  public static void stringEqualsExample() {
    // snippet: stringEqualsExample
    // *@\Gradle{runStringEqualsExample}@*
    String x = "Cake";
    String y = "Coke".replace('o', 'a');
    out.printf("%s equals %s : %b%n", x, y, x.equals(y));
    // snippet: /stringEqualsExample
  }

  public static void stringCompareToExample() {
    // snippet: stringCompareToExample
    // *@\Gradle{runStringCompareToExample}@*
    String s = "Auer";
    out.println(s.compareTo("Aaronson")); // 20
    out.println(s.compareTo("Zukowski")); // -25
    // snippet: /stringCompareToExample
  }
}



