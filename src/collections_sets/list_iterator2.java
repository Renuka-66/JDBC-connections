package collections_sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class list_iterator2 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		ArrayList<String> li1 =  new ArrayList<>(Arrays.asList(10,20,30,40,50));

		li.add(12);
		li.add(23);
		li.add(34);
		li.add(45);
		li.add(56);
		li.add(67);
		li.add(78);
//		li1.add("hi");
//		li1.add("hello");
//		li1.add("good");
//		li1.add("mrng");
//		li1.add("bye");
//		li1.add("bad");
//		li1.add("hey");
		System.out.println(li);
//		System.out.println(li1);
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		System.out.println(Collections.min(li));
		System.out.println(Collections.max(li));
		

}
