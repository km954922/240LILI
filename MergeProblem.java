/*
In this program, you need to merge two sorted linked lists 
and return it as a new list. The new list should be made by
splicing together the nodes of the first two lists.

Example 1:
input:1->2->4, 1->3->4
output:head-->1-->1-->2-->3-->4-->4-->null

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class MergeProblem
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("First list");
         LinkedList llist1 = new LinkedList();
         llist1.head = new ListNode(input.nextInt());
         llist1.head.next = new ListNode(input.nextInt());
         llist1.head.next.next = new ListNode(input.nextInt());
      System.out.println("Second list");
         LinkedList llist2 = new LinkedList();
         llist2.head = new ListNode(input.nextInt());
         llist2.head.next = new ListNode(input.nextInt());
         llist2.head.next.next = new ListNode(input.nextInt());
      LinkedList sortedList = new LinkedList();
      sortedList.head = mergeTwoLists(llist1,llist2);
      System.out.println(sortedList);
   }
   public static ListNode mergeTwoLists(LinkedList llist1, LinkedList llist2)
   {
      //add your code here
      ListNode p1 = llist1.head; 
      ListNode p2 = llist2.head; 
      ListNode temp = new ListNode(0);
      ListNode prev = temp;
      while(true){
         if(p1 == null){
            prev.next = p2;
            break;
         }
         if(p2 == null){
            prev.next = p1;
            break;
         }
      if(p1.value <= p2.value){
            prev.next = p1;
            p1 = p1.next;
            }else{
               prev.next = p2;
               p2 = p2.next;
               }
         prev = prev.next;
         }
      return temp.next;
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
