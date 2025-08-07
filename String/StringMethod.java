import java.util.Arrays;

public class StringMethod {
  public static void main(String[] args) {
    String name = "Hello";
    System.out.println(name.charAt(0));
    char arr[] = name.toCharArray();
    System.out.println(Arrays.toString(arr));
    System.out.println(name.substring(1));
    System.out.println(name.substring(1,2));
    String greet = "Hello how are you";
    String greetArr[] = greet.split(" ");
    System.out.println(Arrays.toString(greetArr));
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    String newName = "    Hello ";
    System.out.println(newName.trim());
    System.out.println(name.equals(newName));
    System.out.println("Amit".compareTo("Ram"));
    System.out.println("Amit".compareTo("Amit"));
    System.out.println("Ram".compareTo("Amit"));

  }
}
