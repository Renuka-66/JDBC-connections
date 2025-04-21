package collections_sets;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Iterator;

public class List_iterator {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		ArrayList<String> li1 =  new ArrayList<String>();

		li.add(12);
		li.add(23);
		li.add(34);
		li.add(45);
		li.add(56);
		li.add(67);
		li.add(78);
		li1.add("hi");
		li1.add("hello");
		li1.add("good");
		li1.add("mrng");
		li1.add("bye");
		li1.add("bad");
		li1.add("hey");
		System.out.println(li);
		System.out.println(li1);
		Iterator<Integer> i = li.iterator();
		
		while(i.hasNext()) {                                                
			Integer i1=i.next();
			System.out.println(i1);
			if(i1==45) {
				
				System.out.println("removing the element 45");
				i.remove();
			}
				
		}
		System.out.println(li);
		Iterator<String> j=                                                                                                                           
		
		
	}

}
