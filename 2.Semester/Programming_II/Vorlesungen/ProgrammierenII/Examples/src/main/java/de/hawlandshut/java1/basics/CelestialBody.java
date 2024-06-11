package de.hawlandshut.java1.basics;

public class CelestialBody
{
  public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11;
  private final double mass;
  private final String name;

  // Konstruktor
  public CelestialBody(String name, double mass)
  {
    this.mass = mass;
    this.name = name;
  }

  // Getter-Methode
  public String getName() {
    return name;
  }

  // Getter-Methode
  public double getMass() {
    return mass;
  }

  // Methode
  public double computeForce(CelestialBody otherBody, double distance){
    return GRAVITATIONAL_CONSTANT 
      * mass * otherBody.getMass() / (distance*distance);
  }

}
