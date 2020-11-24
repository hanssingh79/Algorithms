import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;



public class InorderTraversal {
	public static void main(String[] args) {
		 TreeNode root =new TreeNode(5);
			
		 inOrderTravesal(root);
	}
	 
	
	private static List inOrderTravesal(TreeNode root) {
		
		Stack<TreeNode> stack=new Stack<TreeNode>();
		List<Integer> list=new ArrayList<Integer>();
		while(!stack.isEmpty() || root!=null) {
			while(root!=null) {
				stack.push(root);				
				root=root.left;
			}
			stack.pop();
			list.add(root.val);
			root=root.right;
			
		}
		
		return list;
			
		
	}

}
