import java.io.ByteArrayInputStream;
//import java.io.*;
public class ByteArrayEg {

	public static void main(String[] args) {
		
		byte b[]={'a','b','c','d','e'};
		ByteArrayInputStream bar = new ByteArrayInputStream(b);
		int x;
		while((x=bar.read())!=-1) {
			System.out.print((char)x);
		}
	}
}
