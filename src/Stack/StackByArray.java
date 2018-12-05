package Stack;

import java.util.Arrays;

/**
 * 数组实现栈
 */
public class StackByArray {

    int elements[];

    public StackByArray(){
     elements = new int[0];
   }
    //压入元素
    public void push(int element){

        int arr[] = new int[elements.length+1];
        for(int i = 0; i < elements.length; i++){
            arr[i] = elements[i];
        }
        arr[elements.length] = element;
        elements = arr;
        //System.out.println(Arrays.toString(elements));
    }

    //弹出栈首元素
    public void pop(){
        int arr[] = new int[elements.length-2];
        for(int i = 0 ;i < arr.length; i++){
            arr[i]=elements[i];
        }
        System.out.println("弹出栈首元素"+elements[elements.length-1]);
        elements = arr;

    }
    //查看栈首元素
    public void peek(){
        System.out.println("查看栈首元素"+elements[elements.length-1]);
    }
    //查看栈内元素
    public void show(){
        for(int i = elements.length-1;i >= 0 ; i--){
            System.out.println(elements[i]);
        }
    }
}
