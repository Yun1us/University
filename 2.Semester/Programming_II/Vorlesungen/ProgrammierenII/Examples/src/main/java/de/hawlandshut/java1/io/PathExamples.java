package de.hawlandshut.java1.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.lang.System.out;

import java.io.IOException;

public class PathExamples {

  // snippet: printPathProperties
  // runPrintPathProperties
  public static void printPathProperties(Path path) throws IOException {

    out.printf("path: %s%n", path.toString());
    out.printf("exists: %b%n", Files.exists(path));

    if (!Files.exists(path))
      return;

    out.printf("isDirectory: %b%n", Files.isDirectory(path));
    out.printf("isExecutable: %b%n", Files.isExecutable(path));
    out.printf("isHidden: %b%n", Files.isHidden(path));
    out.printf("isReadable: %b%n", Files.isReadable(path));
    out.printf("isRegularFile: %b%n", Files.isRegularFile(path));
    out.printf("isSymbolicLink: %b%n", Files.isSymbolicLink(path));
    out.printf("isWritable: %b%n", Files.isWritable(path));
    out.printf("size: %d bytes%n", Files.size(path));
    out.printf("getOwner: %s%n", Files.getOwner(path));
    out.printf("getLastModifiedTime: %s%n", Files.getLastModifiedTime(path));
    
  }
  // snippet: /printPathProperties

  public static void main(String[] args) throws IOException {
    printPathProperties(Paths.get(args[0]));
  }

  public static void pathExample(String pathString) {
    // snippet: pathExample
    // *@\Gradle{runPathExampleUnix}@*/Windows
    Path path = Paths.get(pathString);
    out.printf("toString(): %s%n", path.toString());
    out.printf("getFileName(): %s%n", path.getFileName());
    out.printf("getParent(): %s%n", path.getParent());
    
    out.print("iterator: ");
    for (Path p : path)
      out.print(p + " ");
    out.println();

    out.printf("isAbsolute: %b%n", path.isAbsolute());
    out.printf("toAbsolute: %s%n", path.toAbsolutePath());
    /* ... */
    // snippet: /pathExample
    if (!path.isAbsolute()){
      out.printf("relativize(\"auer/secrets\"): %s%n", 
          path.relativize(Paths.get("auer/secrets")));
    }

    out.printf("startsWith(\"dokumente/rezepte\"): %b%n", 
        path.startsWith("dokumente/rezepte"));
  }
  
  public static void pathOperations() throws IOException {
    // snippet: pathOperations
    // *@\Gradle{runPathOperations}@*
    var tempDir = Files.createTempDirectory("java1");

    // Unix command
    out.printf("mkdir %s%n", tempDir);

    var file = Files.createFile(
        tempDir.resolve("test-file"));

    // Unix command
    out.printf("touch %s%n", file);

    var dir = Files.createDirectories(
        Paths.get("java1-test/sub"));

    // Unix command
    out.printf("mkdir -p %s%n", dir);

    var dest = dir.resolve("test-file");

    Files.copy(file, dest);

    // Unix command
    out.printf("cp %s %s%n", file, dir);

    Files.delete(file);

    // Unix command
    out.printf("rm %s%n", file);
    // snippet: /pathOperations
  }

  public static void readWriteFile() throws IOException {
    // snippet: readWriteFile
    // *@\Gradle{runReadWriteFile}@*
    Path p = Paths.get("output.txt");

    for (int i = 0; i < 100; i++)
      Files.writeString(p, 
          "A work and no play makes Jack a dull boy.\n", 
          StandardOpenOption.APPEND, 
          StandardOpenOption.CREATE);

    var lines = Files.readAllLines(p);

    for (String line : lines)
      out.println(line);
    // snippet: /readWriteFile
  }
  
  
  
  
  
}
