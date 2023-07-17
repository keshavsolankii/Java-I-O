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
