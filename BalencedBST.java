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
    public Node balencedBST(int arr[]){
        Arrays.sort(arr);
        return balencedNode(arr,0,arr.length-1);
    }
    public Node balencedNode(int arr[],int start,int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        Node node=createNewNode(arr[mid]);
        node.left=balencedNode(arr,start,mid-1);
        node.right=balencedNode(arr,mid+1,end);
        return node;
    }
    public void inorder(Node node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
}
class GFG {
	public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        BST a=new BST();
        Node node=null;
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
       node= a.balencedBST(arr);
        a.inorder(node);
	}
}
