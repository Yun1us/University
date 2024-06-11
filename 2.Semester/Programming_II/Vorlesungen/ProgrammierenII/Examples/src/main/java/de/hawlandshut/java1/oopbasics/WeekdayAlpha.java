package de.hawlandshut.java1.oopbasics;

public class WeekdayAlpha {

  // snippet: weekdays
  public static final int MONDAY    = 0;
  public static final int TUESDAY   = 1;
  public static final int WEDNESDAY = 2;
  public static final int THURSDAY  = 3;
  public static final int FRIDAY    = 4;
  public static final int SATURDAY  = 5;
  public static final int SUNDAY    = 6;
  // snippet: /weekdays

  // snippet: getGermanName
  public static String getGermanName(int weekday){
    switch (weekday) {
      case MONDAY:    return "Montag";
      case TUESDAY:   return "Dienstag";
      case WEDNESDAY: return "Mittwoch";
      case THURSDAY:  return "Donnerstag";
      case FRIDAY:    return "Freitag";
      case SATURDAY:  return "Samstag";
      case SUNDAY:    return "Sonntag";
      default:
        throw new IllegalArgumentException("Invalid weekday");
    }
  }
  // snippet: /getGermanName

  // snippet: isWorkday
  public static boolean isWorkday(int weekday){
    if (weekday < 0 || weekday > 6)
      throw new IllegalArgumentException("Invalid weekday");
    return weekday < 5;
  }
  // snippet: /isWorkday
  
}
