package dev.pablomedrano.designpatterns.iterenum;

import java.util.*;

public class EI {
	public static void main (String args[]) {
		List<String> strings = List.of("one", "two", "three", "four");
		Vector<String> v = new Vector<String>(strings);
		
		System.out.println("Using enumeration with Vector");
		Enumeration<String> enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println("Using iterator with Vector");
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Using for/in with array of Strings");
		for (String color : strings) {
			System.out.println(color);
		}
		
	}
}
