package Tree.ArrayBinaryTree;

/**
 * 顺序存储二叉树,并对其进行遍历
 */
public class ArrayBinaryTree {
    int data[];
    public  ArrayBinaryTree(int data[]){
        this.data = data;
    }

    /**
     * 通过前序对二叉树进行遍历
     * @param index:遍历的起始位置
     */
    public void frontBinaryTree(int index){
        if(data == null && data.length>0){
            return;
        }
        //根节点
        System.out.print(this.data[index]+" ");
        //遍历左儿子
        if(2*index+1<data.length){
            frontBinaryTree(index*2+1);
        }
        //遍历右儿子
        if(2*index+2<data.length){
            frontBinaryTree(index*2+2);
        }

    }
}
