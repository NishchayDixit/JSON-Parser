package parser;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Main <path-to-json-file>");
      System.exit(1);
    }

    String filePath = args[0];

    try {
      String content = new String(Files.readAllBytes(Paths.get(filePath)));
      JsonParser parser = new JsonParser();
      boolean isValid = parser.parse(content);

      if (isValid) {
        System.out.println("Valid JSON");
        System.exit(0);
      } else {
        System.out.println("Invalid JSON");
        System.exit(1);
      }
    } catch (Exception e) {
        System.out.println("Invalid JSON");
        System.exit(1);
    }
  }
}