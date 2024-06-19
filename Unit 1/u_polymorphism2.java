interface Shape{

    abstract void print();
    abstract void area();
}

class circle implements Shape{
int r;
    public void area(){
        float area = 3.14f * r*r;
        System.out.println("Circle Area  = "+ area);
    }

    circle(int rad){
        r = rad;
    }

    public void print(){
        
    }
}
class triangle implements Shape{
    public void area(){

        System.out.println("triangle");
    }
    public void print(){
        
    }
}
class ellipse implements Shape{
    int r1,r2;
    public void area(){
        System.out.println("ellipse");
    }
    public void print(){
        
    }
}


public class u_polymorphism2 {
    public static void main(String[] args) {
        Shape s1, s2, s3;
        s1 = new circle(7);
        s2 = new triangle();
        s3 = new ellipse();

        s1.area();
        s2.area();
        s3.area();
    }
}
