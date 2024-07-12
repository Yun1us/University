package potionbrewery;

import java.util.Objects;

public abstract class BreweryItem {

  private final String name;
  private final int value;

  public BreweryItem(String name, int value){
    if (name == null || name.isEmpty())
      throw new IllegalArgumentException("name must not be null or empty");

    if (value < 0)
      throw new IllegalArgumentException("value must not be negative");

    this.name = name;
    this.value = value;
  }

  public String getName(){
    return name;
  }

  public int getValue(){
    return value;
  }

  @Override
  public int hashCode(){
    return Objects.hash(name, value);
  }

  @Override
  public boolean equals(Object other){

    if (other == null)
      return false;

    if (other == this)
      return true;

    if (other.getClass() != this.getClass())
      return false;

    BreweryItem otherBreweryItem = (BreweryItem) other;

    if (!otherBreweryItem.name.equals(this.name))
      return false;

    if (otherBreweryItem.value != this.value)
      return false;

    return true;

  }

  @Override
  public String toString(){
    return String.format("%s: %s, value=%d",
        this.getClass().getSimpleName(),
        this.name,
        this.value);
  }




}
