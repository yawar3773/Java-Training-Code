public class VowelsCount {
  public static void main(String[] args) {
    int[] arr = new int[5];
    char[] vowels = {'a','e','i','o','u'};
    String str = "hello how Are you";
    str = str.toLowerCase();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a') arr[0]++;
      else if(str.charAt(i)=='e') arr[1]++;
      else if(str.charAt(i)=='i') arr[2]++;
      else if(str.charAt(i)=='o') arr[3]++;
      else if(str.charAt(i)=='u') arr[4]++;
    }

    for(int i=0;i<5;i++){
      System.out.println("Frequency of "+vowels[i]+" : "+arr[i]);
    }
  }
}
