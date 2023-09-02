import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class File {
	
public static void main(String[] args)	throws Exception{
try
{
 FileOutputStream fos = new FileOutputStream("D:/Source2.txt");
		 String str = "Welcome to java";
				 byte a[]=str.getBytes();
		 fos.write(a);
				 fos.close();
}
catch (FileNotFoundException e) {
	System.out.println("Not created");
	
}
catch (IOException e) {
	System.out.println("created");
	
}
finally {
	System.out.println("File created");
	
}
FileInputStream fis=new FileInputStream("D:/Source1.txt");
	FileOutputStream fos=new FileOutputStream("D:/Source2.txt");
	int x;
	
//	while((x=fis.read())!=-1)
//	{
//		fos.write((char)x);
//	}
//	fis.close();


}
}

//FileInputStream fis=new FileInputStream("D:/Source1.txt");
//FileInputStream fis1=new FileInputStream("D:/Source2.txt");
//FileOutputStream fos=new FileOutputStream("D:/Destination.txt");
//int x;
//SequenceInputStream sis=new SequenceInputStream(fis,fis1);
//while((x=sis.read())!=-1)
//{
//	fos.write((char)x);
//}
//fis.close();
//fis1.close();
//fos.close();
//sis.close();

//import java.io.BufferedReader;
//import java.io.FileInputStream; 
//import java.io.IOException;
//import java.io.InputStreamReader;
//public class BufferReadEg {                       
//public static void main(String[] args) {
//
//try {
//FileInputStream fileinputstr = new FileInputStream ("D:/Source2.txt");
//BufferedReader reader = new BufferedReader(new InputStreamReader(fileinputstr));
//String line;
//while((line= reader.readLine()) !=null)
//{
//	System.out.println(line); 
//		
//	}
//}
//
//
//catch (IOException e) {
//e.printStackTrace();
//}
//
//
//
//
//}
//}
