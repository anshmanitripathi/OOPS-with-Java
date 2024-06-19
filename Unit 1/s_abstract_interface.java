abstract class A{
    abstract void f1();
    void f2(){
        System.out.println("F2 in A");
    }
}
interface B{
    void f1();
    void f2();
}

class C{
    void f1(){

    }
    void f2(){

    }
}

class D implements B{

    public void f2(){
        
    }
    public void f1(){

    }

}
public class s_abstract_interface {
    public static void main(String[] args) {
        
    }
}
