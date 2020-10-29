/* All Operations  of BST*/

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
    //Deletion
    public Node delete(Node node,int val){
        //Node childe element
        if(node==null)
            return null;
        if(val<node.data)
            node.left=delete(node.left,val);
        else if(val>node.data)
            node.right=delete(node.right,val);
        else{
            //One child Element
            if(node.left==null || node.right==null){
                Node temp=null;
                temp=node.left!=null ?node.left:node.right;
                if(temp==null)
                    return null;
                else
                    return temp;
            }
            else{
                //Two child Element
                Node successor=getsuccessor(node);
                node.data=successor.data;
                node.right=delete(node.right,successor.data);
                
                return node;
            }
        }
        return node;
    }
    static Node getsuccessor(Node node){
        if(node==null)
            return null;
        Node temp=node.right;
        while(temp.left!=null)
                temp=temp.left;
        return temp;
    }
    //Inroder
    public void InOrder(Node node){
        if(node==null)
            return;
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
    }
    //PreOrder
    public void PreOrder(Node node){
        if(node==null)
            return ;
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    //PostOrder
    public void PostOrder(Node node){
        if(node==null)
            return ;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }
    // Search Data
    static void search(Node node,int value){
        if(node==null)
            return;
            boolean flag=false;
        while(node!=null){
        if(value<node.data)
            node=node.left;
        else if(value>node.data)
            node=node.right;
        else if(value==node.data){
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("Value found : "+value);
        else
            System.out.println("Value Not Found");
    }
    // Find parent
    static Node parent(Node node, int val){
        Node isparent=null;
        if(node== null)
            return null;
        while(node!=null){
            if(val<node.data){
                isparent=node;
                node=node.left;
            }
            else if(val>node.data){
                isparent =node;
                node=node.right;
            }
            else 
                break;
        }
        return isparent;
    }
    //Find sibling
  public Node sibling(Node node, int val) {
    if(node == null || node.data == val) {
      return null;
    }
    
    Node parentNode = null;
    
    while(node != null) {
      if(val < node.data) {
        parentNode = node;
        node = node.left;
      } else if(val > node.data) {
        parentNode = node;
        node = node.right;
      } else {
        break;
      }
    }
    
    if(parentNode.left != null && val == parentNode.left.data) {
      return parentNode.right;
    }
    
    if(parentNode.right != null && val == parentNode.right.data) {
      return parentNode.left;
    }
    
    return null;
  }  
  
  //Inorder parent
  public Node inOrderParent(Node node, int val){
      if(node==null)
        return null;
        Node isparent=null;
        while(node!=null){
            if(val<node.data)
            {
                isparent=node;
                node=node.left;
            }
            else if(val>node.data){
                node=node.right;
            }
            else
                break;
        }
        return node!=null?isparent:null;
  }
  //InOrder precedessor
  public Node inOrderPrecedessor(Node node, int val){
      if(node==null)
        return null;
     Node issuccessor=null;
     while(node!=null){
         if(val<node.data)
            node=node.left;
        else if(val>node.data)
        {
            issuccessor=node;
            node=node.right;
        }
        else
            break;
     }
     return node!=null?issuccessor:null;
  }
    //InOrder Successor
    public Node inOrderSuccessor(Node node, int val){
      if(node==null)
        return null;
     Node issuccessor=null;
     while(node!=null){
         if(val<node.data){
            issuccessor=node;
            node=node.left;
         }
        else if(val>node.data)
            node=node.right;
        else
            {
                if(node.right!=null){
                    issuccessor=getsuccessor(node);
                    return issuccessor;
                }
                else
                    break;
            }
     }
     return node!=null?issuccessor:null;
  } 
  //Max Value from BST
  public int maxValue(Node node){
      if(node==null)
        return -1;
    while(node.right!=null){
        node=node.right;
    }
    return node.data;
  }
  //Min Value from BST
  public int getMinValue(Node node){
      if(node==null)
        return -1;
    while(node.left!=null){
        node=node.left;
    }
    return node.data;
  }
  // Longest common ancestor of two Element
  public Node LCA(Node node, int n1,int n2){
      if(node==null)
        return null;
        while(node!=null){
    if(node.data<n1 && node.data<n2)
        node=node.right;
    else if(node.data>n1 && node.data>n2)
        node=node.left;
    else
        break;
        }
    return node;
  }
  //Kth Smallest Element from BST
    int count=0;
  public void kthsmallest(Node node,int k){
      if(node==null)
        return;
      kthsmallest(node.left,k);
      count++;
      if(count==k){
        System.out.println("Kth Smallest : "+node.data);
        return;
      }
    
      
    kthsmallest(node.right,k);
  }
  //Kth largest Element from given BST
  int count1=0;
  public void kthLargest(Node node, int k){
      if(node==null)
        return;
      kthLargest(node.right,k);
      count1++;
      if(count1==k){
        System.out.println("Kth Largest Element : "+node.data);
        return;
      }
       kthLargest(node.left,k);
     
      
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
        //PreOrder
        /*
       System.out.print("PreOrder : ");
        a.PreOrder(node);
        System.out.println();*/
        
        /*Delete Particular node*/
        //node= a.delete(node,1);
        
        //InOrder
       /* System.out.print("InOrder : ");
        a.InOrder(node);
        System.out.println();*/

        //PostOrder
      /*  System.out.print("PostOrder : ");
        a.PostOrder(node);
        System.out.println();
        
        /*Search Element*/
    /*    int key=in.nextInt();
        a.search(node,key);
        */
        /* Finde parent of given node */
       /* int e=in.nextInt();
        node=a.parent(node,e);
        if(node!=null)
            System.out.println("Parent node of "+e+" = "+node.data);
        else
            System.out.println("Parent node of not present ");*/
        
        /*Find Sibling */
/*    int s=in.nextInt();
     Node siblingNode = a.sibling(node, s);
    if(siblingNode != null) {
      System.out.println("Sibling: " + siblingNode.data);
    } else {
      System.out.println("No Sibling");
    }
    //Inorder Parent
    int i=in.nextInt();
    Node parent=a.inOrderParent(node,i);
    if(parent!=null)
        System.out.println("Inorder Parent : "+parent.data);
    else
        System.out.println("Inorder parent not found");
   
    //InOrder Precedessor
        int ip=in.nextInt();
        node=a.inOrderPrecedessor(node,ip);
        if(node!=null)
            System.out.println("Inorder Presedessor : "+node.data);
        else
            System.out.println("Inorder Presedessor not found ");
	    
   
    //InOrder successor
        int is=in.nextInt();
        node=a.inOrderSuccessor(node,is);
        if(node!=null)
            System.out.println("Inorder Successor : "+node.data);
        else
            System.out.println("Inorder Successor not found ");
           
    //Find Max Element  from BST
      int max=a.maxValue(node);
      if(max!=-1)
      System.out.println("Max Element of BST: "+max);
      else
        System.out.println("Tree is Empty");
    
    //Min Element from BST
    int min=a.getMinValue(node);
    if(min!=-1)
        System.out.println("Minimum value of BST : "+min);
    else    
        System.out.println("Tree is Empty");
        
   //Longest common ancestor (LCA)
   int n1=in.nextInt();
   int n2=in.nextInt();
   node=a.LCA(node,n1,n2);
   System.out.println("LCA of n1 and n2 : "+node.data);
   */
   //Kth Smallest Element from BST
   int k=in.nextInt();
    a.kthsmallest(node,k);
   // System.out.println(node.data);
   
   // Kth Largest Element from BST
   int km=in.nextInt();
   a.kthLargest(node,km);
   
   
   	}
}
