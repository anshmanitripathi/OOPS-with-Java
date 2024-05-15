import java.util.*;
class i_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter a Sting ");
        s1 = sc.nextLine();
        System.out.println("Enter a Sting ");
        s2 = sc.nextLine();
        boolean b = s1.equals(s2);
        if(b){
            System.out.println("Same");
        }else{
            System.out.println("diff");
        }
    }
}
