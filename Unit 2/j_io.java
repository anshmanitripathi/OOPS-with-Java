import java.io.FileInputStream;

public class j_io {
     public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("Unit 2\\b_error_handling.java");
            int size=f.available();
            byte[] data =new byte[size];
            f.read(data);
            String s=new String(data);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
