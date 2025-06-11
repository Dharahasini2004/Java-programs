import java.io.*;
import java.util.*;
public class fileread
{
public static void main(String args[])
{
	try (BufferedReader reader=new BufferedReader(new FileReader("abc.txt")))
	{
		String line;
		System.out.println("Reading file content: ");
		while((line= reader.readLine())!=null)
		System.out.println(line);
	}catch(IOException e)
	{
	System.out.println("Caught IOException: "+e.getMessage());
	}
}  
}