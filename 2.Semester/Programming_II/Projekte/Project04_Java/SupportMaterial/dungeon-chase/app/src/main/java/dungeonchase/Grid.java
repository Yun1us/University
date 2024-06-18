package dungeonchase;

public class Grid {

  public static final int GRID_WIDTH = 16;
  public static final int GRID_HEIGHT = 16;

  private Character[][] grid; // ### Character

  private int playerX;

  private int playerY;

  private Player player; // ### Player

  private int currentIteration;

  private TreasureChest treasureChest; // ### TreasureChest

  public void updatePlayer(Direction playerMovement){
    if (playerMovement==null){
      throw new IllegalArgumentException("playerMovement must not be null");
    }
    Direction movement = player.update(this, playerX,playerY, playerMovement);
    int newx = playerX + movement.getDx(); //playerMovement.getDx();
    int newy = playerY + movement.getDy(); //playerMovement.getDy();

    /* 
    boolean isok = newx >= 0 && newx < 16 && newy >= 0 && newy < 16;
    if (isok && (grid[newx][newy]==null || player.collisionFrom(grid[newx][newy]))){
      playerX = newx;
      playerY = newy;
    }*/

    if (newx < GRID_WIDTH && newx >= 0 && newy < GRID_HEIGHT && newy >= 0) {
      Character target  = grid[newx][newy];

      if (target == null) {
        grid[playerX][playerY] = null;
        playerX = newx;
        playerY = newy;
        grid[playerX][playerY] = player;
      }

      else if (target.collisionFrom(player)) {
        grid[playerX][playerY] = null;
        playerX = newx;
        playerY = newy;
        grid[playerX][playerY] = player;
      }
      
    }
  }

  public void updateOthers(Direction playerMovement){
    currentIteration++;
    
    for(int gridIterationX = 0; gridIterationX <= GRID_WIDTH - 1; gridIterationX++){
      for(int gridIterationY = 0; gridIterationY <= GRID_HEIGHT - 1; gridIterationY++){
        if (grid[gridIterationX][gridIterationY] != null && grid[playerX][playerY] != grid[gridIterationX][gridIterationY] && grid[gridIterationX][gridIterationY].getLastUpdate() != currentIteration ) {

          Character currentUnit = grid[gridIterationX][gridIterationY];

          currentUnit.setLastUpdate(currentIteration);
          if (currentUnit instanceof Replicable) {
            Direction directionOfRep = ((Replicable) currentUnit).replicationDirection(); 
            System.out.println(directionOfRep);
            if ( directionOfRep != Direction.NONE) { 
              Character newUnit = ((Replicable) currentUnit).generateReplication();

              int repX = gridIterationX + directionOfRep.getDx();
              int repY = gridIterationY + directionOfRep.getDy();

              if (repX >= 0 && repX < GRID_WIDTH && repY >= 0 && repY < GRID_HEIGHT ) {
                if (grid[repX][repY] == null) { 
                  grid[repX][repY] = newUnit;
                }
                else if (grid[repX][repY].collisionFrom(currentUnit)) { 
                  grid[repX][repY] = newUnit;
                }
              }
            }
          }
          //if (grid[gridIterationX][gridIterationY] != null && grid[playerX][playerY] != grid[gridIterationX][gridIterationY] && grid[gridIterationX][gridIterationY].getLastUpdate() != currentIteration ) {}
          else{
          //if ((grid[gridIterationX][gridIterationY] == null || grid[gridIterationX][gridIterationY] == player || grid[gridIterationX][gridIterationY].getLastUpdate()== currentIteration)){  
            Direction movement = currentUnit.update(this, gridIterationX, gridIterationY, playerMovement);
            int hopeX = gridIterationX + movement.getDx();
            int hopeY = gridIterationY + movement.getDy();
            

            if (hopeX < GRID_WIDTH && hopeX >= 0 && hopeY < GRID_HEIGHT && hopeY >= 0) {
              Character target  = grid[hopeX][hopeY];

              if (target == null) {
                grid[gridIterationX][gridIterationY] = null; // funkrioniert itgendwie nicht mit currentUnit = null ???
                grid[hopeX][hopeY] = currentUnit;
              }

              else if (target.collisionFrom(currentUnit)) { // wenn wir wollen dass die bombe sie auch töten können hier was ändern
                grid[gridIterationX][gridIterationY] = null;
                grid[hopeX][hopeY] = currentUnit;
              }
              
              if (currentUnit.isAlive() == false) {
                currentUnit = null;
              }
            }
          }
        

        }  
      }
    }
    /* 
     
    for (int i=0; i < GRID_WIDTH; i++){
      for (int j=0; j < GRID_HEIGHT; j++){
        
        if (!(grid[i][j] == null || grid[i][j] == player || grid[i][j].getLastUpdate()== currentIteration)){

          grid[i][j].setLastUpdate(currentIteration);
          Direction direction = grid[i][j].update(this, i, j, playerMovement);
          if (direction != Direction.NONE){
            int newx = direction.getDx() + i;
            int newy = direction.getDy() + j;

            if (newx < GRID_WIDTH && newx >= 0 && newy < GRID_HEIGHT && newy >= 0){
              if (grid[newx][newy] == null){
                grid[newx][newy] = grid[i][j];
                grid[i][j] = null;
              }
              else if(grid[newx][newy].collisionFrom(grid[i][j])){
                grid[i][j] = null;
                grid[newx][newy] = grid[i][j];
              }
              if (grid[i][j].isAlive() == false) {
                grid[i][j] = null;
              }
            }

          }

        }
          


      }
    }*/
  }

  public Grid(){
    currentIteration = 0;
    initGrid();
  }


  @SuppressWarnings("unchecked")
  private void initGrid(){
    // ### Character
    grid = Helper.fillGrid(
        30  // Anzahl der zu erzeugenden Gegner
        , () -> new Ogre(Helper.generateName("Ogre"))          // ### Ogre
        , () -> new Wall()                                     // ### Wall
        , () -> new Blackknight(Helper.generateName("Knight")) // ### BlackKnight
        , () -> new Bomb("Bomb")                                     // ### Bomb
        // , () -> new Bat(Helper.generateName("Bat"))            // ### Bat
        , () -> new Blob(Helper.generateName("Blob"), 0.2)    // ### Blob
        // , () -> new Fire(0.1)                                  // ### Fire
        );

                                                                                                                                                                               //
    // ### Player 
    playerX = 1;
    playerY = GRID_HEIGHT/2;
    player = new Player("Player");
    grid[playerX][playerY] = player;
    

    // ### TreasureChest 
    treasureChest = new TreasureChest("TreasureChest");
    grid[GRID_WIDTH-2][GRID_HEIGHT/2] = treasureChest;
    

  }

  // ### Player 
  public Player getPlayer(){
    return player;
  } 
  

  public int getPlayerX(){
    return playerX;
  }

  public int getPlayerY(){
    return playerY;
  }

  // ### TrasureChest
  public TreasureChest getTreasureChest(){
    return treasureChest;
  }
  

  // ### Character 
  public Character get(int x, int y){
    if (x < 0 || x >= GRID_WIDTH)
      throw new IllegalArgumentException("x outside of range");

    if (y < 0 || y >= GRID_HEIGHT)
      throw new IllegalArgumentException("y outside of range");

    return this.grid[x][y];
  }  


}
