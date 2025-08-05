public class Armstrong {
  static void arm(int num,int org , int count,int sum){
    if(num==0){
      System.out.println(sum==org?"ArmStrong":"Not ArmStrong");
      return;
    }
    arm(num/10,org,count,sum+(int)Math.pow(num%10,count));
  }

  static int arm(int num,int count){
    if(num==0){
      return 0;
    }
    return (int)Math.pow(num%10,count)+arm(num/10, count);
  }
  public static void main(String[] args) {
    int num = 153;
    arm(num,num,3,0);
    System.out.println(num==arm(153,3)?"Armstrong":"Not Armstrong");
  }
}
