import java.io.FileInputStream;

public class i_io {
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\OOPS with Java\\Unit 2\\a_error_handle.java");
            int a1=f.read();
            while(a1>=0){
                System.out.print((char)a1);
                a1=f.read();
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
