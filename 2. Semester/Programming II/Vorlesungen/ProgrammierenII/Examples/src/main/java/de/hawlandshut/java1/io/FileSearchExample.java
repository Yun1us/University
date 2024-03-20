package de.hawlandshut.java1.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;
import static java.lang.System.err;

public class FileSearchExample {

  // snippet: main
  public static void main(String[] args) throws IOException {
    Path start = Paths.get(args[0]);
    String searchKey = args[1];
  
    FileSearchVisitor visitor = new FileSearchVisitor(searchKey);
  
    Files.walkFileTree(start, visitor);
  
    out.println("Found files:");
    for (Path p : visitor.getFoundFiles())
      out.println(p);
  }
  // snippet: /main

  // snippet: fileSearchVisitor
  private static class FileSearchVisitor 
      implements FileVisitor<Path>{
  // snippet: /fileSearchVisitor

    // snippet: attributes
    private String searchKey;
    private List<Path> foundFiles;
    
    private FileSearchVisitor(String searchKey){
      this.searchKey = searchKey;
      foundFiles = new LinkedList<Path>();
    }
    // snippet: /attributes

    public List<Path> getFoundFiles() {
      return foundFiles;
    }

    // snippet: preVisit
    @Override public FileVisitResult preVisitDirectory(
        Path dir, BasicFileAttributes attrs) {

      out.println("Entering " + dir);
       
      return FileVisitResult.CONTINUE;
    }
    // snippet: /preVisit

    // snippet: visitFile
    @Override public FileVisitResult visitFile(
        Path file, BasicFileAttributes attrs) {

      if (file.toString().contains(searchKey))
        foundFiles.add(file);

      return FileVisitResult.CONTINUE;
    }
    // snippet: /visitFile

    // snippet: visitFailed
    @Override public FileVisitResult visitFileFailed(
        Path file, IOException exc) {
      err.println(exc.getMessage());
      return FileVisitResult.TERMINATE;
    }
    // snippet: /visitFailed

    // snippet: postVisit
    @Override public FileVisitResult postVisitDirectory(
        Path dir, IOException exc) {
      out.println("Leaving " + dir);

      if (exc != null){
        err.println(exc.getMessage());
        return FileVisitResult.TERMINATE;
      }else
        return FileVisitResult.CONTINUE;
    }
    // snippet: /postVisit

  }

}
