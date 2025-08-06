public class SerchElement {

  static int findIndex(int arr[],int index,int value){
    if(index == arr.length){
      return -1;
    }
    if(arr[index]==value){
      return index;
    }
    return findIndex(arr, index+1,value);
  }

  static void findInd(int arr[],int index,int value){
    if(index==arr.length){
      System.out.println("Element not Found");
      return;
    }
    if(value==arr[index]){
      System.out.println("Element found At index "+index);
      return;
    }
    findInd(arr, index+1, value);
  }
  public static void main(String[] args) {
    int arr[] = {1,2,15,4,5};
    System.out.println(findIndex(arr, 0, 16));
    findInd(arr, 0, 5);
  }
}
