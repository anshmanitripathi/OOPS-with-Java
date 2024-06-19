class Emp{
    int eid;
    String name;
    String department;

    Emp(String nm){
        name = nm;
    }

    Emp (int id, String nm){
        name = nm;
        eid = id;
    }
}



public class o_constructor {
    public static void main(String[] args) {
        Emp e1  =new Emp("Ravi");
        System.out.println(e1.eid);
        System.out.println(e1.name);
        Emp e2  =new Emp(45,"Anuo");
        System.out.println(e2.eid);
        System.out.println(e2.name);
    }
}
