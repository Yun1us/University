package dungeonchase;

import java.util.Random;
import java.util.Scanner;
 
public class TerminalDungeonChaseMain {

    private Grid grid;
    private Scanner scanner;

    public static void main(String[] args) {
      TerminalDungeonChaseMain main = new TerminalDungeonChaseMain();
      main.run();
    }
    
    public void run(){
      grid = new Grid();
      scanner = new Scanner(System.in);

      do {
        drawGrid();
        handleKeyPressed();
      } while (!checkGameFinished()); 
    }

    private void handleKeyPressed(){

      System.out.print("Enter movement (WASD): ");
      String input = scanner.nextLine();

      /* ### updatePlayer 
      Direction movement = 
        switch (input.toUpperCase()) {
          case "W" -> Direction.NORTH;
          case "A" -> Direction.WEST;
          case "S" -> Direction.SOUTH;
          case "D" -> Direction.EAST;

          default -> Direction.NONE;
        };

      if (movement == Direction.NONE)
        return;

      grid.updatePlayer(movement); */

      // grid.updateOthers(movement); // ### updateOthers

    }

    private boolean checkGameFinished(){
      /* ### TreasureChest
      if (!grid.getTreasureChest().isAlive()){
        System.out.println("YOU WON!");
        return true;
      } else  */
      /* ### updateOthers
      if (!grid.getPlayer().isAlive()){
        Character killer = grid.get(grid.getPlayerX(),grid.getPlayerY());
        System.out.println("YOU DIED! You have been killed by " + (killer == null ? " unknown" : killer.getName() + "!"));
        return true;
      }  */
      return false;
    }


    private void drawGrid(){

      for (int x = 0; x < Grid.GRID_WIDTH+2; x++){
        System.out.print("#");
      }
      System.out.println();

      for (int y = 0; y < Grid.GRID_HEIGHT; y++){
        System.out.print("#");
        for (int x = 0; x < Grid.GRID_WIDTH; x++){

            /* ### Character 
            Character character = grid.get(x,Grid.GRID_HEIGHT-y-1); 
            if (character != null){
              String image = character.getImage();
              System.out.print(image);
            } else */
              System.out.print(" ");
        }
        System.out.println("#");
      }
      for (int x = 0; x < Grid.GRID_WIDTH+2; x++){
        System.out.print("#");
      }
      System.out.println();
    }
}

