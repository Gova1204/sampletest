package org.model;

import cogn.test.Bike;

public class Cycle {
	private void fitness() {
		System.out.println("Cycling is good for cardio");
		System.out.println("cycle");
	}
	public static void main(String[] args) {
		Cycle b=new Cycle();
		b.fitness();
		Bike a=new Bike();
		a.speed();
	}

}
