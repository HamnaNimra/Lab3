public class BuddyInfo {

	private String name;
	private String Address;
	private String phoneNumber;
	
	public BuddyInfo(String name, String Address, String phoneNumber) {
		super();
		this.name=name;
		this.Address=Address;
		this.phoneNumber=phoneNumber;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BuddyInfo Omar = new BuddyInfo();
		
		
		Omar.setName("Omar");
		Omar.setAddress("Fifth Avenue");
		Omar.setPhoneNumber("I am stupid888");
		
		System.out.println("Hello" + " " + Omar.getName() + ", Your new address is: " + Omar.getAddress() + ", You have changed your phone number to: " + Omar.getPhoneNumber() );
	 */

	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
