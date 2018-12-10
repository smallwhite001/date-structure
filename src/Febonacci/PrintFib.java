package Febonacci;

public class PrintFib {

    //建立一个函数，用于计算数列中的每一项
    public static int fib(int num) {
        //判断：是否是第一个数和第二个数
        if(num == 1 || num == 2) {
            return 1;
        }else {
            //循环调用本函数
            return fib(num - 2) + fib(num - 1);
        }
    }

    //主函数（程序入口）
    public static void main(String[] args) {

        //建立一个for循环，用于打印第一个至第十个数字
        for(int i = 1;i <= 10;i++) {
            //调用函数进行打印
            System.out.print(fib(i) + "\t");
        }
    }

}
