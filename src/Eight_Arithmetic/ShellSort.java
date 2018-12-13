package Eight_Arithmetic;

import java.util.Arrays;

/**
 *
 */
public class ShellSort {
    public static void main(String[] args){
       int arr[] = {3,5,4,8,7,6,2,1,0};
       shellSort(arr);
       System.out.print(Arrays.toString(arr));
    }
    public static void shellSort(int arr[]){
       //增量每次都/2
        for(int step = arr.length/2;step > 0; step/=2){
            //从一开始增量那一组开始进行插入排序,直至完毕，底层实际就是插入排序
            for(int i = step; i<arr.length;i++){
                int  j = i;
                int temp = arr[j];//临时存储要待比较值
                //j-step就是代表它同组相对应得元素
                while(j-step>=0 && arr[j-step]>temp){
                    arr[j] = arr[j-step];
                    j = j-step;
                }
                arr[j] = temp;
            }
        }
    }
}
