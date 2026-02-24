public class test {
    public static void main(String[] args)
    {
        Shape s;
        s=new Rectangle(10, 20);
        s.area();

        s=new triangle(10, 20);
        s.area();

        s=new Circle(10);
        s.area();
    }
}
