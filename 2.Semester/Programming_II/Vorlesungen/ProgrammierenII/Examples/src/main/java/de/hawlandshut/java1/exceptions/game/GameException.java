package de.hawlandshut.java1.exceptions.game;

// snippet: class
public class GameException extends Exception{

  private static final long serialVersionUID 
    = -3573120189683177891L;

  public GameException(String message){ super(message); }

  public GameException(Throwable cause){ super(cause); }

  public GameException(String message, Throwable cause){
    super(message, cause);
  }

}
// snippet: /class
