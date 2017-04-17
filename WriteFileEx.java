import java.io.*;
public class WriteFileEx 
{
public static void main(String[] aa)
{
	String fname = "C:\\Users\\user\\Desktop\\BIG DATA HADOOP\\MyFile.txt";
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	try
	{	
		fw = new FileWriter(fname);
		bw = new BufferedWriter(fw);
		
		bw.write("This is my first line using Java Programming. ");
		bw.write("This is my second line using Java Programming. ");
		bw.write("This is my third line using Java Programming. ");
		bw.write("This is my fourth line using Java Programming. ");
		bw.write("This is my fifth line using Java Programming. ");
		bw.write("This is my sixth line using Java Programming. ");
		bw.write("This is my seventh line using Java Programming. ");
		
		bw.close();
		fw.close();
	}
	catch (IOException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		try
		{
			if(bw != null)
			{
				bw.close();
			}
			else if(fw != null)
			{
				fw.close();
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		}
}
}
