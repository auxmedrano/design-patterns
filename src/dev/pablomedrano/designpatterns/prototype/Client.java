package dev.pablomedrano.designpatterns.prototype;

import javax.sound.midi.Soundbank;

public class Client {
	public static void main(String[] args) {
//		Prototype p1 = new ConcretePrototype1();
//		Prototype p2 = new ConcretePrototype2();
//
//		// ... later ...
//		operation(p1);
//		operation(p2);

		Dragon p1 = new Dragon("Dragon", false); // prototype for all Dragons
		Drakon p2 = new Drakon("Drakon", 2, true); // prototype for all Drakons

		// ... later ...
		operation(p1);
		operation(p2);
	}
	
	public static Monster operation(Monster p) {
		// This code doesn't know or care what the concrete type of p is
		Monster pCopy = null;
		try {
			pCopy = p.copy();
			// do something useful with pCopy

			System.out.println("Operating with pCopy!");
			System.out.println(pCopy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return pCopy;
	}
}