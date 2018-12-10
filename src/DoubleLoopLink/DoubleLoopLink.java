package DoubleLoopLink;

/**
 * 双向循环链表
 *  DoubleLoopLink doubleNextNode = this ;
 * 当前节点下一个的节点,如果当前节点为null，则当前节点为this
 */
public class DoubleLoopLink {
    //上一个节点
    DoubleLoopLink doublePreNode = this;
    //下一个节点
    DoubleLoopLink doubleNextNode = this ;

    int data;

    public DoubleLoopLink(int data){
        this.data = data;
    }


    //返回上一个节点
    public Object getPreNode(){
        return this.doublePreNode.data;
    }
    //返回下一个节点
    public Object getNextNode(){
        return this.doubleNextNode.data;
    }

    //增节点
    public DoubleLoopLink after(DoubleLoopLink doubleLoopLink){
        //当前节点下一个的节点,如果当前节点为null，则当前节点为this
        DoubleLoopLink nextNode = this.doubleNextNode;
        //添加节点后,当前节点的的下一个节点
        this.doubleNextNode = doubleLoopLink;
        //新节点的上一个节点
        doubleLoopLink.doublePreNode = this;
        //新节点的下一个节点
        doubleLoopLink.doubleNextNode = nextNode;
        //nextNode的上一个节点为新节点
        nextNode.doublePreNode = doubleLoopLink;

        return doubleLoopLink;
    }
}
