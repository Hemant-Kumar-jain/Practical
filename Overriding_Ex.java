package com.cognizant.tax;

class Overriding{
	void run() {
		System.out.println("Running Mode ON");
	}
}
public class Overriding_Ex extends Overriding{
		void run() {
			System.out.println("Running Mode OFF");
		}
		public static void main(String[] args) {
			Overriding_Ex o=new Overriding_Ex();
			o.run();
			
	}
}
