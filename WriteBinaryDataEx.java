import java.io.*;
public class WriteBinaryDataEx 
{
public static void main(String[] aa)
{
	String datafile = "C:\\Users\\user\\Desktop\\BIG DATA HADOOP\\Binary.txt";
	String bytedata = "This is the example of Binary Data File";
	byte[] buffer = bytedata.getBytes();
	FileOutputStream fous = null;
	
	try
	{
		fous = new FileOutputStream(datafile);
		fous.write(buffer);
		fous.close();
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("Completed writing Data to file from finally");
	}
}
}
