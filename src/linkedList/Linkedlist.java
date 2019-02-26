package linkedList;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Obj = new LinkedList<String>();
		
		//adding to list
		Obj.add("D");
		Obj.add("C");
		Obj.addFirst("A");
		Obj.add("E");
		Obj.addLast("Z");
		Obj.add("B");
		Obj.add("E");
		Obj.add(2, "F");
		System.out.println("Linked List ::" + Obj);
		
		//Remove from linked list
		
		Obj.remove("F");
		Obj.remove(1);
		Obj.removeLast();
		System.out.println("Removed Linled List ::" + Obj);
		
		//set element
		Obj.set(4, "G");
		System.out.println("setted element"  + Obj);
		
		//get element
		
		Object o =Obj.get(1);
		System.out.println("Get element"+o);
		
		// size 
		Object si = Obj.size();
		System.out.println("size"  + si);
		
		
		boolean status = Obj.contains("E"); 
		  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
		

	}

}
