/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
class BST{
    public Node createNewNode(int val){
        Node node=new Node();
        node.data=val;
        node.left=null;
        node.right=null;
        return node;
    }
    
    public Node insert(Node root,int val){
        if(root==null)
            return createNewNode(val);
        else if(val<root.data)
            root.left=insert(root.left,val);
        else if(val>root.data)
            root.right=insert(root.right,val);
        return root;   
    }
}
class GFG {
	public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        BST a=new BST();
        Node node=null;
        int n=in.nextInt();
        while(n-->0){
        node=a.insert(node,in.nextInt());
       System.out.print(node.data+" ");
        }
	}
}
