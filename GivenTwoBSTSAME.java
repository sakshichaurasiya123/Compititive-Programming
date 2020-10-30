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
    //Insertion
    public Node insert(Node root,int val){
        if(root==null)
            return createNewNode(val);
        else if(val<root.data)
            root.left=insert(root.left,val);
        else if(val>root.data)
            root.right=insert(root.right,val);
        return root;   
    }
    //Element of given two BST's are Same
    public boolean isElementSame(Node node,Node node1){
        List<Integer>l1=new ArrayList<Integer>();
        List<Integer>l2=new ArrayList<Integer>();
        inorder(node,l1);
        inorder(node1,l2);
        if(l1.size()!=l2.size())
            return false;
        else{
        return l1.equals(l2)?true:false;
        }
        
    }
    public void inorder(Node node,List<Integer>list){
        if(node==null)
            return;
        inorder(node.left,list);
        list.add(node.data);
        inorder(node.right,list);
    }
    public void inorder1(Node node){
        if(node==null)
            return;
        inorder1(node.left);
        System.out.print(node.data+" ");
        inorder1(node.right);
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
        }
        int m=in.nextInt();
        Node node1=null;
        while(m-->0){
         node1=a.insert(node1,in.nextInt());
        }
        if(a.isElementSame(node,node1))
        {
            System.out.println("Lists are same : ");
            System.out.print("list one elements : ");
            a.inorder1(node);
            System.out.println();
            System.out.print("list 2 elements : ");
            a.inorder1(node1);
        }
        else
        System.out.println("List elements are not same");
	}
}
