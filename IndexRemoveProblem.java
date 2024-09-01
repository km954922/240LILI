/*
Given a linked list, remove the n-th node from the end of the list
and return its head. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the index of the element that you need to remove
(2) display the new linkedlist after removal

Example 1:
input:1,2,3,4,5,2
output:head-->1-->2-->3-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The second node from the end is 4.
After removing the second node from the end, the 
linkedlist is 1->2->3->5 

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class IndexRemoveProblem
{
   public static void main(String[] args)
   {
      //add your code here
      Scanner input = new Scanner(System.in);
      LinkedList llist = new LinkedList();
      llist.head = new ListNode(input.nextInt());
      llist.head.next = new ListNode(input.nextInt());
      llist.head.next.next = new ListNode(input.nextInt());
      llist.head.next.next.next = new ListNode(input.nextInt());
      llist.head.next.next.next.next = new ListNode(input.nextInt());
      int n = input.nextInt();
      System.out.println("input: " + llist);
      System.out.println("Nth Number: " + n);
      removeNthFromEnd(llist, n);
      System.out.println("output: " + llist);
   }
   public static void removeNthFromEnd(LinkedList llist, int n)
   {
      //add your code here
      ListNode start = llist.head;
      int length = 0; // initialize length to 0
      while(start != null){
         length++;
         start = start.next;
      }
      if(n <= length){
         int indexFromStart = (length-n);
         start = llist.head;
      if(indexFromStart == 0)
         llist.head = llist.head.next;
      else{
      while(indexFromStart > 1){
         indexFromStart--;
         start = start.next;
      }
      start.next = start.next.next;
      }

}
class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}
class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
}
}
