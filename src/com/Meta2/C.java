package com.Meta2;

public class C extends B {
	int m3(int x,int y) {
		int z= x*y;
		System.out.println("Multipication of two number is:- "+z);
		return z;
	}
public static void main(String[] args) {
	A a = new A();
	B b= new B();
	C c = new C();
	a.m1();
	b.m2(15);
	c.m3(10, 5);
}
}
