package de.hawlandshut.java1.oopbasics;

public class WeekdayBetaUtils {

  // snippet: getGermanName
  public static String getGermanName(WeekdayBeta weekday){
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
  // snippet: /getGermanName

  // snippet: isWorkday
  public static boolean isWorkday(WeekdayBeta weekday){
    return (weekday != WeekdayBeta.SATURDAY &&
      weekday != WeekdayBeta.SUNDAY);
  }
  // snippet: /isWorkday
}

