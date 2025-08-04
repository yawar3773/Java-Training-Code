import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    int first=0;
    int second=1;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=1;i<=n;i++){
      System.out.print(first+" ");
      int temp = first+second;
      first = second;
      second = temp;
    }
    in.close();
  }
}
