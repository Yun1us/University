package dungeonchase;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.google.errorprone.annotations.SuppressPackageLocation;

public class Helper{

  private static Random random = new Random();

  private static String[] attributes = {
    "Fiery", "Evil", "Bad", "Mischevious","Sadistic", "Rageful", "Clever",
"Malign", "Atrocious", "Bad", "Black", "Corruptive", "Dark", "Demonic", "Despicable", "Devilish", "Diabolic", "Diabolical", "Evil-Minded", "Fiendish", "Flagitious", "Grievous", "Heinous", "Hellish", "Immoral", "Infernal", "Maleficent", "Mephistophelean", "Mephistophelian", "Monstrous", "Perversive", "Pestiferous", "Satanic", "Sinister", "Slimy", "Ugly", "Unholy", "Unworthy", "Vile", "Wicked", "Worthless", "Wretched"
  };

  public static String generateName(String main){
    return attributes[random.nextInt(attributes.length)] + " " + main;
  }

  /* ### Character 
  @SuppressWarnings("unchecked")
  public static Character[][] fillGrid(
      int amount,
      Supplier<Character>... suppliers){

    Random random = new Random();
    Character[][] grid = new Character[Grid.GRID_WIDTH][Grid.GRID_HEIGHT];

    if (suppliers.length <= 0)
      return grid;

    Stream
      .generate(() -> suppliers[random.nextInt(suppliers.length)].get())
      .limit(amount)
      .forEach(character -> 
          grid[random.nextInt(Grid.GRID_WIDTH)][random.nextInt(Grid.GRID_HEIGHT)]=character);

    return grid;
  } 
  */


}
