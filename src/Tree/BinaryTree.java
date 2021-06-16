package Tree;

import java.util.LinkedList;

/*
 * 先序创建、输出 二叉树
 * 先序 二叉树
 */

public class BinaryTree<T>
{
    /*
     * 先序创建二叉树
     * 返回：根节点
     */
    public TreeNode<T> creatBinaryPre(LinkedList<T> treeData)
    {
        TreeNode<T> root=null;
        T data=treeData.removeFirst();
        if (data!=null)
        {
            root=new TreeNode<T>(data, null, null);
            root.left=creatBinaryPre(treeData);
            root.right=creatBinaryPre(treeData);
        }
        return root;
    }
    /*
     * 先序遍历二叉树（递归）
     */
    public void PrintBinaryTreePreRecur(TreeNode<T> root)
    {
        if (root!=null)
        {
            System.out.print(root.data);
            PrintBinaryTreePreRecur(root.left);
            PrintBinaryTreePreRecur(root.right);
        }
    }
    /*
     * 中序遍历二叉树（递归）
     */
    public void PrintBinaryTreeMidRecur(TreeNode<T> root)
    {
        if (root!=null)
        {
            PrintBinaryTreeMidRecur(root.left);
            System.out.print(root.data);
            PrintBinaryTreeMidRecur(root.right);
        }
    }
    /*
     * 后序遍历二叉树（递归）
     */
    public void PrintBinaryTreeBacRecur(TreeNode<T> root)
    {
        if (root!=null)
        {
            PrintBinaryTreeBacRecur(root.left);
            PrintBinaryTreeBacRecur(root.right);
            System.out.print(root.data);
        }
    }
}
