package de.hawlandshut.java1.oopbasics;

public class WeekdayExamples
{
  // snippet: weekdayExample
  // *@\Gradle{runWeekdayExample}@*
  public static void weekdayExample(Weekday day) {
    System.out.printf("%s: ", day.getGermanName());

    if (day.isWorkday()){
      if (day == Weekday.FRIDAY){
        System.out.println("Hoch die Hände, Wochenende!");
      }else{
        System.out.println("An die Arbeit!");
      }
    }else{
      System.out.println("Yes, weekend!");
    }
  }
  // snippet: /weekdayExample


  public static void enumSwitchCaseExample(Weekday day) {
    // snippet: enumSwitchCaseExample
    // *@\Gradle{runEnumSwitchCaseExample}@*
    switch (day){
      case MONDAY: case TUESDAY: case WEDNESDAY:
        System.out.println("Hmpff!");
        break;

      case THURSDAY: case FRIDAY:
        System.out.println("Eigentlich schon Wochenende!");
        break;

      case SATURDAY: case SUNDAY:
        System.out.println("Wochenende!");
        break;
    }
    // snippet: /enumSwitchCaseExample
  }

  public static void enumValuesExample() {
    // snippet: enumValuesExample
    // *@\Gradle{runEnumValuesExample}@*
    for (var day : Weekday.values())
      System.out.printf("%s%n", day.getGermanName());
    // snippet: /enumValuesExample
  }

  public static void enumValueOfExample() {
    // snippet: enumValueOfExample
    Weekday.valueOf("FRIDAY"); // == Weekday.FRIDAY;
    // snippet: /enumValueOfExample
  }

  public static void enumOrdinalExample() {
    // snippet: enumOrdinalExample
    // *@\Gradle{runEnumOrdinalExample}@*
    for (var day : Weekday.values())
      System.out.printf("%s: %d%n", day.name(), day.ordinal());
    // snippet: /enumOrdinalExample
  }
}


