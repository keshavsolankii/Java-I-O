import java.io.*;

public class FOS{

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("E:\\Java IO\\temp.txt");
            fos.write(65);
            String str = "Hello world";
            byte[] b = str.getBytes();
            fos.write(b);
            fos.close();

            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);    
        }
    }
}
// BufferedOutputStream example
class BOS{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\Java IO\\temp.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "This is buffered output stream";
        byte[] b = str.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
        System.out.println("Success!");
    }
}
// ByteArrayOutputStream example
class DataStreamExample {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");    
      FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
        
      bout.flush();    
      bout.close();//has no effect    
      System.out.println("Success...");    
     }    
}   
// DataOutputStream class
class OutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  
