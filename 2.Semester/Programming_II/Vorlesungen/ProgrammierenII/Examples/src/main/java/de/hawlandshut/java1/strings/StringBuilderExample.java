package de.hawlandshut.java1.strings;

public class StringBuilderExample
{
  private static void printInfo(StringBuilder builder){

    System.out.printf("\"%s\" (L:%d, C:%d)%n", builder.toString(), builder.length(), builder.capacity());
  }

  public static void stringBuilderExample() {
    // snippet: stringBuilderExample
    // *@\Gradle{runStringBuilderExample}@*
    StringBuilder builder = new StringBuilder(10);

    builder.append("Die Fläche");
    printInfo(builder);

    builder.append(' ');
    printInfo(builder);

    builder.append("Kreises");
    printInfo(builder);

    builder.insert(10, " eines");
    printInfo(builder);

    builder.append(" mit Radius ");
    printInfo(builder);

    builder.append(2.3);
    printInfo(builder);

    builder.append(" ist ");
    printInfo(builder);

    builder.append(2.3 * 2.3 * Math.PI);
    printInfo(builder);

    builder.delete(25, 40);
    printInfo(builder);
    // snippet: /stringBuilderExample
  }
}


