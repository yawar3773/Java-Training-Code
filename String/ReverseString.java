public class ReverseString {

  static String reverse(String str){
    if(str.length()==0){
      return "";
    }
    return reverse(str.substring(1,str.length()))+str.charAt(0);
  }
  public static void main(String[] args) {
    String name = "Hello World!";
    System.out.println(reverse(name));
  }
}