package de.hawlandshut.java1.basics;

public class Operators
{

  public static void divisionByZero(){
    // snippet: divisionByZero
    // *@\Gradle{runDivisionByZero}@*
    int p = 10;
    int q = 0;
    System.out.printf("%d / %d = %d", p, q, p/q);
    // snippet: /divisionByZero
  }

  public static void floatPrecisionExample() {
    // snippet: floatPrecisionExample
    // *@\Gradle{runFloatPrecisionExample}@*
    float f1 = 1.0f;
    float f2 = 1.001f;
    System.out.printf("%.15f%n", f2 - f1);
    // snippet: /floatPrecisionExample
    
  }

  public static void floatModuloExample() {
    // snippet: floatModuloExample
    // *@\Gradle{runFloatModuloExample}@*
    System.out.println(5.0 % 2.0);  // 1.0
    System.out.println(5.25 % 2.0); // 1.25
    System.out.println(5.0 % 2.5);  // 0.0
    System.out.println(5.25 % 2.5); // 0.25
    // snippet: /floatModuloExample
  }

  public static double truncate(double x) {
    return x < 0.0 ? Math.ceil(x) : Math.floor(x);
  }

  // snippet: floatManualModulo
  public static double fmod(double p, double q){
    double d = truncate(p / q); // verwirft Nachkommastellen
    return p - d * q;
  }

  public static void floatManualModuloExample() {
    // *@\Gradle{runFloatManualModulo}@*
    System.out.println(fmod(5.0, 2.0));  // 1.0
    System.out.println(fmod(5.25, 2.0)); // 1.25
    System.out.println(fmod(5.0, 2.5));  // 0.0
    System.out.println(fmod(5.25, 2.5)); // 0.25

  }
  // snippet: /floatManualModulo

  public static void incrementDecrementExample() {
    // snippet: incrementDecrementExample
    // *@\Gradle{runIncrementDecrementExample}@*
    int i = 0;
    System.out.printf("i++ : %d%n", i++); // 0
    System.out.printf("i   : %d%n", i);   // 1
    System.out.printf("--i : %d%n", --i); // 0
    System.out.printf("i   : %d%n", i);   // 0
    // snippet: /incrementDecrementExample
  }

  public static void intEqualityExample() {
    // snippet: intEqualityExample
    // *@\Gradle{runIntEqualityExample}@*
    int i = 42;
    byte b = 42;

    System.out.printf("i == 42 : %b%n", i == 42); // true
    System.out.printf("i == b : %b%n", i == b); // true
    // snippet: /intEqualityExample
  }

  public static void referenceEqualityExample() {
    // snippet: referenceEqualityExample
    // *@\Gradle{runReferenceEqualityExample}@*
    CelestialBody iss = new CelestialBody("ISS", 419_700d);
    CelestialBody iss2 = iss;
    CelestialBody issDup = new CelestialBody("ISS", 419_700d);

    System.out.printf("iss == iss2 : %b%n", iss == iss2); // true
    System.out.printf("iss ==  issDup: %b%n", iss == issDup); // false
    // snippet: /referenceEqualityExample
  }

  public static void floatEqualityExample() {
    // snippet: floatEqualityExample
    // *@\Gradle{runFloatEqualityExample}@*
    float f1 = 1f;
    float f2 = 1.001f;

    System.out.printf("f1 == 1f : %b%n", f1 == 1f); // true
    System.out.printf("f2 - f1 == 0.001 : %b%n", 
        (f2-f1 == 0.001f)); // false
    // snippet: /floatEqualityExample
  }


  public static void floatInequalityExample() {
    // snippet: floatInequalityExample
    // *@\Gradle{runFloatInequalityExample}@*
    float f1 = 1f;
    float f2 = 1.001f;

    System.out.printf("f2 - f1 > 0.001 : %b%n", 
        (f2-f1 > 0.001f)); // true
    // snippet: /floatInequalityExample
  }

  private static String toBinary(int x){
    return Integer.toBinaryString(x);
  }

  public static void bitmaskExample() {
    // snippet: bitmaskExample
    // *@\Gradle{runBitmaskExample}@*
    final int OPTION_1 = 1 << 0;
    final int OPTION_2 = 1 << 1;
    final int OPTION_3 = 1 << 2;

    System.out.printf("OPTION_1 = %s%n", toBinary(OPTION_1));
    System.out.printf("OPTION_2 = %s%n", toBinary(OPTION_2));
    System.out.printf("OPTION_3 = %s%n", toBinary(OPTION_3));

    int selection = OPTION_2 | OPTION_3;
    System.out.printf("selection = %s%n", toBinary(selection));

    int inverted = ~selection;
    System.out.printf("inverted = %s%n", toBinary(inverted));

    int anotherSelection = OPTION_1 | OPTION_3;

    int union = selection | anotherSelection;
    System.out.printf("union = %s%n", toBinary(union));

    int intersection = selection & anotherSelection;
    System.out.printf("intersection = %s%n", toBinary(intersection));
    // snippet: /bitmaskExample

  }

  public static void bitMultiplicationExample() {
    // snippet: bitMultiplicationExample
    // *@\Gradle{runBitMultiplicationExample}@*
    int i = 1337;
    System.out.printf("D: %8d B: %s%n", i, toBinary(i));
    System.out.printf("D: %8d B: %s%n", i << 5, toBinary(i << 5));
    System.out.printf("D: %8d B: %s%n", i >> 5, toBinary(i >> 5));
    // snippet: /bitMultiplicationExample

    
  }

  public static void intAssignmentOperationExample() {
    // snippet: intAssignmentOperationExample
    // *@\Gradle{runIntAssignmentOperationExample}@*
    int i = 1;
    i += 1;     // i == 2
    i *= (i+1); // i = i * (i+1) = 2 * 3 = 6
    i <<= 2;    // i = 4 * i = 24
    i |= 0b1;   // i == 25
    // snippet: /intAssignmentOperationExample
    System.out.printf("%d%n", i);
  }


  public static void assignmentOperationExample() {
    // snippet: assignmentOperationExample
    // *@\Gradle{runAssignmentOperationExample}@*
    int i = 0;
    i += Math.PI; 
    System.out.printf("%d%n", i); // 3
    // snippet: /assignmentOperationExample
    
  }

  // snippet: isEven
  public static boolean isEven(int i){
    boolean isEven = (i % 2 == 0);
    System.out.printf("isEven(%d) == %b%n", i, isEven);
    return isEven;
  }
  // snippet: /isEven

  public static void logicOperatorsExample() {
    // snippet: logicOperatorsExample
    // *@\Gradle{runLogicOperatorsExample}@*
    int two = 2, five = 5, nine = 9;
    boolean result;

    result = !isEven(five);
    System.out.printf("!isEven(five): %b%n%n", result);
    
    result = isEven(two) && isEven(five);
    System.out.printf("isEven(two) && isEven(five): %b%n%n", result);

    result = isEven(five) && isEven(nine);
    System.out.printf("isEven(five) && isEven(nine): %b%n%n", result);

    result = isEven(two) || !isEven(nine);
    System.out.printf("isEven(two) || !isEven(nine): %b%n%n", result);

    result = isEven(two) ^ isEven(nine);
    System.out.printf("isEven(two) ^ !isEven(nine): %b%n%n", result);
    // snippet: /logicOperatorsExample
    
  }

  public static void nonBypassLogicOperatorsExample() {
    // taken from [Insel]
    // snippet: nonBypassLogicOperatorsExample
    // *@\Gradle{runNonBypassLogicOperatorsExample}@*
    int a = 0, b = 0, c = 0, d = 0;
    System.out.println( true || a++ == 0 );  // true, a nicht erhöht
    System.out.println( a );                 // 0
    System.out.println( true | b++ == 0 );   // true, b erhöht
    System.out.println( b );                 // 1
    System.out.println( false && c++ == 0 ); // false, c nicht erhöht
    System.out.println( c );                 // 0
    System.out.println( false & d++ == 0 );  // false, d erhöht
    System.out.println( d );                 // 1
    // snippet: /nonBypassLogicOperatorsExample
  }

  public static void concatenationExample(){
    // snippet: concatenationExample
    // *@\Gradle{runConcatenationExample}@*
    System.out.println("Hello" + " " + "World!");
    System.out.println("Antwort: " + 42);
    System.out.println(381 + " ist durch 3 teilbar: " + (381%3==0));

    CelestialBody superman = new CelestialBody("Superman", 100);
    System.out.println("It's a bird, it's a plane, it's " + superman);       
    // snippet: /concatenationExample
  }

  // snippet: instanceOfExample
  // *@\Gradle{runInstanceOfExample}@*
  public static void instanceOfExample(Object mystery) {
    boolean result;
    System.out.printf("%nmystery: %s%n", mystery);

    result = mystery instanceof Object;
    System.out.printf("mystery instanceof Object: %b%n", result);

    result = mystery instanceof String;
    System.out.printf("mystery instanceof String: %b%n", result);

    result = mystery instanceof Double;
    System.out.printf("mystery instanceof Double: %b%n", result);

    result = mystery instanceof Number;
    System.out.printf("mystery instanceof Number: %b%n", result);
  }
  // snippet: /instanceOfExample

  public static void conditionalOperatorExample() {
    // snippet: conditionalOperatorExample
    // *@\Gradle{runConditionalOperatorExample}@*
    int i = 5, j = 10, k = 7;

    String text = i % 2 == 0 ? "gerade" : "ungerade";
    System.out.printf("i ist %s%n", text);

    boolean largerIsEven = i < j ? isEven(j) : isEven(i);
    System.out.printf("Die größere Zahl ist gerade: %b%n", largerIsEven);

    int max = i < j ? (k < j ? j : k) : (i < k ? k : i);
    System.out.printf("Größte Zahl: %d%n", max);
    // snippet: /conditionalOperatorExample
  }

}


