package collections_sets;

import java.util.Collections;
import java.util.HashSet;

public class set {
	public static void main(String[] args) {
		HashSet<String> h= new HashSet<String>();
		HashSet<String> h1=new HashSet<String>();
		h.add("sets");
		h.add("renu");
		h.add("sets");
		System.out.println("output of h:"+h);
		System.out.println(h.clone());
		h1.add("donkey");
		h1.add("monkey");
		h1.add("monkey");
		System.out.println("output of h1:"+h1);
		System.out.println(h1.clone());
		h.addAll(h1);
		System.out.println("output of h:"+h);
		System.out.println("output of h1:"+h1);
//		h.isEmpty();
//		System.out.println(h.isEmpty());
		Collections.sort(h);
		System.out.println(h);

	}
	

}
