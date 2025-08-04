
public class PrintNameBacktrack {
  static void show(int n){
    if(n==0) return;
    System.out.println("Hello "+n);
    show(n-1);
    System.out.println("World "+n);
  }

  public static void main(String[] args) {
    show(5);
  }
}
