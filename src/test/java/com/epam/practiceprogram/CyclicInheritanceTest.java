package com.epam.practiceprogram;

import com.program.inheritance.A;
import com.program.inheritance.B;
import com.program.inheritance.C;

public class CyclicInheritanceTest {
	public static void main(String[] args) {
		A a = new A();
		a.display();

		A ab = new B();
		ab.display();

		B b = new B();
		b.display();

		A ac = new C();
		ac.display();

		A c = new C();
		c.display();
	}
}
