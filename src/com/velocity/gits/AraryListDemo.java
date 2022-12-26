package com.velocity.gits;

import java.util.ArrayList;

public class AraryListDemo {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Pritam");
		al.add("Kshitija");
		al.add("omkar");
		al.stream().forEach(y->System.out.println(y));
	}
}
