/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    
        if(node.next == null) return;
        
        node.val = node.next.val; //swapping values of node to be deleted and next node
        node.next = node.next.next; 
    }
}