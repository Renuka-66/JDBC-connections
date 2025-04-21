package collections_sets;

import java.util.HashMap;
import java.util.Map;

public class maps {
public static void main(String[] args) {
	Map<Integer, String> m = new HashMap<Integer, String>();
	Map<Integer, String> m1 = new HashMap<Integer, String>();
	m.put(2, "two");
	m.put(3, "three");
	m.put(4,"four");
	m1.put(5, "five");
	m1.put(6, "six");
	m1.put(7, "seven");
	System.out.println(m);
	System.out.println(m.get(3));
System.out.println(m.containsKey(3));
System.out.println(m.containsValue("three"));
System.out.println(m1.containsKey(3));
System.out.println(m1.containsValue("three"));
m.remove(2);
System.out.println(m);
}
}
