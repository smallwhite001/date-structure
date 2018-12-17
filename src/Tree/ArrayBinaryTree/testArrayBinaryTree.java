package Tree.ArrayBinaryTree;

import java.util.Arrays;

public class testArrayBinaryTree {
   public static  void  main(String[] args){
       int data[] = new int[]{1,2,3,4,5,6,7};
       ArrayBinaryTree binaryTree  = new ArrayBinaryTree(data);
       binaryTree.frontBinaryTree(0);
//       System.out.println(Arrays.toString(data));
   }
 }
