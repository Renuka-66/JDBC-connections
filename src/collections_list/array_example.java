package collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//add encapsulation in this
public class array_example {
	public static void main(String[] args) {
		List<String> fruit =  new ArrayList<String>();
		List<String> vegitable = new ArrayList<String>();
		fruit.add("wateremelon");
		fruit.add("pineapple");
		fruit.add("grapes");
		fruit.add("orange");
		fruit.add("water Apple");
		System.out.println("The fruit available in the mall:"+fruit);
		for(int i=0;i<fruit.size();i++){
			System.out.println(fruit.get(i));
		}
		vegitable.add("potato");
		vegitable.add("brinjal");
		vegitable.add("sweet potato");
		vegitable.add("ladies finger");
		vegitable.add("beans");
		System.out.println("The vegitables available in the mall:"+"\n"+vegitable);
		for(int i=0;i<vegitable.size();i++){
			System.out.println(vegitable.get(i));
		}
		Collections.sort(fruit);
		System.out.println("The fruits in order"+fruit);
		for(int i=0;i<fruit.size();i++){
			System.out.println(fruit.get(i));
		}
		Collections.sort(vegitable);
		System.out.println("the vegitables in order"+vegitable);
		for(int i=0;i<vegitable.size();i++){
			System.out.println(vegitable.get(i));
		}
		fruit.add(5, "black berry");
		System.out.println("the new stock arrived:"+fruit);
		for(int i=0;i<fruit.size();i++){
			System.out.println(fruit.get(i));
		}
		vegitable.add(5,"tamato");
		System.out.println("the new Stock Arrived:"+vegitable);
		for(int i=0;i<vegitable.size();i++){
			System.out.println(vegitable.get(i));
		}
		List<String> basket1 =  new ArrayList<String>();
		List<String> basket2 = new ArrayList<String>();
		System.out.println("the no.of items custmer choosen to buy:");
		basket1.add(fruit.remove(fruit.indexOf("black berry")));
		basket1.add(fruit.remove(fruit.indexOf("orange")));
		basket1.add(fruit.remove(fruit.indexOf("water Apple")));
		System.out.println("the items that are picked by customer:"+basket1);
		for(int i=0;i<basket1.size();i++){
			System.out.println(basket1.get(i));
		}
		basket2.add(vegitable.remove(vegitable.indexOf("tamato")));
		basket2.add(vegitable.remove(vegitable.indexOf("sweet potato")));
		basket2.add(vegitable.remove(vegitable.indexOf("brinjal")));
		System.out.println("the items that are picked by customer:"+basket2);
		for(int i=0;i<basket2.size();i++){
			System.out.println(basket2.get(i));
		}
		basket1.addAll(basket2);
		Collections.sort(basket2);
		System.out.println("the item available in two baskets"+basket1);
		for(int i=0;i<basket2.size();i++){
			System.out.println(basket2.get(i)+"\n"+basket1.get(i));
//			System.out.println(basket1.get(i));
			
		}
		System.out.println(fruit.indexOf(4));
		System.out.println(vegitable.contains(4));
		
	
	}
	

}
