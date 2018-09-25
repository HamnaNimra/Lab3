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
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "1234");
		AddressBook addressBook= new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
		}
	
}