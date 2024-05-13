// import java.util.*;

class Student {
    String name;
    int marks;
    static String college;
}


class b {
    public static void main(String[] args) {
        Student s1, s2, s3;
        s1 = new Student();
        s2 = new Student();
        s3 = new Student();
        s1.college = "GNIOT";
        s1.name = "Ansh";
        s2.name = "Anup";
        s3.name = "Vishesh";
        s1.marks = 98;
        s2.marks = 99;
        s3.marks = 100;

        System.out.println("Name = " + s1.name + ", marks = " + s1.marks + ", college = " + s1.college);
        System.out.println("Name = " + s2.name + " marks = " + s2.marks + ", college = " + s2.college);
        System.out.println("Name = " + s3.name + " marks = " + s3.marks + ", college = " + s3.college);
    }
}


