package com.inheritance;

class Father {

	void drink() {
		System.out.println("Drinking a beer");
	}
}

class Son extends Father {

	void eat() {
		System.out.println("Eat  Chikan");
	}
}


public class Family {

	public static void main(String args[]) {
		Father f = new Father();
		f.drink();
		f.eat(); //C.E: cannot find symbol
		         //symbol: method eat()
		         //Location; Class Father
		
		Son s = new Son();
		s.eat();
		s.drink();
		
		Father f1 = new Son();
		f1.drink();
		f1.eat();  //C.E: cannot find symbol
                   //symbol: method eat()
                   //Location; Class Father
		
		Son s1 = new Father(); //C.E: incompatible types
		                       //found: Father
		                       //required: Son 
	}
}
