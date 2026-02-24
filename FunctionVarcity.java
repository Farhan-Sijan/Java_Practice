
public class FunctionVarcity {
    
    private String message;

    public void my(String m)
    {
        message=m;
        System.out.println(message);
    }
    public String name(String n)
    {
        message=n;
        return message;
    }
    public static void main(String[] args)
    {
        FunctionVarcity f1 = new FunctionVarcity();
        f1.my("Hellow Sijan");
         
        FunctionVarcity f2=new FunctionVarcity();
        String msg =f2.name("Hellow, Farhan HAsin Sijan");
        System.out.println(f2.message);
    }
}
