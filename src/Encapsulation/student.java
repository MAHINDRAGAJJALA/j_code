package Encapsulation;

public class student {
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public student(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentAttence(boolean flag) {
		if (isAttended != true){
			isAttended = flag;
		}else {
			System.out.println("teacher assinged the attendence");
		}
	}
	
	public boolean getStudentAttendence() {
		System.out.println("teacher accessed student data..");
		return isAttended;
		
	}
}
