package de.hawlandshut.java1.oop.game;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

/**
 * Models the player.
 */
// snippet: class
public class Player extends GameCharacter
// snippet: /class
{

  // snippet: simpleAttributes
  private int attackPower;
  private int defensePower;
  private int gold;
  // snippet: /simpleAttributes
  private ArrayList<Item> inventory;
  private Scanner scanner;

  /**
   * Initializes the player with 100 health and placed at the origin.
   * @param gold Initial gold
   * @param attackPower Attack power of the player
   * @param defensePower Dense of the player
   * @param inventory Inventory items of the player
   */
  public Player(int attackPower, int defensePower, int gold, ArrayList<Item> inventory) {
    super("Geralt von Riva", 100, 0, 0);
    this.gold = gold;
    this.attackPower = attackPower;
    this.defensePower = defensePower;
    this.inventory = inventory;
  }

  /**
   * Initializes the player with 100 health and placed at the origin and a null inventory.
   * @param gold Initial gold
   * @param attackPower Attack power of the player
   * @param defensePower Dense of the player
   */
  // snippet: initConstructorNoInventory
  public Player(int gold, int attackPower, int defensePower) {
    super("Geralt von Riva", 100, 0, 0);
    this.gold = gold;
    this.attackPower = attackPower;
    this.defensePower = defensePower;
  }
  // snippet: /initConstructorNoInventory


  // snippet: defaultConstructor
  public Player(){
    this(0,1,1);
  }
  // snippet: /defaultConstructor

  // snippet: copyConstructor
  public Player(Player other){
    super(other);
    this.gold = other.getGold();
    this.attackPower = other.getAttackPower();
    this.defensePower = other.getDefensePower();
  }
  // snippet: /copyConstructor

  public int getGold() {
    return gold;
  }

  public int getDefensePower() {
    return defensePower;
  }

  public int getAttackPower() {
    return attackPower;
  }

  /**
   * Changes the defense power by the given amount
   * @param change change to defense power
   */
  public void changeDefensePower(int change){
    defensePower += change;
  }

  /**
   * Changes the attack power by the given amount
   * @param change change to attack power
   */
  public void changeAttackPower(int change){
    attackPower += change;
  }

  @Override
  // snippet: update
  public void update() {
    out.println("Wohin? (wasd)");
    // ...
  // snippet: /update
    boolean validInput = true;

    if (scanner == null)
      scanner = new Scanner(System.in);

    // move player by wasd-scheme
    do {
      validInput = true;
      String input = scanner.nextLine().trim();

      switch (input){
        case "w": 
          move(0,+1); 
          break;

        case "s": 
          move(0,-1); 
          break;

        case "a": 
          move(-1,0); 
          break;

        case "d": 
          move(+1,0); 
          break;

        default:
          validInput = false;
          break;
      }

    } while (!validInput);
  }

  /**
   * Uses the item from the inventory and removes if it is a potion.
   * @param index Index of the item in the inventory.
   */
  public void useInventoryItem(int index){
  }

  /**
   * Buy item of the given index from the merchant.
   * The player must have enough money to buy the item.
   * @param merchant Merchant to buy from
   * @param index Index of the item in the merchant's stock to buy
   */
  public void buyFromMerchant(Merchant merchant, int index){
    if (merchant.getStock()[index].getValue() > gold)
      throw new IllegalArgumentException("Not enough money to buy this item!");
    
    Item item = merchant.buy(index);
    gold -= item.getValue();
    inventory.add(item);
  }

  // snippet: toString
  @Override
  public String toString() {
    return String.format(
        "%s, attackPower=%d, defensePower=%d, #inventory=%d",
        super.toString(), attackPower, 
        defensePower, inventory != null ? inventory.size() : 0);
  }
  // snippet: /toString

  // snippet: clone
  @Override public Player clone() 
      throws CloneNotSupportedException{
    return (Player) super.clone();
  }
  // snippet: /clone

}


