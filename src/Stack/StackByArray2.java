package Stack;

import java.util.EmptyStackException;

public class StackByArray2 {
    private Object[] value;
    private int top = -1;
    private int size;

  public StackByArray2(int  size){
      value = new Object[size];
      this.size = size;
  }
  public boolean isEmpty(){
      return top == 0;
  }
  public void push(Object val){
      if(top == size ){
          throw new StackOverflowError();
      }
       value[++top] = val;
  }
  public Object pop(){
      Object obj=null;
      if(top<0){
          throw  new EmptyStackException();
      }
      while (top>=0){
      obj = value[top];
      top--;
      System.out.println(obj);

      }

      return obj;
   }
}
