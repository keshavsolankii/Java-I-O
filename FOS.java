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