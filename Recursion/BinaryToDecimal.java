public class BinaryToDecimal {

  static void binaryToDecimal(int binaryNum,int sum,int power){
    if(binaryNum==0){
      System.out.println(sum);
      return;
    }
    if((binaryNum&1)==1) binaryToDecimal(binaryNum>>1, sum+(int)Math.pow(2,power),power+1);
    else binaryToDecimal(binaryNum>>1,sum,power+1);
  }

  static int binaryToDecimal(int binaryNum,int power){
    if(binaryNum==0){
      return 0;
    }
    return (binaryNum&1)*(int)Math.pow(2,power)+binaryToDecimal(binaryNum>>1,power+1);
  }
  public static void main(String[] args) {
    binaryToDecimal(0b1011, 0, 0);
    System.out.println(binaryToDecimal(0b111,0));
  }
}
