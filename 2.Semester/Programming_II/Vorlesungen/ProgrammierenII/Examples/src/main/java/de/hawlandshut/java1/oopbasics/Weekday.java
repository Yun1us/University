package de.hawlandshut.java1.oopbasics;

// snippet: enum
public enum Weekday {

  MONDAY("Montag", true),
  TUESDAY("Dienstag", true),
  WEDNESDAY("Mittwoch", true),
  THURSDAY("Donnerstag", true),
  FRIDAY("Freitag", true),
  SATURDAY("Samstag", false),
  SUNDAY("Sonntag", false);

  private final boolean isWorkday;
  private final String germanName;


  private Weekday(String germanName, boolean isWorkday){
    this.germanName = germanName;
    this.isWorkday = isWorkday;
  }

  public boolean isWorkday() {
    return isWorkday;
  }

  public String getGermanName(){
    return germanName;
  }
}
// snippet: /enum


