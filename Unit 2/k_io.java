import java.io.FileOutputStream;

public class k_io {
    public static void main(String[] args) {
        try{
            FileOutputStream f=new FileOutputStream("p1.txt");
            f.write(65);
            f.write(66);
            f.write(67);
            byte[] b={97,98,99,100,101,102};
            f.write(b);
            f.write(b,2,3);
            f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
