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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode currentL1Node = l1;
        ListNode currentL2Node = l2;
        int carry = 0;
        int l1Value = 0;
        int l2Value = 0;
        List<Integer> nodes = new ArrayList<>();

        while(currentL1Node != null || currentL2Node != null) {

            l1Value = currentL1Node != null ? currentL1Node.val : 0;
            l2Value = currentL2Node != null ? currentL2Node.val : 0;

            //System.out.println(l1Value + " + " + l2Value);
            int sum = l1Value + l2Value + carry;
            carry = sum / 10;
            //System.out.println("Sum: " + sum);
            //System.out.println("Carry: " + carry);
            nodes.add(sum - 10 * carry);

            if(currentL1Node != null) 
            {
                currentL1Node = currentL1Node.next != null ? currentL1Node.next : null;
            }

            if(currentL2Node != null)
            {
                currentL2Node = currentL2Node.next != null ? currentL2Node.next : null;
            }
        } 

        if(carry > 0) nodes.add(carry);        

        // build linked list
        ListNode initNode = new ListNode(nodes.get(0));
        ListNode currNode = initNode;
        for(int i = 1; i < nodes.size(); i++) {
            ListNode nextNode = new ListNode(nodes.get(i));
            currNode.next = nextNode;
            currNode = nextNode;
        }

        return initNode;
    }
}
