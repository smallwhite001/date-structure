package DoubleLoopLink;

public class test {
    public static void  main(String args[]) {
        DoubleLoopLink doubleLoopLink1 = new DoubleLoopLink(1);
        DoubleLoopLink doubleLoopLink2 = new DoubleLoopLink(2);
        DoubleLoopLink doubleLoopLink3 = new DoubleLoopLink(3);
        DoubleLoopLink doubleLoopLink4 = new DoubleLoopLink(4);

        doubleLoopLink1.after(doubleLoopLink2);
        System.out.println("test:" + doubleLoopLink1.doubleNextNode.data);
        System.out.println("test:"+  doubleLoopLink2.doublePreNode.data);
    }
}