
/**
 * BinearySearchTree. Represent a binary search tree
 * The student cannot change the public interface
 * 
 * Kylie Heiland
 * 11/22/22
 */
public class BinarySearchTree<E extends Comparable<E>> extends CSCI251ProjFour
{
    TreeNode<E> root; // the root of the tree
    
    /**
     * constructor create a empty binary search tree by setting root to be null
     */
    public BinarySearchTree(){
        this.root = null;
    }
    
    /**
     * search the given data in this binary search tree
     * If the data is found, return a reference to the tree node
     * othewise, return null
     * @param data The target to search
     * @return a TreeNode reference to the node that contains the data
     *         if no node contains data, return null
     */
    public TreeNode<E> search(E data){
        TreeNode<E> r = root; //Sets a node reference to the root.
        
        while(r != null)
        { 
            
            if(data.compareTo(r.getData()) == 0)
            {
                return r; //The data is found
            }
            else if(data.compareTo(r.getData()) < 0)
            { //If the data we are searching for is less than the node's data, then we move on to the node's left child. 
                r = r.getLeft();
            }
            else
            { //If the data we are searching for is greater than the node's data, then we move on to the node's right child. 
                r = r.getRight();
            }
        }
        return null; //If no matching data was found in the tree.
    }
    
    /**
     * insert given node to this binary search tree. If this tree 
     * was empty, the given node becomes the root of this tree.
     * @param newNode the given node to be inserted
     */
    public void insert(TreeNode<E> newNode){
        insert(newNode.getData());
    }
    
    /**
     * insert given data to this binary search tree. If this tree 
     * was empty, the given node becomes the root of this tree.
     * @param data the given data to be inserted
     */
    public void insert(E data){
        TreeNode<E> r;
        TreeNode<E> insertedNode = new TreeNode<E>(data);
        if(isEmpty())
        {
            root = insertedNode;
        }
        else
        {
            r = this.root;
            while(r != null)
            {
                if(data.compareTo(r.getData()) < 0)
                {
                    if(r.getLeft() == null)
                    {
                        r.setLeft(insertedNode);
                        insertedNode.setParent(r);
                        return;
                    }
                    else
                    {
                        r = r.getLeft();
                    }
                }
                else
                {
                    if(r.getRight() == null)
                    {
                        r.setRight(insertedNode);
                        insertedNode.setParent(r);
                        return;
                    }
                    else
                    {
                        r = r.getRight();
                    }
                }
            }
    }
}
    
    /**
     * remove the given data from this binary search tree and return
     * true. If the data is not in the tree, return false
     */
    public boolean remove(E data){
        TreeNode<E> par = null;
        TreeNode<E> cur = root;
        TreeNode<E> suc;
        E successorData = null;
        
        while(cur != null)
        {
            if(data.compareTo(cur.getData()) == 0)
            {
                if(cur.getLeft() == null && cur.getRight() == null)
                {
                    if(par == null)
                    { //If the data wanting to be removed is found in the root of the tree and there are no other nodes in the tree, then the binary tree is cleared.
                        root = null;
                    }
                    else if(par.getLeft() == cur)
                    {
                        par.setLeft(null);
                    }
                    else
                        par.setRight(null);
                }
                else if(cur.getRight() == null)
                { //Remove node with only left child. 
                    if(par == null)
                    {
                        root = cur.getLeft();
                    }
                    else if(par.getLeft() == cur)
                    {
                        par.setLeft(cur.getLeft());
                        cur = null;
                    }
                    else
                    {
                        par.setRight(cur.getLeft());
                        cur = null;
                    }
                }
                else if(cur.getLeft() == null)
                { //Remove node with only right child.
                    if(par == null)
                    {
                        root = cur.getRight();
                    }
                    else if(par.getLeft() == cur)
                    {
                        par.setLeft(cur.getRight());
                        cur = null;
                    }
                    else
                    {
                        par.setRight(cur.getRight());
                        cur = null;
                    }
                }
                else
                { //If it is the node with two children. 
                    //Find successor
                    suc = cur.getRight();
                    while(suc.getLeft() != null)
                    {
                        suc = suc.getLeft();
                    }
                    successorData = suc.getData();
                    remove(suc.getData());
                    cur.setData(successorData);
                }
                return true;
            }
            else if(data.compareTo(cur.getData()) < 0)
            {
                par = cur;
                cur = cur.getLeft();
            }
            else
            {
                par = cur;
                cur = cur.getRight();
            } 
        }
        return false;
        }
    
    
    /**
     * return a string representation of the tree
     * @return a String representation of the tree
     */
    public String toString(){
        return "(" + nodeTraversal(root) + ")";
    }
    
    /**
     * Traverses through the tree.
     */
    private String nodeTraversal(TreeNode<E>treeNode)
    {
        if(treeNode == null)
        {
            return "-";
        }
        return treeNode.getData().toString() + "(" + nodeTraversal(treeNode.getLeft()) + "," + nodeTraversal(treeNode.getRight()) + ")";
    }
    
    
    /**
     * return true if the tree is empty. False otherwise
     * @return true if the tree is empty; false othewise
     */
    public boolean isEmpty(){
        if(root == null)
        {
            return true;
        }
        return false;
    }
    
    /**
     * return the height of the tree. Notice the height is defined as
     * the length of the longest path from nodes to root
     * @return the height of the tree
     */
    public int height(){
        return BstGetHeight(root);
    }
    
    /**
     * return the height of the tree. Notice the height is defined as
     * the length of the longest path from nodes to root
     * @return the height of the tree
     */
    private int BstGetHeight(TreeNode<E> node)
    {
        if(node == null)
        {
            return -1;
        }
        int left = BstGetHeight(node.getLeft());
        int right = BstGetHeight(node.getRight());
        return 1 + Math.max(left, right);
    }

    
    /**
     * return the number of nodes in the tree
     * @return the number of nodes in this tree
     */
    public int size()
    {
        return sizeOf(root);
    }
    
    /**
     * return the number of nodes in the tree
     * @return the number of nodes in this tree
     */
    private int sizeOf(TreeNode<E> node){
        if(node == null)
        {
            return 0;
        }
        return sizeOf(node.getLeft()) + sizeOf(node.getRight()) + 1;
    }
}