package de.hawlandshut.java1.oop.game;

/**
 * A health potion can be consumed by a player for healing (increasing health).
 */
// snippet: class
public final class HealthPotion extends Item {
// snippet: /class
  private final int health;

  /**
   * Initializes a Health Potion that heals the player.
   * @param name Name of the potion
   * @param value Gold value of the potion
   * @param attackBuff Amount of health the potion increases (positive)
   */
  public HealthPotion(String name, int value, int health) {
    super(name, value);
    this.health = health;
  }

  // snippet: use
  @Override
  public void use(Player player){
    player.changeHealth(health);
  }
  // snippet: /use

  @Override
  public String toString() {
    return String.format("%s, HealthPotion: health = %d", 
        super.toString(), health);
  }

  // snippet: doublePotentVersion
  @Override
  public HealthPotion doublePotentVersion() {
    return new HealthPotion(
        "Even healthier " + getName(), 
        2*getValue(), 2*health);
  }
  // snippet: /doublePotentVersion
  //
  public int getHealth() {
    return health;
  }
}



