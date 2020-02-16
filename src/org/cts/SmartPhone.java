package org.cts;

public class SmartPhone extends Mobile{

	@Override
    public void features(String s) {
    	System.out.println("many features including "+s);
    }
	@Override
    public void price(int i) {
    	System.out.println("smartphone price is "+i);
    }
	
	public static void main(String[] args) {
		
		SmartPhone s=new SmartPhone();
		s.usage();
		s.features("camera");
		s.price(20000);
	}
	
}
