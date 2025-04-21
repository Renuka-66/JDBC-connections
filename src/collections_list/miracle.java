package collections_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class miracle {
	public static void main(String[] args) {
		List li = new ArrayList<>();
		li.add("****1");
		li.add("***12");
		li.add("**123");
		li.add("*1234");
		li.add(12345);
		System.out.println(li+"\n");
	
	for(int i=0;i<li.size();i++){
		System.out.println(li.get(i));
	}
	
	ListIterator i1 = li.listIterator(li.size());
	while(i1.hasPrevious())
	{
		System.out.println(i1.previous());
	}
	}}
