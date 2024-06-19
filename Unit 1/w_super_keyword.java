class A{
    // A(){
    //     System.out.println("A1");
    // }

    A(int a){
        System.out.println("A2");
    }
    A(String s){
        System.out.println("A3");
    }
}

class B extends A{
    B(){
        super(245);
        System.out.println("B1");
    }
    B(double b){
        super(245);
        System.out.println("B2");
    }
    B(String s , int c){
        super("abc");
        System.out.println("B3");
    }
}

public class w_super_keyword {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println();
        B b2 = new B(5.7);
        System.out.println();
        B b3 = new B("bgf", 7);
        System.out.println();

    }
}
