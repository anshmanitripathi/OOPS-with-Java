import java.io.*;

public class h_io {
    public static void main(String[] args) {
        try{
            FileInputStream f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\OOPS with Java\\Unit 2\\a_error_handle.java");
            int a1=f.read();
            int a2=f.read();
            int a3=f.read();
            int a4=f.read();
            f.skip(5);
            byte[] b=new byte[4];
            f.read(b);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(a4);
            System.out.println(b[0]);
            System.out.println(b[1]);
            System.out.println(b[2]);
            System.out.println(b[3]);
            int a5=f.available();
            System.out.println("remaning "+ a5);
            f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
