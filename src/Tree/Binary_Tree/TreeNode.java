package Tree.Binary_Tree;

public class TreeNode {
    //节点数据
    public int data;
    //左儿子
    public TreeNode leftNode;
    //右儿子
    public TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    //设置左儿子
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    //设置右儿子

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    //前序遍历
    public void frontShow() {
        //先遍历根节点
        System.out.print(this.data + " ");
        //遍历左儿子
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //遍历右儿子
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void middleShow() {
        //左
        if (leftNode != null) {
            leftNode.middleShow();
        }
        System.out.print(this.data + " ");
        //右
        if (rightNode != null) {
            rightNode.middleShow();
        }
    }

    //后续遍历
    public void laterShow() {
        if (leftNode != null) {
            leftNode.laterShow();
        }
        if (rightNode != null) {
            rightNode.laterShow();
        }
        System.out.print(this.data + " ");
    }

    //通过前序查找某一个值
    public TreeNode getNodeByFront(int i) {
        TreeNode target = null;
        if (this.data == i) {
            return this;
        } else {
            if (leftNode != null) {
                target = leftNode.getNodeByFront(i);
            }
            if (target != null) {
                return target;
            }
            if (rightNode != null) {
                target = rightNode.getNodeByFront(i);
            }
        }
        return target;
    }
    //删除子树
    public void delete(int i) {
      TreeNode parentNode = this;
      //判断左儿子
      if(parentNode.leftNode!=null && parentNode.leftNode.data==i){
          parentNode.leftNode = null;
          return;
      }
      //判断右儿子
      if(parentNode.rightNode!=null && parentNode.rightNode.data==i){
          parentNode.rightNode = null;
          return;
      }
      //递归循环左儿子
        parentNode = leftNode;
      if(parentNode!=null){
          parentNode.delete(i);
      }
      //递归循环右儿子
       parentNode =rightNode;
      if(parentNode!=null){
          parentNode.delete(i);
      }
    }














    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
