/*
Given a linked list, remove all elements from a linkedlist of 
integers that have value val. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the value of the element that you need to remove
(2) display the new linkedlist after removal

Example 1:
input:1,2,3,4,5,2
output:head-->1-->3-->4-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The value to remove is 2.
After removing all the nodes that value equals 2, the linkedlist is 1->3->4->5 

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class RemoveElementsProblem
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    LinkedList l = new LinkedList();
	    for(int i=0;i<5;i++){
	        l.insert(sc.nextInt());
	    }
	    removeElements(l, sc.nextInt());
	    System.out.println(l);
	}
	
	public static void removeElements(LinkedList llist, int val){
	      ListNode curr = llist.head;
	      ListNode prev = null;
	      	while(curr != null) {
		    if(curr.value == val){
			if(prev == null){
			    llist.head = curr.next;
			}else{
			    prev.next = curr.next;
			}
		    }else{
			prev = curr;
		    }
		    curr = curr.next;
		}
	}
}
class ListNode{
    int value;
    ListNode next;
    ListNode(int v){value = v;}
}

class LinkedList {
    ListNode head;
    public String toString(){
        //add your code here
        String ans = "head-->";
        ListNode temp = head;
        while(temp != null) {
            ans += temp.value + "-->";
            temp = temp.next;
        }
        ans += null;
        return ans;
    }
    public void insert(int x){
        if(head == null) {
            head = new ListNode(x);
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new ListNode(x);
    }
}
