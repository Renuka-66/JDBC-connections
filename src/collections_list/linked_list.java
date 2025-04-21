package collections_list;

import java.util.ArrayList;
import java.util.List;

public class linked_list {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("kumar");
		li.add("sukumar");
		System.out.println(li);
		li.addFirst("kumari");
		System.out.println(li);
		li.addLast("srikumaa");
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
	}

}
