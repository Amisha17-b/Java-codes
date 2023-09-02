import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEg {
    public static void main(String[] args) throws IOException {
        // FileReader fReader =new FileReader("D:/Source2.txt");
        // BufferedReader bReader =new BufferedReader(fReader);
        // int records;
        // while((records = bReader.read())!=-1){
        //     System.out.println((char)records);

        // }
        // bReader.close();
        // fReader.close();

        FileReader fr =new FileReader("Source2.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.mark(9);
         System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
         br.reset();
        System.out.print((char)br.read());
        System.out.print((char)br.read());

        
    }
}
