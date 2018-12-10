package Hanoi;

public class Hanoi {
    public  static void main(String[] args){
        hanoi(3,"A","B","C");
    }

    /**
     *  @param n :第几个盘子
     * @param from :开始的柱子
     * @param in :中间的柱子
     * @param to :目标柱子
     */
    public static void hanoi(int n, String from, String in, String to){
        //结束条件
        if(n == 1){
            System.out.println("第一个盘子从"+from+"移动到"+to);
        }else{
            //移动除目标盘子所有盘子到中间位置
            hanoi(n-1,from,to,in);
            //移动下面盘子
            System.out.print("第"+n+"个盘子从"+from+"移动"+to);
            //把上面所有盘子从中间位置移动到目标位置
            hanoi(n-1,from,in,to);
        }
    }
}
