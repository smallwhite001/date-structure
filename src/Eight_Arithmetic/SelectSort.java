package Eight_Arithmetic;

import java.util.Arrays;

/**
 * 选择排序
 * int[] arr={里面n个数据};
 * 第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据,将它与arrr[1]交换;
 * 第2趟,在待排序数据arr[2]~arr[n]中选出最小的数据,将它与r[2]交换;
 * 以此类推,第i趟在待排序数据arr[i]~arr[n]中选出最小的数据,将它与r[i]交换,直到全部排序完成
 */
public class SelectSort {
    public static void main(String[] args) {
      int arr[] = {3,5,4,6,7,2,1};
      selectSort(arr);
      System.out.print(Arrays.toString(arr));
    }

    public static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    //记录下最小值得下标
                    minIndex = j;
                }
            }
            //最小值不是自身
            if(i!=minIndex){
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
