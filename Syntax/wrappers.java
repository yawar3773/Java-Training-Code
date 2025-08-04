package Syntax;
public class wrappers {
  public static void main(String[] args) {
    //Explicit Typecasting
    int x=10;
    byte y = (byte)x;
    System.out.println(y);
    //Implicit Typecasting
    int z = y;
    System.out.println(z);
    //Wrapper Class
    Integer h = 100;
    byte g = h.byteValue(); 
    System.out.println(g);
    String g1 = "1000";
    int h1 = Integer.parseInt(g1);
    System.out.println(h1);
    System.out.println(Integer.toOctalString(5000));
  }
}
