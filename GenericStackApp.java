/* Generic Stack using linked list
   Taylor Kirschenheiter
   November 7th, 2019
   Generic stack class that uses a linked list to implement a stack, 
   implements 4 methods, push(), pop(), peek(), size()
*/

import java.util.*;
public class GenericStackApp extends genericStack <String> {
	
	public static void main(String[] args) {
	genericStack<String> stack = new genericStack<String>();
	String a = "Apple";
	String b = "Banana";
	String c = "Orange";
	
	stack.push(a);
	System.out.println("Push: "+a);
	stack.push(b);
	System.out.println("Push: "+b);
	stack.push(c);
	System.out.println("Push: "+c);
	System.out.println("The stack contains " +stack.size() + " items\n");
	
	stack.peek();
	System.out.println("Peek: " + c);
	System.out.println("The stack contains " +stack.size() + " items\n");
	
	
	
	stack.pop(c);
	System.out.println("Pop: "+c);
	stack.pop(b);
	System.out.println("Pop: "+b);
	stack.pop(a);
	System.out.println("Pop: "+a);
	System.out.println("The stack contains " +stack.size() + " items");
	
	
	
	
	
	
	
	}
}