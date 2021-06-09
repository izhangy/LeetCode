package date.secondweek;

import date.secondweek.day2.TreeNode;
import org.junit.Test;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/6/9 - 9:47
 **/
/*
对称递归题型分类
对称递归解决的二叉树问题大多是判断性问题（boolean类型函数），可以分为两类：
1.不需要构造辅助函数。这一类题目有两种情况：（1）单树问题，且不需要用到子树的某一部分（比如根节点左子树的右子树），只需用到根节点左右子树的对称性即可递归。
（2）双树问题，即本身题目要求比较两棵树，那么不需要构造新函数。
2.需要构造辅助函数。这类题目通常只用根节点子树对称性无法完全解决问题，必须要用到子树的某一部分进行递归，即要调用辅助函数比较两个部分子树。形式上主函数参数列表只有一个根节点，辅助函数参数列表有两个节点。
*/


//101. 对称二叉树
public class day3 {
    public boolean isSymmetric(TreeNode root){
        if(root==null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode left, TreeNode right){
        if (left != null && right != null && left.val == right.val){
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
        return left == null && right == null;
    }
}
