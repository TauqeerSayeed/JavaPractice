class node3{
	int data;
	node3 next;
	node3(int data){
		this.data =data;
	}
}
public class insertInNode {
	
	public static node3 convertArraytoLL(int[] arr) {
		node3 head = new node3(arr[0]);
		node3 temp =head;
		for(int i=1;i<arr.length;i++) {
			node3 nn = new node3(arr[i]);
			temp.next = nn;
			temp = temp.next;
		}
		return head;
	}
	public static void print(node3 head) {
		node3 temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static node3 insertAtHead(node3 head, int val) {
		node3 temp = new node3(val);
		temp.next = head;
		return temp;
	}
	public static node3 insertAtTail(node3 head, int val) {
		node3 temp = new node3(val);
		node3 copy = head;
		if(head==null) {
			return temp;
		}
		while(copy.next!=null) {
			copy = copy.next;
		}
		copy.next = temp;
		return head;
	}
	public static node3 insertAtKthNode(node3 head, int value,int k) {
		node3 nn = new node3(value);
		if(head==null) {
			if(k==1) {
				head = nn;
				return head;
			}
			else {
				return null;
			}
		}
		if(k==1) {
			nn.next = head;
			return nn;
		}
		node3 temp = head;
		int count = 1;
		while(temp.next!=null && count!=k-1) {
			temp = temp.next;
			count ++;
		}
		nn.next = temp.next;
		temp.next = nn;
		return head;
	}
	
	public static node3 insertAtValue(node3 head, int atvalue,int value ) {
		node3 nn = new node3(value);
		if(head==null) {
			return null;
		}
		if(head.data == atvalue) {
			nn.next = head;
			return nn;
		}
		node3 temp = head;
		while(temp.next!=null && temp.next.data!=atvalue) {
			temp = temp.next;
		}
		if(temp.next == null) {
			return head;
		}
		nn.next = temp.next;
		temp.next = nn;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5};
		node3 head = convertArraytoLL(arr); // convert to array
		print(head);
		node3 newNode1 = insertAtHead(head,9); // insert at head
		print(newNode1);
		node3 newNode2 = insertAtTail(head,9); // insert at tail
		print(newNode2);
		node3 newNode3 = insertAtKthNode(head,6,9); //insert at Kth node
		print(newNode3);
		node3 newNode4 = insertAtValue(head,4,3); //insert at value
		print(newNode4);
	}

}
