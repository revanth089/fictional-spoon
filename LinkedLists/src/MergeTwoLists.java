//Merging two sorted Linked lists into a new sorted linked list
public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode head = new ListNode(3);
		ListNode tail = new ListNode(3);
		head.next = tail;

		while(l1!=null && l2 != null){
			// ListNode temp = null;

			if(l1.val < l2.val){
				tail.next = l1;
				l1 = l1.next;
			}
			else{
				tail.next = l2;
				l2 = l2.next;
			}
			//tail.next = temp;
			tail = tail.next;
		}
		if(l1 != null && l2 == null){
			tail.next = l1;
		}
		else{
			tail.next = l2;
		}
		return head.next.next;

	}

}
