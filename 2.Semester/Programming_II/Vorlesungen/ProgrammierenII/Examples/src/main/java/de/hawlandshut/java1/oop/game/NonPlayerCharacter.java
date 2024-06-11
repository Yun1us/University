package de.hawlandshut.java1.oop.game;

import java.util.Objects;

/**
 * Models a non-player characters of the game.
 */
// snippet: class
public class NonPlayerCharacter extends GameCharacter
// snippet: /class
{
  private final String phrase;

  // snippet: initConstructor
  public NonPlayerCharacter(String name, String phrase, int x, int y) {
    super(name, 1, x, y); // health is 1
    this.phrase = phrase;
  }
  // snippet: /initConstructor

  // snippet: copyConstructor
  public NonPlayerCharacter(NonPlayerCharacter other){
    super(other);
    this.phrase = other.getPhrase();
  }
  // snippet: /copyConstructor

  /**
   * Returns what the NPC says.
   * @return Utterance of the NPC.
   */
  // snippet: talk
  public String talk() {
    return String.format("Hello, my name is %s! %s", 
        getName(), phrase);
  }
  // snippet: /talk

  @Override
  // snippet: update
  public void update() {
    System.out.println(talk());
    int dx = (int) Math.round(2*Math.random()-1);
    int dy = (int) Math.round(2*Math.random()-1);
    move(dx,dy);
  }
  // snippet: /update

  // snippet: toString
  @Override
  public String toString() {
    return String.format("%s, phrase=%s", 
        super.toString(), phrase);
  }
  // snippet: /toString

  public String getPhrase() {
    return phrase;
  }

  // snippet: hashCode
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode(); // *@\HIGHLIGHT{NEU}@*
    result = prime * result + ((phrase == null) ? 0 : phrase.hashCode());
    return result;
  }
  // snippet: /hashCode

  // snippet: equals
  @Override
  public boolean equals(Object obj) {
    // *@\HIGHLIGHT{Jetzt optional}@*
    // if (this == obj) return true;
    // if (obj == null) return false;
    // if (getClass() != obj.getClass()) return false;

    if (!super.equals(obj)) // *@\HIGHLIGHT{NEU}@*
      return false;

    NonPlayerCharacter other = (NonPlayerCharacter) obj;
    if (!Objects.equals(phrase, other.phrase))
      return false;

    return true;
  }
  // snippet: /equals






}


