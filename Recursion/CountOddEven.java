public class CountOddEven {

  static void CountEvenOdd(int n, int even, int odd){
    if(n == 0){
      System.out.println("Even "+even+" Odd "+odd);
      return;
    }
    else if(n%2==1) odd++;
    else even++;
    CountEvenOdd(n-1, even, odd);
  }

  // static int CountEven(int n,int even){
  //   if(n==0){
  //     return even;
  //   }
  //   if(n%2==0) even++;
  //   return CountEven(n-1,even);
  // }

  static int[] CountEvenOdd(int n){
    if(n==0){
      return new int[2];
    }
    int[] arr = CountEvenOdd(n-1);
    if(n%2==0) arr[0]++;
    else arr[1]++;
    return arr;
  }

  public static void main(String[] args) {
    CountEvenOdd(7, 0, 0);
    int[] arr = CountEvenOdd(7);
    System.out.println("Even: "+arr[0]+" Odd: "+arr[1]);
  }
}
