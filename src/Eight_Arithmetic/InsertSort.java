package Eight_Arithmetic;

import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度O(n^2)
 * 首先假设第一个元素被放置在正确的位置上，这样仅需从1-n-1范围内对剩余元素进行排序。
 * 对于每次遍历，从0-i-1范围内的元素已经被排好序，
 * 每次遍历的任务是：通过扫描前面已排序的子列表，将位置i处的元素定位到从0到i的子列表之内的正确的位置上
 * 扫描期间，大于目标值target的每个元素都会向右滑动一个位置（arr[j]=arr[j-1]）。
 * 一旦确定了正确位置j，
 * 目标值target（即原始的arr[i]）就会被复制到这个位置
 */
public class InsertSort {
 public static void main(String[] args){
    int arr[] = {3,2,5,4,7,6};
    insert(arr);
    System.out.print(Arrays.toString(arr));
 }
 public static  void  insert(int arr[]){
     int j;
     int target;
     for(int i = 1; i<arr.length;i++){
           j=i;
           target = arr[i];
          while(j>0 && target<arr[j-1]){
               arr[j] = arr[j-1];
               j--;
          }
          arr[j]=target;
       }
   }
}
