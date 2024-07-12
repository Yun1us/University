package potionbrewery;

import java.util.Objects;

public class Ingredient extends BreweryItem {

  private final String effect;
  private final int potency; 

  public Ingredient(String name, int value, String effect, int potency){
    super(name, value);

    if (effect == null || effect.isEmpty())
      throw new IllegalArgumentException("Effect must be not null or empty");

    if (potency <= 0)
      throw new IllegalArgumentException("potency must be positive");

    this.effect = effect;
    this.potency = potency;

  }

  public String getEffect() {
    return effect;
  }

  public int getPotency() {
    return potency;
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect,super.hashCode(), effect, potency);
  }

  @Override
  public boolean equals(Object other){

    if (!super.equals(other))
      return false;

    Ingredient otherIngredient = (Ingredient) other;

    if (!otherIngredient.effect.equals(this.effect))
      return false;

    if (otherIngredient.potency != this.potency)
      return false;

    return true;

  }

  @Override
  public String toString(){
    return String.format("%s, effect=%s, potency=%d",
        super.toString(), effect, potency);
  }



}
