package Febonacci;

/**
 * 递归
 * 斐波那契数列  1 1 2 3 5 8 13
 */
public class Febonacci {
 public static  void  main(String args[]){
    System.out.print(test(4));
 }
 public static int test(int i ){
     if(i == 1 || i ==2){ // 结束标志
         return 1;
     }else {
       return  test(i-1)+test(i-2);
     }
  }
}

