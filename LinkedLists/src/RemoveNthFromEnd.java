
public class RemoveNthFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if(head == null)
			return null;

		ListNode temp1 = head;
		ListNode temp2 = head;
		int counter = n;
		while(counter !=0 ){
			temp1 = temp1.next;
			counter--;
		}
		if(temp1 == null)
			return head.next;

		while(temp1.next != null){
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		temp2.next = temp2.next.next;

		return head;
	}

}
