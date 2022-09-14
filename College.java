package com.inheritance;

class Principal {
	void OnDuty() {
		System.out.println("Present");
	}
}

class Hod extends Principal {
	void attendance() {
		System.out.println("Half Day");
	}
}

class Student extends Hod {
	void game() {
		System.out.println("ready to play");
	}
}
public class College {

	public static void main(String args[]) {
		Student s = new Student();
		s.game();
		s.attendance();
		s.OnDuty();
	}
}
