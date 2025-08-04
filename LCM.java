public class LCM {
  public static void main(String[] args) {
    int x=4,y=5;
    int big = x<y?y:x;
    while (true) {
      if(big%x==0&&big%y==0){
        System.out.println(big);
        break;
      }
      big++;
    }
  }
}
