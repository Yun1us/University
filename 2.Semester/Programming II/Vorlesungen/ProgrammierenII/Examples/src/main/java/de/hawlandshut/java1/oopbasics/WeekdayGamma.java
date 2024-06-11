package de.hawlandshut.java1.oopbasics;

// snippet: class
public class WeekdayGamma
{
  public enum Weekday { 
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }

  public static String getGermanName(Weekday weekday){
    switch (weekday) {
      case MONDAY:    return "Montag";
      case TUESDAY:   return "Dienstag";
      case WEDNESDAY: return "Mittwoch";
      case THURSDAY:  return "Donnerstag";
      case FRIDAY:    return "Freitag";
      case SATURDAY:  return "Samstag";
      case SUNDAY:    return "Sonntag";
      // never happens (or will it?)
      default: return null; 
    }
  }

  public static boolean isWorkday(Weekday weekday){
    return (weekday != Weekday.SATURDAY &&
      weekday != Weekday.SUNDAY);
  }
}
// snippet: /class


