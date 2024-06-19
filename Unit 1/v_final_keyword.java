final class A{

}

// class B extends A{
                                        // not possible due to final class
// }

class C{
    void f1(){

    }

    final void f2(){

    }
}

class D extends C{
    void f1(){

    }
    // void f2(){
                            // cant be override as f2 is final
    // }
}


public class v_final_keyword {
    public static void main(String[] args) {
        final int a = 77;
        // a = 99;   // error as once a variable in final it cnat be changed
    }
}
