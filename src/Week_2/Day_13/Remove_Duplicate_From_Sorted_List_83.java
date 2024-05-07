/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package Week_2.Day_13;

public class Remove_Duplicate_From_Sorted_List_83 {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode sHead = new ListNode(), node = head;
//        ListNode sTail = sHead;
//
//        while (node != null) {
//            while (node.next != null && node.next.val == node.val) {
//                node = node.next;
//            }
//
//            ListNode next = node.next;
//            node.next = null;
//            sTail.next = node;
//            sTail = node;
//            node = next;
//        }
//
//        return sHead.next;
//    }
}
