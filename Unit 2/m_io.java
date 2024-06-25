import java.io.BufferedReader;
import java.io.FileReader;

public class m_io {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("Unit 2\\d_throw_in_error_handling.java");
            BufferedReader b=new BufferedReader(f);
            String a1=b.readLine();
            String a2=b.readLine();
            String a3=b.readLine();
            String a4=b.readLine();
            String a5=b.readLine();
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(a4);
            System.out.println(a5);
            f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
