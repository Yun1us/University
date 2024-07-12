package potionbrewery;

import java.util.Objects;

public class Potion extends BreweryItem{

  private final Ingredient mainIngredient;
  private final Ingredient effectIngredient;
  private final Ingredient potencyIngredient;

  public Potion(Ingredient mainIngredient, Ingredient effectIngredient, Ingredient potencyIngredient){

    super(
        String.format("%s %s (%d)", 
          effectIngredient.getEffect(), 
          mainIngredient.getName(), 
          potencyIngredient.getPotency()),
        mainIngredient.getValue() + effectIngredient.getValue() * potencyIngredient.getPotency());

    this.mainIngredient = mainIngredient;
    this.effectIngredient = effectIngredient;
    this.potencyIngredient = potencyIngredient;
  }

  public Ingredient getMainIngredient(){
    return mainIngredient;
  }

  public Ingredient getEffectIngredient(){
    return effectIngredient;
  }

  public Ingredient getPotencyIngredient(){
    return potencyIngredient;
  }

  @Override
  public int hashCode(){
    return Objects.hash(super.hashCode(), 
        mainIngredient.hashCode(), effectIngredient.hashCode(), potencyIngredient.hashCode());
  }

  @Override
  public boolean equals(Object other){

    if (!super.equals(other))
      return false;

    Potion otherPotion = (Potion) other;

    if (!otherPotion.mainIngredient.equals(this.mainIngredient))
      return false;

    if (!otherPotion.effectIngredient.equals(this.effectIngredient))
      return false;

    if (!otherPotion.potencyIngredient.equals(this.potencyIngredient))
      return false;

    return true;
  }



}
