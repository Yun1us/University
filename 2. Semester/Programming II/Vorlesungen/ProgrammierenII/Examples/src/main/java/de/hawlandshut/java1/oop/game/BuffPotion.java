package de.hawlandshut.java1.oop.game;

/**
 * A buff potion can be consumed by a player to alter its attack/defense stats.
 */
public final class BuffPotion extends Item {
  private final int attackBuff;
  private final int defenseBuff;

  /**
   * Initializes a Buff Potion that alters the attack and defense values.
   * @param name Name of the potion
   * @param value Gold value of the potion
   * @param attackBuff Amount of attack power the potion increases (decreases)
   * @param defenseBuff Amount of attack power the potion increases (decreases)
   */
  public BuffPotion(String name, int value, int attackBuff, int defenseBuff) {
    super(name, value);
    this.attackBuff = attackBuff;
    this.defenseBuff = defenseBuff;
  }

  public int getAttackBuff() {
    return attackBuff;
  }

  public int getDefenseBuff() {
    return defenseBuff;
  }

  // snippet: use
  @Override
  public void use(Player player){
    super.use(player);
    player.changeAttackPower(attackBuff);
    player.changeDefensePower(defenseBuff);
  }
  // snippet: /use


  @Override
  public String toString() {
    return String.format("%s, BuffPotion: attackBuff = %d, defenseBuff = %d ", 
        super.toString(), attackBuff, defenseBuff);
  }
}


