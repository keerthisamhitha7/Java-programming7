import java.util.HashMap;
import java.util.Set;
public class HashMapEx
{
	public static void main(String[] aa)
	{
		 HashMap<Price, String> hm = new HashMap<Price, String>();
	     hm.put(new Price("Pen", 20), "Pen");
	     hm.put(new Price("Book", 80), "Book");
	     hm.put(new Price("Pencil", 10), "Pencil");
	     printMap(hm);
	     Price key = new Price("Pen", 20);
	     System.out.println("Adding duplicate key...");
	     hm.put(key, "Paper");
	     System.out.println("After adding dulicate key:");
	     printMap(hm);
	}
	 public static void printMap(HashMap<Price, String> map){
         
	        Set<Price> keys = map.keySet();
	        for(Price p:keys)
	        {
	            System.out.println(p+"==>"+map.get(p));
	        }
	    }
	}
class Price
{
    private String item;
    private int price;
     
    public Price(String itm, int pr)
    {
        this.item = itm;
        this.price = pr;
    }

public String getItem() {
    return item;
}
public void setItem(String item) {
    this.item = item;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
 
public String toString()
{
    return "item: "+item+"  price: "+price;
}
}


	
