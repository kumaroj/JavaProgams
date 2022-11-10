package trees;
import java.util.ArrayList;
import java.util.Stack;

import trees.TreeNode;

public class Zigzagtraversal {

	public static void main(String[] args) {
	
		TreeNode tree = new TreeNode(1);
	    tree.leftChild = new TreeNode(2);
	    tree.rightChild = new TreeNode(3);
	    tree.leftChild.leftChild = new TreeNode(7);
	    tree.leftChild.rightChild = new TreeNode(6);
	    tree.rightChild.leftChild = new TreeNode(5);
	    tree.rightChild.rightChild = new TreeNode(4);
	 
	   ArrayList<Integer> ans = zigzagTreeTraversal(tree);
	   System.out.println(ans);
	}
	

    public static ArrayList<Integer> zigzagTreeTraversal(TreeNode root) 
    {
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	
    	Stack<TreeNode> curr = new Stack<TreeNode>();
    	Stack<TreeNode> next = new Stack<TreeNode>();
    	
    	int level = 1;
    	
    	curr.push(root);
    	//al.add(root.val);
    	
    	while(!curr.isEmpty()){
    		
    		TreeNode x = curr.pop();
    		al.add(x.val);
    		if (level%2==0){
    			
    			if (x.rightChild!=null){
    				next.push(x.rightChild);
    			}
    			if (x.leftChild!=null){
    				next.push(x.leftChild);
    			}
    		}
    		else{
    			if (x.leftChild!=null){
    				next.push(x.leftChild);
    			}
    			if (x.rightChild!=null){
    				next.push(x.rightChild);
    			}
    			
    		}
    		if (curr.isEmpty()){
    			Stack<TreeNode>temp = next;
    			next = curr;
        		curr = temp;
    		}
    		level++;
    		
    	}
    	
    	return al;
    }
    
}
