import java.io.BufferedReader;
import java.io.InputStreamReader;

public class o_io {
    public static void main(String[] args) {
        try{
            InputStreamReader i=new InputStreamReader(System.in);
            BufferedReader b=new BufferedReader(i);
            String a1=b.readLine();
            String a2=b.readLine();
            String a3=b.readLine();
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            // f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
