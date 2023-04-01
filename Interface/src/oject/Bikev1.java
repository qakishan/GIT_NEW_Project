package oject;

public class Bikev1  implements Bike{

	@Override
	public void engine() {
		
		System.out.println("150cc");
		
	}

	@Override
	public void gear() {
		System.out.println("manual 4 gear");
		
	}

	@Override
	public void tyresize() {
		System.out.println("20 mm");
		
	}

	@Override
	public void kettype() {
		System.out.println("smart key");
		
	}

}
