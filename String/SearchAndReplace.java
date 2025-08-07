public class SearchAndReplace {

  static String replaceString(String str, char search, char replace){
    if(str.length()==0){
      return "";
    }
    String s = replaceString(str.substring(1),search,replace);
    if(str.charAt(0)!=search){
      return str.charAt(0)+ s;
    }
    else{
      return replace + s;
    }

  }
  public static void main(String[] args) {
    String str = "Hello";
    System.out.println(replaceString(str, 'l', 'x'));
  }
}
