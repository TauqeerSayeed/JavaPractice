class node1{
	int data;
	node1 next;
	node1(int data){
		this.data=data;
	}
}
public class Node {
	
	public static node1 convertArrayToLL(int[] arr) {
		node1 head = new node1(arr[0]);
		node1 temp =head;
		for(int i=1;i<arr.length;i++) {
			node1 nn = new node1(arr[i]);
			temp.next = nn;
			temp = temp.next;
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		node1 n1 = new node1(80);
//		node1 n2 = new node1(40);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		int[] arr = {8,4,5};
		node1 head = convertArrayToLL(arr);
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
	}

}
