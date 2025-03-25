package oops;

public class developer extends guest{  //developer(child)(sub) <--- guest(parent)(super)

	public void write() {
		super.read();
		write();
		System.out.println("write code");
	}
	
public void read() {
	System.out.println("Printing in the sub class..");
}
	
}
