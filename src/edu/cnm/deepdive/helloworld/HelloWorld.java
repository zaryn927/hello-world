/**
 * 
 */
package edu.cnm.deepdive.helloworld;

/**
 * @author zaryn class that prints "Hello World".
 */
public class HelloWorld {

  /**
   * prints "Hello World!" to standard output.
   * 
   * @param args command-line parameters (ignored).
   */
  public static void main(String[] args) {
    String target;
    if (args.length > 0) {
      target = args[0];
    } else {
      target = "World";
    }
    String message = String.format("Hello %s!", target);
    emitMessage(message);
    for(String arg : args){
      System.out.printf("Argument: %s%n", arg);
    }
    System.getProperties().list(System.out);
    assert args.length > 10;
  }

  // method takes string argument and prints it
  private static void emitMessage(String message) {
    System.out.println(message);
  }

}
