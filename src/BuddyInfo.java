public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    BuddyInfo(){
        this.name = "joe";
        this.address = "45 Garfield Rd.";
        this.phoneNumber = "555-555-5555";
    }

    //Here's an example using constructor chaining instead of using a single "default constructor"
    /*
    BuddyInfo(){ //if nothing is entered, use "joe" and continue initialising
        this("joe");
    }
    BuddyInfo(String name){ //use name if entered, and continue
        this(name, "45 Garfield Rd.");
    }
    BuddyInfo(String name, String address){ //use name and address if entered
        this(name, address, "555-555-5555");
    }
    */

    BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo bud1 = new BuddyInfo("Homer", "742 Evergreen Terrace","555-7334");
        System.out.println("Hello " + bud1.getName());
    }
}