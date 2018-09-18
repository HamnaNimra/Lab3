import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo= new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo Buddy){
		if (Buddy != null){
			this.buddyInfo.add(Buddy);
		}
	}
	
	public BuddyInfo removeBuddy(int index){
		if(index >= 0 && index < this.buddyInfo.size()){
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Address Book");
		BuddyInfo Omar = new BuddyInfo();
		
	 

	}
	
}