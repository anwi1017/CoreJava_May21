package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Ann");
		mylist.add("Krista");
		mylist.add("Aiden");
		mylist.add("Rylan");
		
		System.out.println("Before sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println("After sorting");
		
		
		Collections.sort(mylist,Collections.reverseOrder());
		
		System.out.println("After reverse order");
		System.out.println(mylist);
		
		
		Stack<String> mystack = new Stack<String>();
		
		mystack.push("abc");
		mystack.push("xyz");
		mystack.pop();
		mystack.push("pqr");
		
		System.out.println(mystack);
		
	}

}
