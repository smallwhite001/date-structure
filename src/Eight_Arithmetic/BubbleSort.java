package Eight_Arithmetic;

import java.util.Arrays;

/**
 * 冒泡算法
 * 外层循环控制循环趟数
 * 内层循环控制每一趟的循环次数
 * 最坏时间复杂度：O(n^2)----数据刚好反序
 */
public class BubbleSort {
    public static void  main(String[] args){
       int arr[] ={2,1,4,6,5};
       bubbleSort(arr);
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0;i < arr.length-1; i++){
            for(int j = 0; j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = 0;
                    temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
