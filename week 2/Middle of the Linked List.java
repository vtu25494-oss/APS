class Middle of the Linked List {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        for (; fast != null && fast.next != null; 
               slow = slow.next, fast = fast.next.next);
        
        return slow;
    }
}