package DoubleLink;

public class test {
    public static void  main(String args[]){
        LoopNode loopNode1 = new LoopNode(1);
        LoopNode loopNode2 = new LoopNode(2);
        LoopNode loopNode3 = new LoopNode(3);
        loopNode1.insert(loopNode2);
        System.out.print(loopNode1.nextLoopNode.data);
        System.out.print(loopNode2.nextLoopNode.data);
    }
}
