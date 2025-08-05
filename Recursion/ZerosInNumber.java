public class ZerosInNumber {

  static void countZero1(int num,int count){
    if(num==0){
      System.out.println(count);
      return;
    }
    else if(num%10==0) countZero1(num/10, count+=1);
    else countZero1(num/10, count);
  }

  static int countZero2(int num){
    if(num==0) return 0;
    int z = num%10==0?1:0;
    return z + countZero2(num/10);
  }
  public static void main(String[] args) {
    //countZero1(10090, 0);
    System.out.println(countZero2(10090));
  }
}
