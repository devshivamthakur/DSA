//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    static int postindex=-1;
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        postindex=n-1;
        Node node=solve(in,post,n,0,n-1);
        return node;
        // Your code here
    }
    
    
    Node solve(int in[],int post[],int n,int instart,int inend){
        if(postindex<0|| instart>inend){
            return null;
        }
        
       
        int element=post[postindex];
        Node node =new Node(post[postindex]);
        postindex--;
        
        int index=search(in,element);
        node.right=solve(in,post,n,index+1,inend);
        node.left=solve(in,post,n,instart,index-1);
        return node;
        
        
    }
    
    public int search(int in[],int element){
        
        for(int i=0;i<in.length;i++){
            if(in[i]==element){
                return i;
            }
        }
        
        return -1;
        
    }
}
