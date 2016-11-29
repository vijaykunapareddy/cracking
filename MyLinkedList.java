class MyNode{
	int data;
	MyNode next;
	public MyNode(int d) {
		data = d; 
		next = null;
	}
}
public class MyLinkedList {
	
	MyNode head; 
	public void push(int data){
		 MyNode new_node = new  MyNode(data);
	     new_node.next = head;
         head = new_node;
	}
	
	public int getCount()
    {
        MyNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

	  public static void main(String[] args)
		    {
		        MyLinkedList llist = new MyLinkedList();
		        llist.push(1);
		        llist.push(3);
		        llist.push(1);
		        llist.push(2);
		        llist.push(1);
		        System.out.println("Count of nodes is " +llist.getCount());
		    }

}
