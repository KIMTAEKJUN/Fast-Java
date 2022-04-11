# 02. 연결 리스트 (LinkedList) 구현하기

## LinkedList 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조

- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음

- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)

- 연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)

- jdk 클래스 : LinkedList

##  LinkedList 구현하기

MyListNode.java
```
public class MyListNode {

	private String data;       // 자료
	public MyListNode next;    // 다음 노드를 가리키는 링크
	
	public MyListNode(){
		data = null;
		next = null;
	}
	
	public MyListNode(String data){
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}
```

MyLinkedList.java
```
public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode;
		if(head == null){  //맨 처음일때
			newNode = new MyListNode(data);
			head = newNode;
		}
		else{
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null)  //맨 뒤로 가서  
				temp = temp.next;
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count ){
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
				
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞을 삭제하는
			head = tempNode.next;
		}
		else{
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}
```

MyLinkedListTest.java
```
public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		list.insertElement(3, "D");
		list.printAll();
		list.removeElement(0);
		list.printAll();
		list.removeElement(1);
		list.printAll();
						
		list.insertElement(0, "A-1");
		list.printAll();
		System.out.println(list.getSize());
		
		list.removeElement(0);
		list.printAll();
		System.out.println(list.getSize());
		
		list.removeAll();
		list.printAll();
		list.addElement("A");
		list.printAll();
		System.out.println(list.getElement(0));
		list.removeElement(0);
	}
}
```


