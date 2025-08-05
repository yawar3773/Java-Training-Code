public class PowerOfNumber {

  static void powerOfNumber(int num,int power,int sum){
    if(power==0){
      System.out.println(sum);
      return;
    }
    powerOfNumber(num, power-1, sum*num);
  }

  static int powerOfNumber(int num,int power){
    if(power==0) return 1;
    return num*powerOfNumber(num, power-1);
  }
  public static void main(String[] args) {
    powerOfNumber(3, 3, 1);
    System.out.println(powerOfNumber(2, 5));
  }
}
