public class Palindrome {
  static boolean plaindrome(int num, int org, int reverse){
    if(num == 0) {
      if(reverse == org) return true;
      else return false;
    }
    return plaindrome(num/10,org,reverse*10+num%10);
  }

  // static int rev = 0; // Not a Good way
  // static int plaindrome(int num){
  //   if(num == 0) return rev; 
  //   rev = rev*10 + num%10;
  //   return plaindrome(num/10);
  // }
  
  static int plaindrome(int num){
    boolean n = plaindrome(num,num,0);
    return n?1:0;
  }
  public static void main(String[] args) {
    //System.out.println(plaindrome(1551, 1551, 0));
    int num = 1234;
    System.out.println(plaindrome(num)==1?"Palindrome":"Not Palindrome");
  }
}
