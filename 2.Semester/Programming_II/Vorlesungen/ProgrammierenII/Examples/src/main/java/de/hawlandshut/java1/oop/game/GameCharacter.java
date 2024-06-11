package de.hawlandshut.java1.oop.game;

import java.util.Objects;

/**
 * Models a game character.
 */
// snippet: class
public abstract class GameCharacter
// snippet: /class
{
  private String name;
  private int health;
  private int x;
  private int y;

  /**
   * Initializes the game character.
   * @param name Name of the game character
   * @param health inital health of the game character
   * @param x initial x position of the character
   * @param y initial y position of the character
   */
  // snippet: initConstructor
  public GameCharacter(String name, int health, int x, int y) {
    this.name = name;
    this.health = health;
    this.x = x;
    this.y = y;
  }
  // snippet: /initConstructor

  /**
   * Copy constructor.
   */
  // snippet: copyConstructor
  public GameCharacter(GameCharacter gameCharacter){
    this.name = gameCharacter.getName();
    this.health = gameCharacter.getHealth();
    this.x = gameCharacter.getX();
    this.y = gameCharacter.getY();
  }
  // snippet: /copyConstructor

  /**
   * Updates the state of the game character.
   * The game character chooses its actions in this method, e.g., it may
   * move around, talk or attack.
   */
  // snippet: update
  public abstract void update();
  // snippet: /update

  /**
   * Changes the health of the game character.
   * The health is capped to 0 from below.
   * @param amount amount by which health is changed
   */
  public void changeHealth(int amount) {
    this.health = Math.max(health + amount, 0);
  }

  /**
   * Returns if the character is alive ({@code health>0})
   * @return {@code true} if alive, {@code false} otherwise
   */
  public boolean isAlive() {
    return health > 0;
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public int getX() { 
    return x; 
  }

  public int getY() {
    return y;
  }

  /**
   * Moves the character along the x and y direction
   * @param dx movement along x
   * @param dy movement along y
   */
  // snippet: move
  protected final void move(int dx, int dy) {
    x += dx;
    y += dy;
  }
  // snippet: /move

  // snippet: toString
  @Override
  public String toString() {
    return String.format(
        "%s: name=\"%s\", health=%d, x=%d, y=%d",
        getClass().getSimpleName(), name, health, x, y);
  }
  // snippet: /toString

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + health;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }

// snippet: equals
@Override
public boolean equals(Object obj) {
  if (this == obj) return true;
  if (obj == null) return false;
  if (getClass() != obj.getClass()) return false;

  GameCharacter other = (GameCharacter) obj;
  if (health != other.health) return false;
  if (!Objects.equals(name, other.name)) return false;
  if (x != other.x) return false;
  if (y != other.y) return false;

  return true;
}
// snippet: /equals


  

}


