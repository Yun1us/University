package de.hawlandshut.java1.oop.game;

// snippet: class
public abstract class Enemy extends GameCharacter
{
  private final int attackPower;

  public Enemy(String name, int x, int y, int health, int attackPower) {
    super(name, health, x, y);
    this.attackPower = attackPower;
  }

  public int getAttackPower() {
    return attackPower;
  }
// snippet: /class

  @Override public String toString() {
    return String.format("%s, attackPower=%d", 
        super.toString(), attackPower);
  }
}

