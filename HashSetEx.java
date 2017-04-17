import java.util.HashSet;
public class HashSetEx
{
public static void main(String[] aa)
{
	HashSet hobj = new HashSet();
	hobj.add("Sunday");
	hobj.add("Monday");
	hobj.add("Tuesday");
	hobj.add("Wednesday");
	hobj.add("Thursday");
	hobj.add("Friday");
	hobj.add("Saturday");
	
	System.out.println("Data Display"+hobj);
	System.out.println("Size after adding all data "+hobj.size());
	
	hobj.remove("Sunday");
	
	System.out.println("Data display after removing Sunday "+hobj);
	System.out.println("Size after removing Sunday "+hobj.size());
}
}
