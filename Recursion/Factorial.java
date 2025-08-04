public class Factorial {

  static void factorial(int num, int result){
    if(num == 1) {
      System.out.println(result);
      return;
    }
    factorial(num-1, result*num);
  }

  static int factorial(int num){
    if(num == 1) return 1;
    return num*factorial(num-1);
  }
  public static void main(String[] args) {
    //factorial(5,1);
    System.out.println(factorial(5));
  }
}
