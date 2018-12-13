package Eight_Arithmetic;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
      int arr[] = {3,1,2,5,8,7,6};

      quickSort(arr,0,arr.length-1);
      System.out.print(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int start, int end) {
        //把数组的第0个数字作为标准数
        if(start<end) {
            int stard = arr[start];
            //哨兵low、high,下标
            int low = start;
            int high = end;

            if (low < high) {
                while (low < high) {
                    //先看右边
                    while (arr[high] >= stard && low < high) {
                        high--;
                    }
                    arr[low] = arr[high];
                    //再看左边
                   while (arr[low] <= stard && low < high) {
                        low++;
                    }
                    arr[high] = arr[low];

//                if (low < high) {
//                    int temp = 0;
//                    temp = arr[low];
//                    arr[low] = arr[high];
//                    arr[high] = temp;
//                }
                }
                //将基数和low、high相等位置的数进行调换

                //arr[low] = arr[high];
                arr[low] = stard;

                //递归调用左半数组进行比较
                quickSort(arr, start, low);
                //递归调用右半数组进行比较
                quickSort(arr, low + 1, end);
            }
        }
    }
}
