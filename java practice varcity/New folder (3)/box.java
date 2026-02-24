public class box{
    private double length;
    private double width;
    private double higth;

    public void setlength(double length)
    {
        this.length=length;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public void setHigth(Double higth)
    {
        this.higth=higth;
    }

    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeigth()
    {
        return higth;
    }

   public double area()
    {
       return (length*width*higth);
        
    }
    public void display()
    {
        System.out.println("Area is : "+area());
    }
   

}