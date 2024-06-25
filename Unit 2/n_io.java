import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class n_io {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("Unit 2\\d_throw_in_error_handling.java");
            InputStreamReader i = new InputStreamReader(f);
            BufferedReader b = new BufferedReader(i);
            String a1=b.readLine();
            String a2=b.readLine();
            String a3=b.readLine();
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


