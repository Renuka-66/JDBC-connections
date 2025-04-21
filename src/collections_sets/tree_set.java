package collections_sets;

import java.util.TreeSet;

public class tree_set {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(43);
		System.out.println(ts);
//		ts.pollFirst();
//		ts.pollLast();
//		System.out.println(ts);
		System.out.println(ts.higher(2));
		System.out.println(ts.lower(2));
		System.out.println(ts.headSet(3, true));
		System.out.println(ts.tailSet(3));
		System.out.println(ts.subSet(2, 43));
		System.out.println(ts.ceiling(40));
		System.out.println(ts.floor(4));
		System.out.println(ts.descendingSet());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.size());
//		System.out.println(ts.isEmpty());
//		System.out.println(ts.addFirst(66));
	}

}
