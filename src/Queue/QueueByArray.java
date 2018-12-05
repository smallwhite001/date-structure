package Queue;

public class QueueByArray {
    int element[];

    public QueueByArray() {
        element = new int[0];
    }


    //进队
    public void add(int queue) {
        int arr[] = new int[element.length + 1];
        for (int i = 0; i < element.length; i++) {
            arr[i] = element[i];
        }
        arr[element.length] = queue;
        element = arr;
    }

    //出队
    public void pill() {
        for (int i = 0; i < element.length; i++) {
          System.out.println("元素:" + element[i]);
        }
    }
}
