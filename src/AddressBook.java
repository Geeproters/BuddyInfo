import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;
    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddyList.size()) {
            return buddyList.remove(index);
        }
        return null;
    }

    public int getIndex(AddressBook this, BuddyInfo buddy) {
        return this.buddyList.indexOf(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Peter","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);

        System.out.println("Index from getIndex(): " + addressBook.getIndex(buddy));

        System.out.println(addressBook.buddyList.indexOf(buddy)); //This line was added on GitHub.com
        System.out.println(addressBook.removeBuddy(0).getName());
    }
}
