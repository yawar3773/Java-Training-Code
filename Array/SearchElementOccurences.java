import java.util.Arrays;

public class SearchElementOccurences {

  static int  searchOccurences(int arr[],int index,int val){
    if(index==arr.length){
      return 0;
    }
    int count = val==arr[index]?1:0;
    return count + searchOccurences(arr, index+1, val);
  }

  static int[] helperSearchIndexOccurences(int arr[],int index, int val,int count){
    if(index==arr.length){
      int result[]=new int[count];
      return result;
    }
    if(arr[index]==val) count++;
    int result[] = helperSearchIndexOccurences(arr, index+1, val, count);
    if(arr[index]==val) result[count-1] = index;
    return result;
  }

  static int[] searchIndexOccurences(int arr[],int index, int val){
    return helperSearchIndexOccurences(arr, index, val, 0);
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,4,5,5,5};
    //System.out.println(searchOccurences(arr, 0, 4));
    System.out.println(Arrays.toString(searchIndexOccurences(arr, 0, 5)));
  }
}
