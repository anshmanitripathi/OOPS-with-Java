class person{
    person(){
        System.out.println("person");
    }
}
class Student extends person{
    Student(){
        System.out.println("Student");
    }
}

public class p_inheritence {
    public static void main(String[] args) {
        Student s1 = new Student();        
    }
}
