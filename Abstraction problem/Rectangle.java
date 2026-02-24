public class Rectangle extends Shape{
    
    Rectangle(double base,double hight)
    {
        super(base,hight);
    }
    @Override
    void area()
    {
        double result=base*hight;
        System.out.println("Rectangle area : "+result);
    }
}
