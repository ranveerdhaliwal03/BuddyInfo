import java.util.ArrayList;
import java.util.List;

public class AddressBook {


    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo bud){
        buddies.add(bud);

    }

    public void removeBuddy(BuddyInfo bud){
        buddies.remove(bud);
    }



    public static void main(String[] args){

        System.out.println("Address Book");

        AddressBook a1 = new AddressBook();
        BuddyInfo b1 = new BuddyInfo("Homer","123 main st", "613-555-2828");
        a1.addBuddy(b1);
        a1.removeBuddy(b1);


    }

}
