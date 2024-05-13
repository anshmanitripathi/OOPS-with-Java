class Student{
    String name;
    int rollno;
    void printDetalis(){
        System.out.println("Rollno:"+ rollno);
        System.out.println("Name:"+ name);
    }
}


class c {
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
