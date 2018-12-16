package Tree;

/**
 * 创建二叉树
 */
public class BinaryTree {
   TreeNode root;

   //设置根节点
    public  void setRoot(TreeNode root){
        this.root = root;
    }
    //获取根节点

    public TreeNode getRoot() {
        return root;
    }
    //前序遍历
    public void frontShow(){
        if(root!=null) {
            root.frontShow();
        }
    }

    //中续遍历
    public void middleShow(){
        root.middleShow();
    }
    //后续遍历
    public void laterShow() {
       root.laterShow();

    }

    public TreeNode getNodeByFront(int i) {
      return root.getNodeByFront(i);
    }

    public void delete(int i) {
      //删除根节点
        if (i == this.root.data){
            root = null;
        }else{
            root.delete(i);
        }
    }
}
