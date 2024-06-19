class Emp{
    int eid;
    String name;
    String department;

    // Function Overloading
    void f1(){
        System.out.println("Zero");
    }

    void f1(int a){
        System.out.println("Integer");
    }
    void f1(double b){
        System.out.println("double");
    }

}

public class n_overloading {
    public static void main(String[] args){

        byte x1 = 43;
        short x2 = 34;
        int x3 = 66;
        long x4 = 12;
        double x5 = 345;
        float x6 = 58;
        String x7 = "abc";
        boolean x8 = true;
        char x9 = 'A';
        Emp e = new Emp();
        e.f1();
        e.f1(x1);
        e.f1(x2);
        e.f1(x3);
        e.f1(x4);
        e.f1(x5);
        e.f1(x6);
        // e.f1(x7);
        // e.f1(x8);
        e.f1(x9);
    
    }
}
