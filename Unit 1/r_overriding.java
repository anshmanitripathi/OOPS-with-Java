class person{
    void f1(){
        System.out.println("person f1");
    }
    void f2(){
        System.out.println("person f2");
    }
}
class Student extends person{
    void f3(){
        System.out.println("student f3");
    }
    void f2(){     //function override
        System.out.println("student f2");
    }
}


public class r_overriding {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.f1();
        s1.f2();
        s1.f3();

        person p =s1;
        p.f1();
        p.f2();                              // generalisation and specilasition
        // p.f3();
    }
}
