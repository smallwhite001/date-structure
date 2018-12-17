package Tree.Binary_Tree;

//树的测试
public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一个只有根节点的树
        BinaryTree binaryTree = new BinaryTree();
        TreeNode rootNode = new TreeNode(1);
        binaryTree.setRoot(rootNode);

        TreeNode leftNode = new TreeNode(2);
        rootNode.setLeftNode(leftNode);
        TreeNode rightNode = new TreeNode(3);
        rootNode.setRightNode(rightNode);

        leftNode.setLeftNode(new TreeNode(4));
        leftNode.setRightNode(new TreeNode(5));
        rightNode.setLeftNode(new TreeNode(6));
        rightNode.setRightNode(new TreeNode(7));
        //前序遍历
        binaryTree.frontShow();
        //中序遍历
        System.out.println();
        binaryTree.middleShow();
        //后序遍历
        System.out.println();
        binaryTree.laterShow();

        //前序查找一个节点
        System.out.println();
        TreeNode node =  binaryTree.getNodeByFront(1);
        System.out.println(node);

        //删除二叉树
        binaryTree.delete(7);
        System.out.println("删除一个节点后:");
        binaryTree.frontShow();
    }
}
