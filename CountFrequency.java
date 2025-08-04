public class CountFrequency {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int num = 1122334455;
    while(num>0){
      int lastDigit = num%10;
      arr[lastDigit]++;
      num/=10;
    }

    for(int i=0;i<10;i++){
      System.out.println("Frequency of "+i+":"+arr[i]);
    }
  }
}
