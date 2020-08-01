import java.util.*;
public class Insert_at_specific_location{

    //******** Create new node *********

    static class LinkedListNode{
        public int data;
        public LinkedListNode next;
        public LinkedListNode(int data){
            this.data = data;
            this.next = null; 
        }
    }
    //******** Create List *********
    static class LinkedList{
        public LinkedListNode head;
        public LinkedList(){
            this.head = null;
        }
    }
    static LinkedListNode ttemp;

    //******** Insert element at last *********

    static LinkedListNode insert_last(LinkedListNode head , int data){
        LinkedListNode node = new LinkedListNode(data);
        if(head == null)
            ttemp = head = node;
        else{
            ttemp.next = node;
            ttemp = node;
        }
        return head;
    }

    //******** Insert at specific position *********
    static LinkedListNode insert_at_specific_location(LinkedListNode head , int data,int pos){
        LinkedListNode node = new LinkedListNode(data);
        LinkedListNode temp = head;
        int count=1;
        while(temp!=null){
            if(pos-1 == count)
                break;
            temp = temp.next;
            count++;
        }
        node.next = temp.next;
        temp.next = node;
        return head;
    }
    //******** Reverse list by recursion *********

    public static void reverse(LinkedListNode head){
        if(head.next!= null)
            reverse(head.next);
                System.out.print(head.data + " ");
    }

    //******** Reverse list by address *********

    public static LinkedListNode reverse_by_address(LinkedListNode ll){
        LinkedListNode pre,current,nx;
        pre = null;
        current = ll;
        nx = ll;
        while(nx!=null){
            nx = nx.next;
            current.next = pre;
            pre = current;
            current = nx;
        }
        return pre;
    }

    //******** Sort List *********

    public static LinkedListNode sort(LinkedListNode ll){
        LinkedListNode current ,nx;
        current =  ll;
        nx=null;
        while(current!=null){
            nx = current.next;
            while(nx!=null){
                if(current.data > nx.data){
                    int temp = current.data;
                    current.data = nx.data;
                    nx.data = temp;
                }
                nx = nx.next;
            }
         current = current.next;   
        }
        return ll;
    }
    //******** Remove duplicate element  *********
    
    public static LinkedListNode removeDuplicate(LinkedListNode ll_head){
        LinkedListNode current ,nx;
        current = ll_head;
        nx=null;
        while(current!=null){
            nx= current.next;
            while(nx!=null){
                if(current.data == nx.data){
                    current.next = nx.next;
                }
                nx = nx.next;
            }
            current = current.next;
        }
        return ll_head;
    }

    //******** Delete first element *********

    public static LinkedListNode deleteFirstElement(LinkedListNode ll_head){
        if(ll_head == null)
            return null;
        else
            return ll_head.next;
    }

    //******** Delete last element *********

    public static LinkedListNode deleteLastElement(LinkedListNode ll_head){
        LinkedListNode temp = ll_head;
        while(temp.next.next!=null)
            temp = temp.next;
        temp.next = null;
        return ll_head;
    }

    //******** Delete element specific position *********

    public static LinkedListNode deleteElementSpecificPosition(LinkedListNode ll_head,int pos){
        LinkedListNode temp = ll_head;
        if(ll_head == null)
            return null;
        else{
            int count = 1;
            while(temp!=null){
                if(count == pos-1)
                    break;
                count++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return ll_head;
        }
    }
    //******** Display List *********
    public static void display(LinkedListNode head){
        System.out.println();
        if(head==null)                      
            System.out.println("List is empty !");
        else{
            while(head!=null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }

//******** Main Method *********

    public static void main(String djfjkaj[]){
        try{
            Scanner scan = new Scanner(System.in);
            LinkedList list = new LinkedList();
            int n,data,pos;
            System.out.print("Enter the list size = ");
            n = scan.nextInt();
            System.out.println("Enter data for list = ");
            while( n-- > 0){
                data = scan.nextInt();
                LinkedListNode ll_head = insert_last(list.head , data);
                list.head = ll_head;
            }
            System.out.print("Enter data for specific position = ");
            data = scan.nextInt();
            System.out.print("Enter the specific position = ");
            pos = scan.nextInt();
            System.out.print("Enter positon for delete element = ");
            int position = scan.nextInt();
            insert_at_specific_location(list.head,data,pos);
            System.out.print("\n ** OUTPUT ** ");
            System.out.print("\n\nSimple List ");
            display(list.head);
            System.out.println("");
            System.out.println("Reverce List ");
            reverse(list.head);
            System.out.println("");
            // list.head = reverse_by_address(list.head); //this is also work well.
            list.head = sort(list.head);
            System.out.print("Sorted List ");
            display(list.head);
            System.out.print("\nRemoved Duplicate Data ");
            list.head = removeDuplicate(list.head);
            display(list.head);
            list.head = deleteFirstElement(list.head);
            System.out.print("\nDelete first element ");
            display(list.head);
            list.head = deleteLastElement(list.head);
            System.out.print("\nDelete last element ");
            display(list.head);
            System.out.println("");
            list.head = deleteElementSpecificPosition(list.head,position);
            System.out.print("\nDelete element specific position  ");
            display(list.head);
            System.out.println("");
        }catch(Exception e){}

    }
}
