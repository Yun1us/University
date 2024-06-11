package de.hawlandshut.java1.oop.game;

// snippet: FancierBottle
public class FancierBottle 
  extends FancyBottle implements Container2 {

  public FancierBottle(String name, int value, 
      int volume, int sipsLeft){
    super(name, value, volume, sipsLeft);
  }

  public double percentFull(){
    return Container2.percentFull(this);
  }
}
// snippet: /FancierBottle
