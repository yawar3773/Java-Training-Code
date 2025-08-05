public class SumOfDigt {

  static void sumDigit1(int num,int sum){
    if(num==0){
      System.out.println(sum);
      return;
    }
    sumDigit1(num/10, sum+num%10);
  }

  static int sumDigit2(int num){
    if(num==0) return 0;
    return num%10+sumDigit2(num/10);
  }
  public static void main(String[] args) {
    //sumDigit1(1234, 0);
    System.out.println(sumDigit2(12345));
  }

}
