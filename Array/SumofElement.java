public class SumofElement {

  static int doSum(int arr[],int index){
    if(index == arr.length){
      return 0;
    }
    return arr[index]+doSum(arr, index+1);
  }

  static void doSum(int arr[],int index,int sum){
    if(index==arr.length){
      System.out.println(sum);
      return;
    }
    doSum(arr, index+1, sum+arr[index]);
  }

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(doSum(arr, 0));
    doSum(arr, 0, 0);
  }
}
