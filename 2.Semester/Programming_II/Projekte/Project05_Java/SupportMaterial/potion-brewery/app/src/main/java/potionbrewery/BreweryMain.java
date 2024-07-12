package potionbrewery;

public class BreweryMain {

  /* ### Brewery
  private static Ingredient iceCube;
  private static Ingredient fireMatch;
  private static Ingredient tapWater;
  private static Ingredient booger;
  private static Ingredient northpoleSnowflake;
  private static Ingredient birdsEyeChili;
  private static Ingredient springWater;
  private static Ingredient squealingChalk;
  private static Ingredient capri;
  private static Ingredient dragonsBreath;
  private static Ingredient unicornHair;
  private static Ingredient unmatchedOpeningParenthesis;

  private static void fillWithIngredients(Brewery brewery){
    for (int i = 0; i < 3; i++){
      brewery.add(iceCube                     = new Ingredient("Ice Cube",                      1,  "Cooling",          1));
      brewery.add(fireMatch                   = new Ingredient("Fire Match",                    1,  "Inciting",         1));
      brewery.add(tapWater                    = new Ingredient("Tap Water",                     1,  "Thirst-Quenching", 1));
      brewery.add(booger                      = new Ingredient("Booger",                        1,  "Disgusting",       1));
      brewery.add(northpoleSnowflake          = new Ingredient("Northpole Snowflake",           3,  "Chilling",         2));
      brewery.add(birdsEyeChili               = new Ingredient("Bird's Eye Chili",              2,  "Burning",          4));
      brewery.add(springWater                 = new Ingredient("Spring Water",                  2,  "Refreshing",       2));
      brewery.add(squealingChalk              = new Ingredient("Squealing Chalk",               1,  "Annoying",         4));
      brewery.add(capri                       = new Ingredient("Capri",                         6,  "Freezing",         4));
      brewery.add(dragonsBreath               = new Ingredient("Dragon's Breath",               8,  "Burning",          9));
      brewery.add(unicornHair                 = new Ingredient("Unicorn Hair",                  10, "Rejuvenating",     15));
      brewery.add(unmatchedOpeningParenthesis = new Ingredient("Unmatched Opening Parenthesis", 2,  "Infuriating",      20));
    }

  }
  */

  public static void main(String[] args){

    // TODO fillWithIngredients

    printHeader("printBrewery");
    // TODO printBrewery

    printHeader("contains");
    // TODO contains

    printHeader("remove");
    // TODO remove


    printHeader("brew");
    // TODO brew

    printHeader("sortedItems");
    // TODO sortedItems

    printHeader("sortedIngredients");
    // TODO sortedIngredients

    printHeader("getTotalValue");
    // TODO getTotalValue

    printHeader("getMostValuablePotion");
    // TODO getMaxValuablePotion

    printHeader("getInventory");
    // TODO getInventory


  }

  private static void printHeader(String heading) {
    System.out.println();
    System.out.println("################################################################################");
    System.out.println("   " + heading);
    System.out.println("################################################################################");
    System.out.println();
  }

}
