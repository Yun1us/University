package de.hawlandshut.java1.basics;

public class PrimitiveTypes
{
  private static void println(String s){
    System.out.println(s);
  }

  public static void unicodeExample(){
    // snippet: unicodeExample
    // *@\Gradle{runUnicodeExample}@*
    char j = '\u0399';  // Greek capital Iota
    char a = '\u03AC';  // Greek small Alpha with Tonos
    char v = '\u03B2';  // Greek small Beta
    char a2 = '\u03B1'; // Greek small Alpha

    System.out.printf("%c%c%c%c%n", j, a, v, a2);
    // snippet: /unicodeExample
  }

  public static void integerNumberLiteralsExample() {
    // snippet: integerNumberLiteralsExample
    // *@\Gradle{runIntegerNumberLiteralsExample}@*
    byte b = 0b1111111;
    short s = -077;
    int i = 0x03AC;
    // ohne den Suffix L ist der int-Wert "out of range"
    long l = 0xFFFFFFFFFFL; 

    System.out.printf("b = 0x%x%n", b);
    System.out.printf("s = %d%n", s);
    System.out.printf("i = 0%o%n", i);
    System.out.printf("l = 0b%s%n", Long.toBinaryString(l));
    // snippet: /integerNumberLiteralsExample
    
  }

  public static void printTypeRanges(){
    // snippet: printTypeRanges
    // *@\Gradle{runPrintTypeRanges}@*
    println("boolean: "+Boolean.FALSE+", "+Boolean.TRUE);
    println("char: "+Character.MIN_VALUE+" - "+Character.MAX_VALUE);
    println("byte: "+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
    println("short: "+Short.MIN_VALUE+" - "+Short.MAX_VALUE);
    println("int: "+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);
    println("long: "+Long.MIN_VALUE+" - "+Long.MAX_VALUE);
    println("float: "+Float.MIN_VALUE+" - "+Float.MAX_VALUE);
    println("double: "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
    // snippet: /printTypeRanges
  }

  public static void wideningConversionExample() {
    // snippet: wideningConversionExample
    // *@\Gradle{runWideningConversionExample}@*
    byte b = 21;
    short s = b;
    int i = s;
    long l = i;
    float f = l;
    double d = f;
    println("b = " + b); // b = 21
    println("s = " + s); // s = 21
    println("i = " + i); // i = 21
    println("l = " + l); // l = 21
    println("f = " + f); // f = 21.0
    println("d = " + d); // d = 21.0
    // snippet: /wideningConversionExample
  }

  public static void narrowingConversionExample() {
    // snippet: narrowingConversionExample
    // *@\Gradle{runNarrowingConversionExample}@*
    double d = Math.pow(Math.PI, 20);
    float f = (float) d; // expliziter cast
    long l = (long) f;
    int i = (int) l;
    short s = (short) i;
    byte b = (byte) s;
    println("d = " + d); // d = 8.769956796082693E9
    println("f = " + f); // f = 8.7699569E9
    println("l = " + l); // l = 8769956864
    println("i = " + i); // i = 180022272
    println("s = " + s); // s = -5120
    println("b = " + b); // b = 0
    // snippet: /narrowingConversionExample
  }

  public static void overflowExample() {
    // snippet: overflowExample
    // *@\Gradle{runOverflowExample}@*
    byte b = Byte.MAX_VALUE;
    println("byte: ++b = " + (++b));

    short s = Short.MAX_VALUE;
    println("short: ++s = " + (++s));

    int i = Integer.MAX_VALUE;
    println("int: ++i = " + (++i));

    long l = Long.MAX_VALUE;
    println("long: ++l = " + (++l));
    // snippet: /overflowExample
    
  }

  public static void overflowExample2() {
    // snippet: overflowExample2
    // *@\Gradle{runOverflowExample2}@*
    byte b = Byte.MAX_VALUE;
    println("byte: b+1 = " + (b+1));

    short s = Short.MAX_VALUE;
    println("short: s+1 = " + (s+1));

    int i = Integer.MAX_VALUE;
    println("int: i+1 = " + (i+1));

    long l = Long.MAX_VALUE;
    println("long: l+1 = " + (l+1));
    // snippet: /overflowExample2
  }



}


