import java.io.*;
public class FileInfoEx 
{
public static void main(String[] aa)
{
	try 
	{
		File fobj = new File ("C:\\Users\\user\\Desktop\\BIG DATA HADOOP");
		
		System.out.println("Check Whether file can be read by Application : ");
		System.out.println(fobj.canRead());
		
		System.out.println("Check whether file can be modified by the Application : ");
		System.out.println(fobj.canWrite());
		
		System.out.println("Check whether file or directory exists : ");
		System.out.println(fobj.exists());
		
		System.out.println("Check actual path of file or directory : ");
		System.out.println(fobj.getAbsolutePath());
		
		System.out.println("Check whether file or directory is hidden or not : ");
		System.out.println(fobj.isHidden());
		
		System.out.println("Check whether file can be modified by the ApplicatioDisplay all the files inside directory : ");
		System.out.println(fobj.list());
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
