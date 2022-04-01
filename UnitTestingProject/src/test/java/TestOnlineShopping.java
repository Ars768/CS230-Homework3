import org.testng.annotations.Test;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class TestOnlineShopping {
    OnlineShopping a = new OnlineShopping();

    @Test
    public void testGetItemsInBag1(){
        a.addItem("item1", 20);
        a.addItem("item2", 30);
        a.getItemsInBag();
    }

    @Test
    public void testGetItemsInBag2(){
        a.getItemsInBag();
    }

    @Test
    public void testAddItem1(){
        a.addItem("newItem", -1);
    }

    @Test
    public void testAddItem2(){
        a.addItem("newItem", 50);
    }

    @Test
    public void testRemoveItem1(){
        a.addItem("newItem", 25);
        a.addItem("recentItem", 30);
        a.removeItem("recentItem");
    }

    @Test
    public void testRemoveItem2(){
        a.addItem("newItem", 25);
        a.addItem("recentItem", 30);
        a.removeItem("randomItem");
    }

    @Test
    public void testBuyItems1(){
        a.buyItems();
    }

    @Test
    public void testBuyItems2(){
        a.addItem("Item1", 25);
        a.addItem("Item2", 30);
        a.buyItems();
    }

    public static void main(String[] args){

    }
}

