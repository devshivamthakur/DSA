class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer>ans=new ArrayList<>();
	    if(node==null){
	        return ans;
	    }
	    ans.add(node.data);
	    traverseleft(node.left,ans);
	    
	    traverseLeaf(node.left,ans);
	    traverseLeaf(node.right,ans);
	    
	    traverseright(node.right,ans);
	    return ans;
	    
	    
	    
	}
	public void traverseleft(Node node,ArrayList<Integer>ans){
	    if(node==null||(node.left==null&&node.right==null)){
	        return;
	    }
	    ans.add(node.data);
	    
	    if(node.left!=null){
	        traverseleft(node.left,ans);
	    } else{
	         traverseleft(node.right,ans);  
	    }
	    
	}
	public void traverseLeaf(Node node,ArrayList<Integer>ans){
	    if(node==null){
	        return;
	    }
	     if(node.left==null&&node.right==null){
	        ans.add(node.data);
	       //  return;
	    }
	    traverseLeaf(node.left,ans);
	    traverseLeaf(node.right,ans);
	    
	    
	}
	
	public void traverseright(Node node,ArrayList<Integer>ans){
	    if(node==null||(node.left==null&&node.right==null)){
	        return;
	    }
	     if(node.right!=null){
	        traverseright(node.right,ans);
	    } else{
	         traverseright(node.left,ans);  
	    }
	    ans.add(node.data);
	}
}
