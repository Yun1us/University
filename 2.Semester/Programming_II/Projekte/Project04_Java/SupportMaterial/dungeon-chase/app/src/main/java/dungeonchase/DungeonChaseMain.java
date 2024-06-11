package dungeonchase;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
 
public class DungeonChaseMain extends Application {

    private Grid grid;

    private Canvas gridCanvas;

    private Map<String, Image> tileCache = null;

    private static final int TILE_SIZE = 32;

    private Timer timer;

    private boolean receiveInput;


    public static void start(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws FileNotFoundException {


      tileCache = new HashMap<>();

      timer = new Timer();

      //Creating an image 

      Pane root = new Pane();
      grid = new Grid();

      gridCanvas = new Canvas(Grid.GRID_WIDTH*TILE_SIZE,Grid.GRID_HEIGHT*TILE_SIZE);
      root.getChildren().add(gridCanvas);
      
      //Creating a scene object 
      Scene scene = new Scene(root, gridCanvas.getWidth(), gridCanvas.getHeight());  
      stage.setResizable(false);
      stage.setOnCloseRequest(event -> {
        Platform.exit();
        System.exit(0);
      });

      scene.setOnKeyPressed(this::handleKeyPressed);
      receiveInput = true;
      
      //Setting title to the Stage 
      stage.setTitle("Dungeon Chase");  
      
      //Adding scene to the stage 
      stage.setScene(scene);

      drawGrid();
      
      //Displaying the contents of the stage 
      stage.show();
    }

    private void handleKeyPressed(KeyEvent keyEvent){

      if (!receiveInput)
        return;

      receiveInput = false;

      /* ### updatePlayer 
      Direction movement = 
        switch (keyEvent.getCode()){
          case W, UP -> Direction.NORTH;
          case A, LEFT -> Direction.WEST;
          case D, RIGHT -> Direction.EAST;
          case S, DOWN -> Direction.SOUTH;

          default -> Direction.NONE;
        };

      if (movement == Direction.NONE)
        return;

      grid.updatePlayer(movement);*/
      drawGrid();

      timer.schedule(
          new TimerTask() {
            @Override
            public void run(){

              
              // grid.updateOthers(movement); // ### updateOthers

              drawGrid();
              receiveInput = true;
              Platform.runLater(() -> checkGameFinished());
            }
          },
          200);

    }

    private void checkGameFinished(){
      Alert alert = null;
      /* ### TreasureChest 
      if (!grid.getTreasureChest().isAlive()){
        alert = new Alert(AlertType.INFORMATION, "YOU WON!");
      } else */
      /* ### updateOthers 
      if (!grid.getPlayer().isAlive()){
        Character killer = grid.get(grid.getPlayerX(),grid.getPlayerY());
        alert = new Alert(AlertType.INFORMATION, "YOU DIED! You have been killed by " + (killer == null ? " unknown" : killer.getName() + "!"));
      } else
        return;

      alert.showAndWait();
      Platform.exit();
      System.exit(0);*/
    }


    private Image loadImage(String path) throws FileNotFoundException, IOException{

      if (tileCache.containsKey(path))
        return tileCache.get(path);

      java.net.URL imagePath = ClassLoader.getSystemClassLoader().getResource(path);
      Image image = new Image(imagePath.openStream(), TILE_SIZE, TILE_SIZE, false, false);  

      tileCache.put(path, image);

      return image;
    }

    private void drawGrid(){
      GraphicsContext g = gridCanvas.getGraphicsContext2D();
      Random random = new Random(123);
      for (int x = 0; x < Grid.GRID_WIDTH; x++){
        for (int y = 0; y < Grid.GRID_HEIGHT; y++){
          double screenX = x * TILE_SIZE;
          double screenY = gridCanvas.getHeight()-(y+1) * TILE_SIZE;

          int floorId = Math.abs(random.nextInt())%4;

          try {

            Image image = loadImage(String.format("floor-%02d.png", floorId));
            g.drawImage(image, screenX, screenY);

            /* ### Character
            Character character = grid.get(x,y); 
            if (character != null){
              image = loadImage(character.getImage());
              g.drawImage(image, screenX, screenY);
            } 
            */




          } catch (IOException e){
            Alert alert = new Alert(AlertType.ERROR, e.getMessage());
            alert.showAndWait();
            Platform.exit();
            System.exit(1);
          }
        }
      }


    }
}

