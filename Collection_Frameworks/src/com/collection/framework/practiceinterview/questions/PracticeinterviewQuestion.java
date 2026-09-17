package com.collection.framework.practiceinterview.questions;

import java.util.ArrayList;
import java.util.List;

public class PracticeinterviewQuestion {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		/*
		 1.You can modify the parent list directly, but if you have already created a
		 subList, you should not structurally modify the parent list directly while
		 using that subList.
		 
		 2.The problem is not that you added something "inside the sublist."
		   The problem is that you modified the parent list
		   directly after creating the sublist.
		   
		 3.Once a subList exists, structural modifications should be done through the subList,
		   not directly through the parent list.
		 
		 */
		
	 /*
	    Before creating a subList, you can freely modify the parent list. Once you create a subList,
	    if you want to make structural changes like add() or remove(), 
	    make them through the subList. If you directly structurally modify the parent list and then continue using the existing subList, it can throw ConcurrentModificationException. set() is different because it replaces an existing element and does not change the list's structure.
		List<Integer> sub = list.subList(1, 3);
		sub.set(0, 99);	
	*/
		List<Integer> sub = list.subList(1, 3);
        sub.set(0, 99);
        list.add(5);

		try {
			System.out.println(sub.size());
		} catch (Exception e) {
			System.out.print(e.getClass().getSimpleName() + " ");
		}
		System.out.println(list);
	}
}
