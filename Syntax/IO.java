package Syntax;
import java.util.Scanner;
public class IO {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println(name);
    input.close();
  }
}
