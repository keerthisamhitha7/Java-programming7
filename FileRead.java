import java.io.*;
public class FileRead 
{
private static FileInputStream f;

public static void main(String[] aa)
{
int i;
char c;
try
{
f = new FileInputStream("C:\\Users\\user\\Desktop\\BIG DATA HADOOP\\Test.txt");
while ((i=f.read())!= -1)
{
	c=(char)i;
	System.out.println(c);
}
}
catch(IOException e)
{
	System.out.println(e.getMessage());
}
}
}

