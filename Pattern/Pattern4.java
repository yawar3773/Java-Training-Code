
public class Pattern4 {
  public static void main(String[] args) {
    int n = 5;
    for(int i=1;i<=n;i++){
      System.out.print(" ".repeat(i-1));
      System.out.print("*".repeat(n-i+1));
      System.out.println();
    }
  }
}
