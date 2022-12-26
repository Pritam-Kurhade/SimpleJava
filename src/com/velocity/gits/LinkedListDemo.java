package com.velocity.gits;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Integer> ll= new LinkedList<Integer>();
	ll.add(5);
	ll.add(6);
	ll.add(7);
	
	ll.stream().forEach(x->System.out.println(x));
}
}
