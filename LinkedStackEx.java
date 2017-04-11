import java.util.LinkedList;

public class LinkedStackEx 
{
public static void main(String[] aa)
{
	LinkedList <String> mydata = new LinkedList <String>();
	
	mydata.add("First");
	mydata.add("Second");
	mydata.add("Third");
	mydata.add("Fourth");
	mydata.add("Random");
	
	System.out.println("Elements in LinkedList Before Push : ");
	System.out.println(mydata);
	mydata.push("push element");
	System.out.println("Elements in LinkedList After Push");
	System.out.println(mydata);
	System.out.println("Elements in LinkedList After Pop");
	System.out.println(mydata);
	mydata.pop();
}
}
