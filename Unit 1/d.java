class Student{
    String name;
    int rollno;
    static String college;
    void printDetalis(){
        System.out.println("Rollno:"+ rollno);
        System.out.println("Name:"+ name);
        System.out.println("Colllege :"+ college);
        //  non static functions static as well as non static dono members dono ko access kar sakte hain.
    }

    static void printDetalis2(){
        // System.out.println("Name:"+ name);   //error: non-static variable name cannot be referenced from a static context
        //  static function keval static members ko hi acces  kar sakte hain.
        

        System.out.println("Colllege :"+ college);
    }
}


class d {
    public static void main(String[] args) {
        Student s1, s2, s3;
        s1 = new Student();
        s2 = new Student();
        s3 = new Student();

        s1.rollno = 45;
        s1.name = "Rajat";
        s2.rollno = 18;
        s2.name = "Virat";
        s3.rollno = 7;
        s3.name = "Dhoni";

        s1.printDetalis();
        s2.printDetalis();
        s3.printDetalis();

    }
}