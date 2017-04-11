import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListEx
{
	public static void main(String[] aa)
	{
		LinkedList <String> Data = new LinkedList <String>(); 
		Data.add("E");
		Data.add("A");
		Data.add("L");
		Data.add("D");
		Data.add("S");
		Data.add("G");
		Data.add("K");
		Data.add("B");
		Data.add("O");
		Data.add("C");
		Data.addFirst("1");
		Data.addLast("10");
		
		ListIterator itr = Data.listIterator();
		System.out.println("Inserting Order ....... ");
		while(itr.hasNext())
		{
			System.out.println("Data is "+itr.next());	
		}
		
		System.out.println("Reverse Order .......");
		
		while(itr.hasPrevious())
		{
			System.out.println("Data is "+itr.previous());
		}
		Data.removeFirst();
		Data.removeLast();
		System.out.println("After removing first and last element ......");
		Iterator itr1 = Data.iterator();
		while (itr1.hasNext())
		{
			System.out.println("Data is "+itr1.next());
		}
		Data.set(0,"Test");
		System.out.println(Data);
	}
  
}
