class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);  
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevNode = null;

        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }

        prev.next.next = curr;  
        prev.next = prevNode;  

        return dummy.next;
    }
}
