
package de.hawlandshut.java1.exceptions.game;

// snippet: class
public class InvalidReplenishmentException 
  extends GameException {
// snippet: /class

private static final long serialVersionUID = -7446572239934813533L;

public InvalidReplenishmentException(String message){ super(message); }

  public InvalidReplenishmentException(Throwable cause){ super(cause); }

  public InvalidReplenishmentException(String message, Throwable cause){
    super(message, cause);
  }

}
