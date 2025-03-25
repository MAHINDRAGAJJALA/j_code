package accessModifiers;

public class student { // only public , default

	public int rollno = 101;
	private int roll = 101;
	protected int rolll = 103;
	
	/*
	 public student() {
	 
		rollno = 102;
	}
	
	private student() {
		rollno = 102;
	}
	*/
	protected student() {
		rollno = 102;
	}
	public void printrollnumber() {
		System.out.println(rollno);
	}
	protected void di() {
		System.out.println("protected...");
	}
	protected static void main(String[] args) {
		
		student s = new student();
		System.out.println(s.roll);
	}
	
}
/*
 Public -  any body can access. entire projects , classes 
 
 we can access the public variable in entire package , class , outside the package , interface 
 
 Private - only same class not in package , outside package .
 
 default(no modifier)(package - private) - within the package same as private
 
 protected - same as default but inheritance is present
 
 
 --modifier--class--package--subclass--world--
 --public------Y------Y----------Y--------Y-----
 --protected---Y------Y----------Y--------N-----
 --default-----Y------Y----------N--------N-----
 --private-----Y------N----------N--------N-----
 */
