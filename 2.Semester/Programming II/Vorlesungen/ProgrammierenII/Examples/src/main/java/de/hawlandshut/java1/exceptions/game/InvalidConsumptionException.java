package de.hawlandshut.java1.exceptions.game;

// snippet: class
public class InvalidConsumptionException 
  extends GameException {
// snippet: /class

  private static final long serialVersionUID = -4871581307771102737L;

  public InvalidConsumptionException(String message){ super(message); }

  public InvalidConsumptionException(Throwable cause){ super(cause); }

  public InvalidConsumptionException(String message, Throwable cause){
    super(message, cause);
  }

}
