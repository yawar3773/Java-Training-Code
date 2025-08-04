import java.lang.Math;
public class tempCodeRunnerFile {

   public static void main(String[] args) {
  //     int num = 12345;
  //     int newNum=num;
  //     int i = 1;
  //     while(newNum!=0){
  //       i=i*10;
  //       newNum/=10;
  //     }
  //     i=i/10;
  //     while(num>0){
  //       System.out.println(num/i);
  //       num = num%i;
  //       i=i/10;
  //     }

    // int num = 32145;
    // int pos=1;
    // int result=0;
    // while(num>0){
    //   int lastDigit = num%10;
    //   result = result + pos * (int)(Math.pow(10, lastDigit-1));
    //   num /= 10;
    //   pos++;
    // }
    // System.out.println(result);

    int num = 45672;
    int k = 2;
    int numCopy = num;
    int count=0;
    while(numCopy>0){
      count++;
      numCopy/=10;
    }
    k = k%count;
    if(k==0) System.out.println(num);
    else{  
      int divisor = (int)Math.pow(10,k);
      int lastDigit = num%divisor;
      int firstDigit = num/divisor;
      int result = lastDigit*(int)Math.pow(10,count-k) + firstDigit;
      System.out.println(result);
    }
  }
}