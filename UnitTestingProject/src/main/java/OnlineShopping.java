import java.io.*;
import java.lang.*;
import java.util.*;

public class OnlineShopping {
    //String[] bagItems = new String[]{};
    //List<Object> bagItems = new ArrayList<Object>();
    //List<Integer> bagItemPrices = new ArrayList<Integer>();

    Dictionary bagItems = new Hashtable();

    public void getItemsInBag(){
        if (!bagItems.isEmpty()){
            System.out.println("Currently you have " + bagItems.size() + " item(s) in bag.");
            System.out.println(bagItems);
        }
        else{
            System.out.println("You do not have any item in your bag yet!");
        }
    }

    public void addItem(String itemName, int price){
        if(price>0) {
            bagItems.put(itemName, price);
            System.out.println("Item added successfully");
        }
        else{
            System.out.println("Invalid price!");
        }
    }

    public void removeItem(String itemName){
        boolean found = false;
        for (Enumeration k = bagItems.keys(); k.hasMoreElements();)
        {
            if(itemName == k.nextElement()){
                bagItems.remove(itemName);
                System.out.println("Item was deleted");
                found = true;
            }
        }
        if (!found){
            System.out.println("Item was not found");
        }
    }

    public void buyItems(){
        if (bagItems.isEmpty()){
            System.out.println("Your bag is currently empty");
        }
        else{
            System.out.println("Thanks for the shopping");
        }
    }

    public static void main(String[] args) {
        OnlineShopping a = new OnlineShopping();
        a.addItem("new", 15);
        //a.addItem("new1", 20);
        System.out.println(a.bagItems);
        a.getItemsInBag();
        a.removeItem("new");
        a.getItemsInBag();

    }
}

