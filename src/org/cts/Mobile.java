package org.cts;
public class Mobile {

	public static void main(String[] args) {
	
		int age=3,height=300;
		
		if(age<4||height<400) {
			
			System.out.println("half ticket");
		}
	
		else {
			System.out.println("full ticket");
		}
		
		Mobile m=new Mobile();
		System.out.println("object created");
	}
}
