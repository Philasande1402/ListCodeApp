package listcodeapp;

import java.util.ArrayList;
import java.util.List;

public class ListCodeApp {
    public static void main(String[] args) {
        
        //Declare and initialize the list that can store string object representing customer names
        List<String> nameList = new ArrayList<>();
        
        //Add the following customers to the queue in this order: Alice, Bob,Charlie, Diana, Eve.
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("Diana");
        nameList.add("Eve");
        
        //Print the current list
        System.out.println("Current list : "+nameList);
        
        //Serve the first two customers (remove them from the list) and printtheir names
        String firstRemove = nameList.remove(0);
        System.out.println("First remove : "+firstRemove);
        String secondRemove = nameList.remove(1);
        System.out.println("Second remove : "+secondRemove);
        
        //Print the list after reomoving the first two name on the list
        System.out.println("Current list : "+nameList);
        
        //Add two more customers to the list :Frank and Grace
        nameList.add("Frank");
        nameList.add("Grace");
        
        //Print the final state of the list
        System.out.println("The final state of the list : "+nameList);
        
    }
    
}
