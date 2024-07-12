package potionbrewery;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreweryTest{
  /*
  private Ingredient iceCube;
  private Ingredient fireMatch;
  private Ingredient tapWater;
  private Ingredient booger;
  private Ingredient northpoleSnowflake;
  private Ingredient birdsEyeChili;
  private Ingredient springWater;
  private Ingredient squealingChalk;
  private Ingredient capri;
  private Ingredient dragonsBreath;
  private Ingredient unicornHair;
  private Ingredient unmatchedOpeningParenthesis;

  private Brewery brewery;

  @Before
  public void init(){
    brewery = new Brewery();
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

  @Test
  public void testConstructor(){
    Brewery b = new Brewery();
    assertNotNull("Constructor must initialize items", b.getItems());
    assertEquals("Constructor must not insert any BreweryItems", 0, b.getItems().size());
  }

  @Test
  public void testAdd(){
    Brewery b = new Brewery();

    b.add(unicornHair);
    assertEquals("brewery items must contain exactly one item after single add", 1, b.getItems().size());
    assertTrue("brewery items must contain Unicorn Hair after adding", b.getItems().contains(unicornHair));

    b.add(iceCube);
    assertEquals("brewery items must contain exactly two items after second add", 2, b.getItems().size());
    assertTrue("brewery items must contain Ice Cube after adding", b.getItems().contains(iceCube));

    b.add(unicornHair);
    assertEquals("brewery items must contain exactly three items after third add", 3, b.getItems().size());
    assertTrue("brewery items must contain Unicorn Hair after adding", b.getItems().contains(unicornHair));

    assertThrows("add must throw IllegalArgumentException if null is passed",
        IllegalArgumentException.class,
        () -> b.add(null));

  }

  @Test
  public void testGetItems(){

    var items = brewery.getItems();

    assertEquals("getItems must return List with all 36 items",
        36, items.size());

    assertThrows("list returned by getItems must be unmodifiable",
        UnsupportedOperationException.class,
        () -> items.add(unicornHair));

  }*/

  /*
  @Test
  public void testContains(){

    assertTrue("brewery contains unicornHair", brewery.contains(unicornHair));
    brewery.add(new Ingredient("Unicorn Hair",                  10, "Rejuvenating",     15));
    assertTrue("brewery contains a clone of unicornHair", brewery.contains(unicornHair));
    Ingredient kugelschreibär = new Ingredient("Kugelschreibär",                  1, "Screaming",     1);
    assertFalse("brewery does not contain kugelschreibär", brewery.contains(kugelschreibär));

    assertThrows("contains must throw IllegalArgumentException when null is passed",
        IllegalArgumentException.class,
        () -> brewery.contains(null));

  }*/

  /*
  @Test
  public void testRemove(){

    brewery.remove(unicornHair);

    assertEquals("brewery must contain 35 items after one instance of unicornHair has been removed",
        35, brewery.getItems().size());

    assertThrows("remove must throw IllegalArgumentException when null is passed",
        IllegalArgumentException.class,
        () -> brewery.remove(null));

    Ingredient kugelschreibär = new Ingredient("Kugelschreibär",                  1, "Screaming",     1);

    assertThrows("remove must throw BreweryException when item not in brewery is passed",
        BreweryException.class,
        () -> brewery.remove(kugelschreibär));

  }*/

  /*
  @Test
  public void testBrew(){

      Potion potion = brewery.brew(booger, capri, birdsEyeChili);
      Potion expectedPotion = new Potion(booger, capri, birdsEyeChili);

      assertNotNull("return value must not be null", potion);
      assertEquals("resulting potion must be equal to potion when constructor is called with booger, capri, birdsEyeChili",
          expectedPotion, potion);

      assertEquals("brewery must contain 36-3+1=34 items after brewing",
          34, brewery.getItems().size());

      assertThrows("brew must throw IllegalArgumentException when mainIngredient=null",
          IllegalArgumentException.class,
          () -> brewery.brew(null, capri, birdsEyeChili));

      assertThrows("brew must throw IllegalArgumentException when effectIngredient=null",
          IllegalArgumentException.class,
          () -> brewery.brew(capri, null, birdsEyeChili));

      assertThrows("brew must throw IllegalArgumentException when potencyIngredient=null",
          IllegalArgumentException.class,
          () -> brewery.brew(capri, birdsEyeChili, null));

      Ingredient kugelschreibär = new Ingredient("Kugelschreibär",                  1, "Screaming",     1);

      assertThrows("brew must throw BreweryException when mainIngredient is not in brewery",
          BreweryException.class,
          () -> brewery.brew(kugelschreibär, capri, birdsEyeChili));

      assertThrows("brew must throw BreweryException when effectIngredient is not in brewery",
          BreweryException.class,
          () -> brewery.brew(capri, kugelschreibär, birdsEyeChili));

      assertThrows("brew must throw BreweryException when potencyIngredient is not in brewery",
          BreweryException.class,
          () -> brewery.brew(capri, birdsEyeChili, kugelschreibär));

  }*/

  /*
  @Test
  public void testSortedItems(){

    List<BreweryItem> items = brewery.sortedItems();

    assertNotNull("sortedItems must not return null", items);

    var expected = new ArrayList<>(List.of(birdsEyeChili     , birdsEyeChili     , birdsEyeChili     , booger            , booger            , booger            , capri             , capri             , capri             , dragonsBreath     , dragonsBreath     , dragonsBreath     , fireMatch         , fireMatch         , fireMatch         , iceCube           , iceCube           , iceCube           , northpoleSnowflake, northpoleSnowflake, northpoleSnowflake, springWater       , springWater       , springWater       , squealingChalk    , squealingChalk    , squealingChalk    , tapWater          , tapWater          , tapWater          , unicornHair       , unicornHair       , unicornHair, unmatchedOpeningParenthesis, unmatchedOpeningParenthesis, unmatchedOpeningParenthesis));

    assertEquals("sorted list is not equal to expected sorted list",
        expected, items);
  }*/

  /*
  @Test
  public void testGetIngredients(){

      Potion potion = brewery.brew(booger, capri, birdsEyeChili);
      potion = brewery.brew(booger, capri, birdsEyeChili);
      potion = brewery.brew(northpoleSnowflake, unicornHair, capri);
      potion = brewery.brew(springWater, unmatchedOpeningParenthesis, springWater);

      List<Ingredient> ingredients = brewery.getIngredients();

      assertNotNull("getIngredients must not return null", ingredients);
      assertEquals("there are 28 items in the brewery: 4 potions and 24 ingredients",
          28, brewery.getItems().size());


      assertTrue("ingredient is missing", ingredients.contains(iceCube));
      assertTrue("ingredient is missing", ingredients.contains(fireMatch));
      assertTrue("ingredient is missing", ingredients.contains(tapWater));
      assertTrue("ingredient is missing", ingredients.contains(booger));
      assertTrue("ingredient is missing", ingredients.contains(northpoleSnowflake));
      assertTrue("ingredient is missing", ingredients.contains(birdsEyeChili));
      assertTrue("ingredient is missing", ingredients.contains(springWater));
      assertTrue("ingredient is missing", ingredients.contains(squealingChalk));
      assertTrue("ingredient is missing", ingredients.contains(dragonsBreath));
      assertTrue("ingredient is missing", ingredients.contains(unicornHair));
      assertTrue("ingredient is missing", ingredients.contains(unmatchedOpeningParenthesis));
      assertFalse("capri is not in brewery", ingredients.contains(capri));

  }*/

  /*
  @Test
  public void testSortedIngredients(){

    List<Ingredient> expected = new ArrayList<>(List.of(squealingChalk             , squealingChalk             , squealingChalk             , birdsEyeChili              , birdsEyeChili              , birdsEyeChili              , dragonsBreath              , dragonsBreath              , dragonsBreath              , northpoleSnowflake         , northpoleSnowflake         , northpoleSnowflake         , iceCube                    , iceCube                    , iceCube                    , booger                     , booger                     , booger                     , capri                      , capri                      , capri                      , fireMatch                  , fireMatch                  , fireMatch                  , unmatchedOpeningParenthesis, unmatchedOpeningParenthesis, unmatchedOpeningParenthesis, springWater                , springWater                , springWater                , unicornHair                , unicornHair                , unicornHair                , tapWater                   , tapWater                   , tapWater                    ));

    var sortedIngredients = brewery.sortedIngredients();

    assertNotNull("sortedIngredients must not return null", sortedIngredients);

    assertEquals("sorted list is not equal to expected sorted list",
        expected, sortedIngredients);
  }

  @Test
  public void testGetTotalValue(){
      brewery.remove(unicornHair);
      Potion potion = brewery.brew(booger, capri, birdsEyeChili);
      potion = brewery.brew(booger, capri, birdsEyeChili);
      potion = brewery.brew(northpoleSnowflake, unicornHair, capri);
      potion = brewery.brew(springWater, unmatchedOpeningParenthesis, springWater);

      assertEquals("total value must be 160", 160, brewery.getTotalValue());
  }*/

  /*
  @Test
  public void testGetMostValuablePotion(){
    assertNull("most valuable potion is null when no potion is available", brewery.getMostValuablePotion());

    brewery.brew(booger, capri, birdsEyeChili);
    brewery.brew(booger, capri, birdsEyeChili);
    brewery.brew(northpoleSnowflake, unicornHair, capri);
    brewery.brew(springWater, unmatchedOpeningParenthesis, springWater);

    assertNotNull("most valuable potion is NOT null when at least one potin is available", brewery.getMostValuablePotion());
    assertEquals("must return most valuable potion (Rejuvenating Northpole Snowflake)", 
        new Potion(northpoleSnowflake, unicornHair, capri),
        brewery.getMostValuablePotion());

  }*/

  /*
  @Test
  public void testGetInventory(){
      brewery.remove(unicornHair);
      Potion potion1 = brewery.brew(booger, capri, birdsEyeChili);
      Potion potion2 = brewery.brew(booger, capri, birdsEyeChili);
      Potion potion3 = brewery.brew(northpoleSnowflake, unicornHair, capri);
      Potion potion4 = brewery.brew(springWater, unmatchedOpeningParenthesis, springWater);

      var m = brewery.getInventory();

      assertNotNull("getInventory must not return null", m);
      assertEquals("map must contain exactly 14 entires", 14, m.size());

      var expected = new HashMap<BreweryItem, Long>();
      expected.put((BreweryItem)iceCube,  (Long)3l);
      expected.put((BreweryItem)unicornHair, (Long)1l);
      expected.put((BreweryItem)dragonsBreath,  (Long)3l);
      expected.put((BreweryItem)potion4,  (Long)1l);
      expected.put((BreweryItem)tapWater,  (Long)3l);
      expected.put((BreweryItem)booger,  (Long)1l);
      expected.put((BreweryItem)potion3,  (Long)1l);
      expected.put((BreweryItem)springWater,  (Long)1l);
      expected.put((BreweryItem)potion1,  (Long)2l);
      expected.put((BreweryItem)fireMatch,  (Long)3l);
      expected.put((BreweryItem)unmatchedOpeningParenthesis,  (Long)2l);
      expected.put((BreweryItem)squealingChalk,  (Long)3l);
      expected.put((BreweryItem)northpoleSnowflake,  (Long)2l);
      expected.put((BreweryItem)birdsEyeChili, (Long)1l);

      assertEquals("map must match expected map", expected, m);

  }*/

}
