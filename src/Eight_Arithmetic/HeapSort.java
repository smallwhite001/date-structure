package Eight_Arithmetic;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};
//        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
//            adjustHeap(arr, i, arr.length);
//        }

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 步骤一 :构造初始堆。将给定无序序列构造成一个大顶堆（一般升序采用大顶堆，降序采用小顶堆)
     *
     * @param arr
     * @param index:第一个非叶子节点
     * @param size
     */
    public static void adjustHeap(int arr[], int index, int size) {
        int max = index;
        //左儿子
        int leftNode = 2 * index + 1;
        //右儿子
        int rightNode = 2 * index + 2;
        //判断左节点是否为最大的节点
        if (leftNode < size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        //判断右节点是否为最大节点
        if (rightNode < size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        //对节点进行交换
        if (max != index) {
            int temp;
            temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;

            //递归判断，进行转化为大顶堆
            //因为交换以后,需要判断交换的值对其他两个节点是否有影响
            adjustHeap(arr, max, size);
        }
    }

    /**
     * 步骤二:将堆顶元素与末尾元素进行交换，使末尾元素最大。然后继续调整堆，再将堆顶元素与末尾元素交换，得到第二大元素。如此反复进行交换、重建、交换
     *
     * @param arr
     */
    public static void sort(int arr[]) {
        //调整为大顶堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
              adjustHeap(arr, i, arr.length);
        }
        //将数组中首尾交换
        for (int j = arr.length - 1; j > 0; j--) {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            //??为什么是0
            adjustHeap(arr,0,j);
        }
    }
}