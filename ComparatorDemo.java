package com.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		TreeSet treeSet = new TreeSet(new MyComparator());
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(20);
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Integer a = (Integer) o1;
		Integer b = (Integer) o2;
		if (a > b) {
			return -100;
		} else if (a < b) {
			return +1;
		} else
			return 0;

	}
}
