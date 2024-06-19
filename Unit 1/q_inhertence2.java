class person{
    String name;
}
class Student extends person{
    String course;
}
class Emp extends person{
    int salary;
}


public class q_inhertence2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ansh";
        s1.course = "Btech";
        System.out.println(s1.name);
        System.out.println(s1.course);

        person p =s1;
        System.out.println(p.name);
        // System.out.println(p.course);
    }
}
