abstract class Shape{
    int x;
    int y;
    void print(){
        System.out.println(x);
        System.out.println(y);
    }
    abstract void area();
}

class circle extends Shape{
    int r;
    void area(){
        float area = 3.14f * r*r;
        System.out.println("Circle Area  = "+ area);
    }

    circle(int rad){
        r = rad;
    }
}
class triangle extends Shape{
    void area(){

        System.out.println("triangle");
    }
}
class ellipse extends Shape{
    int r1,r2;
    void area(){
        System.out.println("ellipse");
    }
}


public class t_polymorphism {
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
