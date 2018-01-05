/**
题目描述
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
*/

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

/*
递归
1+max(TD(left),TD(right))
运行时间：15ms
占用内存：8652k
*/
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
/*
层次遍历需要O(n)的空间复杂度
*/