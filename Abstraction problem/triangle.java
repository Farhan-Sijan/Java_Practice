public class triangle extends Shape {

    triangle(double base,double hight)
    {
        super(base,hight);
    }
    @Override
    void area()
    {
        double result1=0.5*base*hight;
        System.out.println("triangle Area is : "+result1);
    }
    
}
