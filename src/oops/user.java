package oops;

public class user {

	public static void main(String[] args) {
		guest guestdata = new guest();
		guestdata.read();
		
		developer developer_data = new developer();
		developer_data.read();
		developer_data.write();
		
		admin adimin = new admin();
		adimin.read();
		adimin.write();
		adimin.manage();
	}
	

}
