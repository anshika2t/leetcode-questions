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
    public ListNode mergeNodes(ListNode head) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                result.add(sum);
                sum = 0;
            } else {
                sum += arr.get(i);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int x : result) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }

        return dummy.next;
    }
}