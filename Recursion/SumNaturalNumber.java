public class SumNaturalNumber {

  static void sumNaturalNo1(int num,int sum){
    if(num==0){
      System.out.println(sum);
      return;
    }
    sumNaturalNo1(num-1, sum+num);
  }

  static int sumNaturalNo2(int num){
    if(num==0) return 0;
    return num + sumNaturalNo2(num-1);
  }
  public static void main(String[] args) {
    sumNaturalNo1(10, 0);
    System.out.println(sumNaturalNo2(3));
  }
}
