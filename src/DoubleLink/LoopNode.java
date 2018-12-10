package DoubleLink;

public class LoopNode {
    //节点内容
    int data;
    //下一个节点
    LoopNode nextLoopNode = this;
    public LoopNode(int data){
        this.data = data;
    }
    //插入一个节点
    public void insert(LoopNode loopNode){
        LoopNode currentNode  = this;
        //下一个节点
        LoopNode nextNode = this.nextLoopNode;

        currentNode.nextLoopNode = loopNode;

        loopNode.nextLoopNode = nextNode;


    }
    //获取下一个节点
    public Object getNextLoopNode(){
        return this.nextLoopNode.data;
    }
}
