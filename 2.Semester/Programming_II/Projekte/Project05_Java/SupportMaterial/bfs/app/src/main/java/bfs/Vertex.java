package bfs;

public class Vertex  {

  private int value;

  private Vertex left;

  private Vertex right;

  public Vertex(int value, Vertex left, Vertex right){
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public int getValue(){
    return value;
  }

  public Vertex getLeft(){
    return left;
  }

  public Vertex getRight(){
    return right;
  }


}
