import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.remove(buddy);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Peter","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}