package Array;

/**
 * 二分查找法
 */
public class binarySearch {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int start = 0;
        int end = array.length;
        int mid = (start + end) / 2;
        while (true) {
            //该数不存在
            if(start > end){
                System.out.println("该数不存在");
            }

            if (array[mid] == target) {
                System.out.println("要查找的值在:" + mid + "位置");
                break;
            } else {
                    //要查找的值在中间值的左边，需要调整结束位置
                    if (array[mid] > target) {
                           end = mid - 1;
                    } else {
                          start = mid + 1;
                    }
                    mid = (start + end) / 2;
            }
        }
    }
}