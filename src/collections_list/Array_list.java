package collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_list {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		ArrayList<Integer>li1=new ArrayList<Integer>();
		li.add(6);
		li.add(66);
		li.add(666);// the output will generate in such way [6, 66, 666]
		System.out.println(li );
		//for
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i));
		}
//		these for ,foreach iterator statements are used for print
//		the avaliable data which  is given by user these make the same operation almost 
		/* 6
		 * 66
		   666*/
//		for-each
		li.forEach(e->{
			System.out.println(e);
		});
//		iterator
		Iterator<Integer> i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//		List iterator
		ListIterator<Integer>i1 = li.listIterator(li.size());
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
//		here list iterator statement is used for printing the avaliable data in the reverse order 
		/*666
		 * 66
		6*/
		li.add(1, 123);//the add function is used for add the 123 in the above list at the index position [6, 123, 66, 666]
		System.out.println(li);
		li.remove(2);//the function remove is used for removing the value by using index position in this exam it is removing at the index position of 2 [6, 123, 666]
		System.out.println(li);
		li1.add(1);
		li1.add(3);
		li1.add(4);//this three at meant that creating another list as named as li1 [1, 3, 4]
		System.out.println(li1);
		li.addAll(li1);//this operation will add two lists as single list li=(li+li1) here the two lists are assigned into li [6, 123, 666, 1, 3, 4]
		System.out.println(li);
		li.addAll(2,li);//this operation will do that it will add the upgraded list to the upgraded list at the index position of 2   [6, 123, 6, 123, 666, 1, 3, 4, 666, 1, 3, 4]
		System.out.println(li);
//     	li.retainAll(li1);//this operation will make the li1 set print together[1, 3, 4, 1, 3, 4]
  //  	System.out.println(li);
//		li.removeAll(li1);//it will remove the entire set
//		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(li1);//it will sort the given list into an order [1, 1, 3, 3, 4, 4]
		System.out.println(li1);
		System.out.println(li.isEmpty());//this empty operation will give either true or false if set is empty it will give true if not false
		System.out.println(li.size());
		li.set(1, 26);//it will be added at the index position of 1 at that particular value will be removed [1, 26, 3, 3, 4, 4]
		System.out.println(li);
		System.out.println(li.indexOf(26));//to find the value by using index position
		System.out.println(li.contains(44));//it is used to search the object(number) is avaliable or not if it doesnt contain it will give false
		li.clear();//it is used to delete the entire table
		System.out.println(li);
	}
	


}
