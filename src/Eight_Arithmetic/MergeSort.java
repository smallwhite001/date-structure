package Eight_Arithmetic;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args){
        int arr[] = new int[]{1,3,5,2,4,6};
        merge(arr,0,(arr.length-1)/2,arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
    //分离
    public static void sort(int arr[],int low,int high) {
        int middle = (high + low) / 2;
        if (low < high) {//递归结束条件
            sort(arr, low, middle);
            sort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }
    //合并
    public static void merge(int arr[],int low,int middle,int high){
        //用于存储归并后得临时数组
        int[] temp = new int[high-low+1];
        //记录第一个数组下标
        int i = low;
        //记录第二个数组开始得下标
        int j = middle+1;
        int index = 0;
        while(i<=middle && j<=high){
            //找到第一最小值
            if(arr[i]>arr[j]){
                temp[index] = arr[j];
                j++;
            }else{
                temp[index] = arr[i];
                i++;
            }
            index++;
        }
        //如果两个数组有剩余
        while (j<=high){
            //第二个数组剩余
            temp[index] = arr[j];
            j++;
            index++;
        }
        while(i<=middle){
            temp[index] = arr[i];
            i++;
            index++;
        }
        for(int n=0;n<arr.length;n++){
            arr[n]=temp[n];
        }
    }
}
