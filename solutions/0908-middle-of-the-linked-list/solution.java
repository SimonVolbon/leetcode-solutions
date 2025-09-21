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
class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        nodes.add(head);
        int count = 0; // we can start counting from 0 because its the starting index of the first entry
        while(true) {
            if(head.next == null){
                System.out.println((double) count / 2);
                return nodes.get((int) Math.ceil((double) count / 2));
            }
            nodes.add(head.next);
            head = head.next;
            count++;
        }
    }
}
