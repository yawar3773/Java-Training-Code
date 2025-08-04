public class GCD {
  public static void main(String[] args) {
    int n1=12;
    int n2=18;
    int min = n1<n2?n1:n2;
    int max=1;
    for(int i=1;i<=min;i++){
      if(n1%i==0&&n2%i==0){
        max = i;
      }
    }
    System.out.println(max);
  }
}
