public class Table {

  static void tableInt(int num,int i){
    if(i == 0) return;
    table(num,i-1);
    System.out.println(num*i);
  }

  static String table(int num, int i){
      if(i==11) return "";
      String s = table(num,i+1);
      return num+" x "+i+" = "+num*i+"\n" + s;
  }
  public static void main(String[] args) {
    String s = table(5, 1);
    System.out.println(s);
  }
}
