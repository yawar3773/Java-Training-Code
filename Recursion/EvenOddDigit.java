public class EvenOddDigit {

  static void evenOddDigit(int num,int even,int odd){
    if(num==0){
      System.out.println("Even: "+even+" Odd: "+odd);
      return;
    }
    if((num%10)%2==0) even++;
    else odd++;
    evenOddDigit(num/10, even, odd);
  }

  static int[] evenOddDigit(int num){
    if(num==0){
      return new int[2];
    }
    int[] arr = evenOddDigit(num/10);
    if((num%10)%2==0) arr[0]++;
    else arr[1]++;
    return arr;
  }
  public static void main(String[] args) {
    evenOddDigit(1234599, 0, 0);
    int[] arr = evenOddDigit(1234588);
    System.out.println("Even: "+arr[0]+" Odd: "+arr[1]);
  }
}
