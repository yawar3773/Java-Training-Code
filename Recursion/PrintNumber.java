import java.util.HashMap;
import java.util.Map;

public class PrintNumber {
  //num=123
  //output: one two three

  static void printNum1(int num,Map<Integer,String> mpp){
    if(num==0) return;
    printNum1(num/10,mpp);
    System.out.println(mpp.get(num%10));
  }

  static String printNum2(int num, Map<Integer,String> mpp){
    if(num == 0) return "";
    String s = printNum2(num/10, mpp);
    return s+mpp.get(num%10)+" ";
  }
  public static void main(String[] args) {
    Map<Integer, String> mpp = new HashMap<>();
    mpp.put(1,"One");
    mpp.put(2,"Two");
    mpp.put(3,"Three");
    mpp.put(4,"Four");
    mpp.put(5,"Five");
    mpp.put(6,"Six");
    mpp.put(7,"Seven");
    mpp.put(8,"Eight");
    mpp.put(9,"Nine");
    mpp.put(0,"Zero");

    //printNum1(12309,mpp);
    System.out.println(printNum2(12309, mpp));
  }
}
