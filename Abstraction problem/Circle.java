public class Circle extends Shape {
    
    Circle(double r)
    {
        super(r,r);
    }
    @Override
    void area()
    {
          double result2=Math.PI*base*hight;
          System.out.println("Cirle result is ; "+result2);
    }
}
