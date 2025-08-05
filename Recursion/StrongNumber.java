public class StrongNumber {

  static int factorial(int num){
    if(num==1) return 1;
    return num*factorial(num-1);
  }

  static void strongNumber(int num,int sum,int org){
    if(num==0){
      System.out.println(sum==org?"Strong Number":"Not Strong Number");
      return;
    }
    strongNumber(num/10, sum+factorial(num%10), org);
  }

  static int strongNumber(int num){
    if(num==0) return 0;
    return factorial(num%10)+strongNumber(num/10);
  }
  public static void main(String[] args) {
    strongNumber(145, 0, 145);
    int num = 145;
    System.out.println(num==strongNumber(num)?"Strong Number":"Not Strong Number");
  }
}
