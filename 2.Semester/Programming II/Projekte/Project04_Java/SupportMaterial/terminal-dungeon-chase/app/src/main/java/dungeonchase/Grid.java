package dungeonchase;

public class Grid {

  public static final int GRID_WIDTH = 16;
  public static final int GRID_HEIGHT = 16;

  // private Character[][] grid; // ### Character

  private int playerX;

  private int playerY;

  // private Player player; // ### Player

  private int currentIteration;


  // private TreasureChest treasureChest; // ### TreasureChest

  public Grid(){
    currentIteration = 0;
    initGrid();
  }


  @SuppressWarnings("unchecked")
  private void initGrid(){
    /* ### Character
    grid = Helper.fillGrid(
        30  // Anzahl der zu erzeugenden Gegner
        // , () -> new Ogre(Helper.generateName("Ogre"))          // ### Ogre
        // , () -> new Wall()                                     // ### Wall
        // , () -> new BlackKnight(Helper.generateName("Knight")) // ### BlackKnight
        // , () -> new Bomb()                                     // ### Bomb
        // , () -> new Bat(Helper.generateName("Bat"))            // ### Bat
        // , () -> new Blob(Helper.generateName("Blob"), 0.05)    // ### Blob
        // , () -> new Fire(0.1)                                  // ### Fire
        );
    */

    /* ### Player 
    playerX = 1;
    playerY = GRID_HEIGHT/2;
    player = new Player();
    grid[playerX][playerY] = player;
    */

    /* ### TreasureChest 
    treasureChest = new TreasureChest();
    grid[GRID_WIDTH-2][GRID_HEIGHT/2] = treasureChest;
    */

  }

  /* ### Player 
  public Player getPlayer(){
    return player;
  } */
  

  public int getPlayerX(){
    return playerX;
  }

  public int getPlayerY(){
    return playerY;
  }

  /* ### TrasureChest
  public TreasureChest getTreasureChest(){
    return treasureChest;
  }
  */

  /* ### Character 
  public Character get(int x, int y){
    if (x < 0 || x >= GRID_WIDTH)
      throw new IllegalArgumentException("x outside of range");

    if (y < 0 || y >= GRID_HEIGHT)
      throw new IllegalArgumentException("y outside of range");

    return this.grid[x][y];
  }  */


}
