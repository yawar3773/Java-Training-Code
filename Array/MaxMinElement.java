public class MaxMinElement {

  static int max(int arr[],int index){
    if(index == arr.length){
      return Integer.MIN_VALUE;
    }
    int digit = max(arr, index+1);
    if(digit > arr[index]) return digit;
    else return arr[index];
  }

  static void max(int arr[],int index,int maxElement){
    if(arr.length==index){
      System.out.println(maxElement);
      return;
    }
    maxElement = maxElement<arr[index]?arr[index]:maxElement;
    max(arr,index+1,maxElement);
  }

  static int min(int arr[],int index){
    if(index == arr.length){
      return Integer.MAX_VALUE;
    }
    int digit = min(arr, index+1);
    if(digit < arr[index]) return digit;
    else return arr[index];
  }
  public static void main(String[] args) {
    int arr[] = {1,2,8,4,5};
    System.out.println(max(arr, 0));
    max(arr, 0,0);
    System.out.println(min(arr, 0));
  }
}
