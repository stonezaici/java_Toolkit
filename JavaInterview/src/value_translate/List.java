package value_translate;

import java.util.ArrayList;

public class List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>() ;
		list1.add(0);
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add(list1);
		System.out.println(list1.get(0) instanceof Integer);
		System.out.println(list2.get(0) instanceof Integer);
	}

}
