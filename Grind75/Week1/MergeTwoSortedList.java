package Grind75.Week1;
import java.util.*;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode curr=result;

       while(list1 != null && list2 !=null){
           if(list1.val >=list2.val){
               curr.next=list2;
               list2=list2.next;  
           }else{
               curr.next=list1;
               list1=list1.next;
           }
           curr=curr.next;
       }
       if(list1 !=null){
           curr.next=list1;
       }else if(list2 != null){
           curr.next =list2;
       }
       return result.next;
    }
}
