import java.util.LinkedList;

public class CheckListDataEx 
{
public static void main(String[] aa)
{
	LinkedList <String> mydata = new LinkedList <String>();
	mydata.add("First");
	mydata.add("Second");
	mydata.add("Third");
	mydata.add("Random");
	LinkedList <String> listdata = new LinkedList <String>();
	listdata.add("Second");
	listdata.add("Random");
	System.out.println("Does LinkedList contains all the list elements ? : "+ mydata.containsAll(listdata));
	listdata.add("One");
	System.out.println("Does LinkedList contains all the list elements ? : "+ mydata.containsAll(listdata));	
}
}
