import java.io.FileInputStream;

public class FIN {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("temp.txt");
            int text = fin.read();
            System.out.println((char)text);

            int i=0;
            while((i = fin.read()) != -1)
            {
                System.out.print((char)i);
            }

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
// BufferedInputStream example
class BIS{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\Java IO\\temp.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while((i = bis.read()) != -1)
            {
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// SequentialInputStream example
class InputStreamExample {    
  public static void main(String args[])throws IOException{    
   FileInputStream input1=new FileInputStream("D:\\testin.txt");    
   FileInputStream input2=new FileInputStream("D:\\testout.txt");

   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    
