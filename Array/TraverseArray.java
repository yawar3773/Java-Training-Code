public class TraverseArray {

  static void traverseArray(int[] arr, int index){
    if(index == arr.length){
      return;
    }
    System.out.println(arr[index]);
    traverseArray(arr, index+1);
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    traverseArray(arr,0);
  }
}
