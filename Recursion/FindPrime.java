public class FindPrime {

  static void isPrime(int num,int count,int org){
    if(num==0){
      System.out.println(count>2?"Not Prime":"Prime");
      return;
    }
    if(org%num==0) isPrime(num-1, count+1, org);
    else isPrime(num-1, count, org);
  }

  static int isPrime(int num,int org){
    if(num==0) return 0;
    int z = org%num==0?1:0;
    return z + isPrime(num-1,org);
  }
  public static void main(String[] args) {
    isPrime(13, 0, 13);
    System.out.println(isPrime(8, 8)>2?"Not Prime":"Prime");
  }
}
