package de.hawlandshut.java1.strings;

import static java.lang.System.out;

public class CharExpressions {
  
  public static void charPromotionExample() {
    // snippet: charPromotionExample
    // *@\Gradle{runCharPromotionExample}@*
    out.println('a' + 1); // 98
    out.println('b' / 2); // 49
    out.println('b' > 'a'); // true
    // snippet: /charPromotionExample
  }

  public static void charComparisonExample() {
    // snippet: charComparisonExample
    // *@\Gradle{runCharComparisonExample}@*
    out.println('b' < 'd'); // true
    out.println('K' < 'M'); // true
    out.println('0' < '5'); // true
    out.println('Ä' < 'B'); // false
    out.println('a' < 'A'); // false
    // snippet: /charComparisonExample
  }

  public static void charUpperLowerCaseExample() {
    // snippet: charUpperLowerCaseExample
    // *@\Gradle{runCharUpperLowerCaseExample}@*
    out.println(Character.isUpperCase('A'));//true
    out.println(Character.isLowerCase('A'));//false
    out.println(Character.isUpperCase('Ä'));//true
    out.println(Character.isUpperCase('0'));//false
    out.println(Character.isLowerCase('0'));//false
    // snippet: /charUpperLowerCaseExample
  }

  public static void charIsDigitExample() {
    // snippet: charIsDigitExample
    // *@\Gradle{runCharIsDigitExample}@*
    out.println(Character.isDigit('5'));//true
    out.println(Character.isDigit('F'));//false
    // snippet: /charIsDigitExample
  }

  public static void charIsWhitespaceExample() {
    // snippet: charIsWhitespaceExample
    // *@\Gradle{runCharIsWhitespaceExample}@*
    out.println(Character.isWhitespace(' '));// true
    out.println(Character.isWhitespace('\t'));// true
    out.println(Character.isWhitespace('\n'));// true
    out.println(Character.isWhitespace('_'));// false
    // snippet: /charIsWhitespaceExample
  }

  public static void charToUpperLowerCaseExample() {
    // snippet: charToUpperLowerCaseExample
    // *@\Gradle{runCharToUpperLowerCaseExample}@*
    out.println(Character.toUpperCase('a'));//'A'
    out.println(Character.toUpperCase('A'));//'A'
    out.println(Character.toLowerCase('A'));//'a'
    out.println(Character.toUpperCase('1'));//'1'
    // snippet: /charToUpperLowerCaseExample
  }
}
