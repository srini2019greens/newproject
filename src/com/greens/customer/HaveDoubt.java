package com.greens.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HaveDoubt {

	public static void main(String[] args) {
		
//		Convert the below list in to set(use addAll()) method
//        Input : List = 10,20,30,90,10,10,40,50
//		Also What is user defined map or set
		
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(10);
		li.add(50);
		li.add(50);
		li.add(100);
		li.add(1000);
		li.add(200);
		li.add(200);
		//li.clear();
		li.remove(6);
		li.set(1, 3);
		Object[] array = li.toArray();
		for (Object x : array) {
			System.out.println(x);
		}
		String string = li.toString();
		System.out.println(string);
		System.out.println(li);

	
		for (int i = 0; i < li.size(); i++) {
			for (int j = i+1; j < li.size(); j++) {
				if (li.get(i)==li.get(j)) {
				System.out.println(li.get(j));
				}
			}
		}
	Set<Integer> s=new TreeSet<>();
	
	s.addAll(li);
	
	System.out.println(s);
	//s.retainAll(li);
	//s.removeAll(li);
	//System.out.println(s);
	int size1 = li.size();
	int size2 = s.size();
	System.out.println(size1-size2);
	
	
	}
	
	}