package whathappen;



public class LinkendList {

	
	private  ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
	
	
	
	public ListNode(int data) {
		this.data =data;
		this.next =next;
	}	
	}
	
	public void display(ListNode head) {
		 ListNode curruent = head;
		   while(curruent != null ) {
			   System.out.print(curruent.data +"-->");
			   curruent = curruent.next;
			  }
		   System.out.println("null");
		   
		   

	       }
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}

		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		LinkendList link = new LinkendList();
		//link.head =new ListNode(10);
		//connect from chain
		
		ListNode head  = new ListNode(10);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		head.next = second; //10-->2
		second.next= third;// 10- 2-3
		third.next=fourth;// 10-2-3-4
		
		
	
		
		link.display(head);
		
		ListNode reversListHeadListNode = link.reverse(head);
		 link.display(reversListHeadListNode);
		
		
		
		
		
		
	  
	}

}
