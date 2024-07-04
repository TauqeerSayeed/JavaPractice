class node2{
	int data;
	node2 next;
	node2(int data){
		this.data =data;
	}
}
public class deleteNode {
	
	public static node2 convertArraytoLL(int[] arr) {
		node2 head = new node2(arr[0]);
		node2 temp =head;
		for(int i=1;i<arr.length;i++) {
			node2 nn = new node2(arr[i]);
			temp.next = nn;
			temp = temp.next;
		}
		return head;
	}
	
	public static node2 deleteHeadNode(node2 head) {
		if(head==null) {
			return null;
		}
		head = head.next;
		return head;
	}
	public static node2 deleteTailNode(node2 head) {
		node2 temp = head;
		if(head==null) return  null;
		if(temp.next==null) {
			return null;
		}
		while(temp.next.next!=null) {
			temp =temp.next;
		}
		temp.next = null;
		return head;
	}
	public static void print(node2 head) {
		node2 temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static node2 deleteKthNode(node2 head,int k) {
;		int count =1;
		node2 temp=head;
		node2 prev =null;
		if(head==null) return null;
		if(k==1) {
			head = head.next;
			return head;
		}
		while (count!=k) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		prev.next = prev.next.next;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,8,7};
		node2 head = convertArraytoLL(arr); //convert array to linked list
		print(head);
		node2 newNode = deleteHeadNode(head); //delete node from head
		print(newNode);
		node2 newNode3 = deleteTailNode(head); //delete node from tail
		print(newNode3);
		node2 newNode4 = deleteKthNode(head,2); // delete Nth node
		print(newNode4);
		print(head);
	}

}
