package collections_list;

import java.util.ArrayList;
import java.util.ListIterator;

public class list_iterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(123);
		al.add(234);
		al.add(345);
		al.add(456);
		al.add(678);
		al.add(890);
		System.out.println(al);
		ListIterator<Integer> l = al.listIterator();
		while(l.hasNext()) {
			System.out.println("index:" +l.nextIndex()+"name"+l.next());
		}
		while(l.hasPrevious()) {
			System.out.println("index:"+l.previousIndex()+"name:"+l.previous());
		}
		while(l.hasNext()) {
			Integer i = l.next();
			if(i==345) {
				l.set(678);
				l.add(419);
			}
			if(i==345) {
				l.remove();
			}
			
		}
		System.out.println(al);
	}
	

}
