package de.hawlandshut.java1.basics;

// snippet: class
public class BinaryNode
// snippet: /class
{
  // snippet: fields
  private final int key;
  private BinaryNode left;
  private BinaryNode right;
  // snippet: /fields

  // snippet: constructor
  public BinaryNode(int key) {
    this.key = key;
  }
  // snippet: /constructor

  // snippet: insert
  public void insert(int newKey){
    if (newKey < this.key){
      if (left != null)
        left.insert(newKey);
      else
        left = new BinaryNode(newKey);
    } else if (newKey > this.key){
  
      if (right != null)
        right.insert(newKey);
      else
        right = new BinaryNode(newKey);
    }
  }
  // snippet: /insert

  // snippet: find
  public BinaryNode find(int searchKey){
    if (key == searchKey)
      return this; // gefunden!
  
    if (searchKey < key && left != null)
      return left.find(searchKey); // rekursiver Aufruf
    else if (searchKey > key && right != null)
      return right.find(searchKey); // rekursiver Aufruf
    else
      return null;
  }
  // snippet: /find


  // snippet: find2
  public BinaryNode find2(int searchKey){
    BinaryNode currentNode = this;

    while (currentNode != null 
        && currentNode.key != searchKey){
      currentNode = 
        searchKey < currentNode.key ? 
        currentNode.left : currentNode.right;
    }
    return currentNode;
  }
  // snippet: /find2
}


